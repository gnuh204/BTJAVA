
package FormHS;


import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import packageapp.DBConnection;


public class JPaneLB extends javax.swing.JPanel {
private static Connection connection;
private static final HashMap<Integer, String> answers = new HashMap<>();
private static final HashMap<Integer, String> dapandung = new HashMap<>();; 
  
    public JPaneLB() {
        initComponents();
       
        
        
    }
    
    public void loadBT(){
        LLK();
    }
    private void LLK(){
        String ten = JPanelBTHS.BaiKT.getTen();
        String mon = JPanelBTHS.BaiKT.getMonhoc();
        String query;
        
        try{
            connection = DBConnection.getConnection();
            query = "SELECT lk_bt FROM bai_tap WHERE ten_bt = '"+ten+"' AND ten_mh ='"+mon+"'";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                String lkbt = rs.getString("lk_bt");
                UILB(lkbt);
            }else {
            System.out.println("Không tìm thấy bài tập." + ten );
            }
            
        }catch(Exception e){
            System.out.println("loi"+ e.getMessage());
        }
    }
    
    private void UILB(String lkbt){
       
        try {
            File file = new File(lkbt);
            PDDocument document = Loader.loadPDF(file);
            PDFRenderer renderer = new PDFRenderer(document);
            BufferedImage image = renderer.renderImage(0); 
            JLabel pdfLabel = new JLabel(new ImageIcon(image));
            JScrollPane pdfScrollPane = new JScrollPane(pdfLabel);
            pdfPanel.add(pdfScrollPane, BorderLayout.CENTER);
            document.close();
        } catch (Exception e) {
            pdfPanel.add(new JLabel("Không thể tải PDF"), BorderLayout.CENTER);
        }
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));
        
         for (int i = 1; i <= 20; i++) {
             
            quizPanel.add(createQuestionPanel(i));
            
        }
    }
    
    private static JPanel createQuestionPanel(int questionNumber) {
        JPanel questionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        questionPanel.setBorder(BorderFactory.createTitledBorder("Câu " + questionNumber));

        JLabel questionLabel = new JLabel("Câu hỏi " + questionNumber + ": ");
        JRadioButton optionA = new JRadioButton("A");
        JRadioButton optionB = new JRadioButton("B");
        JRadioButton optionC = new JRadioButton("C");
        JRadioButton optionD = new JRadioButton("D");

        // Gắn ActionListener để cập nhật câu trả lời
        ActionListener answerListener = e -> {
            String selectedAnswer = e.getActionCommand(); // Lấy đáp án từ ActionCommand
            answers.put(questionNumber, selectedAnswer);
            System.out.println("HashMap hiện tại: " + answers);// Cập nhật HashMap
        };

        optionA.setActionCommand("A");
        optionB.setActionCommand("B");
        optionC.setActionCommand("C");
        optionD.setActionCommand("D");

        optionA.addActionListener(answerListener);
        optionB.addActionListener(answerListener);
        optionC.addActionListener(answerListener);
        optionD.addActionListener(answerListener);

        ButtonGroup group = new ButtonGroup();
        group.add(optionA);
        group.add(optionB);
        group.add(optionC);
        group.add(optionD);

        questionPanel.add(questionLabel);
        questionPanel.add(optionA);
        questionPanel.add(optionB);
        questionPanel.add(optionC);
        questionPanel.add(optionD);

        return questionPanel;
    }
    public static HashMap<Integer,String> Dapandung(){
        String ten = JPanelBTHS.BaiKT.getTen();
        String mon = JPanelBTHS.BaiKT.getMonhoc();
        String query;
        try{
          connection = DBConnection.getConnection();
          query = "SELECT cau1, cau2, cau3, cau4, cau5, cau6, cau7, cau8, cau9, cau10, "
                         + "cau11, cau12, cau13, cau14, cau15, cau16, cau17, cau18, cau19, cau20 "
                         + "FROM bai_tap WHERE ten_bt ='"+ten+"' AND ten_mh = '"+mon+"'";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        System.out.println("n");
        if (rs.next()) {
                for (int i = 1; i <= 20; i++) {
                  dapandung.put(i, rs.getString("cau" + i));
                  System.out.println("n");
                }
            }
        }catch(Exception e){
            System.out.println("loi" + e.getMessage());
        }
        return dapandung;
    }
    private static void gradeQuiz() {
        

        double score = 0;
        ArrayList<Integer> unansweredQuestions = new ArrayList<>();
         HashMap<Integer, String> dapandung = Dapandung();

        // Duyệt qua tất cả các câu hỏi
        for (int question : dapandung.keySet()) {
            if (!answers.containsKey(question)) {
                unansweredQuestions.add(question); // Câu hỏi chưa được trả lời
            } else if (dapandung.get(question).equals(answers.get(question))) {
                score +=0.5; // Đáp án đúng
            }
        }

        // Hiển thị kết quả
        StringBuilder resultMessage = new StringBuilder();
        resultMessage.append("Điểm số của bạn: ").append(score).append("/").append(dapandung.size()).append("\n");

        if (!unansweredQuestions.isEmpty()) {
            resultMessage.append("Các câu hỏi chưa trả lời: ");
            for (int question : unansweredQuestions) {
                resultMessage.append(question).append(" ");
            }
        } else {
            resultMessage.append("Bạn đã trả lời tất cả các câu hỏi.");
        }

        JOptionPane.showMessageDialog(null, resultMessage.toString(), "Kết quả bài kiểm tra", JOptionPane.INFORMATION_MESSAGE);
    }

     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScroll = new javax.swing.JScrollPane();
        quizPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pdfPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout quizPanelLayout = new javax.swing.GroupLayout(quizPanel);
        quizPanel.setLayout(quizPanelLayout);
        quizPanelLayout.setHorizontalGroup(
            quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        quizPanelLayout.setVerticalGroup(
            quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jScroll.setViewportView(quizPanel);

        jButton1.setText("Nộp Bài");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pdfPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pdfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(81, 81, 81))
                    .addComponent(jScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(0, 35, Short.MAX_VALUE))
            .addComponent(pdfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gradeQuiz();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JPanel pdfPanel;
    private javax.swing.JPanel quizPanel;
    // End of variables declaration//GEN-END:variables
}
