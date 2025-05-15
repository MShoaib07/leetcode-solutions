class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int count = n/3;
        int res = 0;
        for(int i=count; i<n; i+=2){
            res += piles[i];
        }
        return res;
    }
}