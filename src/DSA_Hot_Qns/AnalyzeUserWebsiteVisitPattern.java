package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AnalyzeUserWebsiteVisitPattern {
	public static void main(String[] args) {
		
		String[] username = new String[] {"joe","joe","joe","james","james","james","james","james","mary","mary","mary"} ;
		int[] timestamp = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		String[] website = new String[]{"home","cart","career","home","cart","career","home","cart","home","cart","career"};
		System.out.println(mostVisitedPattern(username,timestamp,website));
	}
	
	public static List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
		
		List<String> result = new ArrayList();
		Map<String,TreeMap<Integer,String>> map = new HashMap();
		
		int n = username.length;
		
		for(int i=0;i<n;i++) {
			
			if(!map.containsKey(username[i])) 
				map.put(username[i],new TreeMap());
			map.get(username[i]).put(timestamp[i],website[i]);
			
		}
		
		Map<String,Integer> sequenceCount = new HashMap();
		
		for(String str : map.keySet()) {
			
			List<String> sequences  = formSequences(map.get(str));
			
			Set<String> set = new HashSet();
			for(String sequence: sequences)
				set.add(sequence);
			
			
			for(String ss: set)
				sequenceCount.put(ss, sequenceCount.getOrDefault(ss,0)+1);
			
		}
		
		
	
		int maxCount  = -1;
		String key ="";
		for(String seq : sequenceCount.keySet()) {
			if(maxCount<sequenceCount.get(seq)) {
				maxCount = sequenceCount.get(seq);
				key = seq;
			}else if(maxCount==sequenceCount.get(seq)) {
				if(seq.compareTo(key)<0)
					key = seq;
			}
		
			
			
		
		}
		
		
		
		
		 for (String site : key.split("->")) {
             result.add(site);
         }
         return result;
		
	}
	
	
	private static List<String> formSequences(TreeMap<Integer,String> visitMap){
		
		List<String> sequenceList = new ArrayList();
		
		int n = visitMap.size();
		
		List<String> websiteList =  new ArrayList();
		
		for(Integer i: visitMap.keySet()) {
			websiteList.add(visitMap.get(i));
		}
		
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					sequenceList.add(websiteList.get(i)+"->"+ websiteList.get(j)+"->"+websiteList.get(k));
				}
			}
		}
		
		return sequenceList;
	}
	
	
	

}
