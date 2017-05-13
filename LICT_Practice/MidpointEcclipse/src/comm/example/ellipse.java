package comm.example;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ellipse extends Applet {
	float x, y, xc, yc, rx, ry, p1, p2;
	public void paint(Graphics g) {
		rx = Integer.parseInt("100");
		ry = Integer.parseInt("50");
		xc = Integer.parseInt("100");
		yc = Integer.parseInt("100");
		x = 0;
		y = ry;
		p1 = (ry * ry) - (rx * rx * y) + (rx * rx / 4);
		do {
			g.drawString(".", Math.round(xc - x), Math.round(yc + y));
			g.drawString(".", Math.round(xc - x), Math.round(yc - y));
			g.drawString(".", Math.round(xc + x), Math.round(yc + y));
			g.drawString(".", Math.round(xc + x), Math.round(yc - y));
			x++;
			if (p1 < 0)
				p1 = p1 + (2 * ry * ry * x) + (ry * ry);
			else {
				y -= 1;
				p1 = p1 + (2 * ry * ry * x) - (2 * rx * rx * y) + (ry * ry);
			}
		} while ((2 * ry * ry * x) < (2 * rx * rx * y));
		p2 = (ry * ry * (x + 1 / 2) * (x + 1 / 2))
				+ (rx * rx * (y - 1) * (y - 1)) - (ry * ry * rx * rx);
		while (y > 0) {
			g.drawString(".", Math.round(xc - x), Math.round(yc + y));
			g.drawString(".", Math.round(xc - x), Math.round(yc - y));
			g.drawString(".", Math.round(xc + x), Math.round(yc + y));
			g.drawString(".", Math.round(xc + x), Math.round(yc - y));
			y--;
			if (p2 > 0)
				p2 = p2 - (2 * rx * rx * y) + (ry * ry);
			else {
				x += 1;
				p2 = p2 = (2 * ry * ry * x) + (2 * rx * rx * y) + (ry * ry);
			}
		}
	}
}
