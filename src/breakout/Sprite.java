package breakout;

import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author Hudson Schumaker
 * @since 16/09/2014
 */
public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int heigth;
    protected Image image;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return heigth;
    }

    public Image getImage() {
        return image;
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }
}
