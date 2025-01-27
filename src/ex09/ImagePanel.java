package ex09;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class ImagePanel extends JPanel{
  public BufferedImage image;
  
  ImagePanel() {
    super();
  }
  
  public void setImage(BufferedImage image) { // imageを描画しなおすものも含む
    this.image = image;
    this.setPreferredSize(new Dimension(this.image.getWidth(), this.image.getHeight()));
    repaint();
  }
  @Override
  protected void paintComponent(Graphics g) { // 描画されるときに呼ばれるやつ
    super.paintComponent(g);
    g.drawImage(image, 0, 0, null);
  }
}