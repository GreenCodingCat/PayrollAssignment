
package payrollassignment;
import java.util.Scanner; //Importing Scanner

public class PayrollAssignment {

    
    public static void main(String[] args) {
        String name; //Declaring variables
        double pay;
        double hours;
        double overtime;
        double total;
        Scanner reader = new Scanner (System.in); //Setting up Scanner
        
        //Questions
        
        System.out.println("Enter your name first and last"); //Asking for Name
        name = reader.nextLine();
        
        System.out.println("");
        System.out.println("Enter the amount you get paid in one hour"); //Asking for hourly pay
        pay = reader.nextDouble();
        
        System.out.println("");
        System.out.println("Enter how many hours you worked"); //Asking for hours worked
        hours = reader.nextDouble();
        
        //Total Pay If Statement
       
        if (hours <= 40){ //calculating total pay
            total = hours*pay;
        }
        else{ //calculating total pay with overtime
            overtime = (hours-40)*1.5;
            total = (40*pay)+overtime;
        }
        
        //Pay Check Formatting
                
        System.out.println("");
        System.out.println("_______________________________________________"); //Shows top boarder
        System.out.println("");
        
        System.out.print("Name: "); //Shows Name information
        System.out.print(name);
        System.out.println("");
        
        System.out.print("Pay Rate: "); //Shows Pay Rate information
        System.out.print(pay);
        System.out.println("");
        
        System.out.print("Hours: "); //Shows Hours information
        System.out.print(hours);
        System.out.println("");
       
        System.out.print("Total Pay: "); //Shows total pay information
        System.out.print(total);
        System.out.println("");
        System.out.println("_______________________________________________"); //Shows bottom boarder
       
    }
    
}
