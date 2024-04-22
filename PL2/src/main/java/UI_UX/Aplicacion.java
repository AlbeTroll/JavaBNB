package UI_UX;

import java.awt.CardLayout;
import javax.swing.*;


public class Aplicacion {
    static CardLayout cardLayout = new CardLayout();
    static JPanel cards = new JPanel(cardLayout); //Cards: Contenedor donde van las pantallas (el cardLayout las controla).
    static JFrame frame = new JFrame(); //Ventana normal y corriente.
    
    static Login login = new Login();
    static Register register = new Register();
    static PrivacyPolicy privacypolicy = new PrivacyPolicy();
    
    public static void main(String[] args){
        cards.add(login, "Pantalla login"); //Llamo a toda la lista de pantallas disponibles
        cards.add(register, "Pantalla register");
        cards.add(privacypolicy, "Pantalla privacypolicy");
        
        frame.setContentPane(cards); //Muestra por pantalla las cards
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Si le doy a cerrar, se quita la APP
        frame.setVisible(true); //Lo muestro
        cardLayout.show(cards, "Pantalla login"); //Enseño por pantalla la pantalla de login
    }
}

//Si quiero cambiar de pantalla, Aplicacion.cardLayout.show(cards, "Reservas")
