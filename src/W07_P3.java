import java.util.*;

public class W07_P3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Removing element and printing result
        System.out.println("Original Array: " + Arrays.toString(array));
        array = removeAll(array, elementToRemove);
        System.out.print("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
    }

    static int[] removeAll(int[] arr, int element){
        int count =0, n = arr.length;
        for (int num: arr){
            if (num == element) count++;
        }
        int[] ans = new int[n-count];

        int i=0;
        for(int num: arr){
            if(num != element) ans[i++] = num;
        }

        return ans;
    }

}