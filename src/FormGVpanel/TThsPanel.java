
package FormGVpanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import packageapp.DBConnection; 


public class TThsPanel extends javax.swing.JPanel {

   private Connection connection;
    public TThsPanel() {
        initComponents();
        loadtablehs();
    }

// lây thông tin tên tài khoản khi click   
public class UserSession {
    private static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserSession.username = username;
    }
}
// load dứ liêu từ cơ sở dữ liệu 
private void loadtablehs(){
     String query;
    try{
            connection = DBConnection.getConnection();
            if (connection != null) {
                System.out.println("Kết nối thành công!");
            } else {
                System.out.println("Kết nối thất bại!");
            }
            Statement st = connection.createStatement();
                query = "SElECT * FROM student";
                ResultSet rs = st.executeQuery(query);
                List<Object[]> rowData = new ArrayList<>();
                while(rs.next()){
                    String tenTk = rs.getString("ten_tk");
                    String Hoten = rs.getString("ho_ten");
                    String NgaySinh = rs.getString("ngay_sinh");
                    String Lop = rs.getString("lop");
                    String GioiTinh = rs.getString("gioi_tinh");
                    rowData.add(new Object[]{tenTk, Hoten, NgaySinh, Lop, GioiTinh});
                }
            Object[][] dataFromDb = rowData.toArray(new Object[0][]);
            String[] columnNames = {"Tên TK", "Họ tên", "Ngày sinh", "Lớp", "Giới tính"}; // Thêm tiêu đề cột
            DefaultTableModel model = new DefaultTableModel(dataFromDb, columnNames);
            jTable1.setModel(model);
            JTableHeader header = jTable1.getTableHeader();
            header.setFont(new Font("Arial", Font.BOLD, 16));
            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50); 
            columnModel.getColumn(1).setPreferredWidth(150); 
            columnModel.getColumn(2).setPreferredWidth(100);
            columnModel.getColumn(3).setPreferredWidth(50);
            columnModel.getColumn(4).setPreferredWidth(50);
           jTable1.setFont(new Font("Arial", Font.PLAIN, 16));
           jTable1.setRowHeight(25);
            
            
            
        }catch(Exception e){
            System.out.println("lỗi" + e.getMessage());
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TimKiemhs = new javax.swing.JTextField();
        Btnxoahs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addTenTK = new javax.swing.JTextField();
        jButtonThemTK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btntimkiemhs = new javax.swing.JButton();
        btnxem = new javax.swing.JButton();
        Btndatlai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1120, 750));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        TimKiemhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemhsActionPerformed(evt);
            }
        });

        Btnxoahs.setBackground(new java.awt.Color(0, 153, 51));
        Btnxoahs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnxoahs.setForeground(new java.awt.Color(255, 255, 255));
        Btnxoahs.setText("Xóa");
        Btnxoahs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnxoahsActionPerformed(evt);
            }
        });

        jButtonThemTK.setText("Thêm");
        jButtonThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemTKActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên tài khoản");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonThemTK)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(168, 168, 168))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(addTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButtonThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thông tin học sinh");

        Btntimkiemhs.setBackground(new java.awt.Color(0, 153, 51));
        Btntimkiemhs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btntimkiemhs.setForeground(new java.awt.Color(255, 255, 255));
        Btntimkiemhs.setText("Tim Kiếm");
        Btntimkiemhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtntimkiemhsActionPerformed(evt);
            }
        });

        btnxem.setBackground(new java.awt.Color(0, 153, 51));
        btnxem.setForeground(new java.awt.Color(255, 255, 255));
        btnxem.setText("Xem");
        btnxem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemActionPerformed(evt);
            }
        });

        Btndatlai.setBackground(new java.awt.Color(0, 153, 51));
        Btndatlai.setForeground(new java.awt.Color(255, 255, 255));
        Btndatlai.setText("Đặt lại");
        Btndatlai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndatlaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(TimKiemhs, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Btntimkiemhs)
                        .addGap(18, 18, 18)
                        .addComponent(btnxem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btndatlai, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btnxoahs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(219, 219, 219)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimKiemhs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btntimkiemhs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btndatlai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnxoahs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 170);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên_TK", "Họ Tên", "Ngày sinh", "Lớp", "Giới tính"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 1070, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void TimKiemhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemhsActionPerformed
        
    }//GEN-LAST:event_TimKiemhsActionPerformed

    private void BtnxoahsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnxoahsActionPerformed
        String checkquery;
        String currentUsername = UserSession.getUsername();
           try{
            connection = DBConnection.getConnection();
            Statement st = connection.createStatement();
            checkquery = "DELETE FROM userhs WHERE ten_tk = '"+currentUsername+"'";
            st.execute(checkquery);
            showMessageDialog(null,"Đã xóa tài khoản "+currentUsername+"");
            loadtablehs(); 
       }catch(Exception e){
           System.out.println("Loi"+e.getMessage());
       }  
    }//GEN-LAST:event_BtnxoahsActionPerformed

    private void BtndatlaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndatlaiActionPerformed

        String query ;
        String currentUsername = UserSession.getUsername();
        try{
        connection = DBConnection.getConnection();
        Statement st = connection.createStatement();
        query = "UPDATE `userhs` SET mk = '1234@' WHERE `userhs`.`ten_tk` = '"+currentUsername+"'";
        st.execute(query);
        showMessageDialog(null,"Cập nhật thông tin thành công");
        }catch(Exception ex ){
          System.out.println("Loi"+ex.getMessage());
        }
        
       
        
    }//GEN-LAST:event_BtndatlaiActionPerformed
// Thêm tk cho hoc sinh
    private void jButtonThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemTKActionPerformed
      String TenTK, query, query2,checkquery;
      try{
          connection = DBConnection.getConnection();
          Statement st = connection.createStatement();
          if("".equals(addTenTK.getText())){
              JOptionPane.showMessageDialog(new JFrame(), "chưa nhập tên tài khoản","lỗi",JOptionPane.ERROR_MESSAGE);
              
          }else{
            TenTK = addTenTK.getText();
           
            checkquery = "SELECT * FROM userhs WHERE ten_tk = '"+TenTK +"'";
            st.execute(checkquery);
            ResultSet rs = st.executeQuery(checkquery);
            if(rs.next()){
               JOptionPane.showMessageDialog(new JFrame(), "Tên tài khoản đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);  
            }else{
            query = "INSERT INTO userhs(ten_tk, mk) VALUES('" + TenTK + "', '1234@')" ;
            query2 = "INSERT INTO student(ten_tk) VALUES('"+TenTK +"')";
            
            st.execute(query);
            st.execute(query2);
            addTenTK.setText("");
           
            showMessageDialog(null,"Thêm tài khoản Thành công ");
            loadtablehs();
            
          }
          }
      }catch(Exception e){
          System.out.println("lỗi" + e.getMessage());
      }
      
    }//GEN-LAST:event_jButtonThemTKActionPerformed

    private void BtntimkiemhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtntimkiemhsActionPerformed
        String Ten, query;
        try{
            connection = DBConnection.getConnection();
            Statement st = connection.createStatement();
            if("".equals(TimKiemhs.getText())){
             JOptionPane.showMessageDialog(new JFrame(), "Vui lòng nhập thông tin tìm kiếm","lỗi",JOptionPane.ERROR_MESSAGE);
            }else{
                Ten = TimKiemhs.getText();
                query = "SElECT * FROM student WHERE ten_tk LIKE '%"+Ten+"%' OR ho_ten LIKE '%"+Ten+"%' OR ngay_sinh LIKE '%"+Ten+"%' OR lop LIKE '%"+Ten+"%' OR gioi_tinh LIKE '%"+Ten+"%'";
                ResultSet rs = st.executeQuery(query);
                List<Object[]> rowData = new ArrayList<>();
                while(rs.next()){
                    String tenTk = rs.getString("ten_tk");
                    String Hoten = rs.getString("ho_ten");
                    String NgaySinh = rs.getString("ngay_sinh");
                    String Lop = rs.getString("lop");
                    String GioiTinh = rs.getString("gioi_tinh");
                    rowData.add(new Object[]{tenTk, Hoten, NgaySinh, Lop, GioiTinh});
                    
                }
            Object[][] dataFromDb = rowData.toArray(new Object[0][]);
            String[] columnNames = {"Tên TK", "Họ tên", "Ngày sinh", "Lớp", "Giới tính"}; // Thêm tiêu đề cột
            DefaultTableModel model = new DefaultTableModel(dataFromDb, columnNames);
            jTable1.setModel(model);
            }
            
            
        }catch(Exception e){
            System.out.println("lỗi" + e.getMessage());
        }
    }//GEN-LAST:event_BtntimkiemhsActionPerformed
   
    /*public void setMouseClick(java.awt.event.MouseListener listener) {
    jTable1.addMouseListener(listener);
    }*/

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1) { 
            Object Tentk = jTable1.getValueAt(row, 0);
            UserSession.setUsername(Tentk.toString());
            System.out.println("Đã chọn tên người dùng: " + Tentk.toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked
    public void btnxemListener(java.awt.event.ActionListener listener) {
        btnxem.addActionListener(listener);
        
    }
    private void btnxemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemActionPerformed
     
    }//GEN-LAST:event_btnxemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btndatlai;
    private javax.swing.JButton Btntimkiemhs;
    private javax.swing.JButton Btnxoahs;
    private javax.swing.JTextField TimKiemhs;
    private javax.swing.JTextField addTenTK;
    private javax.swing.JButton btnxem;
    private javax.swing.JButton jButtonThemTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
