package arrayAssignment;
import java.util.*;


public class twoDassi {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the matrix:");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix one by one");

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j <n ; j ++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements inserted successfully...");
        //now printing the 2d matrix formed 

        System.out.println("Printing the 2d matrix formed :");
        for(int i = 0 ; i <n ; i ++)
        {
            for(int j = 0 ; j <n ; j ++)
            {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }

        // PART ONE  printing the elements above the secondary diagonal

        System.out.println("printing the elements above the secondary diagonal");
        for(int i = 0 ; i <n; i ++){
            for(int j = 0 ; j <n ; j ++){
                if(i+j < n-1){
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

        //PART TWO printing both the diagonal elements 

        System.out.println("printing the primary diagonal elements");
        for(int i = 0 ; i <n ; i ++)
        {
            for(int j = 0 ; j <n ; j ++){
                    if(i==j){
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
            }

        }

        System.out.println("Printing the secondary diagonal elements:");
        for(int i = 0 ; i <n ; i ++)
        {
            for(int j = 0 ; j <n ; j ++){
                    if(i+j == n-1){
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
            }

        }

        //PART THREE finding the largest element in the matrix 
        int max = Integer.MIN_VALUE;
        max = arr[0][0];
        for(int i = 0 ; i <n ; i ++)
        {
            for(int j = 0 ; j <n ; j ++){
                   if(arr[i][j] > max){
                    max = arr[i][j];
                   }
            }

        }

        System.out.println("the maximum element in 2d matrix is :" + max);

// PART FOUR finding the middle row and column in the matrix 

        System.out.println("Checking if the middle row and column exist in this matrix--");
        if(n%2 == 0 ){
            System.out.println("cant find the middle row and column");
        }
        else{
            System.out.println("printing the middle row:");
           for(int i = 0 ; i < n ; i ++){
                System.out.println(arr[n/2][i]);

           }

           System.out.println("Printing the middle column:");
           for(int i = 0 ; i < n ; i ++){
            System.out.println(arr[i][n/2]);

       }
        }

    }

}
