package com.echo.frogjump;

public class FrogJump {
	public static void main(String[] args) {
		int num = JumpFloor(9);
		System.out.println(num);
	}
	
	/*
	 * ��Ŀ������һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
	 */
    public static int JumpFloor(int target) {
    	if(target<=0)
    		return 0;
    	if(target == 1)
    		return 1;
    	if(target==2)
    		return 2;
    	
		return JumpFloor(target-1) + JumpFloor(target-2);
    }
}
