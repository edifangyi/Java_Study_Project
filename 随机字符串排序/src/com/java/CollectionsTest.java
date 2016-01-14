package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	/* @author FAN
	 * 1.������List<String>֮�����������ʮ������ַ���
	 * 2.ÿ���ַ����ĳ���Ϊ10���ڵ��������
	 * 3.ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ����ַ������ظ�
	 * 4.ÿ��������ɵ��ַ��������ظ�
	 */
	/**
	 * �������--���ָ�����ȵ��ַ���
	 */
	 public String RandomString(int length)
	 {
		  //����һ�����������ַ��ġ�ȫ�ַ���������������������ַ���ʱ�Ӵ˱�����ȡ�ַ�
		  String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		  Random random = new Random();
		  StringBuffer sb = new StringBuffer();	
		  //����ָ������k���ַ��������δ�ȫ�ַ��������ȡ�ַ�����µ��ַ���
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
		for(int i=0;i<10;i++){//�������10���ַ���		
			int k;
			//������ɸ��ַ����ĳ��ȣ�10���ڵ���0��
			do {
			    k=random.nextInt(10);
			}while(k<1);
			
			//����ָ������k���ַ������ж�stringList���Ƿ��Ѵ���
			do {
				string =this.RandomString(k);
			} while (stringList.contains(string));			
			//�����ɵ��ַ��������stringList�д��
			stringList.add(string);
			System.out.println("��Ҫ����ַ�����'"+string+"'");
		}
		System.out.println("--------------����ǰ-----------------");
		//
		for (String string1 : stringList) {
			System.out.println("Ԫ�أ�"+string1);
		}
		Collections.sort(stringList);
		System.out.println("---------------�����----------------");
		for (String string1 : stringList) {
			System.out.println("Ԫ�أ�"+string1);
		}
	}
	public static void main(String[] args) {
		CollectionsTest ct=new CollectionsTest();
		ct.testSort();
	}

}
