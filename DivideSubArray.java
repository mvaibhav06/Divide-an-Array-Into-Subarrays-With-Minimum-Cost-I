public class DivideSubArray {
    public int minimumCost(int[] nums) {
        int a = nums[0];
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < c){
                if(nums[i] < b){
                    c = b;
                    b = nums[i];
                }else{
                    c = nums[i];
                }
            }
        }
        return a+b+c;
    }
}
