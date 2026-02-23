public class  SumOfArray{
    public static void main(String [] args){
        int array[] = {12,43,54,565,76,56};
        int sum = 0;
        for(int i=0; i < array.length ; i++) {
            sum += array[i];


        }
        System.out.println("Sum of array element :" + sum);

    }

}