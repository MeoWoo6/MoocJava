package leetcode;

import java.util.HashSet;

public class setZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
		
		int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		//Solution1 暴力解法，使用HashSet存储含0的行列下标
//		int m = matrix.length;
//		int n = matrix[0].length;
//		HashSet<Integer> rows = new HashSet<Integer>();
//		HashSet<Integer> cols = new HashSet<Integer>();
//		for(int i=0; i<m; i++)
//		{
//			for(int j=0; j<n; j++)
//			{
//				if(matrix[i][j]==0)
//				{
//					rows.add(i);
//					cols.add(j);
//				}
//			}
//		}
//		for(int i: rows)
//		{
//			for(int j=0; j<n; j++)
//			{
//				matrix[i][j] = 0;
//			}
//		}
//		for(int j: cols)
//		{
//			for(int i=0; i<m; i++)
//			{
//				matrix[i][j] = 0;
//			}
//		}
//		--------------------------------------------
//		Solution2
//		使用数组本身第一行，第一列存储boolean值；
//		另两个值记录原始第一行，第一列是否有0；
		int m = matrix.length;
		int n = matrix[0].length;
		boolean col0 = false;
		boolean row0 = false;
		for(int i=0; i<m; i++)
		{
			if(matrix[i][0] == 0)
			{
				col0 = true;
				break;
			}
		}
		for(int j=0; j<n; j++)
		{
			if(matrix[0][j] == 0)
			{
				row0 = true;
				break;
			}
		}
		for(int i=1; i<m; i++)
		{
			for(int j=1; j<n; j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[0][j] = matrix[i][0] = 0;
				}
			}
		}
		for(int i=1; i<m; i++)
		{
			for(int j=1; j<n; j++)
			{
				if(matrix[0][j]==0 || matrix[i][0]==0)
				{
					matrix[i][j] = 0;
				}
			}
		}
		if(col0)
		{
			for(int i=0; i<m; i++)
			{
				matrix[i][0] = 0;
			}
		}
		if(row0)
		{
			for(int j=0; j<n; j++)
			{
				matrix[0][j] = 0;
			}
		}
		
	}

}
