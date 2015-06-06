package com.echo.frogjump;

public class FrogJump {
	public static void main(String[] args) {
		int num = JumpFloorII(9);
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
    
    /*
     * ��Ŀ������һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
     */
    public static int JumpFloorII(int target) {
/*    	if(target<=0)
    		return 0;
    	if(target == 1)
    		return 1;
    	  	
		return 2*JumpFloorII(target-1);*/
    	return 1 << (int) (target - 1);
    }
}
