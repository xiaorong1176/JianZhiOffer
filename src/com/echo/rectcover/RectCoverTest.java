package com.echo.rectcover;

/*
 * 题目描述:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *分析：一种是最后是由一个2*(n-1)的矩形加上一个竖着的2*1的矩形
　　另一种是由一个2*(n-2)的矩形，加上两个横着的2*1的矩形
　　因此我们可以得出：第2*n个矩形的覆盖方法等于第2*(n-1)加上第2*(n-2)的方法。
 */
public class RectCoverTest {
	public static void main(String[] args) {
		
		System.out.println(RectCover(4));
	}
    public static int RectCover(int target) {

        int[] array = new int[71];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        for(int i=3;i<71;i++)
            {
            array[i]=array[i-1]+array[i-2];
            
        }
        return array[target];
    }

}
