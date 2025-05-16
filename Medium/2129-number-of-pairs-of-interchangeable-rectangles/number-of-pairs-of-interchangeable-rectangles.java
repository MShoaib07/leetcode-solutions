class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        long count = 0;
        for(int[] rect: rectangles){
            double ratio = (double) rect[0] / rect[1];
            count += map.getOrDefault(ratio, 0L);
            map.put(ratio, map.getOrDefault(ratio, 0L) + 1);
        }
        return count;
    }
}