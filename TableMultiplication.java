import java.util.*;
public class TableMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while(true){
        System.out.println("Enter Number :(enter 0 to exit)");
        int number = sc.nextInt();
        if(number ==0) {
            System.out.println("Exiting program.");
                break;  
        }
            for(int i=1; i <=10; i++){
            int result = number * i;
            System.out.println(number + " X " + i + " = "+ result);

        }
    
        
     }
     sc.close();
    
    }

}
