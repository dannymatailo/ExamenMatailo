/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmatailo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
class LecturaDatos {
      public static int LeerEntero(){
         Scanner sc=new Scanner (System.in); 
         do{
             try{
                 int numero1=sc.nextInt();
                return numero1;
                             }
             catch (InputMismatchException ex){
    System.out.println("Error: Intete nuevamen, ingrese un entero");
            sc.nextLine();
}      
         }while(true);
    }
    public static float LeerFloat(){
         Scanner sc=new Scanner (System.in); 
         do{
             try{
                 float numero2=sc.nextFloat();
                return numero2;
                             }
             catch (InputMismatchException ex){
    System.out.println("Error: Intete nuevamen, ingrese un decimal con coma ejemplo:1,67");
            sc.nextLine();
}      
         }while(true);
     }
}
