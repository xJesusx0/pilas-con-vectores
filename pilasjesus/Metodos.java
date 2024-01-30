package pilasjesus;

import java.util.Random;
import java.util.Scanner;
import static pilasjesus.PilasJesus.*;

public class Metodos {

    public static void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public static String input(String mensaje) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje);
            String UserInput = input.nextLine();

            if (!UserInput.trim().isEmpty()) {
                return UserInput;

            } else {
                mostrarError("La entrada esta vacia, intentelo denuevo");
            }
        }
    }

    public static int inputIntPositivo(String mensaje) {
        while (true) {
            String entrada = input(mensaje);

            try {
                int numero = Integer.parseInt(entrada);

                if (numero > -1) {
                    return numero;
                } else {
                    mostrarError("Ingrese un número mayor a 0, inténtelo de nuevo");
                }

            } catch (NumberFormatException e) {
                mostrarError("Entrada inválida, inténtelo de nuevo");
            }
        }
    }

    public static int inputTamaño(String mensaje) {
        while (true) {
            String entrada = input(mensaje);

            try {
                int numero = Integer.parseInt(entrada);

                if (numero > 0) {
                    return numero;
                } else {
                    mostrarError("Ingrese un número mayor a 0, inténtelo de nuevo");
                }

            } catch (NumberFormatException e) {
                mostrarError("Entrada inválida, inténtelo de nuevo");
            }
        }
    }

    public static int inputInt(String mensaje) {
        while (true) {
            String entrada = input(mensaje);

            try {
                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intenelo denuevo");

            }
        }
    }

    public static double inputDouble(String mensaje) {
        while (true) {
            String entrada = input(mensaje);

            try {
                return Double.parseDouble(entrada);

            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intentelo denuevo");

            }
        }
    }

    public static byte inputByte(String mensaje) {
        while (true) {
            String entrada = input(mensaje);
            try {
                return Byte.valueOf(entrada);

            } catch (NumberFormatException e) {
                mostrarError("Entrada invalida, intentelo denuevo");
            }
        }
    }

    public static void imprimirVector(int[] vector) {
        String resultado = "";
        for (int i = 0; i < vector.length; i++) {
            resultado += (vector[i] + "\t");
        }
        System.out.println(resultado);
    }

    public static void menu() {
    System.out.println("+----------------------------------+");
    System.out.println("|       Menu de Operaciones        |");
    System.out.println("+----------------------------------+");
    System.out.println("|  1 - Insertar                    |");
    System.out.println("|  2 - Eliminar                    |");
    System.out.println("|  3 - Imprimir                    |");
    System.out.println("|  4 - Salir                       |");
    System.out.println("+----------------------------------+");
}


    public static int obtenerMayor(int[] vector) {
        int mayor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int obtenerMenor(int[] vector) {
        int menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        return menor;
    }

    public static void comparar(int elemento1, int elemento2) {
        if (elemento1 == elemento2) {
            System.out.println("El elemento 1: " + elemento1 + " es igual que el elemento 2: " + elemento2);
        }
        if (elemento1 > elemento2) {
            System.out.println("El elemento 1: " + elemento1 + " es mayor que el elemento 2: " + elemento2);
        }
        if (elemento1 < elemento2) {
            System.out.println("El elemento 1: " + elemento1 + " es menor que el elemento 2: " + elemento2);

        }
    }

    public static int[] encontrarRepetidos(int[] vector, int numero) {
        int tamañoVector = 0;
        for (int i = 0; i < vector.length; i++) {
            if (numero == vector[i]) {
                tamañoVector++;
            }
        }
        
        int indices[] = new int[tamañoVector];
        int contador2 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (numero == vector[i]) {
                indices[contador2] = i;
            }
        }
        return indices;
    }
    
    public static void mostrarElementos(String[] vector){
        String resultado = "";
        for (String elemento : vector) {
            resultado += (elemento + "\t");
        }
        System.out.println(resultado);
    }

    public static int generarAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }
    
    public static void insertar(){
        if(top == maximo){
            mostrarError("Overflow: pila llena");
            return;
        }
        
        top++;
        pila[top] = inputInt("Ingrese el elemento que desea insertar");
        System.out.println("Dato insertado correctamente");
    }
     
    public static void imprimirPila(){
        if(top == -1){
            mostrarError("Pila vacia");
            return;
        }
        
        for(int i=top ; i >= 0 ; i--){
            System.out.println("| " + pila[i] + " |");
        }
        
    }
    
    public static void eliminar(){
        if(top == -1){
            mostrarError("Underflow, pila vacia");
            return;
        }
        top--;
        System.out.println("Elemento eliminado");
    }
}
