package leetcode;

public class LongestPalindrome {
//	解法1 暴力列举 
//	关键在于初始化maxlen，两个for循环， 得到所有子串，判断该字串是否回文串；
//	单独一个函数，判断是否回文；
	public static String Solution1(String s) {
		int len = s.length();
		int begin = 0;
		int maxlen = 1;
		if(len<2)
		{
			return s;
		}
		char [] sChar = s.toCharArray();
		for(int i=0; i<len-1; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(j-i+1>maxlen && isPalindrome(sChar,i,j))
				{
					begin = i;
					maxlen = j-i+1;
				}
			}
		}
		return s.substring(begin, maxlen+begin);
	}
//	这里用while循环很nice！
	static boolean isPalindrome(char[] sChar, int i, int j)
	{
		
		while(i<j)
		{
			if(sChar[i]!=sChar[j])
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
//	解法2 动态规划
//	动态规划其实也需要遍历所有子串(时间复杂度O(n^2))；
//	s[i][j] 为回文串的充要条件 s[i]==s[j] && s[i+1][j-1]
//	利用以上性质可以不用对所有子串，再去一个个判断字符
	public static String Solution2(String s) {
		int len = s.length();
		int begin = 0;
		int maxlen = 1;
		if(len<2)
		{
			return s;
		}
		boolean[][] dp = new boolean[len][len];
		char[] sChar = s.toCharArray();
		// 单个字符构成的字串肯定是回文串；
		for(int i=0; i<len; i++)
		{
			dp[i][i] = true;
		}
		
		for(int l=2; l<=len; l++)
		{
			for(int i=0; i<len; i++)
			{
				int j = l + i - 1;
				// 出右边界 break
				if(j >= len)
				{
					break;
				}
				if(sChar[i] != sChar[j])
				{
					dp[i][j] = false;
				}
				else
				{
					if(l<4) //长度为2和3的字串
					{
						dp[i][j] = sChar[i] == sChar[j];
					}
					else
					{
						dp[i][j] = sChar[i] == sChar[j] && dp[i+1][j-1];
					}
				}
				if(l>maxlen && dp[i][j])
				{
					maxlen = l;
					begin = i;
				}
				
			}
		}
		
		
		return s.substring(begin, begin+maxlen);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abcdddcxy";
		System.out.print(Solution2(test));

	}

}
