public class Analisis {
    //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
    int numU;

    //DEFINICIÓN DEL CONSTRUCTOR DE USO DEL PROGRAMA
    public Analisis(int numU){
        this.numU = numU;
    }


    //DEFINICIÓN DE LOS MÉTODOS DE ACCIÓN DEL PROGRAMA
    public int []numerosPrimos(int numeroI){
        //IMPLICACIÓN DEL ARREGLO DE USO DENTRO DEL PROGRAMA
            int[] numP = new int[numeroI];
            //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
            int cont = 0;
            int numero = 2;
            //RECORRIDO U VALIDACIÓN DE LOS NÚMEROS PRIMOS
            while (cont < numeroI) {
                boolean numPrimo = true;
                //DESLOSE DE LA FUNCIÓN MATH.SQRT PARA EL CÁCLULO DE VALIDACIÓN DE LA RAÍZ DE LOS NÚMEROS IMPLICADOS
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        numPrimo = false;
                        break;
                    }
                }
                if (numPrimo) {
                    numP[cont] = numero;
                    cont++;
                }
                numero++;
            }

            return numP;
    }

    public int [] SerieFibo(int numeroI){
        //DEFINICIÓN DE LAS VARIABLES DE USO DEL PROGRAMA
        int x = 0, y= 1;
        //IMPLICACIÓN DEL ARREGLO DE USO DENTRO DEL PROGRAMA
        int []ANP = new int[numeroI];
        ANP[0] = x;
        ANP[1] = y;
        for(int i=2; i<ANP.length; i++){
            int z = x + y;
            ANP[i] = z;
            x = y;
            y = z;
        }
        return ANP;
    }
}
