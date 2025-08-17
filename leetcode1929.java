class Solution {
    public int[] getConcatenation(int[] nums) {
        int result[] = new int[2 * nums.length];
        for (int i = 0, j = nums.length; i < nums.length && j < 2 * nums.length; i++, j++) {
            result[i] = nums[i];   
            result[j] = nums[i];   
        }
        return result;
    }
}
