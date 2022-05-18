package OccurancesOfSubStringInString;

import org.apache.commons.lang3.StringUtils;

public class OccurancesOfSubStringInString_using_StringUtils_countMatches {
	
	 public static void main(String[] args)
	    {
	        String text = "babi thisisbaby whereisbaby babyissleeping";
	        String str = "baby";
	 
	        System.out.println(StringUtils.countMatches(text, str));
	     
	    }

}
