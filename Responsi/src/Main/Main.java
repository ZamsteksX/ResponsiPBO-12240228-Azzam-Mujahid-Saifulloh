package Main;

import View.Beasiswa.ViewData;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Identitas:
 * Kelas: [IF-D]
 * NIM  : [123240228]
 * Nama : [Azzam Mujahid SaiFulloh]
 */
public class Main {
    public static void main(String[] args) {
        try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (exceptiom e){
        SYsytem.err.println("Gagal mengatur Look and Feel: " +e.getMessage());
    }
        SwingUtilities.invokeLater(()->{
            ViewData view = new MainView();
            view.setVisible(true);
        });
}