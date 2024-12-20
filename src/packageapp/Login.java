
package packageapp;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class Login extends javax.swing.JFrame {
    private Connection connection;
  
    public Login() {
        initComponents();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lgTenTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lgMK = new javax.swing.JPasswordField();
        btnOPLoginGv = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Loginhs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(350, 400));
        Right.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Right.add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\JAVABTL\\APPHTHT\\JavaAppht\\src\\icon\\chalkboard_icon.png")); // NOI18N
        Right.add(jLabel6, new java.awt.GridBagConstraints());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Luyện mãi thành tài, miệt mài tất giỏi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 29, 155, 38);
        Right.add(jLabel7, gridBagConstraints);

        jPanel1.add(Right);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(350, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên đăng nhập");

        lgTenTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgTenTKActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");

        lgMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgMKActionPerformed(evt);
            }
        });

        btnOPLoginGv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOPLoginGv.setForeground(new java.awt.Color(255, 0, 0));
        btnOPLoginGv.setText("Đăng nhập");
        btnOPLoginGv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOPLoginGvActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Đăng nhập dành cho giáo viên");

        Loginhs.setBackground(new java.awt.Color(0, 102, 102));
        Loginhs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Loginhs.setForeground(new java.awt.Color(255, 255, 255));
        Loginhs.setText("Đăng nhập");
        Loginhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginhsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Loginhs)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                    .addComponent(btnOPLoginGv))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lgTenTK, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lgMK, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lgTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lgMK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Loginhs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOPLoginGv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lgTenTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgTenTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgTenTKActionPerformed

    private void lgMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgMKActionPerformed

    private void btnOPLoginGvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOPLoginGvActionPerformed
        LoginGV LoginGVFrame = new LoginGV();
        LoginGVFrame.setVisible(true);
        LoginGVFrame.pack();
        LoginGVFrame.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnOPLoginGvActionPerformed

    private void LoginhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginhsActionPerformed
           String TenTK, MK, query,passDb = null;
           int NotFound = 0;
      try{
          connection = DBConnection.getConnection();
          Statement st = connection.createStatement();
          if("".equals(lgTenTK.getText())){
              JOptionPane.showMessageDialog(new JFrame(), "chưa nhập tên tài khoản","lỗi",JOptionPane.ERROR_MESSAGE);
              
          }else if("".equals(lgMK.getText())){
              JOptionPane.showMessageDialog(new JFrame(), "chưa nhập mật khẩu","lỗi",JOptionPane.ERROR_MESSAGE);
          }else{
            TenTK = lgTenTK.getText();
            MK = lgMK.getText();
            query = "SELECT * FROM userhs WHERE ten_tk = '" + TenTK + "'";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                passDb = rs.getString("mk");
                NotFound = 1;
            }
            if(NotFound == 1 && MK.equals(passDb)){
            HSForm HSFormFrame = new HSForm();
            HSFormFrame.setVisible(true);
            HSFormFrame.pack();
            HSFormFrame.setLocationRelativeTo(null);
        this.dispose();
            }else{
                JOptionPane.showMessageDialog(new JFrame(), "Vui lòng kiểm ta lại thông tin đăng nhập ","Đăng nhập không thành công",JOptionPane.ERROR_MESSAGE);
            }
          
            lgTenTK.setText("");
            lgMK.setText("");
            
          }
      }catch(Exception e){
          System.out.println("lỗi" + e.getMessage());
      }
    }//GEN-LAST:event_LoginhsActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginhs;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnOPLoginGv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField lgMK;
    private javax.swing.JTextField lgTenTK;
    // End of variables declaration//GEN-END:variables
}
