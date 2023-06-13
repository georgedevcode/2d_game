import java.awt.EventQueue;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
    //    EventQueue.invokeLater(() -> {
    //         Application ex = new Application();
    //         ex.setVisible(true);
    //     });

        EventQueue.invokeLater(() -> {
            Image image = new Image();
            image.setVisible(true);
        });
    }
}
