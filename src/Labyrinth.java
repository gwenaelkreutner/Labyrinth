import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Labyrinth {
    JFrame frame;

    JPanel panel = new JPanel();

    Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

    JButton genMapLab = new JButton("Generate Map");

    private int cells = 20;
    private int WIDTH = 850;
    private final int HEIGHT = 650;
    private final int MSIZE = 600;
    private int CSIZE = MSIZE/cells;

    public static void main(String[] args) {	//MAIN METHOD
        new Labyrinth();
    }

    public Labyrinth() {
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel.setBorder(BorderFactory.createTitledBorder(loweredetched, "Controls"));
        panel.setLayout(null);
        panel.setBounds(10,10, 210, 600);

        genMapLab.setBounds(40, 25, 120, 25);
        panel.add(genMapLab);

        frame.getContentPane().add(panel);


        genMapLab.addActionListener(e -> System.out.println("Yo la mif"));
    }
}
