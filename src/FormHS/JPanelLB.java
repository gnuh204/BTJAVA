/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FormHS;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;


public class JPanelLB extends javax.swing.JPanel {

 
    public JPanelLB() {
        initComponents();
        try{
        File file = new File("D:\\DL\\SO RANG EM BIET ANH CON YEU EM (Juun Dang Dung) - FINGERSTYLE.pdf");
        PDDocument document = Loader.loadPDF(file);
        PDFRenderer renderer = new PDFRenderer(document);
        BufferedImage image = renderer.renderImage(0);
        JLabel pdfLabel = new JLabel(new ImageIcon(image));
        JScrollPane pdfScrollPane = new JScrollPane(pdfLabel);
        jPanel1.add(pdfScrollPane, BorderLayout.CENTER);
        document.close();
        } catch(Exception e){
            e.printStackTrace();
            jPanel1.add(new JLabel("Không thể tải PDF"), BorderLayout.CENTER);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 550);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        add(jPanel2);
        jPanel2.setBounds(777, 0, 343, 469);
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
