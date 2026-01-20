public class Sort {
    public static int[] bubbleSort(int arr[], int n)
    {
        int swaps = 0;
        int comps = 0;
        for(int j = 0; j < n - 1; j++)
        {
            comps++;
            for(int i = 0; i < n - j - 1; i++)
            {
                if(arr[i] > arr[i + 1])
                {

                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];
                    swaps++;
                }
            }
        }
    System.out.println("so lan swap: " + swaps + ", so lan comps: " + comps);
        return arr;
    }

    public static int[] filteredBubbleSort(int arr[], int n)
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

    public static int[] insertionSort(int arr[], int n)
    {
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
        return arr;
    }

    public static int partition(int arr[], int left, int right)
    {
        int pivot = arr[(right + left) / 2];

        while(left <= right)
        {
            while(arr[left] < pivot)
            {
                left++;
            }

            while(arr[right] > pivot)
            {
                right--;
            }

            if(left <= right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }


    public static void quickSort(int arr[], int left, int right)
    {
        int index = partition(arr, left, right);

        if(left < index - 1)
        {
            quickSort(arr, left, index - 1);
        }

        if(right > index )
        {
            quickSort(arr, index, right);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
