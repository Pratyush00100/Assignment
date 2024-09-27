package arrayAssignment;

public class oneDass {
    public static void main(String[] args) {
        int arr[] = {12,3,45,5,23,98,65,845};
        int n = arr.length;

        // printing all the elements of the array at even indices 
        for(int i = 0 ; i <n ; i ++)
        {
            if(i%2 ==0){
                System.out.println(arr[i]);
            }
        }

        // calculating the maximum element in the array

        int max = Integer.MIN_VALUE;
         max = arr[0];
        for(int i = 0 ; i <n ; i++)
        {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("the largest number in the array is: " + max);


        // calculating the 2nd maximum element in the array

        int secMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] < max && arr[i] > secMax){
                secMax = arr[i];
            }
        }

        System.out.println("THe second largest element in the array is:" + secMax);

        // finding the peak element in the array 
        int peak = Integer.MIN_VALUE;
        for(int i = 1 ; i <n-1 ; i ++)
        {
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1])
            {
                peak = arr[i];
                break;
            }
        }

        System.out.println("The first peak element in the array is :" + peak);
    }
}
