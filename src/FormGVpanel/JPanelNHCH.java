/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormGVpanel;
import java.sql.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import packageapp.DBConnection;


public class JPanelNHCH extends javax.swing.JPanel {
private  Connection connection;
   
    public JPanelNHCH() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_ch = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFa = new javax.swing.JTextField();
        TFc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboBoxdap_an = new javax.swing.JComboBox<>();
        btn_luu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxmh = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 750));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 750));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ngân Hàng Câu Hỏi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 60);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TextArea_ch.setColumns(50);
        TextArea_ch.setRows(5);
        jScrollPane1.setViewportView(TextArea_ch);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 140, 500, 90);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nội dung câu hỏi:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 90, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Đáp án:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 270, 100, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Đáp án B:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 340, 70, 40);
        jPanel1.add(TFb);
        TFb.setBounds(510, 340, 160, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Đáp án D:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 440, 70, 40);
        jPanel1.add(TFd);
        TFd.setBounds(510, 450, 160, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Đáp án A:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 340, 70, 40);
        jPanel1.add(TFa);
        TFa.setBounds(140, 340, 160, 40);
        jPanel1.add(TFc);
        TFc.setBounds(140, 440, 160, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Đáp án C:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 440, 70, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Đáp án đúng:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 510, 160, 40);

        ComboBoxdap_an.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jPanel1.add(ComboBoxdap_an);
        ComboBoxdap_an.setBounds(200, 510, 100, 40);

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_luu);
        btn_luu.setBounds(610, 620, 120, 50);

        jButton2.setText("Làm mới");
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 620, 100, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Môn:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 510, 70, 40);

        ComboBoxmh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toán", "Tiếng Việt", "Khoa Học" }));
        jPanel1.add(ComboBoxmh);
        ComboBoxmh.setBounds(540, 510, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
       String Noi_dung, dapanA, dapanB,dapanC,dapanD,dapandung,mon,query;
       Noi_dung = TextArea_ch.getText();
       dapanA = TFa.getText();
       dapanB = TFb.getText();
       dapanC = TFc.getText();
       dapanD = TFd.getText();
       dapandung = (String) ComboBoxdap_an.getSelectedItem();
       mon = (String) ComboBoxmh.getSelectedItem();
        try{
           connection = DBConnection.getConnection();
           Statement st = connection.createStatement();
           if("".equals(Noi_dung)||"".equals(dapanA)||"".equals(dapanB)||"".equals(dapanC)||"".equals(dapanD)||"".equals(dapandung)||"".equals(mon)){
               JOptionPane.showMessageDialog(new JFrame(), "Vui lòng nhập đày đủ thông tin","lỗi",JOptionPane.ERROR_MESSAGE);
           }else{
           query = "INSERT INTO n_hang_ch(noi_dung,dap_an_a,dap_an_b,dap_an_c,dap_an_d,dap_an_dung,monhoc)"+
                   " VALUES ('"+Noi_dung+"','"+dapanA+"','"+dapanB+"','"+dapanC+"','"+dapanD+"','"+dapandung+"','"+mon+"')";
           st.execute(query);
           showMessageDialog(null,"Thêm câu hỏi thành công");
           TextArea_ch.setText("");
           TFa.setText("");
           TFb.setText("");
           TFc.setText("");
           TFd.setText("");
           ComboBoxdap_an.setSelectedIndex(0);
           ComboBoxmh.setSelectedIndex(0);
           
           }
           
       }catch(Exception e){
           System.out.println("loi" + e.getMessage());
       }
    }//GEN-LAST:event_btn_luuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxdap_an;
    private javax.swing.JComboBox<String> ComboBoxmh;
    private javax.swing.JTextField TFa;
    private javax.swing.JTextField TFb;
    private javax.swing.JTextField TFc;
    private javax.swing.JTextField TFd;
    private javax.swing.JTextArea TextArea_ch;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
