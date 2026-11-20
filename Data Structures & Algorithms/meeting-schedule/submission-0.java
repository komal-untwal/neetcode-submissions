/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));
        List<Interval> res = new ArrayList<>();

        for(Interval curr: intervals){
            if(!res.isEmpty() && res.get(res.size()-1).end > curr.start){
                return false;
            }    
            else{
                res.add(curr);
            }    
        } 
        return true;
    }
}
