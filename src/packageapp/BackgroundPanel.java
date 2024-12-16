/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageapp;


import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;
    private boolean scaleToPanel; // Biến điều khiển co giãn ảnh
    private int customWidth;     // Chiều rộng ảnh tùy chỉnh
    private int customHeight;    // Chiều cao ảnh tùy chỉnh

    // Constructor 1: Co giãn ảnh theo JPanel
    public BackgroundPanel(String imagePath) {
        this(imagePath, true, 0, 0);
    }

    // Constructor 2: Hiển thị ảnh với kích thước cố định
    public BackgroundPanel(String imagePath, boolean scaleToPanel, int customWidth, int customHeight) {
        try {
            backgroundImage = new ImageIcon(imagePath).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.scaleToPanel = scaleToPanel;
        this.customWidth = customWidth;
        this.customHeight = customHeight;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            if (scaleToPanel) {
                // Co giãn ảnh theo kích thước của JPanel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            } else {
                // Vẽ ảnh với kích thước tùy chỉnh
                g.drawImage(backgroundImage, 0, 0, customWidth, customHeight, this);
            }
        }
    }

    // Phương thức để thay đổi ảnh nền và kích thước
    public void setBackgroundImage(String imagePath, boolean scaleToPanel, int customWidth, int customHeight) {
        try {
            backgroundImage = new ImageIcon(imagePath).getImage();
            this.scaleToPanel = scaleToPanel;
            this.customWidth = customWidth;
            this.customHeight = customHeight;
            repaint(); // Vẽ lại JPanel
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

