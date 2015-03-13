/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * admiinAccount.java
 *
 * Created on Mar 6, 2013, 7:18:26 PM
 */
/**
 *
 * @author hp
 */
import java.awt.CardLayout;
import java.sql.*;
import javax.swing.*;

public class admiinAccount extends javax.swing.JPanel {

	/** Creates new form admiinAccount */
	Person per;
	public admiinAccount() {
		initComponents();
		
	}
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jusername = new javax.swing.JLabel();
        jcity = new javax.swing.JLabel();
        jemail_id = new javax.swing.JLabel();
        jmobilenumber = new javax.swing.JLabel();
        jtextcity = new javax.swing.JTextField();
        jtextname = new javax.swing.JTextField();
        jtextemail_id = new javax.swing.JTextField();
        jtextmobile = new javax.swing.JTextField();
        jsavechange = new javax.swing.JButton();
        jlabelconpasswd = new javax.swing.JLabel();
        Jlabelpasswd = new javax.swing.JLabel();
        jconfirmpassword = new javax.swing.JPasswordField();
        jpassword = new javax.swing.JPasswordField();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1161, 548));
        setLayout(null);

        jusername.setBackground(new java.awt.Color(255, 0, 204));
        jusername.setFont(new java.awt.Font("Calibri", 0, 24));
        jusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jusername.setText("Name");
        add(jusername);
        jusername.setBounds(139, 85, 237, 52);

        jcity.setBackground(new java.awt.Color(255, 51, 255));
        jcity.setFont(new java.awt.Font("Calibri", 0, 24));
        jcity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jcity.setText("                      City   ");
        add(jcity);
        jcity.setBounds(221, 268, 163, 51);

        jemail_id.setBackground(new java.awt.Color(255, 0, 255));
        jemail_id.setFont(new java.awt.Font("Calibri", 0, 24));
        jemail_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jemail_id.setText("          Email ID");
        add(jemail_id);
        jemail_id.setBounds(139, 148, 237, 47);

        jmobilenumber.setBackground(new java.awt.Color(255, 0, 255));
        jmobilenumber.setFont(new java.awt.Font("Calibri", 0, 24));
        jmobilenumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jmobilenumber.setText("                     Mobile name");
        add(jmobilenumber);
        jmobilenumber.setBounds(157, 203, 237, 52);

        jtextcity.setFont(new java.awt.Font("Calibri", 0, 24));
        add(jtextcity);
        jtextcity.setBounds(394, 270, 232, 46);

        jtextname.setFont(new java.awt.Font("Calibri", 0, 24));
        add(jtextname);
        jtextname.setBounds(394, 88, 232, 46);

        jtextemail_id.setEditable(false);
        jtextemail_id.setFont(new java.awt.Font("Calibri", 0, 24));
        add(jtextemail_id);
        jtextemail_id.setBounds(394, 148, 232, 47);

        jtextmobile.setFont(new java.awt.Font("Calibri", 0, 24));
        add(jtextmobile);
        jtextmobile.setBounds(394, 206, 232, 47);

        jsavechange.setBackground(new java.awt.Color(51, 51, 255));
        jsavechange.setFont(new java.awt.Font("Calibri", 0, 14));
        jsavechange.setText("Save changes");
        jsavechange.setBorder(null);
        jsavechange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsavechangeActionPerformed(evt);
            }
        });
        add(jsavechange);
        jsavechange.setBounds(513, 517, 147, 41);

        jlabelconpasswd.setBackground(new java.awt.Color(255, 0, 255));
        jlabelconpasswd.setFont(new java.awt.Font("Calibri", 0, 24));
        jlabelconpasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlabelconpasswd.setText("Confirm Password");
        add(jlabelconpasswd);
        jlabelconpasswd.setBounds(199, 409, 177, 30);

        Jlabelpasswd.setBackground(new java.awt.Color(255, 0, 255));
        Jlabelpasswd.setFont(new java.awt.Font("Calibri", 0, 24));
        Jlabelpasswd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Jlabelpasswd.setText("Password");
        add(Jlabelpasswd);
        Jlabelpasswd.setBounds(149, 330, 227, 47);
        add(jconfirmpassword);
        jconfirmpassword.setBounds(394, 400, 232, 52);
        add(jpassword);
        jpassword.setBounds(394, 338, 232, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Snowflake.jpg"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(bg);
        bg.setBounds(0, 0, 910, 634);
    }// </editor-fold>//GEN-END:initComponents
	 private void connection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
            try {
                 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
                
		String str = "Update admin_table set admin_name = ?, admin_mob = ?, admin_city = ?, admin_pwd = ? where admin_id = ?";
                
               pst = conn.prepareStatement(str);
	       
                pst.setString(3, city);
                pst.setString(2, n);
		pst.setString(4, passwd1);
		pst.setString(1, name);
		pst.setString(5, per.uName);
		
		
		per.city = city;
		per.mobileno = n;
		per.pass = passwd1;
		per.name = name;
		
		pst.executeQuery();
		
		conn.commit();
                conn.close();
            } catch (SQLException ex) {
               System.out.println("errpr in connection");
            }
        
    }
	private void jsavechangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsavechangeActionPerformed
		  n = jtextmobile.getText();
		  name = jtextname.getText();
            city = jtextcity.getText();
            passwd1 = jpassword.getText();
            passwd2 = jconfirmpassword.getText();
         
            if(city.equals("") || passwd1.equals("") || passwd2.equals("") || n.length() < 10 || name.equals("")){
                JOptionPane.showMessageDialog(null, " please enter valid entry "," entry ", JOptionPane.DEFAULT_OPTION);
		    
            }else if(!passwd1.equals(passwd2)){
                JOptionPane.showMessageDialog(null, " password does not match ", " password confirmatin ", JOptionPane.DEFAULT_OPTION);
            }else {
                  
		    connection();
		    JOptionPane.showMessageDialog(this, "Profile changed successfully");
		    CardLayout card = (CardLayout) this.getParent().getLayout();
		    card.show(this.getParent(), "productcard");
            }
	}//GEN-LAST:event_jsavechangeActionPerformed
	
	 public void vsetTextField(){
		per = ((Amin)this.getTopLevelAncestor()).per;
		
		jtextname.setText(per.name);
		jtextemail_id.setText(per.uName);
		jtextmobile.setText(per.mobileno);
		jpassword.setText(per.pass);
		jtextcity.setText(per.city);
		jconfirmpassword.setText(per.pass);
        }
	 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabelpasswd;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jcity;
    private javax.swing.JPasswordField jconfirmpassword;
    private javax.swing.JLabel jemail_id;
    private javax.swing.JLabel jlabelconpasswd;
    private javax.swing.JLabel jmobilenumber;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JButton jsavechange;
    private javax.swing.JTextField jtextcity;
    private javax.swing.JTextField jtextemail_id;
    private javax.swing.JTextField jtextmobile;
    private javax.swing.JTextField jtextname;
    private javax.swing.JLabel jusername;
    // End of variables declaration//GEN-END:variables
     private String city;
     private String passwd1;
     private  String passwd2;
     private String n;
     private boolean flag;
     private Connection conn;
     private Statement st;
     private ResultSet rs;
     private PreparedStatement pst;
     private String name;
}
