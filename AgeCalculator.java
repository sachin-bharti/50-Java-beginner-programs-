import java.util.Scanner;
public class AgeCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current  year :");
        int Currentyear = sc.nextInt();
        System.out.println("please enter current year :");
        System.out.println("Enter birth year");
        int birthyear=sc.nextInt();
        System.out.println("the person is "+ (Currentyear - birthyear) + " Year Old");
        sc.close();

    }
}
