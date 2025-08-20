class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // count of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // keep element
                k++;
            }
        }

        return k; // new length
    }
}
