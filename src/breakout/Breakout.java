
package breakout;

import javax.swing.JFrame;

/**
 *
 * @author Hudson Schumaker
 */
public class Breakout extends JFrame {

    public Breakout() {
        add(new Board());
        setTitle("HS - Breakout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Commons.WIDTH, Commons.HEIGTH);
        setLocationRelativeTo(null);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Breakout();
    }
}
