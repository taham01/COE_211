import java.util.*;
public class Lab10 {

    
    public static void main(String[] args) {
       
        
    	Scanner scan = new Scanner(System.in);
        
        int attendance;
        int midgrade;
        int sum = 0;
        
        final int n = 5;
        int [] assigment = new int[n+1];
       
       
          for (int j=1; j<=n;j++){
          System.out.println("Input the grade of assignment"+j+":");
           assigment [j]= scan.nextInt();}
           
       
       for (int i=0; i<=n;i++){
           sum+= assigment[i];}
       
        System.out.print("Input the number of attended classes :");
        attendance = scan.nextInt();
        System.out.print("input the grade of the midterm");
        midgrade = scan.nextInt();
        System.out.println("Assignments (30%):"+(sum/5)*0.3);
        System.out.println("Attendance (5%): "+(attendance/7)*100*0.05);
        System.out.println("Midterm (30%):"+midgrade * 0.3);
    }
           
    }