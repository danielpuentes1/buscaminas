/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Ahorcado {
    
    String palabras[]={"casa", "gato", "loro", "mago"};
     Palabra palabra[] = new Palabra[4];   
     String x;
    void arregloPalabra(){
for(int i=0 ; i<4 ; i++){
    palabra[i] = new Palabra();
    palabra[i].palabra=palabras[i];   
    
}}
void seleccionarPalabra(){
   Random miRandom= new Random(); 
   int p=miRandom.nextInt(3);
   palabras[p] = x; 
   System.out.println(x);
    }
//  Random pseleccionada = new Random();
          
    }
    
        
   //   char letra = palabras.charAt(0);
        
        
        
        
    
    



   