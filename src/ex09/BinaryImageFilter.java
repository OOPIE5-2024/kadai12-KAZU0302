package ex09;

public class BinaryImageFilter implements Processable{
   @Override
  public void process(GrayImage img) {
    int width = img.getWidth();
    int height = img.getHeight();
    int threshould = 128;
    
    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        int l = img.getGray(i, j);
        if (l <= threshould) {
          l = 0;
        } else {
          l = 255;
        }
        img.setGray(i, j, l);
      }
    }
  }
}
