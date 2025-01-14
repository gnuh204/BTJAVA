/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormHS;
import java.awt.*;
import javax.swing.*;


public class JPanelKT extends javax.swing.JPanel {

    /**
     * Creates new form JPanelKT
     */
    public JPanelKT() {
        initComponents();
      
    }
    public class Thoigian {
    public static String thoigian;
    private static String monhoc;

    public static String getThoigian() {
        return thoigian;
    }
    public static String getMonhoc(){
        return monhoc;
    }
 
    public static void setThoigian(String thoigian) {
        Thoigian.thoigian = thoigian;
    }
    public static void setMonhoc(String monhoc){
        Thoigian.monhoc = monhoc;
    }
    }
    
    private static boolean isNumeric(String text) {
        return text.matches("\\d+");
    }
    public void bntKT(){
        LTT();
    }
    private void LTT(){
        String input = TextFieldtg.getText();
    String inputcbb = (String) ComboBoxtg.getSelectedItem();
    
    // Kiểm tra nếu cả hai đều null hoặc rỗng
    if ((input == null || input.trim().isEmpty()) && (inputcbb == null || inputcbb.trim().isEmpty())) {
        JOptionPane.showMessageDialog(null, 
            "Vui lòng nhập số hợp lệ!", 
            "Lỗi đầu vào", 
            JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kiểm tra và xử lý input từ TextFieldtg
    if (input != null && !input.trim().isEmpty()) {
        input = input.trim();
        if (!isNumeric(input)) {
            JOptionPane.showMessageDialog(null, 
                "Vui lòng nhập số hợp lệ!", 
                "Lỗi đầu vào", 
                JOptionPane.ERROR_MESSAGE);
            TextFieldtg.setText("");
            return;
        }

        int value = Integer.parseInt(input);
        if (15 <= value && value <= 50) {
            Thoigian.setThoigian(input);
            System.out.println("Thời gian được nhập: " + input);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Vui lòng nhập số từ 15 đến 50!", 
                "Lỗi đầu vào", 
                JOptionPane.ERROR_MESSAGE);
            TextFieldtg.setText("");
        }
        return;
    }
    // Kiểm tra và xử lý input từ ComboBoxtg
    if (inputcbb != null && !inputcbb.trim().isEmpty()) {
        inputcbb = inputcbb.trim();
        if (!isNumeric(inputcbb)) {
            JOptionPane.showMessageDialog(null, 
                "Vui lòng nhập số hợp lệ!", 
                "Lỗi đầu vào", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        Thoigian.setThoigian(inputcbb);
        System.out.println("Thời gian được chọn: " + inputcbb);
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
        btnlb = new javax.swing.JButton();
        Labeltg = new javax.swing.JLabel();
        ComboBoxtg = new javax.swing.JComboBox<>();
        TextFieldtg = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

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
                .addGroup(paneltvietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jPanel2.setBounds(0, 0, 558, 550);

        btnlb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnlb.setText("Làm Bài");
        btnlb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlbActionPerformed(evt);
            }
        });
        add(btnlb);
        btnlb.setBounds(790, 330, 121, 52);

        Labeltg.setBackground(new java.awt.Color(255, 255, 255));
        Labeltg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Labeltg.setForeground(new java.awt.Color(255, 255, 255));
        Labeltg.setText("Chọn thời gian làm bài mong muốn(tính bằng phút)");
        add(Labeltg);
        Labeltg.setBounds(640, 140, 420, 30);

        ComboBoxtg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboBoxtg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thời gian đề cử", "15", "20", "25", "30", "35", "40" }));
        add(ComboBoxtg);
        ComboBoxtg.setBounds(840, 190, 140, 40);
        add(TextFieldtg);
        TextFieldtg.setBounds(750, 190, 70, 41);
    }// </editor-fold>//GEN-END:initComponents

    private void PaneltoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneltoanMouseClicked
        Paneltoan.setBackground(Color.LIGHT_GRAY);
        paneltviet.setBackground(new Color(102, 102, 102));
        panelkhoc.setBackground(new Color(102, 102, 102));
        String monhoc = "Toán";
        Thoigian.setMonhoc(monhoc);
        
    }//GEN-LAST:event_PaneltoanMouseClicked

    private void PaneltoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaneltoanMouseExited

    }//GEN-LAST:event_PaneltoanMouseExited

    private void paneltvietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltvietMouseClicked
        
        paneltviet.setBackground(Color.LIGHT_GRAY);
        Paneltoan.setBackground(new Color(102, 102, 102));
        panelkhoc.setBackground(new Color(102, 102, 102));
        String monhoc = "Tiếng Việt";
        Thoigian.setMonhoc(monhoc);
    }//GEN-LAST:event_paneltvietMouseClicked

    private void panelkhocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelkhocMouseClicked

        panelkhoc.setBackground(Color.LIGHT_GRAY);
        Paneltoan.setBackground(new Color(102, 102, 102));
        paneltviet.setBackground(new Color(102, 102, 102));
        String monhoc = "Khoa Học";
        Thoigian.setMonhoc(monhoc);
    }//GEN-LAST:event_panelkhocMouseClicked
    
    public void btnlbButtonListener(java.awt.event.ActionListener listener) {
        btnlb.addActionListener(listener);
        
    }
    private void btnlbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlbActionPerformed
    
    }//GEN-LAST:event_btnlbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxtg;
    private javax.swing.JLabel Labeltg;
    private javax.swing.JPanel Paneltoan;
    private javax.swing.JTextField TextFieldtg;
    private javax.swing.JButton btnlb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelkhoc;
    private javax.swing.JPanel paneltviet;
    // End of variables declaration//GEN-END:variables
}
