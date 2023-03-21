/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico2aed;

/**
 *
 * @author alumnoFI
 */
public class Practico2AED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = {6, 3, 5, 1, 8, 7, 2, 4};
        int[] vectorOrdenado = {2, 4, 6, 8, 10};
        int[] vector2 = {10, 10, 10};
        int[] vector3 = {2, 3, 4, 5, 6, 7};
        int[] vector4 = {2, 3, 4, 5, 6, 7};

        //EJERCICIO 1
        //System.out.println("Vector --> " + mostrarv(vector1));
        //EJERCICIO 2
        //System.out.println("Promedio --> " + promedio(vector2));
        //EJERCICIO 3
        //System.out.println("Impares --> " + muestrovaloresimpares(vector3));
        //System.out.println("Pares --> " + muestrovalorespares(vector3));
        //EJERCICIO 4
        //System.out.println("Posicion pares --> " + muestrovalorespares(vector3));
        //System.out.println("Posicion impares --> " + muestroposimpares(vector4));
        //EJERCICIO 5
        //System.out.println("Posicion pares --> " + muestropospares(vector4));
        //System.out.println("Maximo desordenado --> " + maxvec1(vector1));
        //EJERCICIO 6
        //System.out.println("Maximo ordenado --> " + maxvecv1(vectorOrdenado));
        //System.out.println("Minimo desordenado --> " + minvec1(vector1));
        //EJERCICIO 7 
        //System.out.println("Minimo ordenado --> " + minvecv1(vectorOrdenado));
        //System.out.println("Maximo desde hasta --> " + maxvec(vector1, 5, 7));   
        //EJERCICIO 8
        //System.out.println("Minimo desde hasta --> " + minvecpos(vector1, 0, vector1.length-1));
        //EJERCICIO 9
        //System.out.println("Buscar elemento. Esta? --> " + buscarvec1(vector1, 10));
        //System.out.println("Buscar elemento desde hasta. Esta? --> " + buscarvec2(vector1, 3, 0, 3));
        //System.out.println("Buscar elemento desde hasta. Esta? --> " + buscarporposicion(vector1, 3));
        //System.out.println("Buscar elemento. Esta? --> " + buscarporposicion(vector1, 3, 0, 3));
        // EJERCICIO 10
        //System.out.println("Buscar ORDENADA. Esta? --> " + buscarvecOrdenado(vectorOrdenado, 8));
        // EJERCICIO 11
        //System.out.println("Mergear vector. --> " + mergearVectores(vector1, vector2).toString());
        System.out.println("Ordenar vector --> " + mostrarVector(vector1));
        System.out.println("Ordenar vector --> " + mostrarVector(ordernarVector(vector1)));
    }

    // EJERCICIO 01
    public static String mostrarv(int[] vector) {

        String texto = "";
        for (int i = 0; i < vector.length; i++) {
            texto = texto + " - " + vector[i];
        }

        return texto;
    }

    // EJERCICIO 02
    public static double promedio(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        return suma / vector.length;
    }

    // EJERCICIO 03
    public static String muestrovaloresimpares(int[] vector) {
        String impares = "";

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                impares = impares + " - " + vector[i];
            }
        }

        return impares;
    }

    public static String muestrovalorespares(int[] vector) {
        String pares = "";

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                pares = pares + " - " + vector[i];
            }
        }

        return pares;
    }

    // EJERCICIO 04
    public static String muestroposimpares(int[] vector) {
        String impares = "";

        for (int i = 0; i < vector.length; i++) {
            if (i % 2 != 0) {
                impares = impares + " - " + vector[i];
            }
        }

        return impares;
    }

    public static String muestropospares(int[] vector) {
        String pares = "";

        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                pares = pares + " - " + vector[i];
            }
        }

        return pares;
    }

    // EJERCICIO 05
    // El array no esta vacio, no esta ordenado y todos los valores son positivos
    public static int maxvec1(int[] vector) {
        int maximo = 0;

        for (int i = 0; i < vector.length; i++) {
            if (maximo < vector[i]) {
                maximo = vector[i];
            }
        }

        return maximo;
    }

    // El array no esta vacio, esta ordenado de forma ascendente y todos los valores son positivos
    public static int maxvecv1(int[] vector) {
        return vector[vector.length - 1];
    }

    // EJERCICIO 06    
    // El array no esta vacio, no esta ordenado y todos los valores son positivos
    public static int minvec1(int[] vector) {
        int minimo = 0;

        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                minimo = vector[0];
            }

            if (minimo > vector[i]) {
                minimo = vector[i];
            }
        }

        return minimo;
    }

    // El array no esta vacio, esta ordenado de forma ascendente y todos los valores son positivos
    public static int minvecv1(int[] vector) {
        return vector[0];
    }

    // EJERCICIO 07
    //El desde y el hasta estan incluidos. El desde y el hasta estan contemplados dentro del largo del vector
    public static int maxvec(int[] vector, int desde, int hasta) {
        int maximo = 0;

        for (int i = desde; i <= hasta; i++) {
            if (maximo < vector[i]) {
                maximo = vector[i];
            }
        }

        return maximo;
    }

    //El desde y el hasta estan incluidos. El desde y el hasta estan contemplados dentro del largo del vector
    public static int minvec(int[] vector, int desde, int hasta) {
        int minimo = 0;

        for (int i = desde; i < hasta; i++) {
            if (i == desde) {
                minimo = vector[desde];
            }

            if (minimo > vector[i]) {
                minimo = vector[i];
            }
        }

        return minimo;
    }
    
    //EJERCICIO 08
    //Trae la posicion del menor valor del vector. El desde y el hasta estan incluidos. 
    //El desde y el hasta estan contemplados dentro del largo del vector
    public static int minvecpos(int[] vector, int desde, int hasta) {
        int minimo = 0;
        int valor = 0;
        for (int i = desde; i <= hasta; i++) {
            if (i == desde) {
                minimo = desde;
                valor = vector[desde];
            }

            if (valor > vector[i]) {
                minimo = i;
                valor = vector[i];
            }
        }

        return minimo;
    }
    

    // EJERCICIO 09
    public static boolean buscarvec1(int[] vector, int elemento) {
        int i = 0;

        while (i < vector.length) {
            if (vector[i] == elemento) {
                return true;
            }
            i++;
        }

        return false;
    }

    // pre condicion: la posicion desde va a ser menor a la hasta. Las dos posiciones van a estar contempladas en el array
    public static boolean buscarvec2(int[] vector, int elemento, int desde, int hasta) {
        while (desde <= hasta) {
            if (vector[desde] == elemento) {
                return true;
            }
            desde++;
        }

        return false;
    }

    public static int buscarporposicion(int[] vector, int elemento) {
        int i = 0;

        while (i < vector.length) {
            if (vector[i] == elemento) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public static int buscarporposicion(int[] vector, int desde, int hasta, int elemento) {
        while (desde <= hasta) {
            if (vector[desde] == elemento) {
                return desde;
            }
            desde++;
        }

        return -1;
    }

    //EJERCICIO 10
    //PARA BUSCAR EN UN ARRAY ORDENADO DE MANERA MAS OPTIMIZADA --> BIPARTICION
    public static boolean buscarvecOrdenado(int[] vector, int elemento) {
        int inicio = 0;
        int fin = vector.length - 1;
        int posicion = 0;
        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
            if (elemento < vector[posicion]) {
                fin = posicion - 1;
            } else if (elemento > vector[posicion]) {
                inicio = posicion + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    //EJERCICIO 11
    public static int[] mergearVectores(int[] vectorUno, int[] vectorDos) {
        int[] vectorResultante = new int[vectorUno.length + vectorDos.length];
        int ivectorUno = 0;
        int ivectorDos = 0;
        int ivectorRes = 0;
        while (ivectorUno < vectorUno.length && ivectorDos < vectorDos.length) {
            if (vectorUno[ivectorUno] >= vectorDos[ivectorDos]) {
                vectorResultante[ivectorRes] = vectorDos[ivectorDos];
                ivectorRes++;
                ivectorDos++;
            } else {
                vectorResultante[ivectorRes] = vectorUno[ivectorUno];
                ivectorRes++;
                ivectorUno++;
            }
        }

        while (ivectorUno < vectorUno.length) {
            vectorResultante[ivectorRes] = vectorUno[ivectorUno];
            ivectorRes++;
            ivectorUno++;
        }

        while (ivectorDos < vectorDos.length) {
            vectorResultante[ivectorRes] = vectorDos[ivectorDos];
            ivectorRes++;
            ivectorDos++;
        }

        return vectorResultante;
    }
    
    //EJERCICIO 12 METODO DE ORDENAMIENTO DE SELECCION
    public static int[] ordernarVector(int[] vector) {
        for(int i = 0; i < vector.length; i++){
            int posicion = minvecpos(vector, i, vector.length-1);
            int auxiliar = vector[i];
            vector[i] = vector[posicion];
            vector[posicion] = auxiliar;
        }
        
        return vector;
    }
    
    public static String mostrarVector(int[] vector){        
        String mostrar = "";
        for(int i = 0; i < vector.length; i++){            
            mostrar = mostrar + " - " + vector[i];
        }
        
        return mostrar;
    }
}
