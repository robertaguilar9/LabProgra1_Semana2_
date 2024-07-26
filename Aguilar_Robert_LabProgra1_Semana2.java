/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_labprogra1_semana2;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_LabProgra1_Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner (System.in);
        lea.useDelimiter("\n");
        
        System.out.println("""
                           --------MENU--------
                           1. Cadena
                           2. Notas
                           3. Clases
                           4. Salir
                           -Elije una opcion del 1-4:""");
        int menu = lea.nextInt();
        
        if (menu == 1){
            System.out.println("Ingrese una cadena de texto:");
        String cadena = lea.nextLine();
        
        int longitud = cadena.length();
        int maxRepeticiones = 0;
        char caracterMasRepetido = ' ';
        int i = 0;
        char c = 0;
        while (c < 256) {
            int conteoActual = 0;
            int j = 0;

            while (j < longitud) {
                if (cadena.charAt(j) == c) {
                    conteoActual++;
                }
                j++;
            }

            if (conteoActual > maxRepeticiones) {
                maxRepeticiones = conteoActual;
                caracterMasRepetido = c;
            }
            
            c++;
        }
        
        System.out.println("El caracter que más veces se repite es: " + caracterMasRepetido);
        System.out.println("Numero de veces que se repite: " + maxRepeticiones);
        }
        if (menu == 2){
            System.out.println("Ingrese la cantidad de notas:");
            int cantidadNotas = lea.nextInt();

            double suma = 0;
            double notaMayor = -1;
            double notaMenor = 101;

            int i = 0;
            while (i < cantidadNotas) {
            System.out.println("Ingrese la nota " + (i + 1) + " (0 a 100):");
            double nota = lea.nextDouble();

            while (nota < 0 || nota > 100) {
                System.out.println("Nota inválida. Ingrese la nota " + (i + 1) + " (0 a 100):");
                nota = lea.nextDouble();
            }

            suma += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }

            i++;
        }

            double promedio = suma / cantidadNotas;

            System.out.printf("Promedio de las notas: %.2f%n", promedio);
            System.out.println("Nota mayor: " + notaMayor);
            System.out.println("Nota menor: " + notaMenor);
        }
        
        if (menu ==4){
            break;
        }
        
    }
    
}
