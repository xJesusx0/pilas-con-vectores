package pilasjesus;

import static pilasjesus.Metodos.*;

public class PilasJesus {

    public static int tamaño;
    public static int maximo;
    public static int top = -1;
    public static int pila[];
    
    public static void main(String[] args) {
        
        tamaño = inputTamaño("Ingrese el tamaño de la pila");
        maximo = tamaño - 1;
        pila = new int[tamaño];
        
        while(true){
             System.out.println("===================");
            menu();
            int eleccion = inputIntPositivo("Ingrese su eleccion");
            System.out.println("===================");
            switch(eleccion){
                case 1 -> insertar();
                    
                case 2 -> eliminar();
                    
                case 3 ->  imprimirPila();
                    
                
                case 4 ->{
                
                }
                default ->{
                    System.out.println("Opcion invalida");
                }   
            }
            
            if(eleccion == 4){
                System.out.println("Saliendo del programa...");
                break;
            }
        
        }     
    }    
}
