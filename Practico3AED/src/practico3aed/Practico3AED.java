/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico3aed;

/**
 *
 * @author alumnoFI
 */
public class Practico3AED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = {6, 3, 0, 85, 1, 7, 2, 4, 8};
        int[] vectorOrdenado = {2, 4, 6, 8, 10};
        int[] vector2 = {10, 10, 10};
        int[] vector3 = {2, 3, 4, 5, 6, 7};
        int[] vector4 = {2, 3, 4, 5, 6, 7};

        //RECURSIVIDAD!
        //EJERCICIO 1
        //FACTORIAL
        System.out.println("Factorial--> " + factorial(4));
        //POTENCIA
        System.out.println("Potenia --> " + potencia(2, 3));
        mostrarVectorRecursivo(vector1);

        //EJERCICIO 3
        System.out.println("Invertir palabra --> " + invertir01("hola"));
        System.out.println("Invertir palabra --> " + invertir02("hola"));

        //EJERCICIO 05
        System.out.println("Suma vector --> " + suma(vector2));

        // EJERCICIO 08
        System.out.println("Mayor numero del vector --> " + mayor(vector1));
        System.out.println("Minimo numero del vector --> " + minimo(vector1));

        System.out.println("Existe el numero --> " + existe(vector1, 85));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int potencia(int numero, int potencia) {
        if (potencia == 0) {
            return 1;
        }
        return numero * potencia(numero, potencia - 1);
    }

    public static void mostrarVectorRecursivo(int[] vector) {

        mostrarVectorRecursivo(vector, 0);
    }

    public static void mostrarVectorRecursivo(int[] vector, int i) {
        if (i == vector.length) {
            return;
        }
        System.out.println(vector[i]);

        mostrarVectorRecursivo(vector, i + 1);
    }

    public static String invertir01(String palabra) {
        return invertirPalabra02(palabra, 0);
    }

    public static String invertir02(String palabra) {
        return invertirPalabra02(palabra, 0);
    }

    public static String invertirPalabra01(String palabra, int i) {
        if (i == 0) {
            return palabra.charAt(i) + "";
        } else {
            return palabra.charAt(i) + invertirPalabra01(palabra, i - 1);
        }
    }

    public static String invertirPalabra02(String palabra, int i) {
        if (i == palabra.length() - 1) {
            return palabra.charAt(i) + "";
        } else {
            return invertirPalabra02(palabra, i + 1) + palabra.charAt(i);
        }
    }

    public static int suma(int[] vector) {
        return suma(vector, 0);
    }

    public static int suma(int[] vector, int posicion) {
        int suma = 0;
        if (posicion == vector.length - 1) {
            suma = vector[posicion];
            return suma;
        }

        return vector[posicion] + suma(vector, posicion + 1);
    }

    public static int mayor(int[] vector) {
        return mayor(vector, 0);
    }

    public static int mayor(int[] vector, int posicion) {
        int maximo = Integer.MIN_VALUE;
        if (posicion == vector.length - 1) {
            maximo = vector[posicion];
            return maximo;
        } else {
            maximo = mayor(vector, posicion + 1);
            if (vector[posicion] > maximo) {
                maximo = vector[posicion];
            }
        }
        return maximo;
    }

    public static int minimo(int[] vector) {
        return minimo(vector, 0);
    }

    public static int minimo(int[] vector, int posicion) {
        int minimo = Integer.MAX_VALUE;
        if (posicion == vector.length - 1) {
            minimo = vector[posicion];
            return minimo;
        } else {
            minimo = minimo(vector, posicion + 1);
            if (vector[posicion] < minimo) {
                minimo = vector[posicion];
            }
        }
        return minimo;
    }

    public static boolean existe(int[] vector, int numero) {
        return existe(vector, numero, 0, vector.length - 1);
    }

    public static boolean existe(int[] vector, int numero, int desde, int hasta) {
        boolean esta = false;
        if (desde <= hasta) {
            int posicion = (desde + hasta) / 2;
            if (numero == vector[posicion]) {
                return true;
            } else {
                esta = existe(vector, numero, posicion + 1, hasta) || existe(vector, numero, desde, posicion - 1);
            }
        }

        return esta;
    }
}
