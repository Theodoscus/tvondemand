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
public class User_S_and_M extends javax.swing.JFrame implements DBConnection{

    /**
     * Creates new form User_Main
     */
    public User_S_and_M() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("My Rentals");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setText("Rent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton10))
                .addGap(15, 15, 15))
        );

        jButton4.setText("Rent Film");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("RENT A FILM!");
        jLabel1.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("Film ID");

        jLabel2.setText("Insert the film's ID you want to rent!");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("RENT AN EPISODE!");
        jLabel3.setToolTipText("");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jTextField2.setText("Series ID");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Insert the serie's ID you want to view cycles");

        jButton5.setText("View cycles");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View All Films");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("View All Series");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("View details");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField3.setText("Cycle ID");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Insert the cycle's ID you want to view episodes");

        jButton9.setText("View episodes");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setText("Rent Series");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField5.setText("Episode ID");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton13.setText("View details");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel7.setText("Insert the episode's ID you want to rent!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(289, 289, 289)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField2)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton13))
                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1)))
                .addGap(0, 125, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==1||user_plan==3){
                stmt = connectdata();
                int Film_id=Integer.valueOf(jTextField1.getText());
                stmt.executeUpdate("insert into film_inventory(film_id) values ('"+Film_id+"')");
                rs =   stmt.executeQuery("Select id from film_inventory where film_id='"+Film_id+"' AND id=(SELECT MAX(ID) FROM film_inventory)");
                rs.next();
                int inv_id = Integer.valueOf(rs.getString(1));
                rs =   stmt.executeQuery("Select user_id from login_status where Login_Status_id=1");
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                stmt.executeUpdate("insert into film_rental(user_id,rental_date,film_inventory_id) values ('"+user_id+"',NOW(),'"+inv_id+"')");
                double total_amount=0;
                rs =   stmt.executeQuery("Select discount from user where id='"+user_id+"'");
                rs.next();
                double user_discount = Double.valueOf(rs.getString(1));
                if(user_plan==1){
                rs =   stmt.executeQuery("select movies_price from plan_type where id=1");
                rs.next();
                double movie_price= Double.valueOf(rs.getString(1));
                total_amount=user_discount*movie_price;
                } else if (user_plan==3){
                rs =   stmt.executeQuery("select movies_price from plan_type where id=3");
                rs.next();
                double movie_price= Double.valueOf(rs.getString(1));
                total_amount=user_discount*movie_price;
                }
                int result = JOptionPane.showConfirmDialog(this, "Do you wish to pay "+total_amount+"$ to rent this film?");
        if (result == 0){
            rs =   stmt.executeQuery("Select id from film_rental where film_inventory_id='"+inv_id+"'");
            rs.next();
            int rent_id = Integer.valueOf(rs.getString(1));
            rs =   stmt.executeQuery("Select id from plan where user_id='"+user_id+"'");
            rs.next();
            int user_plan_id = Integer.valueOf(rs.getString(1));
            stmt.executeUpdate("insert into film_payment(plan_id,total_amount,payment_date,user_id,film_rental_id) values ('"+user_plan_id+"','"+total_amount+"',NOW(),'"+user_id+"','"+rent_id+"')");
        }
        else if (result == 1){
            stmt.execute("delete from film_rental where film_inventory_id='"+inv_id+"'");
            stmt.execute("delete from film_inventory where id='"+inv_id+"'");
        }
        else{
            stmt.execute("delete from film_rental where film_inventory_id='"+inv_id+"'");
            stmt.execute("delete from film_inventory where id='"+inv_id+"'");
        }
            
                
            } else if (user_plan==2){
                JOptionPane.showMessageDialog(this,"Your plan type does not include films!");
            }
            }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
         model.setRowCount(0);
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==2||user_plan==3){
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                int Series_id=Integer.valueOf(jTextField2.getText());
                rs=st.executeQuery("Select id, title, release_year from cycle where series_id='"+Series_id+"'");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String no,tit,release;
                while(rs.next()){
                    no=rs.getString(1);
                    tit=rs.getString(2);
                    release=rs.getString(3);
                    String[] row={no,tit,release};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            }else if(user_plan==1){
                JOptionPane.showMessageDialog(this,"Your plan type does not include series!");
            }
            }
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==1||user_plan==3){
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                
                rs=st.executeQuery("Select id, title, length, rating, release_year, special_features from film");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String no,tit,leng,ratin,release,features;
                while(rs.next()){
                    no=rs.getString(1);
                    tit=rs.getString(2);
                    leng=rs.getString(3);
                    ratin=rs.getString(4);
                    release=rs.getString(5);
                    features=rs.getString(6);
                    String[] row={no,tit,leng,ratin,release,features};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            }else if(user_plan==2){
                JOptionPane.showMessageDialog(this,"Your plan type does not include films!");
            }
            }
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
         model.setRowCount(0);
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==2||user_plan==3){
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                
                rs=st.executeQuery("Select id, title, rating, release_year from series");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String no,tit,leng,ratin,release,features;
                while(rs.next()){
                    no=rs.getString(1);
                    tit=rs.getString(2);
                    ratin=rs.getString(3);
                    release=rs.getString(4);
                    String[] row={no,tit,ratin,release};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            }else if(user_plan==1){
                JOptionPane.showMessageDialog(this,"Your plan type does not include series!");
            }
            }
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==1||user_plan==3){
                    int Film_id=Integer.valueOf(jTextField1.getText());
                    rs = stmt.executeQuery("Select description,language_id from film where id='"+Film_id+"'");
                    rs.next();
                    String descr = rs.getString(1);
                    int lang_id = Integer.valueOf(rs.getString(2));
              
                    rs = stmt.executeQuery("Select name from language where id='"+lang_id+"'");
                    rs.next();
                    String language = rs.getString(1);
                    JOptionPane.showMessageDialog(this,"Description: "+descr+"\nLanguage: "+language);
                    
                } else if(user_plan==2){
                JOptionPane.showMessageDialog(this,"Your plan type does not include films!");}
            } catch(Exception e) {
                 JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
         model.setRowCount(0);
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==2||user_plan==3){
                Connection con=DBConnection.getConnection();
                Statement st=con.createStatement();
                int Cycle_id=Integer.valueOf(jTextField3.getText());
                rs=st.executeQuery("Select id, title, duration, release_year, description from episode where cycle_id= '"+Cycle_id+"'");
                ResultSetMetaData rsmd=rs.getMetaData();
                
                
                int cols=rsmd.getColumnCount();
                String[] colName= new String[cols];
                for (int i=0;i<cols;i++)
                    colName[i]=rsmd.getColumnName(i+1);
                model.setColumnIdentifiers(colName);
                String no,tit,dur,release,des;
                while(rs.next()){
                    no=rs.getString(1);
                    tit=rs.getString(2);
                    dur=rs.getString(3);
                    release=rs.getString(4);
                    des=rs.getString(5);
                    String[] row={no,tit,dur,release,des};
                    model.addRow(row);
                }
                st.close();
                con.close();
                    
                
            }else if(user_plan==1){
                JOptionPane.showMessageDialog(this,"Your plan type does not include series!");
            }
            }
            
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
                                 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try
            {
                Statement stmt = connectdata();
                ResultSet rs =   stmt.executeQuery("Select plan_type from login_status where Login_Status_id=1");
                rs.next();
                int user_plan = Integer.valueOf(rs.getString(1));
                if (user_plan==2||user_plan==3){
                stmt = connectdata();
                int episode_id=Integer.valueOf(jTextField5.getText());
                stmt.executeUpdate("insert into series_inventory(episode_id) values ('"+episode_id+"')");
                rs =   stmt.executeQuery("Select id from series_inventory where episode_id='"+episode_id+"' AND id=(SELECT MAX(ID) FROM series_inventory)");
                rs.next();
                int inv_id = Integer.valueOf(rs.getString(1));
                rs =   stmt.executeQuery("Select user_id from login_status where Login_Status_id=1");
                rs.next();
                int user_id = Integer.valueOf(rs.getString(1));
                stmt.executeUpdate("insert into series_rental(rental_date,series_inventory_id, user_id) values (NOW(),'"+inv_id+"','"+user_id+"')");
                double total_amount=0;
                rs =   stmt.executeQuery("Select discount from user where id='"+user_id+"'");
                rs.next();
                double user_discount = Double.valueOf(rs.getString(1));
                System.out.println(user_discount);
                if(user_plan==2){
                rs =   stmt.executeQuery("select series_price from plan_type where id=2");
                rs.next();
                double series_price= Double.valueOf(rs.getString(1));
                total_amount=user_discount*series_price;
                } else if (user_plan==3){
                rs =   stmt.executeQuery("select series_price from plan_type where id=3");
                rs.next();
                double series_price= Double.valueOf(rs.getString(1));
                total_amount=user_discount*series_price;
                }
                int result = JOptionPane.showConfirmDialog(this, "Do you wish to pay "+total_amount+"$ to rent this episode?");
        if (result == 0){
            rs =   stmt.executeQuery("Select id from series_rental where series_inventory_id='"+inv_id+"'");
            rs.next();
            int rent_id = Integer.valueOf(rs.getString(1));
            rs =   stmt.executeQuery("Select id from plan where user_id='"+user_id+"'");
            rs.next();
            int user_plan_id = Integer.valueOf(rs.getString(1));
            stmt.executeUpdate("insert into series_payment(total_amount,payment_date,user_id,series_rental_id,plan_id) values ('"+total_amount+"',NOW(),'"+user_id+"','"+rent_id+"','"+user_plan_id+"')");
        }
        else if (result == 1){
            stmt.execute("delete from series_rental where series_inventory_id='"+inv_id+"'");
            stmt.execute("delete from series_inventory where id='"+inv_id+"'");
        }
        else{
            stmt.execute("delete from series_rental where series_inventory_id='"+inv_id+"'");
            stmt.execute("delete from series_inventory where id='"+inv_id+"'");
        }
            
                
            } else if (user_plan==1){
                JOptionPane.showMessageDialog(this,"Your plan type does not include series!");
            }
            }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
                        Customer_Rentals ob = new Customer_Rentals();
                        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Customer_Account ob = new Customer_Account();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(User_S_and_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_S_and_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_S_and_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_S_and_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_S_and_M().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}