/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormHS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.sql.*;
import java.util.Enumeration;
import packageapp.DBConnection;

public class JPanelKT1 extends javax.swing.JPanel {
private Connection connection;
private ArrayList<JPanel> questionPanels;
private ArrayList<ButtonGroup> answerGroups;
private QuizDataFetcher dataFetcher;
private static Timer timer;
private int totalSeconds;

    public JPanelKT1() {
        initComponents();
    }

    public void KT1(){
         Qf();
    }
    private void Qf(){
        String thoigian = JPanelKT.Thoigian.getThoigian();
        totalSeconds = Integer.parseInt(thoigian) * 60;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (totalSeconds > 0) {
                    totalSeconds--;
                    lbtg.setText(formatTime(totalSeconds));
                } else {
                    timer.stop(); // Dừng bộ đếm khi kết thúc
                    JOptionPane.showMessageDialog(null, 
                        "Hết thời gian!", 
                        "Thông báo", 
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        lbtg.setText(formatTime(totalSeconds));
        timer.start();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        questionPanels = new ArrayList<>();
        answerGroups = new ArrayList<>();
        dataFetcher = new QuizDataFetcher();
        String[][] sampleQuestions = dataFetcher.fetchQuestions();
          for (String[] question : sampleQuestions) {
            addQpanel(question);
        }
         
    }
    private String formatTime(int totalSeconds) {
    int minutes = totalSeconds / 60; // Tính phút
    int seconds = totalSeconds % 60; // Tính giây
    return String.format("%02d:%02d", minutes, seconds); // Định dạng "MM:SS"
    }
    private void addQpanel(String[] Qdata){
       JPanel QPanel = new JPanel();
       QPanel.setLayout(new BoxLayout(QPanel, BoxLayout.Y_AXIS));
       QPanel.setBorder(BorderFactory.createTitledBorder(Qdata[0]));
       ButtonGroup group = new ButtonGroup();
       JRadioButton optionA = new JRadioButton(Qdata[1]);
       group.add(optionA);
       QPanel.add(optionA);
       JRadioButton optionB = new JRadioButton(Qdata[2]);
       group.add(optionB);
       QPanel.add(optionB);
       JRadioButton optionC = new JRadioButton(Qdata[3]);
       group.add(optionC);
       QPanel.add(optionC);
       JRadioButton optionD = new JRadioButton(Qdata[4]);
       group.add(optionD);
       QPanel.add(optionD);
       mainPanel.add(QPanel);
       questionPanels.add(QPanel);
       answerGroups.add(group);
       
       
    }
    public class QuizDataFetcher {
     public String[][] fetchQuestions() {
        String[][] questions = new String[20][6];
        String mon = JPanelKT.Thoigian.getMonhoc();
        String query = "SELECT noi_dung, dapan_a, dapan_b, dapan_c, dapan_d, dap_an_dung FROM n_hang_ch WHERE '"+mon+"' ORDER BY RAND() LIMIT 20"; // Truy vấn ngẫu nhiên

        try {
            connection = DBConnection.getConnection();
            Statement stmt = connection.createStatement(); 
            ResultSet rs = stmt.executeQuery(query);
            int i = 0;
            while (rs.next()) {
                questions[i][0] = rs.getString("noidung"); // Câu hỏi
                questions[i][1] = rs.getString("dapana"); // Đáp án A
                questions[i][2] = rs.getString("dapanb"); // Đáp án B
                questions[i][3] = rs.getString("dapanc"); // Đáp án C
                questions[i][4] = rs.getString("dapand"); // Đáp án D
                questions[i][5] = rs.getString("dapandung"); // Đáp án đúng
                i++;
            }
        } catch (Exception e) {
            System.out.println("loi" + e.getMessage());
        }

        return questions;
    }}
  private void submitQuiz() {
    int correctAnswers = 0;
    int totalQuestions = questionPanels.size();

    // Lấy các đáp án đúng từ cơ sở dữ liệu (cột "dapandung")
    String[] correctAnswersData = new String[totalQuestions];
    for (int i = 0; i < totalQuestions; i++) {
        correctAnswersData[i] = dataFetcher.fetchQuestions()[i][5]; // Lấy đáp án đúng từ cột "dapandung"
    }

    // Kiểm tra đáp án của người dùng
    for (int i = 0; i < answerGroups.size(); i++) {
        ButtonGroup group = answerGroups.get(i);
        Enumeration<AbstractButton> buttons = group.getElements();

        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected() && button.getText().equals(correctAnswersData[i])) {
                correctAnswers++;
                break; // Đã tìm thấy câu trả lời đúng, không cần kiểm tra các nút khác
            }
        }
    }

    // Hiển thị kết quả
    JOptionPane.showMessageDialog(null, "Bạn trả lời đúng " + correctAnswers + "/" + totalQuestions + " câu!");
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbtg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(null);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(null);
        add(mainPanel);
        mainPanel.setBounds(0, 0, 0, 0);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Thời gian còn lại");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 90, 141, 43);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbtg.setBackground(new java.awt.Color(255, 255, 255));
        lbtg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbtg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbtg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(27, 134, 120, 43);

        jButton1.setText("Nộp bài");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 340, 120, 50);

        add(jPanel1);
        jPanel1.setBounds(930, 0, 190, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       submitQuiz();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbtg;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
