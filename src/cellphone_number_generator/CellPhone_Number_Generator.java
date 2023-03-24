/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphone_number_generator;

import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;
//importing JOptionPane//
public class CellPhone_Number_Generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //creating a loop so the name can be inputed 3 times//
        for( int numEmp = 1; numEmp < 4; numEmp ++ ) {
            String firstName = JOptionPane.showInputDialog(" Enter employee name");
            
            String[] serviceProvider = {" Vodacome "," Cell C ", " MTN "};
            int randomNum1, randomNum2, randomNum3;
            //using the import to random numbers//
            randomNum1 = ThreadLocalRandom.current().nextInt(0,3);
            randomNum2 = ThreadLocalRandom.current().nextInt(100,1000);
            randomNum3 = ThreadLocalRandom.current().nextInt(1000,10000);
            
            if(randomNum1 == 0 ) {
                System.out.println( firstName + " is assigned    " + serviceProvider[randomNum1] + " with phone number: 072 " + randomNum2 + randomNum3); 
                 
            }
                else if (randomNum1 == 1) {
                System.out.println( firstName + " is assigned" + serviceProvider[randomNum1] +    " with phone number:  083 " + randomNum2 + randomNum3);
                     
                }
                else{ 
                System.out.println( firstName + " is assigned" + serviceProvider[randomNum1] +    " with phone number:  084 " + randomNum2 + randomNum3);
                     
                }
            
            
        
    }
    }
    
}
