import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

                // 1.  create a frame

                JFrame frame = new JFrame();

                // 2. create a panel

                JPanel panel = new JPanel();

                // 3. create components

                JLabel label = new JLabel("Hello Seaver");
                frame.setSize(500, 500);
                JButton button = new JButton("push me!");
                JTextField textField = new JTextField(10);
                Scrollbar scrollbar = new Scrollbar();

                ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
                // Scaling the image before putting it on the label
                icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
                // Creating a Label with an icon on it
                JLabel picLabel = new JLabel(icon);
                // 4. add components to panel

                panel.add(label);
                panel.setBackground(new Color(200, 100 , 57));
                panel.setBackground(Color.yellow);
                panel.add(button);
                panel.add(textField);
                panel.add(picLabel);
                panel.add(scrollbar);

                //add image



                // 5. add panel to frame

                frame.add(panel);

                // 6. make the frame visible

                frame.setVisible(true);

            }
        }

