/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Amin.java
 *
 * Created on 23 Feb, 2013, 12:41:13 PM
 */
/**
 *
 * @author hp
 */


import java.awt.CardLayout;
import java.util.*;
import java.util.logging.*;


public class Amin extends javax.swing.JFrame {

	
	Person per;
	Thread th;
	public Amin(Person p) {
		initComponents();
		this.per = p;
		obtaindate();
		CardLayout card = (CardLayout) display.getLayout();
		card.show(display, "product");
		
		this.setResizable(false);
             
		userid_txt.setText("Welcome, " + per.name);
		
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JPanel();
        MCUlogo = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userid_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        date_text = new javax.swing.JLabel();
        bgBanner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        admiinAccount1 = new admiinAccount();
        adminMemberInfo1 = new AdminMemberInfo();
        adminProduct1 = new AdminProduct();
        admnReport1 = new AdmnReport();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MCU Admin");

        Banner.setBackground(new java.awt.Color(255, 255, 255));

        MCUlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mculogo2.gif"))); // NOI18N

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        jButton2.setText("Account");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        jButton3.setText("Product");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mamber.png"))); // NOI18N
        jButton4.setText("Members");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jButton5.setText("Report");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(1);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5signOutActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign-Shutdown-icon.png"))); // NOI18N
        jButton1.setText("Sign Out");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 30));
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("MCU Online Shoping");

        userid_txt.setFont(new java.awt.Font("Miriam Fixed", 0, 18));
        userid_txt.setForeground(new java.awt.Color(0, 204, 102));
        userid_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userid_txt.setText("Welcome, Username");

        time_txt.setFont(new java.awt.Font("Tahoma", 0, 14));
        time_txt.setText("hh:mm:ss");

        date_text.setFont(new java.awt.Font("Tahoma", 0, 14));
        date_text.setText("dd/mm/yyy");

        bgBanner.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.png"))); // NOI18N
        bgBanner.add(jLabel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MCUlogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(userid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BannerLayout.createSequentialGroup()
                    .addComponent(bgBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(date_text, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MCUlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BannerLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(bgBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        display.setLayout(new java.awt.CardLayout());
        display.add(admiinAccount1, "account");
        display.add(adminMemberInfo1, "member");
        display.add(adminProduct1, "product");
        display.add(admnReport1, "report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(81, Short.MAX_VALUE)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(552, Short.MAX_VALUE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-905)/2, (screenSize.height-694)/2, 905, 694);
    }// </editor-fold>//GEN-END:initComponents
	
	
	private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
		th.stop();
		dispose();
		LoginFrame lf = new LoginFrame();
		lf.setVisible(true);
		
	}//GEN-LAST:event_signOutActionPerformed

	private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
		CardLayout card = (CardLayout) display.getLayout();
                admiinAccount1.vsetTextField();
		admiinAccount1.repaint();
		card.show(display, "account");
	}//GEN-LAST:event_accountActionPerformed
       
	private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
		 CardLayout card = (CardLayout) display.getLayout();
		 card.show(display, "product");
	}//GEN-LAST:event_ProductActionPerformed

	private void MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberActionPerformed
		 CardLayout card = (CardLayout) display.getLayout();
		 card.show(display, "member");
	}//GEN-LAST:event_MemberActionPerformed

	private void jButton5signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5signOutActionPerformed
		CardLayout card = (CardLayout) display.getLayout();
		 card.show(display, "report");
	}//GEN-LAST:event_jButton5signOutActionPerformed
	
	private void obtaindate()
	{
		th = new Thread() {

			@Override
			public void run() {
				
				for (; true;) {
					Calendar cd = new GregorianCalendar();
				
					int mon = cd.get(Calendar.MONTH);
					mon++;
					int year = cd.get(Calendar.YEAR);
					int day = cd.get(Calendar.DAY_OF_MONTH);
					date_text.setText("" + day + "/" + mon + "/" + year);	
				
					int hh = cd.get(Calendar.HOUR_OF_DAY);
					int min = cd.get(Calendar.MINUTE);
					int sec = cd.get(Calendar.SECOND);
					time_txt.setText("" + hh + ":" + min + ":" + sec);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						Logger.getLogger(Amin.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		};
		
		th.start();
		
 	}
	
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
			java.util.logging.Logger.getLogger(Amin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Amin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Amin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Amin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

                    @Override
			public void run() {
				new Amin(new Administrator()).setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JLabel MCUlogo;
    private admiinAccount admiinAccount1;
    private AdminMemberInfo adminMemberInfo1;
    private AdminProduct adminProduct1;
    private AdmnReport admnReport1;
    private javax.swing.JPanel bgBanner;
    private javax.swing.JLabel date_text;
    private javax.swing.JPanel display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel time_txt;
    private javax.swing.JLabel userid_txt;
    // End of variables declaration//GEN-END:variables
    
	
}
