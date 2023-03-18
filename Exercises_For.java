/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises_for;
import java.util.Scanner;
/**
 *
 * @author Instructor
 */
public class Exercises_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar la suma: ");
        int n = number.nextInt();
        int suma = 0; //Inicializamos la variable suma de FOR
        // Creamos el FOR
        for (int numero = 1; numero <=n; numero ++){
            suma = suma + numero;
        }
        System.out.println("La suma es: " +suma);
    }
    
}
