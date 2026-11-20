class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        int prevEnd=intervals[0][1];
        int counter =0;
        for(int i=1; i<intervals.length; i++){
            if(prevEnd > intervals[i][0]){
                counter++;
            }else{
            prevEnd = intervals[i][1];
            }
        }
        return counter;
        
    }
}
