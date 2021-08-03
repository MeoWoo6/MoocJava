package leetcode;

public class findDiagonalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		给定一个含有 M x N 个元素的矩阵（M 行，N 列），
//		请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
//		https://leetcode-cn.com/leetbook/read/array-and-string/cuxq3/
//		思路：对角线上数的下标之和相等，和的奇偶性影响输出顺序
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] mat = {};
//		int[][] mat = {{1,2,3}};
		int m = mat.length;
		int n = mat[0].length;
		int[] dia = new int[m*n];
		int count = 0;
		int sum = m+n-2;
		for(int s=0; s<=sum; s++)
		{
			if(s%2==0)
			{
				for(int i=s; i>=0; i--)
				{
					if(i>=m||(s-i)>=n)
					{
						continue;
					}
					else
					{
						dia[count] = mat[i][s-i];
						count++;
					}
					
				}
			}
			else
			{
				for(int j=s; j>=0; j--)
				{
					if(j>=n||(s-j)>=m)
					{
						continue;
					}
					else
					{
						dia[count] = mat[s-j][j];
						count++;
					}
					
				}
			}
					
		}
		
		for(int i=0; i<dia.length; i++)
		{
			System.out.print(dia[i]+" ");
		}
		
//		System.out.print(m);
//		System.out.print(n);
	}

}
