package leetcode;

public class reverseWords {
//	Description:
//	给你一个字符串 s ，逐个翻转字符串中的所有 单词 。

//	单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
//
//	请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
//
//	输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
//	翻转后单词间应当仅用一个空格分隔。
//	翻转后的字符串中不应包含额外的空格。

//	Brute force
	public static String solution1(String s)
	{
		char[] schar = s.toCharArray();
		int len = schar.length;
		char[] revschar = new char[len];
		int revindex = 0;
		int begin = -1;
		int end = -1;
		for(int i=len-1; i>=0; i--)
		{
			
			if(schar[i] == ' ')
			{
				if(end!=-1)
				{
					begin = i+1;
				}
			}
			else
			{
				if(end == -1)
				{
					end = i + 1;
				}
			}
			if((begin != -1 && end != -1) || (end != -1 && i == 0))
			{
				if(i == 0 && begin==-1)
				{
					begin = i;
				}
				for(int j = begin; j<end; j++)
				{
					revschar[revindex] = schar[j];
					revindex ++;
				}
				if(i!=0)
				{
					revschar[revindex] = ' ';
					revindex ++;
					begin = end = -1;
				}
				else
				{
					revindex ++;
				}
				
			}
					
		}
		return String.copyValueOf(revschar, 0, revindex-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "  Bob    Loves  Alice   ";
//		String s = "the sky";
//		String s = "  hello world  ";
		String s = "a good   example";
		System.out.print(solution1(s));
	}

}
