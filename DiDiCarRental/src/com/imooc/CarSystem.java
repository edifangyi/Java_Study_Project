package com.imooc;

import java.security.Provider.Service;
import java.util.Scanner;

public class CarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = {
				new SmallCars("奥迪A4", 5, 0, 500),
				new SmallCars("宝马i3", 5, 0, 400),
				new SmallCars("大众XL1", 5, 0, 600),
				new MediumCars("宝骏730", 8, 1, 800),
				new MediumCars("奔驰R级", 8, 1, 850),
				new MediumCars("别克GL8", 9, 1, 900),
				new LargeCars("北汽幻速H6", 15, 3, 1300),
				new LargeCars("柯斯达", 18, 4, 2100),
				new LargeCars("金杯海狮", 25, 5.5, 2850),
				new Pickup("XXX", 5, 5.5, 820),
				new Pickup("雄师F16", 5, 6, 870),
				new Pickup("坦途", 6, 8, 1000),
				};
		int[] nums = new int[cars.length];
		for (int i = 0; i < nums.length; i++){
			nums[i] = 0;
		}
		
		
		
		//系统流程
		System.out.println("*******欢迎来到滴滴打车系统*******");
		System.out.println("您是否需要租车：1:是     0:否");
		Scanner input = new Scanner(System.in);
		int Service_Code1 = input.nextInt();	//获取用户输入的代码并保存变量中
		
		
		
		if(Service_Code1 == 0) {
			System.out.println("谢谢使用答答租车");
			return;
		} else {
			System.out.println("您可租车的类型及其价格目表：");
			System.out.println("序号\t汽车名称\t租金(日)\t容量");
			CarSystem sys = new CarSystem();
			for(int i=0; i < cars.length; i++) {
				System.out.print(i+1 + ".\t");
				sys.showCarMessage(cars[i]);
				System.out.println();
			}
			
			
			System.out.println("请输入您要租汽车的数量：");
			int num = input.nextInt();
			for(int i = 0; i < num; i++){
				System.out.println("请输入第"+(i+1)+"辆车的序号：");
				int index = input.nextInt();
				nums[index-1]++;
			}
			
			System.out.println("请输入租车天数：");
			int days = input.nextInt();
			
			
			/**特效************************************************/
			System.out.print("系统正在为您生成账单·");
			try {
				Thread.sleep(300);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.print("·");
			try {
				Thread.sleep(300);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.println("·");
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.println("账单生成成功");
			/****************************************************/
			
			//统计账单
			System.out.println("\n您的账单：");
			System.out.println("*******可载人的车有：*******");
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
			System.out.println("共载人：" + totalpeople + "人");
			

			double totalvolume = 0;
			System.out.println("*******可载货的车有：*******");

			for(int i = 0; i < cars.length; i++){
				if(( (cars[i] instanceof MediumCars)
						|| (cars[i] instanceof LargeCars)
						|| (cars[i] instanceof Pickup)) && nums[i] > 0){

					System.out.println(cars[i].getName() + ":" + nums[i]);
					totalvolume += (nums[i] * cars[i].getVolume());
				}

			}
			System.out.println("共载货：" + totalvolume + "吨");
			
			double totalMoney = 0;
			for(int i = 0; i < cars.length; i++){
				if(nums[i] > 0){
				totalMoney += (cars[i].getMoney() * nums[i]);
				}
			}
			totalMoney *= days;
			System.out.println("*******租车总价格：    *******");
			System.out.print(totalMoney +"元");
		}
	}

	
	public void showCarMessage(Car car){
		System.out.print(car.name + "\t" + car.money + "\t");
		if (car instanceof SmallCars){
			System.out.print("载人："+car.getPeople()+"人");
		}else if(car instanceof MediumCars){
			System.out.print("载人："+car.getPeople()+"人"+ "\t载货：" + car.getVolume() + "吨");
		}else if(car instanceof LargeCars){
			System.out.print("载人："+car.getPeople()+"人"+ "\t载货：" + car.getVolume() + "吨");
		}else if(car instanceof Pickup) {
			System.out.print("载人："+car.getPeople()+"人"+ "\t载货：" + car.getVolume() + "吨");
		}
	}
}
