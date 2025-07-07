/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorcontras;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class GeneradorContras {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String opc ="";
        
        while(opc != "2"){
            System.out.println("Programa Generador de contras");
            System.out.println("Seleccione una opccion");
            System.out.println("[1] Generar contras");
            System.out.println("[2] Salir");
            Scanner scanner = new Scanner(System.in);
            opc = scanner.nextLine();
            
            switch(opc){
                case "1":
                    //generar contra
                    System.out.println("Generador de contras");
                    System.out.println("Ingrese una palabra");
                    String pass = scanner.nextLine();
                    
                    if(pass == ""){
                        System.out.println("No hay contraseña ya que no escribiste nada");
                    }
                    else{
                        pass = pass.toLowerCase();
                        char[] passChars = pass.toCharArray();
                        //String[] generatedPass = new String[5]; no se ocupan guardar lel
                        System.out.println("----------------------");
                        System.out.println("Contras Generadas");
                        
                        for(int i = 0; i< 5; i++){
                            String newPass = "";
                            
                            for(int y=0;y < passChars.length;y++){
                                Random random = new Random();
                                int randomNum = random.nextInt(0,5);
                                String aChar = ""+passChars[y];
                                
                                switch(randomNum){
                                    case 0:
                                        newPass += aChar;
                                        break;
                                    case 1:
                                        newPass += aChar.toUpperCase();
                                        break;
                                    case 2:
                                        newPass += ("$"+aChar);
                                        break;
                                    case 3:
                                        
                                        Random rand = new Random();
                                        int anInt = rand.nextInt(0,9);
                                        newPass += (anInt+aChar);
                                        break;
                                    case 4:
                                        
                                        newPass += ("!"+aChar+"?");
                                        break;
                                    case 5:
                                        newPass += (aChar+aChar);
                                        break;
                                }
                            }
                            System.out.println("["+(i+1)+"] "+newPass);
                        }
                        System.out.println("----------------------");
                    }
                    
                    break;
                case "2":
                    System.out.println("Usted Saldra del programa"); 
                    break;
                default:
                    System.out.println("Seleccione una de las opcciones disponibles");
                    break;
            }
        }
    }
    
}
