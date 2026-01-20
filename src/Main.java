import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("ARRAYS");
        int arr[] = {3,5,2,7,6,8,9,1,4};
        int value = 8;
        int index = 3;

        int linearSearch = Array.linearSearch(arr, arr.length, value);
        int[] insertArray = Array.insertArray(arr, arr.length, value, index);
        int[] deleteArray = Array.deleteArray(arr, arr.length, index);

        if(linearSearch != -1 ){
            System.out.println("Phan tu co Value = " + value + " nam o index: " + linearSearch);
            System.out.println("so buoc linear search: " + linearSearch);
        }
        else {
            System.out.println("khong tim thay");
        }

        System.out.println("Inserted Array at index = " + index + ": " + Arrays.toString(insertArray));
        System.out.println("Deleted Array at index = " + index + ": " + Arrays.toString(deleteArray));


        System.out.println("\nORDERED ARRAYS");
        int oderedArr[] = {1,2,4,5,6,7,8,9};
        int n = oderedArr.length;
        int value2 = 8;

        int binarySearch = OderedArray.binarySearch(oderedArr, n, value2);
        int[] insertOrdered = OderedArray.insertOrdered(oderedArr, n, 3);
        if(binarySearch != -1 ){
            //System.out.println("Binary Search Phan tu co Value = " + value2 + " nam o index: " + binarySearch);
            System.out.println("so buoc binary search: " + binarySearch);
        }
        else {
            System.out.println("khong tim thay");
        }

        System.out.println("Inserted Orederd Array: " + Arrays.toString(insertOrdered));

        System.out.println("\nSORTS");

        int sortArr[] = {13,41,52,2,5,1,1};
        Sort.bubbleSort(sortArr, sortArr.length);
        System.out.println(Arrays.toString(sortArr));

        //int filterBubbleSort[] = Sort.filteredBubbleSort(sortArr, sortArr.length);
        //System.out.println("Xoa phan tu trung nhau: " + Arrays.toString(filterBubbleSort));

        int selectionSort[] = Sort.selectionSort(sortArr, sortArr.length);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSort));

        int insertionSort[] = Sort.insertionSort(sortArr, sortArr.length);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionSort));

        int pivot = Sort.partition(sortArr, 0, sortArr.length - 1);
        //System.out.println("left: " + partition);

        Sort.quickSort(sortArr, 0, sortArr.length - 1);



    }
}