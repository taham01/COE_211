import java.io.*;
import java.util.Scanner;
public class ExpensesTracker {

    /**
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main (String[] args) throws IOException{
        //creating variables
        String answer,ownerName,purchase,answ2,answ1;
        double cost;
        boolean condition1 = true;
        
        //declaring scanner class
        Scanner scan = new Scanner(System.in);
        
        //creating expnses.txt file to append information into it
        
        FileWriter fw = new FileWriter(new File("expenses.txt"));
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter pw = new PrintWriter(bw);
   
        //creating while loop to append as much statments as te user wants
        while (condition1 == true){
                //taking required input from the user (name,purchased item, and cost)
                System.out.println("Enter owner name: ");
                ownerName=scan.next();
                System.out.println("What did you purchase? ");
                purchase=scan.next();
                System.out.println("How much did you pay ");
                cost=scan.nextDouble();
                
                //printing the output of the given information
                answ2 = (ownerName+" purchased "+purchase +" for "+cost+" US Dollars.");
                System.out.println(answ2);
                
                //appending the the info to the expenses.txt file
                
                pw.print(answ2);
                pw.println();
                System.out.println();
                //asking the users if they want to procced appending dats
                System.out.print("Do you want to continue? (y/n) ");
                answer=scan.next();
                //creating if statements to know if the loop should repeat or not 
                if (answer.equalsIgnoreCase("y")){
                    continue;}
               //considering when the users are done propmting the data
                else {
                  //closing the file  
                  pw.close();
                  //outputing christophhers funny joke
                  System.out.println("Get off of ZoodMall!");
                  System.out.println("Would you like to read a summary of your purchases?");
                  answ1 = scan.next();
                  //creating another if statement to know if the users want to see the suumery and outputing if they want
                  if (answ1.equalsIgnoreCase("y")){
                      //calling the required file and creating a scanner to outut the summary
                      File ofile = new File ("expenses.txt");
                      
                      Scanner input = new Scanner(ofile);
                      //outputing the file
                      while (input.hasNext()){
                          System.out.println(input.nextLine());
                          
                  }
                  //closing the scnner reading file
                  input.close();
                 
                  //exiting the while loop
                  condition1 = false;
                  
                
            }
            } 
        //closing the scanner
        
        scan.close();
       
                 }

      //Done
        
    } 
    }
    

