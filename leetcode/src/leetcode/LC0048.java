package leetcode;

//import java.util.Scanner;
//给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。
//请你设计一种算法，将图像旋转 90 度。不占用额外内存空间能否做到？

public class LC0048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//Solution1 
//		int N = matrix.length;
//		if(N == 1)
//		{
//			return;
//		}
//		int cols = N/2;
//		int rows = N/2;
//		int temp0, temp1, temp2, temp3;
//		if(N%2!=0)
//		{
//			cols += 1;
//		}
//		for(int i=0; i<rows; i++)
//		{
//			for(int j=0; j<cols; j++)
//			{
//				temp0 = matrix[i][j];
//				temp1 = matrix[j][N-i-1];
//				temp2 = matrix[N-i-1][N-j-1];
//				temp3 = matrix[N-j-1][i];
//				matrix[i][j] = temp3;
//				matrix[j][N-i-1] = temp0;
//				matrix[N-i-1][N-j-1] = temp1;
//				matrix[N-j-1][i] = temp2;
//			}
//		}
//Solution2
//		水平翻转 + 对角线翻转
		int N = matrix.length;
		int temp = 0;
		int rows = N/2;
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<N; j++)
			{
				temp = matrix[i][j];
				matrix[i][j] = matrix[N-i-1][j];
				matrix[N-i-1][j] = temp;
			}
		}
		for(int i=1; i<N; i++)
		{
			for(int j=0; j<i; j++)
			{
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix.length; j++)
			{
				System.out.print(matrix[i][j]+",");
			}
		}
		
	}

}
