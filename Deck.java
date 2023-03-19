//IMPORTACIÓN DE LAS LIBRERÍAS DE USO DEL SISTEMA
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class Deck {
    //CREACIÓN DE LA LISTA DE USO DEL SISTEMA
    public String [] paloI = {"Treboles","Corazones","Picas","Diamanates"};
    public String [] valorI = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
    public String [] colorI = {"Negro","Rojo"};
    public ArrayList<Card> CartasI;
    Random random = new Random();

    //DEFINCIÓN DEL COSNTRUCTOR DE LA LISTA
    public Deck(){
        String palo = "";
        String color = "";
        String valor = "";
        CartasI = new ArrayList<>(52);
        for( int i = 0; i < paloI.length; i++){
            palo = paloI[i];
            if (palo.equals("Treboles")){
                color = colorI[0];
            }else if (palo.equals("Corazones")){
                color = colorI[1];
            }else if(palo.equals("Picas")){
                color = colorI[0];
            }
            else if(palo.equals("Diamantes")){
                color = colorI[1];
            }
            for(int x = 0; x < valorI.length; x++){
                valor = valorI[x];
                CartasI.add(new Card(palo, color, valor));             }
            Collections.shuffle(CartasI);}
    }

    //DESGLOSE DE LAS FUNCIONES DEL SISTEMA CON BASE AL USO DEL DECK
    public void Head(){
        //IMPLICACIÓN DEL COLLECTION FRAMEWORK DENTRO DEL MÉTODO HEAD
        Card cardU = CartasI.remove(0);
        System.out.println(cardU.getPalo()+","+cardU.getEquivalencia()+","+cardU.getColores()+",");
        System.out.println("Se disponen de:  "+ CartasI.size()+" cartas implicadas dentro del Deck");
    }
    public void Pick(){
        //DEFINCIÓN DEL ÍNDICE IMPLICADO DENTRO DEL SISTEMA PARA LA FUNCIÓN Y GENERACIÓN DE PARÁMETROS DE ACCIÓN ALEATORIOS
        int indiceU = random.nextInt(this.CartasI.size());
        Card cardI = CartasI.remove(indiceU);
        System.out.println(cardI.getPalo()+","+cardI.getEquivalencia()+","+cardI.getColores()+",");
        System.out.println("Se disponen de "+CartasI.size()+" cartas dentro del Deck");
    }

    public void Shuffle(){
        Collections.shuffle(CartasI);
        System.out.println("El Deck ha sido mezclado correctamente");
    }

    public ArrayList<Card> Hand(){
        ArrayList<Card> HandU = new ArrayList<Card>();
        //RECORRIDO DEL MÉTODO DEL SISTEMA CON BASE AL USO Y DISPOSICIÓN DE UNA ESTRUCTURA DE REPETICIÓN FOR
        for (int j = 0; j < 5; j++){
            Card cardU = CartasI.remove(0);
            HandU.add(cardU);
            System.out.println(cardU.getPalo()+","+cardU.getEquivalencia()+","+cardU.getColores()+",");
        }
        System.out.println("Se disponen de: "+CartasI.size()+" cartas dentro del Deck");
        return HandU;
    }
    //IMPLICACIÓN DEL MÉTOOD QUE PERMITE OBTENER EL NÚMERO DE CARTAS DEL SISTEMA
    public int numCartas(){
    return CartasI.size();
    }
}

