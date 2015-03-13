
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 
 * @author hp
 * 
 * 
 */

public class ShoppingFrame extends javax.swing.JFrame {
        public static ShoppingFrame sfPublic;
        public static Person per;
        CartClass cartObject;
	Thread th;
        
        public ShoppingFrame(Person per) {
                initComponents();
                this.setResizable(false);
                //thissetBounds(0, 0, 959, 600);
                
                obtaindate(); // Initialise Date-Time
                userid_txt.setText("Welcome, " + per.name);
                
                adsPanel1.changeImage(); // Start Thread for Image ads. :)
		
                this.sfPublic = this;
		this.per = per;
                history1.askParent();
                cartObject = new CartClass();
		product1.printTable(category1.firstItem());
                
                checkout1 = new Checkout();        /* Make new Checkout card manually. Unable from drag n drop! :( */
                account1 = new Account(); /* Make new Account card manually. Unable from drag n drop! :( */
                
                right.add(checkout1, "checkout");  /* Adding this card to right panel */
		right.add(account1, "account");    /* Adding this card to right panel */
		
                CardLayout card = (CardLayout) right.getLayout();
		card.show(right, "product");
                card = (CardLayout) left.getLayout();
                card.show(left, "category");
                
                
        }

	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        aboutUs = new javax.swing.JButton();
        help = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userid_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        date_text = new javax.swing.JLabel();
        MCUlogo = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        cartPanel1 = new CartPanel();
        updateProfile1 = new updateProfile();
        changePasswordUpdate1 = new ChangePasswordUpdate();
        product1 = new Product();
        history1 = new History();
        aboutUs1 = new aboutUs();
        help1 = new help();
        left = new javax.swing.JPanel();
        updateInformation1 = new UpdateInformation();
        category1 = new Category();
        ads = new javax.swing.JPanel();
        adsPanel1 = new adsPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MCU Online Shopping");

        Banner.setBackground(new java.awt.Color(204, 204, 255));

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
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HOME.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1361639918_shopping-cart.png"))); // NOI18N
        jButton3.setText("Cart");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        aboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AboutUs.jpg"))); // NOI18N
        aboutUs.setText("About Us");
        aboutUs.setFocusable(false);
        aboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(aboutUs);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        help.setText("Help");
        help.setFocusable(false);
        help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jToolBar1.add(help);

        signOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign-Shutdown-icon.png"))); // NOI18N
        signOut.setText("Sign Out");
        signOut.setFocusable(false);
        signOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jToolBar1.add(signOut);

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

        MCUlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mculogo2.gif"))); // NOI18N

        bg.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner - shoppinng.png"))); // NOI18N
        jLabel2.setOpaque(true);
        bg.add(jLabel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MCUlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userid_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                        .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(MCUlogo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(userid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(time_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        right.setLayout(new java.awt.CardLayout());
        right.add(cartPanel1, "cartpanel1");
        right.add(updateProfile1, "updateProfile");
        right.add(changePasswordUpdate1, "changePassword");
        right.add(product1, "product");
        right.add(history1, "history");
        right.add(aboutUs1, "about");
        right.add(help1, "help");

        left.setLayout(new java.awt.CardLayout());
        left.add(updateInformation1, "updateInfo");
        left.add(category1, "category");

        javax.swing.GroupLayout adsLayout = new javax.swing.GroupLayout(ads);
        ads.setLayout(adsLayout);
        adsLayout.setHorizontalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adsLayout.createSequentialGroup()
                .addComponent(adsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adsLayout.setVerticalGroup(
            adsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, 0, 1006, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ads, 0, 246, Short.MAX_VALUE)
                    .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, 246, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(right, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1013)/2, (screenSize.height-717)/2, 1013, 717);
    }// </editor-fold>//GEN-END:initComponents

	private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
		adsPanel1.t.stop();
		th.stop();
		new LoginFrame().setVisible(true);
                dispose();
	}//GEN-LAST:event_signOutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout card = (CardLayout) right.getLayout();
	card.show(right, "cartpanel1");
        cartPanel1.updater(cartObject.getList());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        account1.SetFields();
        CardLayout card = (CardLayout) right.getLayout();
	card.show(right, "account");
        account1.SetFields();
        card = (CardLayout) left.getLayout();
        card.show(left, "updateInfo");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ShoppingFrame sf = ShoppingFrame.sfPublic;
        CardLayout card2 = (CardLayout) sf.right.getLayout();
        card2.show(sf.right, "product");
        card2 = (CardLayout) sf.left.getLayout();
        card2.show(sf.left, "category");
    }//GEN-LAST:event_jButton1MouseClicked

	private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
		
		CardLayout card = (CardLayout) right.getLayout();
		card.show(right, "about");
		
	}//GEN-LAST:event_aboutUsActionPerformed

	private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
		CardLayout card = (CardLayout) right.getLayout();
		card.show(right, "help");
		
	}//GEN-LAST:event_helpActionPerformed

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
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ShoppingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				Person p = new Customer();
                                p.name = "viaksh";
                                p.uName = "iit2011209";
                                p.city = "city";
                                p.mobileno = "9234567567";
                                p.pass = "209";
				new ShoppingFrame(p).setVisible(true);
			}
		});
	}
	
   public void callProductPanel(String c) {
        
	product1.printTable(c);
    }
     
   
   public void actionOfButton(String buttonType) {
       if (buttonType.equals("+")) {
           product1.addToCart();
       }
       else {
           cartPanel1.deleteSelectedRow();
       }
   }
   
   public void addTOcartobject(String itemID) {
       cartObject.add(itemID, 1);
   }
   
   public void fillFields() {
       checkout1.fillFeilds();
   }
   
   public void setFieldsOfUpdateProfile() {
       updateProfile1.SetFields();
   }
   
   public void callHistoryPanelForUpdate() {
       history1.connection();
   }
   
   public void callProductPanelForSearch(ArrayList a) {
      product1.update(a);
  }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JLabel MCUlogo;
    private javax.swing.JButton aboutUs;
    private aboutUs aboutUs1;
    private javax.swing.JPanel ads;
    private adsPanel adsPanel1;
    private javax.swing.JPanel bg;
    private CartPanel cartPanel1;
    private Category category1;
    private ChangePasswordUpdate changePasswordUpdate1;
    private javax.swing.JLabel date_text;
    private javax.swing.JButton help;
    private help help1;
    private History history1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JPanel left;
    private Product product1;
    public javax.swing.JPanel right;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel time_txt;
    private UpdateInformation updateInformation1;
    private updateProfile updateProfile1;
    private javax.swing.JLabel userid_txt;
    // End of variables declaration//GEN-END:variables

    private Checkout checkout1;
    private Account account1;
    
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
    
}
