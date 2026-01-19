
public class Array {

    public static int linearSearch(int arr[], int n, int value )
    {
        System.out.println("Do dai mang arr: " + arr.length);
        int stepLinear = 0;

        for(int i = 0; i < arr.length; i++){
            if (value == arr[i]){
                return i;
                //return stepLinear;
            }

            stepLinear++;
        }
        return -1;
    }

    public static int[] insertArray(int arr[], int n, int value, int index)
    {
        if(index < 0 || index > n){
            System.out.println("ko hop le");
            return arr;
        }

        int newArr[] = new int[n + 1];

        for(int i = 0; i < index; i++)
        {
            newArr[i] = arr[i];
        }

        newArr[index] = value;

        for(int i = index; i < n; i++){
            newArr[i+1] = arr[i];

        }
        System.out.println("Do dai mang inserted: " + newArr.length);
        return newArr;
    }

    public static int[] deleteArray(int arr[], int n, int index){
        if(index < 0 || index > n)
        {
            System.out.println("Khong hop le");
            return arr;
        }

        int newArr[] = new int[n-1];

        for(int i = 0; i < index; i++)
        {
            newArr[i] = arr[i];
        }

        for(int i = index; i < n; i++)
        {
            newArr[i -1] = arr[i];
        }

        System.out.println("Do dai mang deleted: " + newArr.length);
        return newArr;
    }
}
