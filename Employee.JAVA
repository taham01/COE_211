import java.util.*;
public class Employee {
    
    public String FirstName;
    public String LastName;
    public int Age;
    public double MonthlySalary;
    public  Employee(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the Employees first name : ");
        FirstName = scan.next();
        System.out.println("Please input the Employees last name : ");
        LastName = scan.next();
        System.out.println("Please input the Employees age : ");
        Age = scan.nextInt();
        System.out.println("Please input the Employees Monthly Salary: ");
        MonthlySalary = scan.nextDouble();}
    public String toString(){
            return " " + FirstName + LastName + Age + MonthlySalary;
        
    
    
    }