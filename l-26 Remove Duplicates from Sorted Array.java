class Solution {
    public int removeDuplicates(int[] nums) {
                int j=1;
        int count = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[j]){
                count++;
                nums[count] = nums[j];
            }
            j++;
        }
        return count+1;
    }
}