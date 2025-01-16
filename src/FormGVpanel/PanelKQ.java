/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormGVpanel;

import FormGVpanel.TThsPanel.UserSession;
import java.awt.Font;
import packageapp.DBConnection;
import java.sql.*;
import java.util.*;
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
       String Ten, query;
       Ten = UserSession.getUsername();
       
       try{
       connection = DBConnection.getConnection();
       Statement st = connection.createStatement();
       query = "SELECT * FROM student WHERE ten_tk = '"+Ten+"'";
       ResultSet rs = st.executeQuery(query);
       if(rs.next()){
       Lbhoten.setText( rs.getString("ho_ten"));
       Lbngaysinh.setText(rs.getString("ngay_sinh"));
       Lblop.setText(rs.getString("lop"));
       Lbgioitinh.setText( rs.getString("gioi_tinh"));
       Lbemail.setText(rs.getString("email")); 
       }
           
       }catch(Exception e){
          System.out.println("loi" + e.getMessage());
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Họ tên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ngày sinh");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Lớp");

        jLabel5.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lblop, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Lbngaysinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lbhoten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbemail, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(Lbgioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbhoten, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Lbgioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lblop, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

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
