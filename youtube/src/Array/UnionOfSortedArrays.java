package Array;


public class UnionOfSortedArrays {

    public static void union(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            // Skip duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                System.out.print(arr1[i] + " ");
            }
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 6, 7};

        System.out.print("Union: ");
        union(arr1, arr2);
    }
}