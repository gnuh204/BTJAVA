/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormGVpanel;

import FormGVpanel.TThsPanel.UserSession;
import java.awt.Font;
import java.io.File;
import packageapp.DBConnection;
import java.sql.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;




/**
 *
 * @author ignuh
 */
public class PanelKQ extends javax.swing.JPanel {
private Connection connection;
    
    public PanelKQ() {
        initComponents();  



        
    }
    
    public void KQ() {
        loadtt();
        loadtb();
}
   private void loadtt(){
       String Ten, query,img = null;
       Ten = UserSession.getUsername();
       
      try {
    connection = DBConnection.getConnection();
    query = "SELECT * FROM student WHERE ten_tk = ?";
    PreparedStatement st = connection.prepareStatement(query);
    st.setString(1,Ten);
    ResultSet rs = st.executeQuery();

    if (rs.next()) {
        // Đặt các thông tin
        Lbhoten.setText(rs.getString("ho_ten"));
        Lbngaysinh.setText(rs.getString("ngay_sinh"));
        Lblop.setText(rs.getString("lop"));
        Lbemail.setText(rs.getString("email"));
        Lbgioitinh.setText(rs.getString("gioi_tinh"));
        img = rs.getString("avt");

        // Xử lý hình ảnh
        if (img != null && !img.isEmpty()) {
            File imageFile = new File(img);
            if (imageFile.exists()) {
                imageAvatar1.setImage(new ImageIcon(img)); // Đường dẫn hợp lệ
            } else {
                System.out.println("Hình ảnh không tồn tại tại đường dẫn: " + img);
            }
        } else {
            System.out.println("Đường dẫn ảnh trống hoặc không hợp lệ.");
        }
    }
    rs.close();
    st.close();
    connection.close();

} catch (Exception e) {
    System.out.println("Lỗi: " + e.getMessage());
}
   }
   
   private void loadtb(){
       String query,tentk;
       tentk = UserSession.getUsername();
       try{
       connection = DBConnection.getConnection();
       Statement st = connection.createStatement();
       query = "SELECT bt.ten_bt, bt.ten_mh, sbt.trang_thai, sbt.ngay_nop\n"+
           "FROM student_bai_tap sbt\n"+
           "JOIN bai_tap bt ON sbt.bai_tap_id = bt.id\n"+
           "WHERE sbt.ten_tk = '"+tentk+"';";
        ResultSet rs = st.executeQuery(query);
                List<Object[]> rowData = new ArrayList<>();
                while(rs.next()){
                 String tenbt = rs.getString("ten_bt");
                 String tenmh = rs.getString("ten_mh");
                 String trangthai = rs.getString("trang_thai");
                 String tg = rs.getString("ngay_nop");
                 
                    rowData.add(new Object[]{tenbt,tenmh,trangthai,tg});
                }
                Object[][] dataFromDb = rowData.toArray(new Object[0][]);
                String[] columnNames = {"Tên Bài tập", "Môn Học", "Trạng Thái","Thời gian làm"};
                DefaultTableModel model = new DefaultTableModel(dataFromDb, columnNames);
                Tablett.setModel(model);
                JTableHeader header = Tablett.getTableHeader();
                header.setFont(new Font("Arial", Font.BOLD, 16));
                Tablett.setFont(new Font("Arial", Font.PLAIN, 16));
                Tablett.setRowHeight(25);

       
       }catch(Exception e){
           System.out.println("lỗi" + e.getMessage());
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lbhoten = new javax.swing.JLabel();
        Lbngaysinh = new javax.swing.JLabel();
        Lblop = new javax.swing.JLabel();
        Lbgioitinh = new javax.swing.JLabel();
        Lbemail = new javax.swing.JLabel();
        imageAvatar1 = new packageapp.ImageAvatar();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablett = new javax.swing.JTable();

        setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Họ tên");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(329, 6, 60, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ngày sinh");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(329, 76, 70, 20);

        jLabel3.setText("Giới tính");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(589, 6, 60, 30);

        jLabel4.setText("Lớp");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(329, 140, 50, 31);

        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(589, 76, 60, 20);

        Lbhoten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(Lbhoten);
        Lbhoten.setBounds(329, 42, 157, 28);

        Lbngaysinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(Lbngaysinh);
        Lbngaysinh.setBounds(329, 104, 157, 27);

        Lblop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(Lblop);
        Lblop.setBounds(360, 140, 101, 31);

        Lbgioitinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(Lbgioitinh);
        Lbgioitinh.setBounds(589, 42, 165, 28);

        Lbemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(Lbemail);
        Lbemail.setBounds(589, 104, 220, 27);
        jPanel1.add(imageAvatar1);
        imageAvatar1.setBounds(57, 14, 148, 136);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1120, 180);

        Tablett.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tablett);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 180, 1000, 480);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbemail;
    private javax.swing.JLabel Lbgioitinh;
    private javax.swing.JLabel Lbhoten;
    private javax.swing.JLabel Lblop;
    private javax.swing.JLabel Lbngaysinh;
    private javax.swing.JTable Tablett;
    private packageapp.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
