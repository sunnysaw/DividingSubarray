import java.util.Scanner;
/*
Question : Check if we can partition the array into two subarrays with equal sum.
________________________________________________________________________________________________________________________
LOGIC : In this type of question first we have to add all the element of array that are present in array and then divide
        the value by 2 if value is divisible by 2 then we can divide the array into two part otherwise we return false.
 */
public class Main {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("FIRST, PRINTING THE ORIGINAL VALUE OF ARRAY :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        for (int j : arr) {
            temp = temp + j;
        }
        System.out.println();
        if (temp % 2 == 0){
            System.out.println("YES ARRAY CAN BE DIVIDED INTO TWO PARTS :");
        }else
            System.out.println("NO ARRAY CAN BE DIVIDED INTO TWO PARTS :");
    }
}