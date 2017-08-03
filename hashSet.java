package NewProject;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet<String> StringSet = new HashSet<String>();
		StringSet.add("Hello");
		StringSet.add("Hello");
		StringSet.add("World");
		for(String s : StringSet){
			System.out.println(s);
		}
		

	}

}
