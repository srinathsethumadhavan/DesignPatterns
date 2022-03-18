package DSA_Hot_Qns;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileSystem {
	
	class Trie{
		int val;
		Map<String,Trie> map;
		
		Trie(){
			val = -1;
			 map = new HashMap();
		}

		@Override
		public String toString() {
			return "Trie [val=" + val + ", map=" + map + "]";
		}
	}
	
	Trie root ;
	 FileSystem() {
		
		  root = new Trie();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString("/aa".split("/")));
		FileSystem fileSystem = new FileSystem();
		StringBuilder sb = new StringBuilder(232);
		System.out.println(sb);
		System.out. println(fileSystem.createPath("/leet", 1)); // return true
		System.out. println(fileSystem.createPath("/leet/code", 2));
		System.out. println(fileSystem.createPath("/leet/code/com",3));
		System.out. println(fileSystem.createPath("/leet/man",6));// return true
		System.out. println(fileSystem.get("/leet/code")); // return 2
		System.out. println(fileSystem.createPath("/c/d", 1)); // return false because the parent path "/c" doesn't exist.
		System.out. println(fileSystem.createPath("/c",43)); 
		
		// return -1 because this path doesn't exist.
		
		
		
	}
	
	
	public boolean createPath(String path, int value) {
	
		String[] paths = path.split("/");
		
		if(paths.length<=1)
			return false;
		
		Trie current = root;
		
		for(int i =1;i<paths.length-1;i++) {
			if(!current.map.containsKey(paths[i]))
				return false;
			current = current.map.get(paths[i]);
		}
		
		
		Trie newNode = new Trie();
		newNode.val = value;
		current.map.put(paths[paths.length-1], newNode);
		System.out.println(root);
		return true;
	}
	
	public int get(String path) {
		
		Trie current = root;
		String[] paths  = path.split("/");
		if(paths.length<=1)
			return -1;
		for(int i=1;i<paths.length;i++) {
			if(!current.map.containsKey(paths[i]))
				return -1;
			current = current.map.get(paths[i]);
		}
		
		return current.val;
	}

}



