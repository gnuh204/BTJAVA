/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package packageapp;

import FormGVpanel.JPanelBT;
import FormGVpanel.JPanelDSBT;
import FormGVpanel.JPanelDSNHCH;
import FormGVpanel.TThsPanel;
import FormGVpanel.JPanelNHCH;


public class GVForm extends javax.swing.JFrame {
    JPanelNHCH NHCH = new JPanelNHCH();
    TThsPanel TThs = new TThsPanel();
    JPanelBT BT = new JPanelBT();
    JPanelDSBT DSBT = new JPanelDSBT();
    JPanelDSNHCH DSNHCH = new JPanelDSNHCH();
    
    
    public GVForm() {
        initComponents();
        jLayeredPaneGV.add(TThs);
        jLayeredPaneGV.add(BT);
        jLayeredPaneGV.add(DSBT);
        jLayeredPaneGV.add(DSNHCH);
        jLayeredPaneGV.add(NHCH);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
        
        
        DSNHCH.setButtonListener(e -> onButtonThemNHCH());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabelTTHSinh = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelTrangchuGV = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabelBTGV = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabelDSBTGV = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabelNHCH_GV = new javax.swing.JLabel();
        jLayeredPaneGV = new javax.swing.JLayeredPane();
        TCPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/recent_app_icon.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 102, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow_return_icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 822, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 50);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 750));
        jPanel2.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabelTTHSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTTHSinh.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTTHSinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account_icon.png"))); // NOI18N
        jLabelTTHSinh.setText("Thông tin học sinh");
        jLabelTTHSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTTHSinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTTHSinh, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTTHSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel10);
        jPanel10.setBounds(0, 120, 200, 50);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabelTrangchuGV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTrangchuGV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTrangchuGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home_button_icon.png"))); // NOI18N
        jLabelTrangchuGV.setText("Trang chủ");
        jLabelTrangchuGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTrangchuGVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTrangchuGV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTrangchuGV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(0, 40, 200, 50);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account_icon.png"))); // NOI18N
        jLabel6.setText("Thông tin học sinh");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(0, 120, 200, 50);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabelBTGV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBTGV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBTGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document_icon.png"))); // NOI18N
        jLabelBTGV.setText("Bài tập");
        jLabelBTGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBTGVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBTGV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBTGV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(0, 170, 200, 50);

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));
        jPanel14.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabelDSBTGV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDSBTGV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDSBTGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder_icon.png"))); // NOI18N
        jLabelDSBTGV.setText("Danh sách bài tập");
        jLabelDSBTGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDSBTGVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDSBTGV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDSBTGV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(0, 220, 200, 50);

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabelNHCH_GV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNHCH_GV.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNHCH_GV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_diskette_icon.png"))); // NOI18N
        jLabelNHCH_GV.setText("Ngân hàng câu hỏi");
        jLabelNHCH_GV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNHCH_GVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNHCH_GV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNHCH_GV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel15);
        jPanel15.setBounds(0, 270, 200, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 200, 746);

        jLayeredPaneGV.setPreferredSize(new java.awt.Dimension(800, 750));
        jLayeredPaneGV.setLayout(new java.awt.CardLayout());

        TCPanel.setBackground(new java.awt.Color(255, 255, 255));
        TCPanel.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/school_students_icon.png"))); // NOI18N
        jLabel1.setText("1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TCPanel.add(jPanel5);
        jPanel5.setBounds(30, 86, 200, 150);

        jPanel12.setBackground(new java.awt.Color(255, 153, 0));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 150));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/school_material_ruler_pnecil_notebook_icon.png"))); // NOI18N
        jLabel10.setText("1");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        TCPanel.add(jPanel12);
        jPanel12.setBounds(300, 86, 200, 150);

        jPanel13.setBackground(new java.awt.Color(255, 153, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 150));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/extract_certificate_document_excellence_icon.png"))); // NOI18N
        jLabel11.setText("1");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        TCPanel.add(jPanel13);
        jPanel13.setBounds(570, 86, 200, 150);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Số học sinh");
        TCPanel.add(jLabel12);
        jLabel12.setBounds(30, 42, 130, 32);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Bài tập");
        TCPanel.add(jLabel13);
        jLabel13.setBounds(300, 42, 79, 32);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Câi hỏi đã tạo");
        TCPanel.add(jLabel14);
        jLabel14.setBounds(570, 42, 157, 32);

        jLayeredPaneGV.add(TCPanel, "card2");

        getContentPane().add(jLayeredPaneGV);
        jLayeredPaneGV.setBounds(200, 50, 800, 750);

        getAccessibleContext().setAccessibleName("FormGV");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTTHSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTTHSinhMouseClicked
        TCPanel.setVisible(false);
        TThs.setVisible(true);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
        
    }//GEN-LAST:event_jLabelTTHSinhMouseClicked

    private void jLabelTrangchuGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTrangchuGVMouseClicked
        TCPanel.setVisible(true);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
    }//GEN-LAST:event_jLabelTrangchuGVMouseClicked

    private void jLabelBTGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBTGVMouseClicked
        TCPanel.setVisible(false);
        TThs.setVisible(false);
    
        BT.setVisible(true);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
    }//GEN-LAST:event_jLabelBTGVMouseClicked

    private void jLabelDSBTGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDSBTGVMouseClicked
        TCPanel.setVisible(false);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(true);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
    }//GEN-LAST:event_jLabelDSBTGVMouseClicked
    
    private void jLabelNHCH_GVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNHCH_GVMouseClicked
       TCPanel.setVisible(false);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(true);
        NHCH.setVisible(false);
    }//GEN-LAST:event_jLabelNHCH_GVMouseClicked
    
     private void onButtonThemNHCH() {
       TCPanel.setVisible(false);
       TThs.setVisible(false);
       BT.setVisible(false);
       DSBT.setVisible(false);
       DSNHCH.setVisible(false);
       NHCH.setVisible(true);
    }
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    Login LoginFrame = new Login();
    LoginFrame.setVisible(true);
    LoginFrame.pack();
    LoginFrame.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TCPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBTGV;
    private javax.swing.JLabel jLabelDSBTGV;
    private javax.swing.JLabel jLabelNHCH_GV;
    private javax.swing.JLabel jLabelTTHSinh;
    private javax.swing.JLabel jLabelTrangchuGV;
    private javax.swing.JLayeredPane jLayeredPaneGV;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
