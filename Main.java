import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int eleccion;
        Deck jugador1 = new Deck();
        eleccion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al juego de poker, favor de elegir la opción que desee\n1) Head\n2) Pick\n3) Hand\n4) Shuffle\n5) Salir"));
        while (eleccion != 5) {
            if (eleccion == 1) {
                jugador1.Head();
            } else if (eleccion == 2) {
                jugador1.Pick();
            } else if (eleccion == 3) {
                jugador1.Hand();
            } else if (eleccion==4) {
                jugador1.Shuffle();
            } else {
                System.out.println("Opción invalida");
            }
            eleccion = Integer.parseInt(JOptionPane.showInputDialog("Favor de elegir una nueva opción para el juego de poker\n1) Head\n2)Pick\n3)Hand\n4) Shuffle\n5) Salir"));
        }
    }
}