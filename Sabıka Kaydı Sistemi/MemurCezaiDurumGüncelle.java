/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.*;

public class MemurCezaiDurumGüncelle extends javax.swing.JFrame {
public String gelenTc;
public String öncekiCezai;

Color old;
/**
     * Creates new form MemurCezaiDurumGüncelle
     */
    public MemurCezaiDurumGüncelle() {
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
    }
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconResmi.png"))); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MemurCezaiDurumGüncelle(Insan insan) {
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
        EnterTcNo.setText(insan.TcNo);
        EnterCezaiDurum.setText(insan.CezaiDurum);
        EnterSoyİsim.setText(insan.Soyİsim);
        Enterİsim.setText(insan.İsim);
        this.gelenTc=insan.TcNo;
        this.öncekiCezai=insan.CezaiDurum;
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
        lblCezaiDurumGüncellemeYazısı = new javax.swing.JLabel();
        lblİsimYazısı = new javax.swing.JLabel();
        lblSoyİsimYazısı = new javax.swing.JLabel();
        Enterİsim = new javax.swing.JLabel();
        EnterSoyİsim = new javax.swing.JLabel();
        lblTcNoYazısı = new javax.swing.JLabel();
        EnterTcNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EnterCezaiDurum = new javax.swing.JLabel();
        CezaiSeçenekler = new javax.swing.JComboBox();
        lblYeniCezaiYazısı = new javax.swing.JLabel();
        btnGüncelle = new javax.swing.JButton();
        btnÇıkış = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        lblCezaiDurumGüncellemeYazısı.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCezaiDurumGüncellemeYazısı.setText("Cezai Durum Güncelleme ");

        lblİsimYazısı.setText("İsim :");

        lblSoyİsimYazısı.setText("Soyisim :");

        lblTcNoYazısı.setText("TC No :");

        jLabel1.setText("Mevcut Cezai Durum :");

        EnterCezaiDurum.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        CezaiSeçenekler.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Serbest", "Denetimli Serbest", "Aranıyor" }));

        lblYeniCezaiYazısı.setText("Yeni Cezai Durum :");

        btnGüncelle.setText("Güncelle");
        btnGüncelle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        btnGüncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGüncelleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGüncelleMouseExited(evt);
            }
        });
        btnGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGüncelleActionPerformed(evt);
            }
        });

        btnÇıkış.setText("Çıkış");
        btnÇıkış.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        btnÇıkış.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnÇıkışMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnÇıkışMouseExited(evt);
            }
        });
        btnÇıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÇıkışActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCezaiDurumGüncellemeYazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CezaiSeçenekler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EnterCezaiDurum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblYeniCezaiYazısı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTcNoYazısı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSoyİsimYazısı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(lblİsimYazısı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Enterİsim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnterSoyİsim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnterTcNo, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnÇıkış, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCezaiDurumGüncellemeYazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblİsimYazısı)
                    .addComponent(Enterİsim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoyİsimYazısı)
                    .addComponent(EnterSoyİsim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTcNoYazısı)
                    .addComponent(EnterTcNo))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterCezaiDurum)
                .addGap(18, 18, 18)
                .addComponent(lblYeniCezaiYazısı)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CezaiSeçenekler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnÇıkış, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÇıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÇıkışActionPerformed
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_btnÇıkışActionPerformed

    private void btnGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGüncelleActionPerformed
        VeriTabani vt=new VeriTabani();
        if(vt.cezaiGuncelle(CezaiSeçenekler.getSelectedItem().toString(),gelenTc)){
            MemurCezaiGüncelleTamam ok=new MemurCezaiGüncelleTamam(this.öncekiCezai,CezaiSeçenekler.getSelectedItem().toString());
            this.öncekiCezai=CezaiSeçenekler.getSelectedItem().toString();
            EnterCezaiDurum.setText(CezaiSeçenekler.getSelectedItem().toString());
            ok.setVisible(true);
            this.repaint();
        }else{
            kisiBulunamadı hata=new kisiBulunamadı();
            hata.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnGüncelleActionPerformed

    private void btnGüncelleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGüncelleMouseEntered
        old=btnGüncelle.getForeground();
        btnGüncelle.setForeground(Color.red);
    }//GEN-LAST:event_btnGüncelleMouseEntered

    private void btnGüncelleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGüncelleMouseExited
       btnGüncelle.setForeground(old); // TODO add your handling code here:
    }//GEN-LAST:event_btnGüncelleMouseExited

    private void btnÇıkışMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnÇıkışMouseEntered
       old=btnÇıkış.getForeground();
       btnÇıkış.setForeground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_btnÇıkışMouseEntered

    private void btnÇıkışMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnÇıkışMouseExited
     btnÇıkış.setForeground(old);   // TODO add your handling code here:
    }//GEN-LAST:event_btnÇıkışMouseExited

    
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
            java.util.logging.Logger.getLogger(MemurCezaiDurumGüncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemurCezaiDurumGüncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemurCezaiDurumGüncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemurCezaiDurumGüncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemurCezaiDurumGüncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CezaiSeçenekler;
    private javax.swing.JLabel EnterCezaiDurum;
    private javax.swing.JLabel EnterSoyİsim;
    private javax.swing.JLabel EnterTcNo;
    private javax.swing.JLabel Enterİsim;
    private javax.swing.JButton btnGüncelle;
    private javax.swing.JButton btnÇıkış;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCezaiDurumGüncellemeYazısı;
    private javax.swing.JLabel lblSoyİsimYazısı;
    private javax.swing.JLabel lblTcNoYazısı;
    private javax.swing.JLabel lblYeniCezaiYazısı;
    private javax.swing.JLabel lblİsimYazısı;
    // End of variables declaration//GEN-END:variables
}
