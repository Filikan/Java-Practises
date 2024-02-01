public class Main {

    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int[] result = twoSum(a,12);
        System.out.println("Answer is [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        //[1,2,3,4] target = 4
        int n = nums.length;
        for (int i=0; i<n;i++)
        {
            for (int j=0; j<n-1; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    System.out.println("The numbers are " + nums[i] + " and " + nums[j]);
                    return new int[]{i, j};
                }
            }
        }

        System.out.println("No solution found.");
        return new int[]{}; // if there is no solution found.
    }
}