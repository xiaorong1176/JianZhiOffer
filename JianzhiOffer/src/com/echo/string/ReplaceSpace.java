package com.echo.string;

/*
 * 题目描述:请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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
