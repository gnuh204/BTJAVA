
package FormHS;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import packageapp.BackgroundPanel;
import java.sql.*;

import javax.swing.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import packageapp.DBConnection;
import packageapp.Login.UserSession;

public class JPanelCN extends javax.swing.JPanel {
private Connection connection;
private String selectedFilePath = null;   
    public JPanelCN() {
        initComponents();
        
    }
    public void CN(){
        loaddata();
    }
private void loaddata(){
    buttonGroup.add(jRadioNam);
    buttonGroup.add(jRadioNu);
    String Gioi_Tinh = null, checkquery, img = null;
    String currentUsername = UserSession.getUsername();

try {
    connection = DBConnection.getConnection();
    checkquery = "SELECT * FROM student WHERE ten_tk = ?";
    PreparedStatement st = connection.prepareStatement(checkquery);
    st.setString(1, currentUsername);
    ResultSet rs = st.executeQuery();

    if (rs.next()) {
        // Đặt các thông tin
        ho_ten.setText(rs.getString("ho_ten"));
        ngay_thang.setText(rs.getString("ngay_sinh"));
        lop.setText(rs.getString("lop"));
        TFemail.setText(rs.getString("email"));
        Gioi_Tinh = rs.getString("gioi_tinh");
        img = rs.getString("avt");

        // Xử lý hình ảnh
        if (img != null && !img.isEmpty()) {
            File imageFile = new File(img);
            if (imageFile.exists()) {
                imageAvatar2.setImage(new ImageIcon(img)); // Đường dẫn hợp lệ
            } else {
                System.out.println("Hình ảnh không tồn tại tại đường dẫn: " + img);
            }
        } else {
            System.out.println("Đường dẫn ảnh trống hoặc không hợp lệ.");
        }

        // Xử lý giới tính
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

} catch (Exception e) {
    System.out.println("Lỗi: " + e.getMessage());
}
}

   

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        Date = new com.raven.datechooser.DateChooser();
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
        jLabel6 = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        imageAvatar2 = new packageapp.ImageAvatar();
        Btnavts = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        Date.setDateFormat("yyyy-MM-dd");
        Date.setTextRefernce(ngay_thang);

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

        jLabel6.setText("Email");

        Btnavts.setText("Thay đổi");
        Btnavts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnavtsActionPerformed(evt);
            }
        });

        jButton1.setText("Đổi mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(luu_thong_tin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(Btnavts))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ho_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ngay_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioNu)))
                        .addGap(95, 95, 95)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ho_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(ngay_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4))
                    .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnavts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioNam)
                    .addComponent(jRadioNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(luu_thong_tin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ho_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ho_tenActionPerformed

    }//GEN-LAST:event_ho_tenActionPerformed

    private void lopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopActionPerformed

    }//GEN-LAST:event_lopActionPerformed

    private void luu_thong_tinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luu_thong_tinActionPerformed
      String Ho_Ten, Ngay_Thang, Lop,Gioi_Tinh = null,query,Email;
      String currentUsername = UserSession.getUsername();
      Ho_Ten = ho_ten.getText();
      Ngay_Thang = ngay_thang.getText();
      Lop = lop.getText();
      Email = TFemail.getText();
      
      if(jRadioNam.isSelected()){
          Gioi_Tinh = "Nam";
      }
      if(jRadioNu.isSelected()){
          Gioi_Tinh = "Nữ";
      }
      if (Ho_Ten.isEmpty() || Ngay_Thang.isEmpty() || Lop.isEmpty() || Gioi_Tinh == null){
          JOptionPane.showMessageDialog(this,"Vui lòng nhập dầy đủ thông tin!","Lỗi",JOptionPane.ERROR_MESSAGE);
          return;
      }
        try{
            connection = DBConnection.getConnection();
            Statement st = connection.createStatement();
            query = "UPDATE `student` SET `ho_ten` ='"+Ho_Ten+"', `ngay_sinh` = '"+Ngay_Thang+"', `lop` ='"+Lop+"', `gioi_tinh` = '"+Gioi_Tinh+"',email = '"+Email+"' WHERE `student`.`ten_tk` = '"+currentUsername+"'";
            st.execute(query);
            showMessageDialog(null,"Cập nhật thông tin thành công");
       }catch(Exception e){
           System.out.println("Loi"+e.getMessage());
       }
        loaddata();
    }//GEN-LAST:event_luu_thong_tinActionPerformed

    private void jRadioNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioNuActionPerformed

    private void BtnavtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnavtsActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int result = fileChooser.showOpenDialog(frame);
            

              if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                selectedFilePath = selectedFile.getAbsolutePath();
                
                Btnavts.setEnabled(true);
                avt();
            }

    }//GEN-LAST:event_BtnavtsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = new JFrame("Đổi Mật Khẩu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        // Tạo các thành phần giao diện
        JLabel oldPassLabel = new JLabel("Mật khẩu cũ:");
        JPasswordField oldPassField = new JPasswordField(20);

        JLabel newPassLabel = new JLabel("Mật khẩu mới:");
        JPasswordField newPassField = new JPasswordField(20);

        JButton changeButton = new JButton("Đổi mật khẩu");

        JLabel statusLabel = new JLabel("", JLabel.CENTER);

        // Sử dụng GridBagLayout để sắp xếp các thành phần
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(oldPassLabel, gbc);

        gbc.gridx = 1;
        frame.add(oldPassField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(newPassLabel, gbc);

        gbc.gridx = 1;
        frame.add(newPassField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(changeButton, gbc);

        gbc.gridy = 3;
        frame.add(statusLabel, gbc);

        // Xử lý sự kiện khi nhấn nút đổi mật khẩu
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldPassword = new String(oldPassField.getPassword());
                String newPassword = new String(newPassField.getPassword());
                String ten = UserSession.getUsername();
                  
                try {
            
            connection = DBConnection.getConnection();

            // Kiểm tra mật khẩu cũ
            String checkPasswordQuery = "SELECT mk FROM userhs WHERE ten_tk = ?";
            PreparedStatement checkPasswordStmt = connection.prepareStatement(checkPasswordQuery);
            checkPasswordStmt.setString(1,ten); // Thay bằng giá trị tên người dùng
            ResultSet resultSet = checkPasswordStmt.executeQuery();

            if (resultSet.next()) {
                String actualOldPassword = resultSet.getString("mk");

                if (oldPassword.isEmpty() || newPassword.isEmpty()) {
                    statusLabel.setText("Vui lòng nhập đầy đủ thông tin.");
                    statusLabel.setForeground(Color.RED);
                } else if (!oldPassword.equals(actualOldPassword)) {
                    statusLabel.setText("Mật khẩu cũ không đúng.");
                    statusLabel.setForeground(Color.RED);
                } else if (newPassword.length() < 4) {
                    statusLabel.setText("Mật khẩu mới phải có ít nhất 6 ký tự.");
                    statusLabel.setForeground(Color.RED);
                } else {
                    // Cập nhật mật khẩu mới
                    String updatePasswordQuery = "UPDATE userhs SET mk = ? WHERE ten_tk = ?";
                    PreparedStatement updatePasswordStmt = connection.prepareStatement(updatePasswordQuery);
                    updatePasswordStmt.setString(1, newPassword);
                    updatePasswordStmt.setString(2, ten); 
                    int rowsUpdated = updatePasswordStmt.executeUpdate();

                    if (rowsUpdated > 0) {
                        statusLabel.setText("Đổi mật khẩu thành công!");
                        statusLabel.setForeground(Color.GREEN);
                    } else {
                        statusLabel.setText("Đổi mật khẩu thất bại.");
                        statusLabel.setForeground(Color.RED);
                    }
                }
            } else {
                statusLabel.setText("Không tìm thấy tài khoản.");
                statusLabel.setForeground(Color.RED);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            statusLabel.setText("Đã xảy ra lỗi.");
            statusLabel.setForeground(Color.RED);
        } 
            }
        });

        // Hiển thị JFrame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void avt(){
        String query;
String currentUsername = UserSession.getUsername();
String imagePath = selectedFilePath;
System.out.println(imagePath);

try {
    // Kết nối với cơ sở dữ liệu
    connection = DBConnection.getConnection();
    
    // Câu lệnh SQL để cập nhật ảnh
    query = "UPDATE `student` SET `avt` = ? WHERE `ten_tk` = ?";
    
    // Tạo PreparedStatement
    PreparedStatement pstmt = connection.prepareStatement(query);
    
    // Set các tham số cho câu lệnh SQL
    pstmt.setString(1, imagePath);
    pstmt.setString(2, currentUsername);
    
    // Thực thi câu lệnh cập nhật
    int rowsAffected = pstmt.executeUpdate();
    
    // Kiểm tra xem có bao nhiêu hàng bị ảnh hưởng
    if (rowsAffected > 0) {
        showMessageDialog(null, "Cập nhật thông tin thành công");
    } else {
        showMessageDialog(null, "Cập nhật không thành công. Không tìm thấy tài khoản.");
    }
    
    // Đóng PreparedStatement sau khi sử dụng
    pstmt.close();
} catch (Exception e) {
    // In ra lỗi nếu có
    System.out.println("Lỗi: " + e.getMessage());
} finally {
    try {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    } catch (SQLException e) {
        System.out.println("Lỗi đóng kết nối: " + e.getMessage());
    }
}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnavts;
    private com.raven.datechooser.DateChooser Date;
    private javax.swing.JTextField TFemail;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField ho_ten;
    private packageapp.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioNam;
    private javax.swing.JRadioButton jRadioNu;
    private javax.swing.JTextField lop;
    private javax.swing.JButton luu_thong_tin;
    private javax.swing.JTextField ngay_thang;
    // End of variables declaration//GEN-END:variables
}
