package com.echo.array;

/*
 * 题目描述:在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 *每一列都按照从上到下递增的顺序排序。请完成一个函数，
 *输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindInTwoDimensionalArray {
	public static void main(String[] args) {
		int[][] array= {{100,200,300,400},{500,600,700,800},{900,1000,1100,1200,1300}};
		boolean isTrue = Find(array, 30);
		System.out.println(isTrue);
	}

    public static boolean Find(int [][] array,int target) {
    	int a = array.length;
    	int b = array[0].length;
    	int i=0;
    	int j=b-1;
    	while(i<a&&j>0){
            if (array[i][j] == target)
                return true;
            else if (array[i][j] < target)
                i++;
            else
                j--;   		
    	}

    	return false;
    }
}
