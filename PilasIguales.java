import java.util.Stack;
import java.io.*;
import java.util.*;

public class PilasIguales {
    public static int equalStacks(int[] h1, int[] h2, int[] h3) { // Funcion equalStacks con parametros array de valores

        int maximo = 0; // Valor que se va a devolver

        Stack<Integer> pila1 = new Stack<>(); // Primera Pila
        Stack<Integer> pila2 = new Stack<>(); // Segunda Pila
        Stack<Integer> pila3 = new Stack<>(); // Tercera Pila

        llenar(pila1, h1, pila2, h2, pila3, h3); // Funcion para llenar las pilas con las sumas de los elementos del
                                                 // array

        while (true) {
            // Se revisa el ultimo valor de la pila (en este caso el valor de la suma de los
            // cilindros)
            int alturapila1 = pila1.peek();
            int alturapila2 = pila2.peek();
            int alturapila3 = pila3.peek();

            if (alturapila1 == alturapila2 && alturapila2 == alturapila3 && alturapila1 == alturapila3) { // Cuando el
                                                                                                          // valor de
                                                                                                          // las sumas
                                                                                                          // se igualan
                                                                                                          // se termina
                                                                                                          // el While
                maximo = pila1.peek(); // y se establece la altura maxima
                break;
            }

            if (alturapila1 >= alturapila2 && alturapila1 >= alturapila3) { // Se compara la pila 1 con las demas
                pila1.pop(); // si todavia es mas grande se usa el metodo pop para retirar el ultimo cilindro
            } else if (alturapila2 >= alturapila1 && alturapila2 >= alturapila3) { // Se compara la pila 2 con las demas
                pila2.pop(); // si todavia es mas grande se usa el metodo pop para retirar el ultimo cilindro
            } else if (alturapila3 >= alturapila1 && alturapila3 >= alturapila2) {// Se compara la pila 3 con las demas
                pila3.pop(); // si todavia es mas grande se usa el metodo pop para retirar el ultimo cilindro
            }
        }

        System.out.println(maximo);

        // Comprobar pilas: La cantidad de elementos = numero de cilindros, valor de
        // elemento es la suma
        // System.out.println(Arrays.toString(pila1.toArray()));
        // System.out.println(Arrays.toString(pila2.toArray()));
        // System.out.println(Arrays.toString(pila3.toArray()));
        return maximo;
    }

    // Se llenan las pilas con la suma de los cilindros en lugar de los cilindros en
    // si mismo.
    private static void llenar(Stack<Integer> pila1, int[] h1, Stack<Integer> pila2, int[] h2, Stack<Integer> pila3,
            int[] h3) {
        int pila1sumAltura = 0;
        int pila2sumAltura = 0;
        int pila3sumAltura = 0;
        for (int i = h1.length - 1; i >= 0; i--) {
            pila1sumAltura += h1[i];
            pila1.push(pila1sumAltura);
            // System.out.println(Arrays.toString(pila1.toArray()));
        }
        for (int i = h2.length - 1; i >= 0; i--) {
            pila2sumAltura += h2[i];
            pila2.push(pila2sumAltura);
            // System.out.println(Arrays.toString(pila2.toArray()));
        }
        for (int i = h3.length - 1; i >= 0; i--) {
            pila3sumAltura += h3[i];
            pila3.push(pila3sumAltura);
            // System.out.println(Arrays.toString(pila3.toArray()));
        }
    }

    public static void main(String[] args) {
        // Valores de las Pilas
        int h1[] = { 1, 2, 1, 1 };
        int h2[] = { 1, 1, 2 };
        int h3[] = { 1, 1 };

        System.out.println("El tamaño de las pilas es de  " + equalStacks(h1, h2, h3));

    }
}
