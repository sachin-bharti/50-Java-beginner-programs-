import java.util.*;
public class CheckEvenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter Number to check whether number is even or odd:");  
    int number=sc.nextInt();
    if(number % 2 == 0){
        System.out.println(number+" is Even");
    }
    else {
        System.out.println(number+" is Odd");
    }
    sc.close();
    }
    
}
