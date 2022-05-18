package OccurancesOfSubStringInString;

import java.util.ArrayList;
import java.util.Arrays;

public class OccuranceOfSubStringInString_using_Stream {

	
    public static void main(String[] args) {
    	System.out.println(Arrays.toString(OccuranceOfSubStringInString3()));
    	
    }
	private static int[] OccuranceOfSubStringInString3() {
		String searchableString = "babi thisisbaby whereisbaby babyissleeping";
	    String keyword = "baby";
	 
	    int index = searchableString.indexOf(keyword);
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while (index >=0){
	        list.add(index);
	        index = searchableString.indexOf(keyword, index+keyword.length())   ;
	    }
	  return list.stream().mapToInt(Integer::intValue).toArray();
		
	}
}


