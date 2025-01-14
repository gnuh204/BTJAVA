

package FormGVpanel;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import packageapp.DBConnection;





public class JPanelDSNHCH extends javax.swing.JPanel {
private Connection connection;
private String click = null;
    public JPanelDSNHCH() {
        
        initComponents();
       
    }
    public void loadtable(){
    String query;
    try{
       connection = DBConnection.getConnection();
       Statement st = connection.createStatement();
       query = "SELECT * FROM n_hang_ch";
       ResultSet rs = st.executeQuery(query);
       List<Object[]> rowData = new ArrayList<>();
       while(rs.next()){
                    String Noi_dung = rs.getString("noi_dung");
                    String dapanA = rs.getString("dap_an_a");
                    String dapanB = rs.getString("dap_an_b");
                    String dapanC = rs.getString("dap_an_c");
                    String dapanD = rs.getString("dap_an_d");
                    String dapanDung = rs.getString("dap_an_dung");
                    String monhoc = rs.getString("monhoc");
                    rowData.add(new Object[]{Noi_dung,monhoc,dapanA , dapanB,dapanC, dapanD,dapanDung});
                }
            Object[][] dataFromDb = rowData.toArray(new Object[0][]);
            String[] columnNames = {"Nội Dung", "Môn", "Đáp án A", "Đáp án B", "Đáp án C","Đáp án D","Đáp án đúng"}; // Thêm tiêu đề cột
            DefaultTableModel model = new DefaultTableModel(dataFromDb, columnNames);
            Tablenhch.setModel(model);
            JTableHeader header = Tablenhch.getTableHeader();
            header.setFont(new Font("Arial", Font.BOLD, 16));
            Tablenhch.setFont(new Font("Arial", Font.PLAIN, 16));
            Tablenhch.setRowHeight(25);
    }catch(Exception e){
        System.out.println("loi"+ e.getMessage());
    }
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonThemNHCH = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Xoabtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablenhch = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(800, 750));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 750));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ngân hàng câu hỏi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 110);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(480, 130, 180, 40);

        jButton1.setText("Tìm Kiếm");
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 130, 90, 40);

        jButtonThemNHCH.setText("Thêm");
        jButtonThemNHCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemNHCHActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonThemNHCH);
        jButtonThemNHCH.setBounds(260, 640, 90, 40);

        jButton3.setText("Sửa");
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 640, 90, 40);

        Xoabtn.setText("Xóa");
        Xoabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoabtnActionPerformed(evt);
            }
        });
        jPanel1.add(Xoabtn);
        Xoabtn.setBounds(480, 640, 90, 40);

        Tablenhch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nội Dung", "Môn", "Đáp án A", "Đáp án B", "Đáp án C", "Đáp án D", "Đáp án đúng"
            }
        ));
        Tablenhch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablenhchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablenhch);
        if (Tablenhch.getColumnModel().getColumnCount() > 0) {
            Tablenhch.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 740, 430);

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
    public void setButtonListener(java.awt.event.ActionListener listener) {
        // Kết nối listener với nút "Thêm"
        jButtonThemNHCH.addActionListener(listener);
    }
    private void jButtonThemNHCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemNHCHActionPerformed
      
    }//GEN-LAST:event_jButtonThemNHCHActionPerformed

    private void XoabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoabtnActionPerformed
        String query;
       
        try{
             connection = DBConnection.getConnection();
             Statement st = connection.createStatement();
             query = "DELETE FROM n_hang_ch WHERE noi_dung = '"+click+"' ";
             st.execute(query);
             showMessageDialog(null,"Đã xóa tài khoản "+click+"");
             loadtable();
        }catch(Exception e){
            System.out.println("loi"+ e.getMessage());
        }
    }//GEN-LAST:event_XoabtnActionPerformed

    private void TablenhchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablenhchMouseClicked
         int row = Tablenhch.getSelectedRow();
        if (row != -1) { 
            Object Noidung = Tablenhch.getValueAt(row, 0);
            click = (String) Noidung;
            System.out.println("Đã chọn tên người dùng: " + Noidung.toString());
        }
    }//GEN-LAST:event_TablenhchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablenhch;
    private javax.swing.JButton Xoabtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonThemNHCH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
