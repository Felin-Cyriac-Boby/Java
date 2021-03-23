class Solution2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> subs = new ArrayList<>();
        comb(res,nums,subs,0);
        return res;
    }
    
    static void comb(List<List<Integer>> res,int[] nums, List<Integer> subs, int start_Ind) {
        //deepcopy because subs can change
	res.add(new ArrayList<>(subs));
        for (int i = start_Ind; i < nums.length; i++) {
	    //checks if on consecutive loops that there are no repeats
            if (i != start_Ind && nums[i] == nums[i-1]) {
                continue;
            }
            subs.add(nums[i]);
   	    //backtracking & increment start by 1
            comb(res,nums,subs,i+1);
	    // remove last element, essentially overwrites it once loop starts again
            subs.remove(subs.size() - 1);
        }
    }
}