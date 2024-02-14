/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import dao.CategoryDAO;
import dao.Product;
import dao.ProductDAO;
import dao.Provider;
import dao.ProviderDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL-10
 */
public class produits_out extends javax.swing.JPanel {

    /**
     * Creates new form clients
     */
    public produits_out() {
        initComponents();
        tb_load();
        combo_load();
                updatebtn.setVisible(false);
                idlabel.setVisible(false);

        
     // CategoryDAO cddd = new CategoryDAO();
        //   p_cat = new JComboBox<>(cddd.getCategoryNames());
    
    }
    
    
    
    public void combo_load(){
         CategoryDAO cddd = new CategoryDAO();
       String[] categoryNames = cddd.getCategoryNames();

 
        for (String categoryName : categoryNames) {
            p_cat.addItem(categoryName); }
        
ProviderDAO pddd = new ProviderDAO();        
        String[] providerNames = pddd.getProviderNames();
        for(String providerName : providerNames){
        p_f.addItem(providerName);
        }
        
        
    
    }


    
    
    public void tb_load(){

  
      try {
          
          DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
          dt.setRowCount(0);
          
      //    Product p = new Product();
          ProductDAO prd = new ProductDAO();
        
              List<Product> productList = prd.getOutProducts();
               for (Product product : productList) {
            Object[] rowData = {
                    product.getId(),
                    product.getName(),
                    product.getCategoryName(),
                    product.getPrice(),
                    product.getQuantity(),
                    product.getCodeBar(),
                 product.getProviderName(),
                  //  product.getImages(),
                
                  
            };
            dt.addRow(rowData);
        }
          }
          
       catch (Exception e) {
          System.out.println(e);
      }
  
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p_nom = new javax.swing.JTextField();
        p_prix = new javax.swing.JTextField();
        p_qt = new javax.swing.JTextField();
        add_p = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_code = new javax.swing.JTextField();
        p_i = new javax.swing.JTextField();
        p_cat = new javax.swing.JComboBox<>();
        p_f = new javax.swing.JComboBox<>();
        updatebtn = new javax.swing.JButton();
        idlabel = new java.awt.Label();
        idfield = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        recherche_p = new javax.swing.JTextField();
        r_p_b = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nom");

        jLabel2.setText("Catégorie");

        jLabel3.setText("Prix");

        jLabel4.setText("Quantité");

        p_prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_prixActionPerformed(evt);
            }
        });

        p_qt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_qtActionPerformed(evt);
            }
        });

        add_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse/images/save-16.png"))); // NOI18N
        add_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_pActionPerformed(evt);
            }
        });

        jLabel6.setText("Code bar");

        jLabel7.setText("Fournisseur");

        jLabel8.setText("Images");

        p_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_iActionPerformed(evt);
            }
        });

        p_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_catActionPerformed(evt);
            }
        });

        p_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_fActionPerformed(evt);
            }
        });

        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse/images/save-16.png"))); // NOI18N
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        idlabel.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(p_qt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(p_code))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p_f, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(p_i))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(p_nom))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(p_prix))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p_cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatebtn)
                            .addComponent(add_p)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(p_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(p_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(p_prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(p_qt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(p_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(p_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(p_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(add_p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatebtn)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Catégorie", "Prix", "Quantité", "Code", "Fournisseur"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("GERER LES PRODUITS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Rechercher  ");

        recherche_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherche_pActionPerformed(evt);
            }
        });

        r_p_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse/images/search-3-16.png"))); // NOI18N
        r_p_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_p_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recherche_p, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(r_p_b)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r_p_b)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(recherche_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse/images/edit-16.png"))); // NOI18N
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warehouse/images/delete-16.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit)
                .addGap(178, 178, 178)
                .addComponent(delete)
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit)
                    .addComponent(delete))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_pActionPerformed

 
                                       
    CategoryDAO cd = new CategoryDAO();
    ProviderDAO pd = new ProviderDAO();
    ProductDAO prd = new ProductDAO();

    String pr_nom = p_nom.getText();
    String pr_prix_str = p_prix.getText();
    String pr_qt_str = p_qt.getText();
    String pr_im = p_i.getText();
    String pr_code = p_code.getText();

    String pr_cat = p_cat.getSelectedItem().toString();
    String pr_f = p_f.getSelectedItem().toString();

    if (pr_nom.isEmpty() || pr_prix_str.isEmpty() || pr_qt_str.isEmpty() || pr_im.isEmpty() || pr_code.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double pr_prix = Double.parseDouble(pr_prix_str);
        int pr_qt = Integer.parseInt(pr_qt_str);

        

        int categoryId = cd.getCategoryIdByName(pr_cat);
        int providerId = pd.getProviderIdByName(pr_f);

        Product p = new Product();
        p.setName(pr_nom);
        p.setQuantity(pr_qt);
        p.setPrice(pr_prix);
        p.setCategoryId(categoryId);
        p.setProviderId(providerId);
        p.setImages(pr_im);
        p.setCodeBar(pr_code);

        prd.addProduct(p);
        refreshTable();
        JOptionPane.showMessageDialog(null, "Produit enregistré");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Prix ou quantité invalide. veuillez entrer une valeur numérique correcte.", "Erreur", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Insértion du produit impossible.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }


     
     

    }//GEN-LAST:event_add_pActionPerformed

    private void p_prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_prixActionPerformed

    private void recherche_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherche_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recherche_pActionPerformed

    private void r_p_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_p_bActionPerformed

String searchKeyword = recherche_p.getText();

ProductDAO pdao = new ProductDAO();
                List<Product> searchResults = pdao.searchProducts(searchKeyword);
                updateTable(searchResults);
    }

    
    private void updateTable(List<Product> productList) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); //

        for (Product product : productList) {
            model.addRow(new Object[]{product.getId(), product.getName(),product.getCategoryName(),product.getPrice(),product.getQuantity(), product.getProviderName()});

                    
        }
    
 
     
 

    }//GEN-LAST:event_r_p_bActionPerformed

    private void p_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_catActionPerformed

    private void p_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_fActionPerformed

    private void p_qtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_qtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_qtActionPerformed

    private void p_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_iActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed


         int index = jTable1.getSelectedRow();
        if (index != -1) {
        TableModel model = jTable1.getModel();
        int id = (int) model.getValueAt(index,0);
       
        ProductDAO dao = new ProductDAO();
        dao.deleteProduct(id);
        refreshTable();
        JOptionPane.showMessageDialog(this, "Produit supprimé avec succès");
        // refreshTable();
        }
        else {
            JOptionPane.showMessageDialog(this, "veuillez selectionner un produit à supprimer.");
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

                                     
    String pr_nom = p_nom.getText();
String idd = idfield.getText();
int id;

try {
    id = Integer.parseInt(idd);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid ID. Please enter a valid numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

String pr_prix_str = p_prix.getText();
String pr_qt_str = p_qt.getText();
String pr_im = p_i.getText();
String pr_code = p_code.getText();
String pr_cat = p_cat.getSelectedItem().toString();
String pr_f = p_f.getSelectedItem().toString();

if (pr_nom.isEmpty() || pr_prix_str.isEmpty() || pr_qt_str.isEmpty() || pr_im.isEmpty() || pr_code.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    double pr_prix = Double.parseDouble(pr_prix_str);
    int pr_qt = Integer.parseInt(pr_qt_str);

    CategoryDAO cd = new CategoryDAO();
    ProviderDAO pd = new ProviderDAO();
    ProductDAO dao = new ProductDAO();
    Product p = new Product();
    int categoryId = cd.getCategoryIdByName(pr_cat);
    int providerId = pd.getProviderIdByName(pr_f);

    p.setId(id);
    p.setName(pr_nom);
    p.setQuantity(pr_qt);
    p.setPrice(pr_prix);
    p.setCategoryId(categoryId);
    p.setProviderId(providerId);
    p.setImages(pr_im);
    p.setCodeBar(pr_code);

    dao.updateProduct(p);
    refreshTable();
    JOptionPane.showMessageDialog(this, "Produit modifié avec succès");

    // Make sure to handle visibility correctly
    add_p.setVisible(true);
    updatebtn.setVisible(false);

    idfield.setVisible(false);
    idlabel.setVisible(false);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Qualité ou prix invalide. Veuillez entrer une valeur numérique valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "An error occurred while updating the product.", "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_updatebtnActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed


 int index = jTable1.getSelectedRow();
        if (index != -1) {
        TableModel model = jTable1.getModel();
    
         int id = (int) model.getValueAt(index,0);   
        String nom = (String) model.getValueAt(index,1);
        String categorie = (String) model.getValueAt(index,2);
        //String prix = (String) model.getValueAt(index,3);
        Double prix = (Double) model.getValueAt(index,3);
         int qt =  (int) model.getValueAt(index,4);
           String code = (String) model.getValueAt(index,5);
           String fournisseur = (String) model.getValueAt(index,6);
           
           
       String qtt = Integer.toString(qt);  
       String prixx = Double.toString(prix);
       String idd = Integer.toString(id);
       p_nom.setText(nom); 
        p_cat.setSelectedItem(categorie);
        p_prix.setText(prixx);
        p_qt.setText(qtt);
        p_code.setText(code);
        p_f.setSelectedItem(fournisseur);
        
        
      idfield.setVisible(true);
        idlabel.setVisible(true);
      
        idfield.setText(idd);
        
       add_p.setVisible(false);                                         
        updatebtn.setVisible(true);
        
       
        // refreshTable();
        }
        else {
            JOptionPane.showMessageDialog(this, "veuillez selectionner une catégorie à éditer.");
        }




    }//GEN-LAST:event_editActionPerformed


    
    
    private void refreshTable() {
    ProductDAO dao = new ProductDAO();
    List<Product> productList = dao.getOutProducts();

    DefaultTableModel newTableModel = new DefaultTableModel(new Object[]{"ID", "Nom", "Catégorie", "Prix", "Quantité", "Code", "Fournisseur"}, 0);

    for (Product product : productList) {
        Object[] rowData = {product.getId(), product.getName(), product.getCategoryName(), product.getPrice(), product.getQuantity(), product.getCodeBar(), product.getProviderName()};
        newTableModel.addRow(rowData);
    }

    jTable1.setModel(newTableModel);
}

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_p;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private java.awt.Label idfield;
    private java.awt.Label idlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> p_cat;
    private javax.swing.JTextField p_code;
    private javax.swing.JComboBox<String> p_f;
    private javax.swing.JTextField p_i;
    private javax.swing.JTextField p_nom;
    private javax.swing.JTextField p_prix;
    private javax.swing.JTextField p_qt;
    private javax.swing.JButton r_p_b;
    private javax.swing.JTextField recherche_p;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}