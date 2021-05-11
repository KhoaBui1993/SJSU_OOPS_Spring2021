import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;
    // create a text field
    static JTextField l;
    // store operator and operands
    String s0, s1, s2;

    // default constructor
    Calculator()
    {
        s0 = s1 = s2 = "";
    }
public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                // if operand is present then add to second no
                if (!s1.equals(""))
                        s2 = s2 + s;
                else
                        s0 = s0 + s;

                // set the value of text
                l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
                // clear the one letter
                s0 = s1 = s2 = "";

                // set the value of text
                l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {

                double te = switch (s1) {
                        case "+" -> (Double.parseDouble(s0) + Double.parseDouble(s2));
                        case "-" -> (Double.parseDouble(s0) - Double.parseDouble(s2));
                        case "/" -> (Double.parseDouble(s0) / Double.parseDouble(s2));
                        default -> (Double.parseDouble(s0) * Double.parseDouble(s2));
                };

                // store the value in 1st

                // set the value of text
                l.setText(s0 + s1 + s2 + "=" + te);

                // convert it to string
                s0 = Double.toString(te);

                s1 = s2 = "";
        }
        else {
                // if there was no operand
                if (s1.equals("") || s2.equals(""))
                        s1 = s;
                        // else evaluate
                else {
                        double te = switch (s1) {
                                case "+" -> (Double.parseDouble(s0) + Double.parseDouble(s2));
                                case "-" -> (Double.parseDouble(s0) - Double.parseDouble(s2));
                                case "/" -> (Double.parseDouble(s0) / Double.parseDouble(s2));
                                default -> (Double.parseDouble(s0) * Double.parseDouble(s2));
                        };

                        // store the value in 1st

                        // convert it to string
                        s0 = Double.toString(te);

                        // place the operator
                        s1 = s;

                        // make the operand blank
                        s2 = "";
                }

                // set the value of text
                l.setText(s0 + s1 + s2);
        }
        if (s.equals("AC"))
                s1=s2=s0="";
        l.setText(s0+s1+s2);
}
// main function
public static void main(String[] args)
{


        // create a frame
        f = new JFrame("Calculator");
        try {
                // set look and feel
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
                System.err.println(e.getMessage());
        }
        // create the menu
        JMenuBar menuBar= new JMenuBar();
        JMenu menu= new JMenu();
        menu.setIcon(new ImageIcon("menu_icon.png"));
        menu.setText("Operation Menu");
        menuBar.add(menu);
        JMenuItem plus= new JMenuItem("+",new ImageIcon("plus.png"));
        JMenuItem Mul= new JMenuItem("*",new ImageIcon("mul.png"));
        JMenuItem minus= new JMenuItem("-",new ImageIcon("minus.png"));
        JMenuItem Div= new JMenuItem("/",new ImageIcon("div.png"));

        //add menu item to menubar
        menu.add(plus);
        menu.add(minus);
        menu.add(Mul);
        menu.add(Div);


        // create a object of class
        Calculator c = new Calculator();

        // create a text field
        l = new JTextField(16);

        // set the text field to non editable
        l.setEditable(false);

        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

        // create number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        // equals button
        beq1 = new JButton("=");

        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        ImageIcon delete= new ImageIcon("clear.png");
        beq = new JButton();
        beq.setIcon(delete);
        beq.setText("AC");
        // create . button
        be = new JButton(".");

        // create a panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,3));
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,1));
        // add action listeners
        bm.addActionListener(c);
        bd.addActionListener(c);
        bs.addActionListener(c);
        ba.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        be.addActionListener(c);
        beq.addActionListener(c);
        beq1.addActionListener(c);
        plus.addActionListener(c);
        minus.addActionListener(c);
        Mul.addActionListener(c);
        Div.addActionListener(c);

        // add elements to panel


        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(be);
        p.add(beq);

        p1.add(bs);
        p1.add(ba);
        p1.add(bd);
        p1.add(beq1);
        p1.add(bm);
        // add panel to frame
        f.setSize(400, 500);
        f.setLayout(new BorderLayout());
        f.setJMenuBar(menuBar);
        f.add(l,BorderLayout.NORTH);
        f.add(p,BorderLayout.CENTER);
        f.add(p1,BorderLayout.EAST);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}