

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class adsPanel extends javax.swing.JPanel {

    
    Image img2;
       Thread t;
    public adsPanel() {
        initComponents();
      
    }
   
    
    ImageIcon img[] = new ImageIcon[40];
  
    final void load(){
	    
	    for (int i = 0; i < 40; i++) {
		 img[i] = new ImageIcon(getClass().getResource("/images/" + String.valueOf(i+1) + ".jpg"));
	    }
  
    }
    
  void changeImage(){
      load();
      changeImage2();
  }  
   
    private void changeImage2(){
        load();
     
       
        t = new Thread(){
         @Override
        public void run(){
            while(true){
                    for(int j = 0; j < img.length; j++){
                        jLabel1.setIcon(img[j]);

                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                    }
            }
        }
      };
        t.start();
    }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
