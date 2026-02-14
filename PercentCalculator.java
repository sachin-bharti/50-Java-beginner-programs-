import java.util.*;
public class PercentCalculator{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  number :");
        double number = sc.nextDouble(); // taking number  from user 
        System.out.println("Enter percent that you want :");
        double PercentageValue =sc.nextDouble(); // taking pecentage vaule that he want find 
        double result = number * PercentageValue / 100; // formula we use 
       System.out.println(PercentageValue+"% of " + number +" is : "+ result );
    }

}