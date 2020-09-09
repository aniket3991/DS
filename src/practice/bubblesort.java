package practice;

import java.util.Scanner;
public class bubblesort {
    static void bubble(int arr[])
    {
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i++)
        {
            for(int j = 0 ; j < n - i - 1 ; j++ )
            {
                if ( arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please Enter size of array");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Now Enters Elements");
        for(int i = 0 ; i < size ; i++)
            arr[i] = scan.nextInt();
        bubble(arr);
        System.out.println("Sorted array is:");
        for(int i = 0 ; i < size ; i++)
            System.out.print(arr[i] + " ");
    }
}
