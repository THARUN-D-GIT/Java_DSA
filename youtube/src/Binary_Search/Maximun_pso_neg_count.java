package Binary_Search;

public class Maximun_pso_neg_count {
    static void main(String[] args) {
        int[] nums = {-5, -4, -2, 0, 1, 2, 3};

        Maximun_pso_neg_count  obj = new Maximun_pso_neg_count();

        int ans = obj.maximumCount(nums);

        System.out.println(ans);

    }
    public int maximumCount(int[] nums) {

        int n = nums.length;

        // count negatives
        int low = 0, high = n - 1;
        int neg = 0;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] < 0){
                neg = mid + 1;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        // count positives
        low = 0;
        high = n - 1;

        int pos = 0;

        while(low <= high){

            int mid = (low + high) / 2;

            if(nums[mid] > 0){
                pos = n - mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return Math.max(neg, pos);
    }
}
