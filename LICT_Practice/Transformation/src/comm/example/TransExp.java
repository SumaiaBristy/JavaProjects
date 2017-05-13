package comm.example;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.RoundRectangle2D;
public class TransExp {
 public static void main(String[] args) {
Frame frame = new Frame();
  frame.add(new CustomPaintComponent());
int frameWidth = 200;
int frameHeight = 200;
frame.setSize(frameWidth, frameHeight);
frame.setVisible(true);
}
static class CustomPaintComponent extends Component {
public void paint(Graphics g) 
{
Graphics2D g2d = (Graphics2D)g;
int x = 0;
int y = 0;
int w = getSize().width-1;
int h = getSize().height-1;
Shape roundRectangle = new RoundRectangle2D.Float(x, y, w, h, w*2, h*2);
AffineTransform affineTransform = new AffineTransform();
affineTransform.scale(0.2, 0.6);
affineTransform.translate(w/4, h/4);
affineTransform.rotate(0.18);
Shape newRoundRectangle = affineTransform.createTransformedShape(roundRectangle);
g2d.draw(roundRectangle);
g2d.draw(newRoundRectangle);

}
}
}

