package Array;

public class IntersectionOfThreeArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        print(arr1);
        print(arr2);
        print(arr3);

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {

                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            }
            else {

                int min = Math.min(arr1[i],
                        Math.min(arr2[j], arr3[k]));

                if (arr1[i] == min) {
                    i++;
                }
                else if (arr2[j] == min) {
                    j++;
                }
                else {
                    k++;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}