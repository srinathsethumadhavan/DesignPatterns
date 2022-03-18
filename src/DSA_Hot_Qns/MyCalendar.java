package DSA_Hot_Qns;
import java.util.TreeMap;

class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    MyCalendar(int[][] scheduled) {
    	
    	
        calendar = new TreeMap<Integer, Integer>();
        
        for(int[] s:scheduled)
        book(s[0],s[0]+s[1]);
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}