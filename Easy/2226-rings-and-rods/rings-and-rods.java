class Solution {
    public int countPoints(String rings) {
        int[] rods = new int[10];

        for(int i=0; i<rings.length(); i+=2){
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            int colorBit = 0;
            if(color == 'R') colorBit = 1;
            else if(color == 'B') colorBit = 2;
            else if(color == 'G') colorBit = 4;

            rods[rod] |= colorBit;
        }
        int count = 0;
        for(int rod: rods){
            if(rod == 7) count++;
        }
        return count;
    }
}