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
import FormGVpanel.PanelKQ;
import java.sql.*;
import javax.swing.JOptionPane;


public class GVForm extends javax.swing.JFrame {
private Connection connection;
    JPanelNHCH NHCH = new JPanelNHCH();
    TThsPanel TThs = new TThsPanel();
    JPanelBT BT = new JPanelBT();
    JPanelDSBT DSBT = new JPanelDSBT();
    JPanelDSNHCH DSNHCH = new JPanelDSNHCH();
    PanelKQ KQ = new PanelKQ();
    
    
    public GVForm() {
        initComponents();
        loadlabel();
        
        jLayeredPaneGV.add(TThs);
        jLayeredPaneGV.add(BT);
        jLayeredPaneGV.add(DSBT);
        jLayeredPaneGV.add(DSNHCH);
        jLayeredPaneGV.add(NHCH);
        jLayeredPaneGV.add(KQ);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
        KQ.setVisible(false);
       // nut them
        DSNHCH.setButtonListener(e -> onButtonThemNHCH());
        TThs.btnxemListener(e -> onxembtn());
    }
    private void loadlabel(){
        String query,query1,query2;
        query ="SELECT COUNT(*) AS total FROM student";
        query1 = "SELECT COUNT(*) AS total1 FROM bai_tap";
        query2 = "SELECT COUNT(*) AS total2 FROM n_hang_ch";
        try{
        connection = DBConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        PreparedStatement statement1 = connection.prepareStatement(query1);
        PreparedStatement statement2 = connection.prepareStatement(query2);
        ResultSet resultSet = statement.executeQuery();
        ResultSet resultSet1 = statement1.executeQuery();
        ResultSet resultSet2 = statement2.executeQuery();
         if (resultSet.next()) {
                String total = resultSet.getString("total");
                Shs.setText(total);
                System.out.println("Số lượng bản ghi trong bảng: " + total);
            }
          if (resultSet1.next()) {
                String total1 = resultSet1.getString("total1");
                sbt.setText(total1);
                System.out.println("Số lượng bản ghi trong bảng: " + total1);
            }
          if (resultSet2.next()) {
                String total2 = resultSet2.getString("total2");
                sch.setText(total2);
                System.out.println("Số lượng bản ghi trong bảng: " + total2);
            }
          
        }catch(Exception e){
           System.out.println("loi"+ e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabelTTHSinh = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelTrangchuGV = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabelBTGV = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabelDSBTGV = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabelNHCH_GV = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLayeredPaneGV = new javax.swing.JLayeredPane();
        TCPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Shs = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        sbt = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        sch = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1320, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/recent_app_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(1272, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1320, 50);

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
        jPanel10.setBounds(0, 90, 200, 50);

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
        jPanel11.setBounds(0, 140, 200, 50);

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
        jPanel14.setBounds(0, 190, 200, 50);

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
        jPanel15.setBounds(0, 240, 200, 50);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 630, 110, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 200, 746);

        jLayeredPaneGV.setPreferredSize(new java.awt.Dimension(1120, 750));
        jLayeredPaneGV.setLayout(new java.awt.CardLayout());

        TCPanel.setBackground(new java.awt.Color(255, 255, 255));
        TCPanel.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 150));

        Shs.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Shs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/school_students_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Shs, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Shs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TCPanel.add(jPanel5);
        jPanel5.setBounds(90, 80, 200, 150);

        jPanel12.setBackground(new java.awt.Color(255, 153, 0));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 150));

        sbt.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        sbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/school_material_ruler_pnecil_notebook_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sbt, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(sbt)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        TCPanel.add(jPanel12);
        jPanel12.setBounds(440, 80, 200, 150);

        jPanel13.setBackground(new java.awt.Color(255, 153, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 150));

        sch.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        sch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/extract_certificate_document_excellence_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sch, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(sch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        TCPanel.add(jPanel13);
        jPanel13.setBounds(770, 80, 200, 150);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Số học sinh");
        TCPanel.add(jLabel12);
        jLabel12.setBounds(90, 40, 130, 32);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Bài tập");
        TCPanel.add(jLabel13);
        jLabel13.setBounds(440, 40, 79, 32);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Câu hỏi đã tạo");
        TCPanel.add(jLabel14);
        jLabel14.setBounds(770, 40, 165, 32);

        jLayeredPaneGV.add(TCPanel, "card2");

        getContentPane().add(jLayeredPaneGV);
        jLayeredPaneGV.setBounds(200, 50, 1120, 750);

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
        KQ.setVisible(false);
        loadlabel();
    }//GEN-LAST:event_jLabelTTHSinhMouseClicked

    private void jLabelTrangchuGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTrangchuGVMouseClicked
        TCPanel.setVisible(true);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
        KQ.setVisible(false);
    }//GEN-LAST:event_jLabelTrangchuGVMouseClicked

    private void jLabelBTGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBTGVMouseClicked
        TCPanel.setVisible(false);
        TThs.setVisible(false);
        BT.setVisible(true);
        DSBT.setVisible(false);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
        KQ.setVisible(false);
    }//GEN-LAST:event_jLabelBTGVMouseClicked

    private void jLabelDSBTGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDSBTGVMouseClicked
        TCPanel.setVisible(false);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(true);
        DSNHCH.setVisible(false);
        NHCH.setVisible(false);
        KQ.setVisible(false);
        DSBT.load();
    }//GEN-LAST:event_jLabelDSBTGVMouseClicked
    
    private void jLabelNHCH_GVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNHCH_GVMouseClicked
       TCPanel.setVisible(false);
        TThs.setVisible(false);
        BT.setVisible(false);
        DSBT.setVisible(false);
        DSNHCH.setVisible(true);
        NHCH.setVisible(false);
        KQ.setVisible(false);
        DSNHCH.loadtable();
    }//GEN-LAST:event_jLabelNHCH_GVMouseClicked
    
     private void onButtonThemNHCH() {
       TCPanel.setVisible(false);
       TThs.setVisible(false);
       BT.setVisible(false);
       DSBT.setVisible(false);
       DSNHCH.setVisible(false);
       NHCH.setVisible(true);
       KQ.setVisible(false);
       
    }
     private void onxembtn(){
       TCPanel.setVisible(false);
       TThs.setVisible(false);
       BT.setVisible(false);
       DSBT.setVisible(false);
       DSNHCH.setVisible(false);
       NHCH.setVisible(false);
       KQ.setVisible(true);
       KQ.KQ();
     }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int overwrite = JOptionPane.showConfirmDialog(
                    null,
                    "Bạn có muốn đăng xuất không?",
                    "Xác nhận",
                    JOptionPane.YES_NO_OPTION
            );
            if (overwrite != JOptionPane.YES_OPTION) {
                return;
            }else{
           Login LoginFrame = new Login();
           LoginFrame.setVisible(true);
           LoginFrame.pack();
           LoginFrame.setLocationRelativeTo(null);
    this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Shs;
    private javax.swing.JPanel TCPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel sbt;
    private javax.swing.JLabel sch;
    // End of variables declaration//GEN-END:variables
}
