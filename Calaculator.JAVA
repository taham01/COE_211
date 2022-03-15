import java.util.Scanner;
public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    
    public Calculator(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        num1 = scan.nextInt();
        scan.nextLine();
        
        System.out.print("What operation You Want ?  ");
        operator =scan.nextLine();
        
        
        System.out.print("Enter seconde number");
        num2 = scan.nextInt();
        
        
        System.out.println("Op: " + operator);
        scan.close();
        switch (operator){
                case "+":
                    System.out.println(add(num1, num2));
                    break;
                  
                case "-":
                    System.out.println(subtract(num1, num2));
                    break;
                case "x":
                    System.out.println(multiplication(num1,num2));
                    break;
                case "/":
                    System.out.println(division(num1, num2));
                    break;
                    
                        
        }
        
        }
        
    public String add(int a, int b) { 

        int result = a + b;
        return a + "+"  + b + "=" + result;
        
}
    public String subtract(int a, int b) { 

        int result = a-b;
        return a + "-"  + b + "=" + result;
        
    }
    public String multiplication(int a, int b) { 

        int result = a*b;
       
        return a + "x"  + b + "=" + result;
    }
    public String division(int a, int b) { 

        int result = a/b;
        return a + "/"  + b + "=" + result;
    }    

}
    

