class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans,new ArrayList(),nums);
        return ans;
    }
    public void helper(List<List<Integer>> ans , List<Integer> curr , int[] nums){
        if(curr.size() == nums.length){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!curr.contains(nums[i])){
            curr.add(nums[i]);
            helper(ans,curr,nums);
            curr.remove(curr.size() - 1);
            }
        }
    }
}
