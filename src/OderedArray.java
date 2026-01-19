import java.util.Arrays;

public class OderedArray
{
    public static int binarySearch(int arr[],int n, int value)
    {
        int lower = 0, upper = n - 1;
        int stepBinary = 0;

        while(lower <= upper)
        {
            int midPoint = (upper + lower)/2;
            if(arr[midPoint] == value) {
                return midPoint;
                //return stepBinary;
            }

            if (arr[midPoint] < value)
            {
                lower = midPoint + 1;
            } else if (arr[midPoint] > value)
            {
                upper = midPoint - 1;
            }
            stepBinary++;
        }
        return -1;
    }

    public static int[] insertOrdered(int arr[], int n, int value){
        int lower = 0, upper = n-1;
        int i = 0;

        int newArr[] = new int[n+1];

        while(i < n && arr[i] < value)
        {
            newArr[i] = arr[i];
            i++;
        }
        newArr[i] = value;


        for(int j = i; j < n; j++)
        {
            newArr[j+1] = arr[j];
        }
        return newArr;
    }
}
