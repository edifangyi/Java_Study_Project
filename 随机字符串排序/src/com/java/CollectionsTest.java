package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	/* @author FAN
	 * 1.创建完List<String>之后，往其中添加十条随机字符串
	 * 2.每条字符串的长度为10以内的随机整数
	 * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
	 * 4.每条随机生成的字符串不可重复
	 */
	/**
	 * 随机生成--随机指定长度的字符串
	 */
	 public String RandomString(int length)
	 {
		  //定义一个包括所有字符的‘全字符变量’，方便随机生成字符串时从此变量中取字符
		  String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		  Random random = new Random();
		  StringBuffer sb = new StringBuffer();	
		  //生成指定长度k的字符串：依次从全字符变量随机取字符组成新的字符串
		  for(int i = 0 ;i < length ; i ++)
		  {
			  int num = random.nextInt(62); 			  
		      sb.append(str.charAt(num));
		  }				  	  
		  return sb.toString(); 
	 }
	
	public void testSort(){
		List<String>stringList=new ArrayList<String>();
		Random random=new Random();
		String string;
		for(int i=0;i<10;i++){//随机生成10个字符串		
			int k;
			//随机生成该字符串的长度（10以内但非0）
			do {
			    k=random.nextInt(10);
			}while(k<1);
			
			//生成指定长度k的字符串并判断stringList中是否已存在
			do {
				string =this.RandomString(k);
			} while (stringList.contains(string));			
			//将生成的字符串添加至stringList中存放
			stringList.add(string);
			System.out.println("将要添加字符串：'"+string+"'");
		}
		System.out.println("--------------排序前-----------------");
		//
		for (String string1 : stringList) {
			System.out.println("元素："+string1);
		}
		Collections.sort(stringList);
		System.out.println("---------------排序后----------------");
		for (String string1 : stringList) {
			System.out.println("元素："+string1);
		}
	}
	public static void main(String[] args) {
		CollectionsTest ct=new CollectionsTest();
		ct.testSort();
	}

}
