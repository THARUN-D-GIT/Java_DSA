package Binary_Search;

public class Singles_among_doubles_2 {
        public static void main(String[] args) {

            int[] arr = {1,1,2,2,3,3,4,50,50,65,65};

            int n = arr.length;

            int lo = 0, hi = n - 1;

            while(lo < hi) {

                int mid = lo + (hi - lo) / 2;

                // make mid even
                if(mid % 2 == 1) {
                    mid--;
                }

                // valid pair
                if(arr[mid] == arr[mid + 1]) {
                    lo = mid + 2;
                }
                else {
                    hi = mid;
                }
            }

            System.out.println("unique element is: " + arr[lo]);
        }
    }

