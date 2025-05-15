class Solution {
    //Shaikh_Mohamad_Shoaib
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int point: cardPoints){
            total += point;
        }
        int windowSum = n - k;
        int currSum = 0;
        for(int i=0; i<windowSum; i++){
            currSum += cardPoints[i];
        }
        int minWindowSum = currSum;
        for(int i=windowSum; i<n; i++){
            currSum += cardPoints[i] - cardPoints[i - windowSum];
            minWindowSum = Math.min(minWindowSum, currSum);
        }
        return total - minWindowSum;
    }
}