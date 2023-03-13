import javax.swing.JOptionPane;
public class Main2 {
    public static void main(String[] args) {
        //DECLARACIÓN DE LAS VARIABLES DE USO DEL SISTEMA
        String A, B;
        int numS;
        int numV;

        String variable = JOptionPane.showInputDialog("Seleccione el modelo de acción que desee hacer uso para el cálculo de los datos deseados: \nA) Número Primos\nB) Serie de Fibonacci");
        numV = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el tamañano del arreglo que desea analizar: "));
        Analisis analisisU = new Analisis(numV);
        if (variable.equals("A")) {
            int[] testeoB = analisisU.numerosPrimos(numV);
            System.out.println("");
            System.out.print("Implicación del sistema de validación de números primos");
            for (int i = 0; i < testeoB.length; i++) {
                System.out.print(testeoB[i] + " ,");
            }
        }
        else if (variable.equals("B")) {
            int[] testeoA = analisisU.SerieFibo(numV);
            System.out.print("Implicación de la serie de Fibonacci");
            for (int i = 0; i < testeoA.length; i++) {
                System.out.print(testeoA[i] + " ,");
            }
        }


    }
}
