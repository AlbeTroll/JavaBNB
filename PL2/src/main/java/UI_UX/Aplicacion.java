package UI_UX;

import Logica.*;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 * Clase principal que representa la aplicación de usuario.
 */
class WindowEventHandler extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent evt) {
        JavaBNB.guardarDatos();
    }
}

public class Aplicacion {

    // Se define un CardLayout para gestionar los diferentes paneles de la aplicación.
    static CardLayout cardLayout = new CardLayout();
    // JPanel que actúa como contenedor de los paneles que forman la aplicación.
    static JPanel cards = new JPanel(cardLayout);
    // JFrame principal de la aplicación.
    static JFrame frame = new JFrame();

    // Instancias de los paneles de la aplicación.
    static Login login = new Login();
    static Register register = new Register();
    static PrivacyPolicy privacypolicy = new PrivacyPolicy();
    static MainScreen mainscreen = new MainScreen();
    static UserProfile userprofile = new UserProfile();
    static AdminScreen adminscreen = new AdminScreen();

    public static Sesion sesion = null;  //iniciamos sesion como null

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * caso).
     */
    public static void main(String[] args) {

        new JavaBNB();
        JavaBNB.cargarDatos();

        // Establecer el tamaño mínimo de la ventana.
        frame.setMinimumSize(new Dimension(900, 777));

        // Crear un JScrollPane y agregar el panel cards para permitir el desplazamiento.
        JScrollPane scrollPane = new JScrollPane(cards);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Agregar los paneles a cards.
        cards.add(login, "Pantalla login");
        cards.add(register, "Pantalla register");
        cards.add(privacypolicy, "Pantalla privacypolicy");
        cards.add(mainscreen, "Pantalla mainscreen");
        cards.add(adminscreen, "Pantalla adminscreen");
        loadUserProfile();

        // Establecer el contenido del JFrame como el JScrollPane.
        frame.setContentPane(scrollPane);
        // Configurar el comportamiento de cierre del JFrame.
        frame.addWindowListener(new WindowEventHandler());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible el JFrame.
        frame.setVisible(true);
        // Mostrar inicialmente la pantalla de login.
        cardLayout.show(cards, "Pantalla login");
    }

    public static void loadUserProfile() {
        cards.add(userprofile, "Pantalla userprofile");
        userprofile.actualizar();
        cardLayout.show(cards,"Pantalla userprofile");
        
    }
}