package com.imooc;

import java.security.Provider.Service;
import java.util.Scanner;

public class CarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = {
				new SmallCars("�µ�A4", 5, 0, 500),
				new SmallCars("����i3", 5, 0, 400),
				new SmallCars("����XL1", 5, 0, 600),
				new MediumCars("����730", 8, 1, 800),
				new MediumCars("����R��", 8, 1, 850),
				new MediumCars("���GL8", 9, 1, 900),
				new LargeCars("��������H6", 15, 3, 1300),
				new LargeCars("��˹��", 18, 4, 2100),
				new LargeCars("�𱭺�ʨ", 25, 5.5, 2850),
				new Pickup("XXX", 5, 5.5, 820),
				new Pickup("��ʦF16", 5, 6, 870),
				new Pickup("̹;", 6, 8, 1000),
				};
		int[] nums = new int[cars.length];
		for (int i = 0; i < nums.length; i++){
			nums[i] = 0;
		}
		
		
		
		//ϵͳ����
		System.out.println("*******��ӭ�����εδ�ϵͳ*******");
		System.out.println("���Ƿ���Ҫ�⳵��1:��     0:��");
		Scanner input = new Scanner(System.in);
		int Service_Code1 = input.nextInt();	//��ȡ�û�����Ĵ��벢���������
		
		
		
		if(Service_Code1 == 0) {
			System.out.println("ллʹ�ô���⳵");
			return;
		} else {
			System.out.println("�����⳵�����ͼ���۸�Ŀ��");
			System.out.println("���\t��������\t���(��)\t����");
			CarSystem sys = new CarSystem();
			for(int i=0; i < cars.length; i++) {
				System.out.print(i+1 + ".\t");
				sys.showCarMessage(cars[i]);
				System.out.println();
			}
			
			
			System.out.println("��������Ҫ��������������");
			int num = input.nextInt();
			for(int i = 0; i < num; i++){
				System.out.println("�������"+(i+1)+"��������ţ�");
				int index = input.nextInt();
				nums[index-1]++;
			}
			
			System.out.println("�������⳵������");
			int days = input.nextInt();
			
			
			/**��Ч************************************************/
			System.out.print("ϵͳ����Ϊ�������˵���");
			try {
				Thread.sleep(300);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.print("��");
			try {
				Thread.sleep(300);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.println("��");
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.println("�˵����ɳɹ�");
			/****************************************************/
			
			//ͳ���˵�
			System.out.println("\n�����˵���");
			System.out.println("*******�����˵ĳ��У�*******");
			int totalpeople= 0;
			for(int i = 0; i < cars.length; i++){
				if(((cars[i] instanceof SmallCars) 
						|| (cars[i] instanceof MediumCars)
						|| (cars[i] instanceof LargeCars)
						|| (cars[i] instanceof Pickup)) && nums[i] > 0) {
					System.out.println(cars[i].getName() + ":" + nums[i]);
					totalpeople += (nums[i] * cars[i].getPeople());
				}
			}
			System.out.println("�����ˣ�" + totalpeople + "��");
			

			double totalvolume = 0;
			System.out.println("*******���ػ��ĳ��У�*******");

			for(int i = 0; i < cars.length; i++){
				if(( (cars[i] instanceof MediumCars)
						|| (cars[i] instanceof LargeCars)
						|| (cars[i] instanceof Pickup)) && nums[i] > 0){

					System.out.println(cars[i].getName() + ":" + nums[i]);
					totalvolume += (nums[i] * cars[i].getVolume());
				}

			}
			System.out.println("���ػ���" + totalvolume + "��");
			
			double totalMoney = 0;
			for(int i = 0; i < cars.length; i++){
				if(nums[i] > 0){
				totalMoney += (cars[i].getMoney() * nums[i]);
				}
			}
			totalMoney *= days;
			System.out.println("*******�⳵�ܼ۸�    *******");
			System.out.print(totalMoney +"Ԫ");
		}
	}

	
	public void showCarMessage(Car car){
		System.out.print(car.name + "\t" + car.money + "\t");
		if (car instanceof SmallCars){
			System.out.print("���ˣ�"+car.getPeople()+"��");
		}else if(car instanceof MediumCars){
			System.out.print("���ˣ�"+car.getPeople()+"��"+ "\t�ػ���" + car.getVolume() + "��");
		}else if(car instanceof LargeCars){
			System.out.print("���ˣ�"+car.getPeople()+"��"+ "\t�ػ���" + car.getVolume() + "��");
		}else if(car instanceof Pickup) {
			System.out.print("���ˣ�"+car.getPeople()+"��"+ "\t�ػ���" + car.getVolume() + "��");
		}
	}
}
