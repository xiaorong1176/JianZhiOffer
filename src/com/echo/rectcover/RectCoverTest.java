package com.echo.rectcover;

/*
 * ��Ŀ����:���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 *������һ�����������һ��2*(n-1)�ľ��μ���һ�����ŵ�2*1�ľ���
������һ������һ��2*(n-2)�ľ��Σ������������ŵ�2*1�ľ���
����������ǿ��Եó�����2*n�����εĸ��Ƿ������ڵ�2*(n-1)���ϵ�2*(n-2)�ķ�����
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
