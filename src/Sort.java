public class Sort {
    public static void bubbleSort(int arr[], int n)
    {
        int swaps = 0;
        int comps = 0;
        for(int j = 0; j < n - 1; j++)
        {
            swaps++;
            for(int i = 0; i < n - j - 1; i++)
            {
                if(arr[i] > arr[i + 1])
                {

                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];
                    comps++;
                }
            }
        }
    System.out.println("so lan swap: " + swaps + ", so lan comps: " + comps);
    }

    public static int[] filterBubbleSort(int arr[], int n)
    {
        int count = 1;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }

            }
        }

        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] != arr[i + 1])
                count++;
        }

        int newArr[] = new int[count];
        newArr[0] = arr[0];
        int index = 1;
        for(int i = 1; i < n; i++)
        {
            if(arr[i] != arr[i - 1]) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] selectionSort(int arr[], int n)
    {

        for(int i = 0; i < n - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
