
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vikash
 */
public class History extends javax.swing.JPanel {

    /**
     * Creates new form History
     */
    
    ArrayList arr;
    OrderClass object;
    DefaultTableModel model;
    Person per;
    
    public History() {
        
        initComponents();
	
    }

   public void askParent()
   {
	ShoppingFrame sf = (ShoppingFrame) this.getTopLevelAncestor();
	per = sf.per;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelhistory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jhistorytable = new javax.swing.JTable();
        jinvoicebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(754, 556));

        jpanelhistory.setOpaque(false);

        jScrollPane1.setOpaque(false);

        jhistorytable.setFillsViewportHeight(true);
        jhistorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jhistorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jhistorytable);

        jinvoicebutton.setBackground(new java.awt.Color(204, 204, 204));
        jinvoicebutton.setFont(new java.awt.Font("Monotype Corsiva", 0, 24));
        jinvoicebutton.setForeground(new java.awt.Color(102, 102, 255));
        jinvoicebutton.setText("View Invoice");
        jinvoicebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinvoicebuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Californian FB", 0, 36));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("          Shopping History");

        javax.swing.GroupLayout jpanelhistoryLayout = new javax.swing.GroupLayout(jpanelhistory);
        jpanelhistory.setLayout(jpanelhistoryLayout);
        jpanelhistoryLayout.setHorizontalGroup(
            jpanelhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelhistoryLayout.createSequentialGroup()
                .addContainerGap(567, Short.MAX_VALUE)
                .addComponent(jinvoicebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        jpanelhistoryLayout.setVerticalGroup(
            jpanelhistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelhistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jinvoicebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled-1.png"))); // NOI18N
        bg.add(jLabel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelhistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelhistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void jinvoicebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinvoicebuttonActionPerformed
           int index = jhistorytable.getSelectedRow();
           if (index >= 0) {
               new PrintFrame(object, per).setVisible(true);
           }
    }//GEN-LAST:event_jinvoicebuttonActionPerformed

    private void jhistorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jhistorytableMouseClicked
	    
	    
            int index = jhistorytable.getSelectedRow();
	   String o =  (String) jhistorytable.getValueAt(index,0);
	    int OrderId = Integer.parseInt(o);
	    for (int i = 0; i < arr.size(); i++) {
		   object = (OrderClass) arr.get(i); 
		   if (object.order_no == OrderId)
			 break;
	    } 
    }//GEN-LAST:event_jhistorytableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jhistorytable;
    private javax.swing.JButton jinvoicebutton;
    private javax.swing.JPanel jpanelhistory;
    // End of variables declaration//GEN-END:variables

  
    
    void connection(){
	    
	String Id = per.uName;
        arr = new ArrayList();
        Connection con = null;
	
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
	
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
            String query = "select * from log_table where CUSTOMER_ID = '" + Id + "'";
	    
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
	    
            boolean flag = false;
	    while(rs.next()){
		
		    flag = true;
		
		arr.add(new OrderClass(rs.getInt(1),rs.getDate(2),  rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
	   }
		if (!flag)
		 JOptionPane.showMessageDialog(jpanelhistory, "You have not Transacted yet.");
               
	    con.close();
        } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        addToTable(arr);
    }
    
    void addToTable(ArrayList arr){
        model = new DefaultTableModel(){
			@Override
		public boolean isCellEditable(int row, int column){
			return false;
			
		}
	};
        jhistorytable.setModel(model);
        model.addColumn("Order No");
        model.addColumn(" Shopping Date");
        model.addColumn("Toal Amount");
        for(int i = 0 ; i < arr.size(); i++){
            OrderClass ob = (OrderClass) arr.get(i);
            model.insertRow(i,new Object[]{ String.valueOf(ob.order_no), ob.date, ob.total_amount}); 
        }
        
    }
    
    
}
