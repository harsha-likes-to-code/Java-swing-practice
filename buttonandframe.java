import javax.swing.*;
class gui
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JButton b = new JButton("Hello");
        b.setBounds(200,200,200,200);
        f.add(b);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
