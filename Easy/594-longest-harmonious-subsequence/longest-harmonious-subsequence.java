class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int longest = 0;

        for(int num: map.keySet()){
            if(map.containsKey(num + 1)){
                int length = map.get(num) + map.get(num + 1);
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}