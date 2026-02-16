package java_Star_patern;
import java.util.Scanner;
public class SolidStarPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        if(number <= 0){
            System.out.println(" Plese Enter positive Number : ");
            return;
        }
        for(int i=1; i <= number; i++){
            for(int j=1; j <= number ; j++){
                System.out.print(" *");
        }
        System.out.println();

    }
    sc.close();
}
}
