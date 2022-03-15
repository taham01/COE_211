import lab6.BasicWeek;
import lab6.AdvancedWeek;
import lab6.EntryPoint1;
import lab6.Calculator;
import java.util.*;
public class MainFunctuality {
    public static void main (String [] args){
        
        String Y = "y";
        while ( Y == "y"){
            Scanner scan = new Scanner(System.in);
        
        System.out.println("Whhich service would you like to use?\n" +"[1]: Basic week visualizer\n" +"[2]: Advanced week visualizer\n" +"[3]: Basic calculator\n" +"[4]: Employee repertoire");
        int definer = scan.nextInt();
        
        if (definer == 1){
            BasicWeek wk = new BasicWeek();
            wk.printdays();
              
        }
        if (definer == 2){
            AdvancedWeek week = new AdvancedWeek();
            week.printdays();}
        if(definer == 3){
            
            
            Calculator calc = new Calculator();
            
                }
        if (definer == 4){
            
        
          Employee emp = new Employee();
          System.out.println(emp.toString());
          System.out.println(emp.FirstName + " " + emp.LastName + " " + emp.Age+ " " + emp.MonthlySalary);}
        System.out.println("Do you want to repeat this ? (y/n)");
        String y = scan.nextLine();
             if ( y !=Y){
             Y += "k";
          }
        }
        }
    }

        
