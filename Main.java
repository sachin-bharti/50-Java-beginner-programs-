import java.util.Scanner;

public class Main {

    int maxelement(Scanner sc) {

        System.out.println("Enter Size of the array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements of Array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You Entered :");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        // find maximum element
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;   // now method returns an int
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m1 = new Main();

        int max = m1.maxelement(sc);   // capture the return value
        System.out.println("Maximum element is: " + max);

        sc.close();
    }
}
