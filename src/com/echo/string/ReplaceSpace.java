package com.echo.string;

/*
 * ��Ŀ����:��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("We are student.");
		ReplaceSpace replace = new ReplaceSpace();
		String str = replace.replaceSpace(sBuffer);
		System.out.println(str);
	}
    public String replaceSpace(StringBuffer str) {
    	String temp = str.toString();
    	temp = temp.replaceAll(" ", "%20");
		return temp;   	
    }
}
