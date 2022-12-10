/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tvondemand1;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Θεοδόσης
 */
public class Admin_Clients_View extends javax.swing.JFrame implements DBConnection{

    /**
     * Creates new form Admin_Clients_View
     */
    public Admin_Clients_View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("User ID");

        jButton1.setText("View all users");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete user");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View film rental total");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("View series rental total");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton6.setText("New User");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Set Films and Series Prices");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
            Statement stmt = connectdata();
            stmt.execute("delete from LOGIN_STATUS where login_status_id = 1");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        this.dispose();
        Welcome_Page ob = new Welcome_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        try
            {
                
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                
                ResultSet rs=st.executeQuery("select user.id,user.first_name,user.last_name,user.email,user.create_date,user.user_type,user.discount,address.address,address.district,address.postal_code,address.phone,city.city,country.country from user, address,city,country where user.address_id=address.id AND address.city_id=city.id AND city.country_id=country.id");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String no,f_name,l_name,email,date,type,discount,address,district,postal,phone,city,country;
                while(rs.next()){
                    no=rs.getString(1);
                    f_name=rs.getString(2);
                    l_name=rs.getString(3);
                    email=rs.getString(4);
                    date=rs.getString(5);
                    type=rs.getString(6);
                    discount=rs.getString(7);
                    address=rs.getString(8);
                    district=rs.getString(9);
                    postal=rs.getString(10);
                    phone=rs.getString(11);
                    city=rs.getString(12);
                    country=rs.getString(13);
                    String[] row={no,f_name,l_name,email,date,type,discount,address,district,postal,phone,city,country};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            }
            
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
     
                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        try
            {
                
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                Statement stmt = connectdata();
                int user_id=Integer.valueOf(jTextField1.getText());
                ResultSet rs=st.executeQuery("select user_type from user where id='"+user_id+"'");
                rs.next();
                String user_type=rs.getString(1);
                if(user_type.equals("Admin")){
                    JOptionPane.showMessageDialog(this,"You can't delete this user.");
                }else{
                    stmt.execute("delete from film_payment where user_id='"+user_id+"'");
                    stmt.execute("delete from film_rental where user_id = '"+user_id+"'");
                    stmt.execute("delete from series_payment where user_id = '"+user_id+"'");
                    stmt.execute("delete from series_rental where user_id = '"+user_id+"'");
                    stmt.execute("delete from plan where user_id = '"+user_id+"'");
                    stmt.execute("delete from user where id = '"+user_id+"'");
                    
                    JOptionPane.showMessageDialog(this,"User with ID "+user_id+" deleted.");
                }
                
                
                    
                
            }
            
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try
            {
                
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                int user_id=Integer.valueOf(jTextField1.getText());
                
                ResultSet rs=st.executeQuery("Select user_type from user where id='"+user_id+"'");
                rs.next();
                String old_type = rs.getString(1);
                String user_type=jComboBox1.getSelectedItem().toString();
                if(old_type.equals("Customer")){
                    JOptionPane.showMessageDialog(this,"Can't change the plan type of the selected user!");
                }else{
                if (old_type.equals(user_type)){
                    JOptionPane.showMessageDialog(this,"Selected user already has the selected user type!");
                } else {
                    Statement stmt = connectdata();
                    stmt.executeUpdate("update user set user_type='"+user_type+"' where id='"+user_id+"'");
                    JOptionPane.showMessageDialog(this,"You have succesfully changed user's type to "+user_type+"!");
                }
                }
                
                    
                
            }
            
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        try
            {
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                
                ResultSet rs=st.executeQuery("select year(film_payment.payment_date) ,month(film_payment.payment_date),sum(total_amount)from film_payment group by year(film_payment.payment_date),month(film_payment.payment_date) order by year(film_payment.payment_date),month(film_payment.payment_date);");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String year,month,sum;
                while(rs.next()){
                    year=rs.getString(1);
                    month=rs.getString(2);
                    sum=rs.getString(3);
                    
                    String[] row={year,month,sum};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            
            }
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        try
            {
                
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                
                ResultSet rs=st.executeQuery("select year(series_payment.payment_date)  ,month(series_payment.payment_date) ,sum(total_amount) from series_payment group by year(series_payment.payment_date),month(series_payment.payment_date) order by year(series_payment.payment_date),month(series_payment.payment_date);");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String year,month,sum;
                while(rs.next()){
                    year=rs.getString(1);
                    month=rs.getString(2);
                    sum=rs.getString(3);
                    
                    String[] row={year,month,sum};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            
            }
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        Admin_New_User ob = new Admin_New_User();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        Admin_Set_Prices ob = new Admin_Set_Prices();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Clients_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Clients_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Clients_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Clients_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Clients_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
