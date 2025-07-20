class Solution {
    public static void bactrack(List<List<Integer>> result, List<Integer> ans, int[] num, int start){
        result.add(new ArrayList<>(ans));
        for(int i=start; i<num.length; i++){
            ans.add(num[i]);
            bactrack(result, ans, num, i+1);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        bactrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
}