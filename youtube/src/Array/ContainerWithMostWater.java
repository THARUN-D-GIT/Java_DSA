package Array;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        print(height);

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;

            int currentArea =
                    Math.min(height[left], height[right]) * width;

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println("Maximum Area = " + maxArea);
    }

    public static void print(int[] arr) {

        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.println();
    }
}