
package warehouse;

import dao.Orders;
import dao.OrdersDAO;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author amina
 */
public class commandes_refusees extends javax.swing.JPanel {

   
    
    public commandes_refusees() {
        initComponents();
        tb_load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID du produit", "Nom du produit", "Client", "Quantité", "Total", "Date", "", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("COMMANDES REFUSEES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


    

      private void tb_load() {
    try {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Make all cells non-editable except the button columns
                return column == getColumnCount() - 2 || column == getColumnCount() - 1;
            }
        };

        model.setColumnIdentifiers(new Object[]{
                "ID", "ID du produit", "Nom du produit", "Client", "Quantité", "Total", "Date", "Accepter", "Refuser"
        });

        jTable1.setModel(model);

        // Add data to the table
        OrdersDAO ordersDAO = new OrdersDAO();
        List<Orders> ordersList = ordersDAO.getRejectedOrders();

        for (Orders order : ordersList) {
            model.addRow(new Object[]{
                    order.getId(),
                    order.getProductId(),
                    order.getProductName(),
                    order.getClientName(),
                    order.getQuantity(),
                    order.getAmount(),
                    order.getOrderDate(),
                    "Accepter",
                    "Restaurer"
            });
        }

        // Add button column renderer and editor for "Accepter"
        jTable1.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        jTable1.getColumnModel().getColumn(7).setCellEditor(new Accept(new JTextField(), jTable1));

        // Add button column renderer and editor for "Refuser"
        jTable1.getColumnModel().getColumn(8).setCellRenderer(new ButtonRenderer());
        jTable1.getColumnModel().getColumn(8).setCellEditor(new Reject(new JTextField(),jTable1));

    } catch (Exception e) {
        System.out.println(e);
    }
}


    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

   class Accept extends DefaultCellEditor {
    protected JButton button;

    private String label;
    private JTable table;

    public Accept(JTextField textField, JTable table) {
        super(textField);
        this.table = table;
        button = new JButton();
        button.setOpaque(true);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Set hand cursor
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = table.convertRowIndexToModel(table.getEditingRow());
                Object id = table.getModel().getValueAt(row, 0); // Assuming ID is in the first column
                // Call your DAO method here to update the status
                updateStatus((int) id);
            }
        });
    }

    private void updateStatus(int id) {
        // Call your DAO method to update the status here
        OrdersDAO ordersDAO = new OrdersDAO();
        ordersDAO.updateStatusToAccepted(id);
        // Refresh the table after updating the status if necessary
        tb_load();
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        return button;
    }

    public Object getCellEditorValue() {
        return label;
    }
}
   
   
   
   
   class Reject extends DefaultCellEditor {
        protected JButton button;

        private String label;
            private JTable table;


        public Reject(JTextField textField,JTable table) {
           super(textField);
        this.table = table;
        button = new JButton();
        button.setOpaque(true);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Set hand cursor
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = table.convertRowIndexToModel(table.getEditingRow());
                Object id = table.getModel().getValueAt(row, 0); // Assuming ID is in the first column
                // Call DAO method to reject the order
                rejectOrder((int) id);
            }
        });
    }

    private void rejectOrder(int id) {
        // Call DAO method to update order status to "rejected"
        OrdersDAO ordersDAO = new OrdersDAO();
        ordersDAO.updateStatusToPending(id);
        // Refresh the table after updating the status if necessary
        tb_load();
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        return button;
    }

    public Object getCellEditorValue() {
        return label;
    }
}
   
   

}