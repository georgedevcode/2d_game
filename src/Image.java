import java.awt.EventQueue;
import javax.swing.JFrame;

public class Image extends JFrame{
    
    public Image(){
        initUI();
    }

    private void initUI(){

        add(new Board());

        pack();

        setTitle("Bardejov");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

}
