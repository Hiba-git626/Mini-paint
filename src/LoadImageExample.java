import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class LoadImageExample extends JPanel {

    BufferedImage img;
    public void paint(Graphics g) {

        g.drawImage(img, 0, 0, null);

    }
    public LoadImageExample() {

        try {

            img = ImageIO.read(new File("src/LogoENSA.png"));

        } catch (IOException e) {

            System.out.println("Error");

        }

    }
    public Dimension getPreferredSize() {

        if (img == null) return new Dimension(100, 100);
        else return new Dimension(img.getWidth(null), img.getHeight(null));

    }
    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Exemple");
        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                System.exit(0);

            }

        });
        f.add(new LoadImageExample());
        f.pack(); f.setVisible(true);

    }

}
