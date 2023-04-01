package ArraysNewProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
     String[] s= {"eat","tea","tan","ate","nat","bat"};
     List<List<String>> result=groupAnagrams(s);
     result.forEach(t->System.out.println(t+" "));
	}
	public static List<List<String>> groupAnagrams(String[] s1){
		List<List<String>> result=new ArrayList<>();
		HashMap<String,List<String>> map=new HashMap<>();
		for(String str:s1) {
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String key=new String(ch);
			
			if(map.containsKey(key)) {
				map.get(key).add(str);
			}
			else
			{
				List<String> strList=new ArrayList<>();
				strList.add(str);
				map.put(key, strList);
			}
		}
		result.addAll(map.values());
		return result;
	}

}
