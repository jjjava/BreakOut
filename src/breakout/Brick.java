package breakout;

import javax.swing.ImageIcon;

/**
 *
 * @author Hudson Schumaker
 * @since 16/09/2014
 */
public class Brick extends Sprite {

    String brickie = "images/brick.png";

    boolean destroyed;

    public Brick(int x, int y) {
        this.x = x;
        this.y = y;

        ImageIcon ii = new ImageIcon(this.getClass().getResource(brickie));
        image = ii.getImage();
        width = image.getWidth(null);
        heigth = image.getHeight(null);
        destroyed = false;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
}
