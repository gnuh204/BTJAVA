
package FormGVpanel;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import packageapp.DBConnection;

public class JPanelDSBT extends javax.swing.JPanel {
private Connection connection;
private String click = null;
  
    public JPanelDSBT() {
        initComponents();
    }
    public void load(){
        String query = "SELECT ten_bt,ten_mh,tg_tai_len FROM bai_tap ";
        loadtableds(query);
    }
    
    private void loadtableds(String query){       
        try{
            connection = DBConnection.getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            List<Object[]> rowData = new ArrayList<>();
            while(rs.next()){
                    String Tenbt = rs.getString("ten_bt");
                    String Tenmh = rs.getString("ten_mh");
                    String Tgtl = rs.getString("tg_tai_len");
                    rowData.add(new Object[]{Tenbt,Tenmh,Tgtl});
                }
            Object[][] dataFromDb = rowData.toArray(new Object[0][]);
            String[] columnNames = {"Tên bài tập", "Môn", "Thời gian tải lên"}; // Thêm tiêu đề cột
            DefaultTableModel model = new DefaultTableModel(dataFromDb, columnNames);
            jTable1.setModel(model);
            JTableHeader header = jTable1.getTableHeader();
            header.setFont(new Font("Arial", Font.BOLD, 16));
            jTable1.setFont(new Font("Arial", Font.PLAIN, 16));
            jTable1.setRowHeight(25);
        }catch(Exception e){
            System.out.println("loi"+ e.getMessage());
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ComboBoxmonhoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(453, 7, 188, 41);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(659, 6, 104, 41);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(659, 61, 103, 40);

        ComboBoxmonhoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toán", "Tiếng Việt", "Khoa học" }));
        ComboBoxmonhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxmonhocActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxmonhoc);
        ComboBoxmonhoc.setBounds(569, 61, 87, 41);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Danh sách bài tập đã tải lên");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 350, 60);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 120);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setBackground(new java.awt.Color(245, 245, 245));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 720, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String query;
       try{
           connection = DBConnection.getConnection();
           Statement st = connection.createStatement();
           query = "DELETE FROM bai_tap WHERE ten_bt = '"+click+"'";
           st.execute(query);
           showMessageDialog(null,"Xóa thành công ");
           click = null;
           load();  
       }catch(Exception e){
           System.out.println("loi" + e.getMessage());
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComboBoxmonhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxmonhocActionPerformed

    }//GEN-LAST:event_ComboBoxmonhocActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          int row = jTable1.getSelectedRow();
        if (row != -1) { 
            Object Noidung = jTable1.getValueAt(row, 0);
            click = (String) Noidung;
            System.out.println("Đã chọn tên người dùng: " + Noidung.toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String query,mon,timkiem;
       timkiem = jTextField1.getText();
       mon = (String) ComboBoxmonhoc.getSelectedItem();
       if("".equals(timkiem)){
       query = "SELECT ten_bt,ten_mh,tg_tai_len FROM bai_tap WHERE ten_mh ='"+mon+"' ";
       loadtableds(query);
       }else{
       query ="SELECT ten_bt,ten_mh,tg_tai_len FROM bai_tap WHERE ten_mh = '"+mon+"' AND ten_bt = '"+timkiem+"'";
       loadtableds(query);
       }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxmonhoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
