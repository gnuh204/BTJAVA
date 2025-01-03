/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormHS;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import packageapp.DBConnection;


public class JPanelBTHS extends javax.swing.JPanel {
    private Connection connection;
   
    
  
    public JPanelBTHS() {
        initComponents();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
 
    }
    
 public class BaiKT {
    private static String ten;
    private static String monhoc;

    public static String getTen() {
        return ten;
    }
    public static String getMonhoc() {
        return monhoc;
    }

    public static void setTen(String ten) {
        BaiKT.ten = ten;
    }
    public static void setMonhoc(String monhoc) {
        BaiKT.monhoc = monhoc;
    }
}
    
    private void addExercisePanel(String title,String monhoc, String sentTime,JPanel mainPanel) {
    // Tạo JPanel cho bài tập mới
    JPanel exercisePanel = new JPanel();
    exercisePanel.setLayout(new BorderLayout());
    exercisePanel.setBorder(BorderFactory.createLineBorder(Color.PINK));
    exercisePanel.setPreferredSize(new Dimension(500, 50));  // Kích thước mặc định cho nhiều bài tập
    
    exercisePanel.putClientProperty("title", title);
    exercisePanel.putClientProperty("monhoc", monhoc);
    // Thông tin bài tập
    JPanel infoPanel = new JPanel();
    infoPanel.setLayout(new GridLayout(2, 1));

    JLabel titleLabel = new JLabel(title);
    titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

    JLabel timeLabel = new JLabel("Đã gửi vào lúc: " + sentTime);
    timeLabel.setFont(new Font("Arial", Font.PLAIN, 12));

    infoPanel.add(titleLabel);
    infoPanel.add(timeLabel);
    exercisePanel.add(infoPanel, BorderLayout.CENTER);
    // Thêm bài tập mới vào container chính
     exercisePanel.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Lấy thông tin từ panel khi click
            infoPanel.setBackground(Color.LIGHT_GRAY);
            String title = (String) exercisePanel.getClientProperty("title");
            String monhoc = (String) exercisePanel.getClientProperty("monhoc");
            BaiKT.setTen(title);
            BaiKT.setMonhoc(monhoc);
           System.out.println(title + monhoc);
            for (Component component : mainPanel.getComponents()) {
                JPanel container = (JPanel) component;
                for (Component subComponent : container.getComponents()) {
                    if (subComponent instanceof JPanel) {
                        JPanel otherExercisePanel = (JPanel) subComponent;
                        JPanel otherInfoPanel = (JPanel) otherExercisePanel.getComponent(0);
                        if (otherInfoPanel != infoPanel) {
                            otherInfoPanel.setBackground(Color.WHITE);  
                        }
                    }
                }
            }
        }
    });
    JPanel container = new JPanel();
    container.setLayout(new FlowLayout(FlowLayout.CENTER, 1,2));  // Không gian giữa các bài tập theo chiều dọc
    // Thêm bài tập vào container
    container.add(exercisePanel);
    // Thêm container vào mainPanel
    mainPanel.add(container);
    
    // Làm mới giao diện
    mainPanel.revalidate();
    mainPanel.repaint();
}
    private void dsbt(String ten_monhoc){
          String query;
        try{
        connection = DBConnection.getConnection();
        query = "SELECT  ten_bt,tg_tai_len FROM bai_tap WHERE ten_mh = '"+ten_monhoc+"'";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        mainPanel.removeAll(); 
        String monhoc = ten_monhoc;

         while (rs.next()) {
                String title = rs.getString("ten_bt");
                String sentTime = rs.getString("tg_tai_len");
                // Thêm bài tập mới vào giao diện
               addExercisePanel(title,monhoc, sentTime,mainPanel);
            }
        }catch(Exception e){
            System.out.println("loi"+ e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Paneltoan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paneltviet = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelkhoc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Lam_bai = new javax.swing.JButton();
        ScrollPanemain = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new java.awt.GridLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        Paneltoan.setBackground(new java.awt.Color(102, 102, 102));
        Paneltoan.setPreferredSize(new java.awt.Dimension(350, 130));
        Paneltoan.setRequestFocusEnabled(false);
        Paneltoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaneltoanMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaneltoanMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Toán");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/math_icon.png"))); // NOI18N

        javax.swing.GroupLayout PaneltoanLayout = new javax.swing.GroupLayout(Paneltoan);
        Paneltoan.setLayout(PaneltoanLayout);
        PaneltoanLayout.setHorizontalGroup(
            PaneltoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneltoanLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        PaneltoanLayout.setVerticalGroup(
            PaneltoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneltoanLayout.createSequentialGroup()
                .addGroup(PaneltoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneltoanLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(PaneltoanLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(Paneltoan);
        Paneltoan.setBounds(38, 35, 350, 130);

        paneltviet.setBackground(new java.awt.Color(102, 102, 102));
        paneltviet.setPreferredSize(new java.awt.Dimension(0, 130));
        paneltviet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneltvietMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiếng Việt");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/education_book_learn_icon.png"))); // NOI18N

        javax.swing.GroupLayout paneltvietLayout = new javax.swing.GroupLayout(paneltviet);
        paneltviet.setLayout(paneltvietLayout);
        paneltvietLayout.setHorizontalGroup(
            paneltvietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltvietLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        paneltvietLayout.setVerticalGroup(
            paneltvietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltvietLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paneltvietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(paneltviet);
        paneltviet.setBounds(40, 210, 350, 130);

        panelkhoc.setBackground(new java.awt.Color(102, 102, 102));
        panelkhoc.setPreferredSize(new java.awt.Dimension(0, 130));
        panelkhoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelkhocMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Khoa Học");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/puzzle_icon_149707.png"))); // NOI18N

        javax.swing.GroupLayout panelkhocLayout = new javax.swing.GroupLayout(panelkhoc);
        panelkhoc.setLayout(panelkhocLayout);
        panelkhocLayout.setHorizontalGroup(
            panelkhocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkhocLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panelkhocLayout.setVerticalGroup(
            panelkhocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkhocLayout.createSequentialGroup()
                .addGroup(panelkhocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelkhocLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(panelkhocLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(panelkhoc);
        panelkhoc.setBounds(40, 390, 350, 130);

        add(jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(610, 550));

        Lam_bai.setBackground(new java.awt.Color(0, 204, 102));
        Lam_bai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lam_bai.setForeground(new java.awt.Color(255, 255, 255));
        Lam_bai.setText("Làm Bài");
        Lam_bai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lam_baiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        ScrollPanemain.setViewportView(mainPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollPanemain)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 410, Short.MAX_VALUE)
                        .addComponent(Lam_bai, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(ScrollPanemain, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lam_bai, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    public void LamBaiButtonListener(java.awt.event.ActionListener listener) {
        Lam_bai.addActionListener(listener);
        
    }
    private void Lam_baiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lam_baiActionPerformed
        
    }//GEN-LAST:event_Lam_baiActionPerformed

    private void PaneltoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneltoanMouseClicked
        Paneltoan.setBackground(Color.LIGHT_GRAY);
        String ten_monhoc = "Toán";
        dsbt(ten_monhoc);
        paneltviet.setBackground(new Color(102, 102, 102));
        panelkhoc.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_PaneltoanMouseClicked

    private void paneltvietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltvietMouseClicked
        String ten_monhoc = "Tiếng Việt";
        dsbt(ten_monhoc);
        paneltviet.setBackground(Color.LIGHT_GRAY);
        Paneltoan.setBackground(new Color(102, 102, 102));
        panelkhoc.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_paneltvietMouseClicked

    private void PaneltoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneltoanMouseExited
      
    }//GEN-LAST:event_PaneltoanMouseExited

    private void panelkhocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkhocMouseClicked
        String ten_monhoc = "Khoa Học";
        dsbt(ten_monhoc);
        panelkhoc.setBackground(Color.LIGHT_GRAY);
        Paneltoan.setBackground(new Color(102, 102, 102));
        paneltviet.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_panelkhocMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lam_bai;
    private javax.swing.JPanel Paneltoan;
    private javax.swing.JScrollPane ScrollPanemain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelkhoc;
    private javax.swing.JPanel paneltviet;
    // End of variables declaration//GEN-END:variables
}
