/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Arrayburbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int tabla[], nelementos,aux;
        nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que quiere tener en el arreglo: "));
        
        tabla = new int [nelementos];
        for(int i =0; i<10;i++){
            tabla[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        }
        //metodo burbuja
        for(int i=0;i<(nelementos-1);i++){
            for(int j=0;j<(nelementos-1);j++){ //este for organiza los números
                 if(tabla[j]>tabla[j+1]){
                     aux = tabla[j];
                     tabla[j]= tabla[j+1];
                     tabla[j+1]=aux;
                 }
                
            }
        }
        System.out.println("El arreglo ordenado de forma creciente es: ");
        
        for(int i=0;i<nelementos;i++){
            System.out.println(tabla[i]+"-");
        }
        System.out.println("El arreglo ordenado de forma decreciente es:");
        for(int i=nelementos-1;i>=0;i--){
            System.out.println(tabla[i]+"-");
        }
        
    }
    
}
