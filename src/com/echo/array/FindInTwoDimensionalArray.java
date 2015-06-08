package com.echo.array;

/*
 * ��Ŀ����:��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 *ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
 *����������һ����ά�����һ���������ж��������Ƿ��и�������
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
