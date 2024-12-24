
package FormHS;
import packageapp.BackgroundPanel;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import packageapp.DBConnection;

public class JPanelCN extends javax.swing.JPanel {
private Connection connection;
    
    public JPanelCN() {
        initComponents();
        buttonGroup.add(jRadioNam);
        buttonGroup.add(jRadioNu);
        String Gioi_Tinh = null,checkquery;
           try{
            connection = DBConnection.getConnection();
            Statement st = connection.createStatement();
            checkquery = "SELECT * FROM student WHERE ten_tk = 'hung'";
            st.execute(checkquery);
            ResultSet rs = st.executeQuery(checkquery);
            if(rs.next()){
              ho_ten.setText(rs.getString("ho_ten"));
              ngay_thang.setText(rs.getString("ngay_sinh"));
              lop.setText(rs.getString("lop"));
              Gioi_Tinh = rs.getString("gioi_tinh");
              if ("Nam".equals(Gioi_Tinh)) {
                    jRadioNam.setSelected(true);
                } else if ("Nu".equals(Gioi_Tinh)) {
                    jRadioNu.setSelected(true);
                }
            } else {
                jRadioNam.setSelected(false);
                jRadioNu.setSelected(false);
            }      
        rs.close();
        st.close();
        connection.close();

       }catch(Exception e){
           System.out.println("Loi"+e.getMessage());
       }
        
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new BackgroundPanel("src\\Img\\HS.jpg!bew340");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ho_ten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ngay_thang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioNam = new javax.swing.JRadioButton();
        jRadioNu = new javax.swing.JRadioButton();
        luu_thong_tin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1120, 550));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account_icon.png"))); // NOI18N
        jLabel1.setText("  Thông tin cá nhân");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ và Tên");

        ho_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ho_tenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày tháng năm sinh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Lớp");

        lop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính");

        jRadioNam.setText("Nam");

        jRadioNu.setText("Nữ");
        jRadioNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNuActionPerformed(evt);
            }
        });

        luu_thong_tin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        luu_thong_tin.setText("Lưu thay đổi");
        luu_thong_tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luu_thong_tinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ho_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ngay_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioNam)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioNu))
                    .addComponent(luu_thong_tin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(ho_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(ngay_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioNam)
                    .addComponent(jRadioNu))
                .addGap(138, 138, 138)
                .addComponent(luu_thong_tin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ho_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ho_tenActionPerformed

    }//GEN-LAST:event_ho_tenActionPerformed

    private void lopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopActionPerformed

    }//GEN-LAST:event_lopActionPerformed

    private void luu_thong_tinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luu_thong_tinActionPerformed
      String Ho_Ten, Ngay_Thang, Lop,Gioi_Tinh = null,query;
      Ho_Ten = ho_ten.getText();
      Ngay_Thang = ngay_thang.getText();
      Lop = lop.getText();
      if(jRadioNam.isSelected()){
          Gioi_Tinh = "Nam";
      }
      if(jRadioNu.isSelected()){
          Gioi_Tinh = "Nữ";
      }
      if (Ho_Ten.isEmpty() || Ngay_Thang.isEmpty() || Lop.isEmpty() || Gioi_Tinh == null){
          JOptionPane.showMessageDialog(this,"Vui lòng nhâpj dầy đủ thông tin!","Lỗi",JOptionPane.ERROR_MESSAGE);
          return;
      }
        try{
            connection = DBConnection.getConnection();
            Statement st = connection.createStatement();
            query = "UPDATE `student` SET `ho_ten` ='"+Ho_Ten+"', `ngay_sinh` = '"+Ngay_Thang+"', `lop` ='"+Lop+"', `gioi_tinh` = '"+Gioi_Tinh+"' WHERE `student`.`ten_tk` = 'hung'";
            st.execute(query);
            showMessageDialog(null,"Cập nhật thông tin thành công");
       }catch(Exception e){
           System.out.println("Loi"+e.getMessage());
       }
    }//GEN-LAST:event_luu_thong_tinActionPerformed

    private void jRadioNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioNuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField ho_ten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioNam;
    private javax.swing.JRadioButton jRadioNu;
    private javax.swing.JTextField lop;
    private javax.swing.JButton luu_thong_tin;
    private javax.swing.JTextField ngay_thang;
    // End of variables declaration//GEN-END:variables
}
