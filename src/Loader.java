import javax.swing.*;
import java.awt.*;


public class Loader {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout(1,1));
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Текст"));
        Canvas canv = new Canvas();
        frame.add(canv);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static class Canvas extends JComponent{

        /*Метод, перерисовывающий элемент внутри окна
         *при обновлении*/
        public void paintComponent(Graphics g){
            super.paintComponents(g);
            Graphics2D g2d=(Graphics2D)g;

            /* 	Устанавливает цвет рисования в зелёный*/
            g2d.setPaint(Color.GREEN);

            /* 	Рисует текущим цветом прямоугольник	*/
            g2d.drawRect(100, 100, 80, 20);

            g2d.setPaint(Color.RED);
            /* 	Рисует текущим цветом в координатах (150,150) строку "привет мир"*/
            g2d.drawString("Привет мир", 150, 150);

            g2d.setColor(Color.blue);
            /*	Рисует текущим цветом овал в координатах (200,50)*/
            g2d.fillOval(200, 50, 50, 20);

            /* 	Вызывает обновление себя после завершения рисования	*/
            super.repaint();
        }
    }
}
