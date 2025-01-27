package ex09;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GrayImage extends BufferedImage{
  public GrayImage(BufferedImage img) {
    super(img.getWidth(), img.getHeight(), TYPE_BYTE_GRAY);
    Graphics g = createGraphics();
    g.drawImage(img, 0, 0, null);
  }
  
  public int getGray(int x, int y) {
    int argb = getRGB(x,y);
    int l = argb & 0xff;
    return l;
  }
  public void setGray(int x, int y, int gray) {
    int argb = (0xff<<24) | (gray<<16) | (gray<<8) | gray;
    setRGB(x,y,argb);
  }
  public void applyFilter(Processable binaryImageFilter) {
    binaryImageFilter.process(this);
  }
}
