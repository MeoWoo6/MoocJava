package leetcode;

public class longestCommonPrefix {
	
	public static String LCP(String[] strs) {
		if (strs == null || strs.length == 0) {
            return "";
        }
		String s = strs[0];

		for(String str : strs)
		{
			if(str.length()<s.length())
			{
				s = str;
			}
		}
		String lcp = s;
		for (int i = 0; i < s.length(); i++) {
            for (String str : strs) {
                if (!str.startsWith(lcp)) {
                    lcp = lcp.substring(0, lcp.length() - 1);
                    break;
                }
            }
        }
		return lcp;

    }
	
	
	public static String LCP2(String[] strs)
	{
		if(strs == null || strs.length == 0)
		{
			return "";
		}
		String lcp = strs[0];
		int len = lcp.length();
		for(int i=0; i<len; i++)
		{
			for (String str : strs) {
	            if (!str.startsWith(lcp)) {
	                lcp = lcp.substring(0, lcp.length() - 1);
	                break;
	            }
	        }
		}
			
		return lcp;	
		
	}
	
	public static String LCP3(String[] strs)
	{
		if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"flower","flow","flight"};
		System.out.print(LCP2(strs));
	}

}
