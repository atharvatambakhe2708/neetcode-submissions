class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r = 0, l = numbers.length - 1;

        while(r<l){
            int currsum = numbers[l]+numbers[r];
            if(currsum<target){
                r++;
            }else if(currsum>target){
                l--;
            }else{
                return new int[]{r+1, l+1};
            }
        }
        return new int[0];
    }
}
