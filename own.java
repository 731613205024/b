/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aswinaji;

import java.util.Scanner;


/**
 *
 * @author Student
 */
public class own {
 
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
 
          String s;
        // TODO code application logic here
        Scanner ac=new Scanner(System.in);
        s=ac.nextLine();
      char c;
      String a=" ";
      for(int i=0;i<s.length();i++)
      {
          c=s.charAt(i);
          if(c!=' ')
          {
              a=a+c;
              s=s.replace(c,' ');
          }
      }
        System.out.println("Removing duplicate character are:"+a);      
    }
}
          
              
          
      
        

    

            
        
    
