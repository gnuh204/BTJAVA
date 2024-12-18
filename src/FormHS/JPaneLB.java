/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormHS;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class JPaneLB extends javax.swing.JPanel {

   
    public JPaneLB() {
        initComponents();
        
        try {
            File file = new File("D:\\DL\\SO RANG EM BIET ANH CON YEU EM (Juun Dang Dung) - FINGERSTYLE.pdf");
            PDDocument document = Loader.loadPDF(file);
            PDFRenderer renderer = new PDFRenderer(document);
            BufferedImage image = renderer.renderImage(0); 
            JLabel pdfLabel = new JLabel(new ImageIcon(image));
            JScrollPane pdfScrollPane = new JScrollPane(pdfLabel);
            pdfPanel.add(pdfScrollPane, BorderLayout.CENTER);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
            pdfPanel.add(new JLabel("Không thể tải PDF"), BorderLayout.CENTER);
        }
        quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 20; i++) {
            JPanel questionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            questionPanel.setBorder(BorderFactory.createTitledBorder("Câu " + i));

            JLabel questionLabel = new JLabel("Câu hỏi " + i + ": ");
            JRadioButton optionA = new JRadioButton("A");
            JRadioButton optionB = new JRadioButton("B");
            JRadioButton optionC = new JRadioButton("C");
            JRadioButton optionD = new JRadioButton("D");

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
            quizPanel.add(questionPanel);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
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

        jScrollPane2.setViewportView(quizPanel);

        jButton1.setText("Nộp Bài");

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(0, 35, Short.MAX_VALUE))
            .addComponent(pdfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pdfPanel;
    private javax.swing.JPanel quizPanel;
    // End of variables declaration//GEN-END:variables
}
