基础核心 Java SE  面向对象 API JVM
企业	 Java EE  JSP EJB 服务
		 JAva ME  移动设备 游戏 通信

JVM( Java Virtual Machine ) ：跨平台通过 JVM实现的

	源文件(.java) → 编译器(compiler) → 字节码文件(.class) → 解释器(interpreter)
/**
 
 */

1.认识Java标识符

	标识符可以由字母、数字、下划线（_）、美元符（$）组成，但不能包含 @、%、空格等其它特殊字符，不能以数字开头。譬如：123name 就是不合法滴

2.  标识符不能是 Java 关键字和保留字（ Java 预留的关键字，以后的升级版本中有可能作为关键字），但可以包含关键字和保留字。如：不可以使用 void 作为标识符，但是 Myvoid 可以

3.  标识符是严格区分大小写的。 所以涅，一定要分清楚 imooc 和 IMooc 是两个不同的标识符哦！

4.  标识符的命名最好能反映出其作用，做到见名知意。



//////////////////////////////////////////////////////////////////////////////////////////////////////////////

5.Java 语言是一种强类型语言。通俗点说就是，在 Java 中存储的数据都是有类型的，而且必须在编译时就确定其类型。 

		 String     name="爱慕课";
		 char     sex='男';
		 int     num=18;
		 double     price=120.5;
		 boolean     isOK=true;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

6.Java 中变量的使用规则

	1、Java 中的变量需要先声明后使用
	2、变量使用时，可以声明变量的同时进行初始化，也可以先声明后赋值
	3、变量中每次只能赋一个值，但可以修改多次
	4、main 方法中定义的变量必须先赋值，然后才能输出

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

7.Java 中的强制类型转换
		double heightAvg1=176.2;
		int heightAvg2=(int)heightAvg1;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

8.Java 常量
	语法：final 常量名 = 值;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

9.Java 数组

		// 定义一个数组，保存五名学生的成绩
		int[] scores = { 78, 93, 97, 84, 63 };

		// 输出数组中的第二个成绩
		System.out.println("数组中的第2个成绩为：" +   scores[1]         );
	1、 声明数组

	语法：  数据类型[ ] 数组名；
 				
 		int[] scores;
 		double height[];
 		String[] name;
	
	或者   数据类型 数组名[ ]；
    
    2、 分配空间

	简单地说，就是指定数组中最多可存储多少个元素

	语法：  数组名 = new  数据类型 [ 数组长度 ];   

 		int[] scores =  new String[5];  

	
	4、 处理数组中数据
 		int[] scores={1,2,3,4,5};	//创建一个长为4的整形数组
 	等价
 		int scores = new int[]{1,2,3,4,5}; //中括号中必须要为空，不能指定长度、


//////////////////////////////////////////////////////////////////////////////////////////////////////////////

10.使用循环操作 Java 中的数组

		// 定义一个长度为 3 的字符串数组，并赋值初始值
		String[] hobbys = { "sports", "game", "movie" };
		System.out.println("循环输出数组中元素的值：");
		
		// 使用循环遍历数组中的元素
		for(int i = 0; i <hobbys.length; i++) {
    	    System.out.println(hobbys[i]);
		}

	1. 数组名.length  用于获取数组的长度
	2. 数组下标的范围是 0 至 数组长度-1 ，如果越界访问，就会报错

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
11.使用 Arrays 类操作 Java 中的数组

	Arrays 类是 Java 中提供的一个工具类，在 java.util 包中。
	该类中包含了一些方法用来直接操作数组，比如可直接实现数组的排序、搜索等

		// 定义一个字符串数组
		String[] hobbys = { "sports", "game", "movie" };
			

		1、 排序

			语法：  Arrays.sort(数组名);

			可以使用 sort( ) 方法实现对数组的排序，只要将数组名放在 sort( ) 方法的括号中，就可以完成对该数
			组的排序（按升序排列），如：

				// 使用Arrays类的sort()方法对数组进行排序
				Arrays.sort(hobbys);


		2、 将数组转换为字符串

			语法：  Arrays.toString(数组名);

			可以使用 toString( ) 方法将一个数组转换成字符串，该方法按顺序把多个数组元素连接在一起，多个元素之
			间使用逗号和空格隔开，如：
			        

				// 使用Arrays类的toString()方法将数组转换为字符串并输出
				System.out.println( Arrays.toString(hobbys);




Arrays类应用

				Arrays 类是 Java API 中提供的类，在 java.util 包中， Arrays类中提供的方法可直接实现数组的排序、搜索等。常用方法如下：
				1、toString
				转换数组：将指定数组内容转换为字符串形式
				2、fill
				给数组赋值：通过fill方法。
				3、sort
				对数组排序：通过sort方法，默认按升序。
				4、equals
				比较数组：通过equals方法比较数组中元素值是否相等。
				5、binarySearch
				二分查找：使用二分搜索法来搜索指定数组的范围
				 
				示例代码：
				import java.util.Arrays;
				public class HelloWorld {
				    public static void main(String[] args) {
				       int[] array = new int[5];
				       // 填充数组
				       /* Arrays.fill（ a1, value ）;
				         作用：填充 a1 数组中的每个元素都是value
				       */
				       Arrays.fill(array, 5);
				       System.out.println("填充数组：Arrays.fill(array, 5)：");
				       System.out.println(Arrays.toString(array));
				 
				       // 将数组的第3和第4个元素赋值为8
				       /* Arrays.fill（ a1, fromIndex, toIndex,value）;
				         作用：填充 a1 数组中的从索引为 fromIndex 开始到索引为 toIndex-1 为止每个元素都是 value
				       */
				       Arrays.fill(array, 2, 4, 8);
				       System.out.println("将数组的第2和第3个元素赋值为8：Arrays.fill(array, 2, 4, 8)：");
				       System.out.println(Arrays.toString(array));
				      
				       int[] array1 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };
				       // 对数组的第3个到第7个进行排序
				       /* Arrays.sort（ a1, fromIndex, toIndex）;
				         作用：对 a1 数组中的从索引为 fromIndex 开始到索引为 toIndex-1 为止每个元素排序
				       */
				       Arrays.sort(array1, 2, 7);
				       System.out.println("对数组的第2个到第6个元素进行排序：Arrays.sort(array,2,7)：");
				       System.out.println(Arrays.toString(array1));
				 
				       // 对整个数组进行排序
				       Arrays.sort(array1);
				       System.out.println("对整个数组进行排序：Arrays.sort(array1)：");
				       System.out.println(Arrays.toString(array1));
				 
				       // 比较数组元素是否相等
				       System.out.println("比较数组元素是否相等:Arrays.equals(array, array1):" + "\n"
				              + Arrays.equals(array, array1));
				       int[] array2 = array1.clone();
				       System.out.println("克隆后数组元素是否相等:Arrays.equals(array1, array2):" + "\n"
				              + Arrays.equals(array1, array2));
				 
				       // 使用二分搜索算法查找指定元素所在的下标（必须是排序好的，否则结果不正确）
				       Arrays.sort(array1);
				       System.out.println("元素3在array1中的位置：Arrays.binarySearch(array1, 3)："
				              + "\n" + Arrays.binarySearch(array1, 3));
				 
				       // 如果不存在就返回负数
				       System.out.println("元素9在array1中的位置：Arrays.binarySearch(array1, 9)："
				              + "\n" + Arrays.binarySearch(array1, 9));
				    }
				}
				 
				运行结果：
				填充数组：Arrays.fill(array, 5)：
				[5, 5, 5, 5, 5]
				将数组的第2和第3个元素赋值为8：Arrays.fill(array, 2, 4, 8)：
				[5, 5, 8, 8, 5]
				对数组的第2个到第6个元素进行排序：Arrays.sort(array,2,7)：
				[7, 8, 2, 3, 3, 6, 12, 5, 4]
				对整个数组进行排序：Arrays.sort(array1)：
				[2, 3, 3, 4, 5, 6, 7, 8, 12]
				比较数组元素是否相等:Arrays.equals(array, array1):
				false
				克隆后数组元素是否相等:Arrays.equals(array1, array2):
				true
				元素3在array1中的位置：Arrays.binarySearch(array1, 3)：
				1
				元素9在array1中的位置：Arrays.binarySearch(array1, 9)：
				-9



//////////////////////////////////////////////////////////////////////////////////////////////////////////////

12.使用 foreach 操作数组

	foreach 并不是 Java 中的关键字，是 for 语句的特殊简化版本，在遍历数组、集合时，
	foreach 更简单便捷。从英文字面意思理解 foreach 也就是“ for 每一个”的意思，

	for( 元素类型 元素变量:遍历对象) {
		执行的代码
	}
        
			// 定义一个整型数组，保存成绩信息
			int[] scores = { 89, 72, 64, 58, 93 };
	        
			// 对Arrays类对数组进行排序
			Arrays.sort(scores);
	        
			// 使用foreach遍历输出数组中的元素
			for ( int scores :scores ) {
				System.out.println(score);
			}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

13.Java 中的二维数组
	
	
	1.声明数组并分配空间

		数据类型[][] 数组名 = new 数据类型[行][列];

		数据类型[][] 数据名;
		数组名 = new 数据类型[行][列];

	2.赋值

		二维数组的赋值，和一维数组类似，可以通过下标来逐个赋值，注意索引从 0 开始	

		数据类型[][] 数组名 = { {值1，值2···},{值11，值22···},{值21，值22···}};



	3、 处理数组
		// 定义两行三列的二维数组并赋值
		names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
                 
		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i < numes.length    ; i++) {
            
			for (int j = 0; j < names[i].length; j++) {
                
				System.out.println( numes[i][j] );
			}
            
			System.out.println();
		}

	4.	
		需要了解的：在定义二维数组时也可以只指定行的个数，然后再为每一行分别指定列的个数。
		如果每行的列数不同，则创建的是不规则的二维数组，如下所示：


		int[][] num = new int[3][]; //定义一个三行的二维数组
		num[0] = new int[2];	//为第一行分配两列
		num[1] = new int[3];	//为第二行分配三列
		num[2] = new int[4];	//为第三行分配四列

		num[0][0] = 1;	//第一行第一列赋值1
		num[1][1] = 2;	//第二行第二列赋值2
		num[2][2] = 3;	//第三行第四列赋值3

/**
 
 */

14.如何定义 Java 中的方法

	所谓方法，就是用来解决一类问题的代码的有序组合，是一个功能模块。

	一般情况下，定义一个方法的语法是：

	访问修饰符 返回值类型 方法名（参数列表）{
		方法体；
	}

	其中：

	1、 访问修饰符：方法允许被访问的权限范围， 可以是 public、protected、private 甚至可以省略 ，其中 public 表示该方法可以被其他任何代码调用，其他几种修饰符的使用在后面章节中会详细讲解滴

	2、 返回值类型：方法返回值的类型，如果方法不返回任何值，则返回值类型指定为 void ；如果方法具有返回值，则需要指定返回值的类型，并且在方法体中使用 return 语句返回值

	3、 方法名：定义的方法的名字，必须使用合法的标识符

	4、 参数列表：传递给方法的参数列表，参数可以有多个，多个参数间以逗号隔开，每个参数由参数类型和参数名组成，以空格隔开 

	根据方法是否带参、是否带返回值，可将方法分为四类：

	Ø 无参无返回值方法

	Ø 无参带返回值方法

	Ø 带参无返回值方法

	Ø 带参带返回值方法

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

15.Java 中无参无返回值方法的使用

	如果方法不包含参数，且没有返回值，我们称为无参无返回值的方法。

	方法的使用分两步：

	第一步，定义方法

	例如：下面代码定义了一个方法名为 show ，没有参数，且没有返回值的方法，执行的操作为输出 “ welcome to imooc. ”

		public void show() {
			XXX;
		}

	注意哦：

	1、 方法体放在一对大括号中，实现特定的操作

	2、 方法名主要在调用这个方法时使用，需要注意命名的规范，一般采用第一个单词首字母小写，其它单词首字母大写的形式

	第二步，调用方法

	当需要调用方法执行某个操作时，可以先创建类的对象，然后通过  对象名.方法名();  来实现（关于类和对象的概念在后面章节中会详细讲解滴，先熟悉语法，表着急哦~~）

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

16.Java 中无参带返回值方法的使用

	public int calSum() {
		int sum=0;
		return sum;
	}

	在 calSum( ) 方法中，返回值类型为 int 类型，因此在方法体中必须使用 return 返回一个整数值。

	调用带返回值的方法时需要注意，由于方法执行后会返回一个结果，因此在调用带返回值方法时一般都会接收其返回值并进行处理。如：

	
	1、 如果方法的返回类型为 void ，则方法中不能使用 return 返回值！
	2、 方法的返回值最多只能有一个，不能返回多个值
	3、 方法返回值的类型必须兼容，例如，如果返回值类型为 int ，则不能返回 String 型值

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

17.Java 中带参无返回值方法的使用

	1、 调用带参方法时，必须保证实参的数量、类型、顺序与形参一一对应
	2、 调用方法时，实参不需要指定数据类型，如 
	3、 方法的参数可以是基本数据类型，如 int、double 等，也可以是引用数据类型，如 String、数组等
	4、 当方法参数有多个时，多个参数间以逗号分隔

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

18.Java 中方法的重载
	
	如果同一个类中包含了两个或两个以上方法名相同、方法参数的个数、顺序或类型不同的方法，则称为方法的重载，也可称该方法被重载了。

	判断方法重载的依据：

1、 必须是在同一个类中

2、 方法名相同

3、 方法参数的个数、顺序或类型不同

4、 与方法的修饰符或返回值没有关系


/**
 
 */

1.如何定义一个类：
	1.类的重要性：所有java程序都是以类class为组织单元的，是基本元素。
	2.类是模子，确定对象将会拥有什么样的特征（属性）和行为（方法）。先有类才能够描述具体对象。
	3.类的组成：属性和方法
	4.定义一个类的顺序：
		a.定义类名：
			publi class 类名 {
				内容
			}
			class是定义类的关键字。

		b.编写类的属性：在{}内定义不同的属性类型，可以是一种可以是N种。

		c.编写类的方法：可以多种行为，可以一种。

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	使用对象的步骤：
	1. 创建对象：
		类名 对象名 = new 类名();

		Telphone phone = new Telphone;


	2.使用对象

		引用对象的属性：对象名.属性
		phone.screen = 5;//给screen属性赋值5

		引用对象的方法：对象名.方法名()
		phone.sendMessage();//调用sendMessgae()方法


	package com.imooc;

	public class InitailTelphone {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Telphone phone = new Telphone();
			phone.sendMessaage();
			//给实例变量赋值
			phone.screen = 5.0f;
			phone.cpu = 1.4f;
			phone.mem = 2.0f;
			//条用对象谢谢的方法；
			phone.sendMessaage();
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

2.
	成员变量：在类中定义，用来描述对象将要有什么（属性）。可被本类方法和其他跟当前类有关系的方法使用。
	局部变量：在类的方法中定义，在方法中临时保存数据。（只能在当前的方法中使用）
	
	区别：
	1.作用域不同：局部变量的作用域仅限于定义它的方法，成员变量的作用域在整个类内部都是可见的。
	2.初始值不同：java会给成员变量一个初始值，java不会给局部变量赋予初始值。
	3.在同一个方法中，不允许有同名局部变量；在不同的方法中，可以有同名局部变量。
	4.全局变量和局部变量同名时，局部变量具有更高的优先级。


	package com.imooc;

	public class Telphone {
		//属性（成员变量）有什么
		float screen;
		float cpu;
		float mem;
		
		int var;//成员变量
		//方法 干什么
		void call() {
			int var = 30；//优先使用局部变量，输出30
			int localVar = 0;//局部变量
			System.out.println("localVar: " + localVar);
			System.out.println("var: " + var);
			System.out.println("Telphone有打电话的功能！");
		} 
		void sendMessaage() {
			int localVar = 10;//局部变量
			System.out.println("var: " + var);
			System.out.println("screen: "+ screen +" CPU: "+cpu+" mem: "+mem+" Telphone有发短信的功能！");
		}
	 }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////

3.构造方法：

	1.使用new+构造方法=创建新对象
	
	2.用于定义类中初始化对象的方法
	（构造也是方法的一种）
	
	3.与类同名且没有返回值
		
		public 构造方法名() {	//没有返回值类型
								//与类名相同
			//初始化代码		//可以指定参数
		}

	4.语法格式：

		public 构造方法名(可以指定参数){
			初始化代码
		}
	
	5.特点：
		a.如果没有指定构造方法，系统默认添加无参方法
		b.如果指定了构造方法，就按照指定的添加
	
	6.构造方法也有重载（根据参数决定使用哪个方法）
	
	7.构造方法中可以加入适当的判断，避免赋值不恰当
	
	通过有参构造方法创建对象，并给对象中的实例变量赋初始值
	
	Telphone phone2=new Telphone(值1，值2，值3);
	
	当有指定构造方法，无论是有参，还是无参的构造方法，都不会自动添加无参的构造方法
	构造方法的重载：方法名相同，但参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法


4.无参构造方法的使用
	main():
		Telphone phone = new Telphone();
	class Telphone:
		public Telphone() {
			System.out.println("Telphone无参构造方法执行了");
		}


5.有参的构造方法使用
	main():
		Telphone phone = new Telphone(4.0f, 2.0f, 2.0f);
	class Telphone:
		public Telphone(float newSceen, float newCpu, float newMem) {
			screen = newSceen;
			cpu = newCpu;
			mem = newMem;
			System.out.println("Telphone有参构造方法执行了");
		}






		package com.imooc;

		public class Telphone {
			float screen;
			float cpu;
			float mem;

			public Telphone() {
				System.out.println("无参的构造方法执行了");
			}
			
			public Telphone(float newSceen, float newCpu, float newMem) {
				if(newSceen < 3.5f){
					System.out.println("数值不符合，自动赋值3.5f");
					screen = 3.5f;
				} else {
					screen = newSceen;
				}
				cpu = newCpu;
				mem = newMem;
				System.out.println("you参的构造方法执行了");
			}
		}


		package com.imooc;

		public class InitailTelphone {

			public static void main(String[] args) {
				// TODO Auto-generated method stub、
				//通过无参的构造方法可以创建对象
				Telphone phone1 = new Telphone();
				//通过又参的构造方法也可以创建对象，并且可以给对象实例变量赋值
				Telphone phone2 = new Telphone(3.0f, 2.0f, 2.0f);
			}

		}


/**
 
 */


4.Java 中的 static 使用之静态变量

	1.Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，即被类的所有对象所共享。
		静态成员可以使用类名直接访问，也可以使用对象名进行访问。当然，鉴于他作用的特殊性更推荐用类名访问~~
	
	2.
		static StringBuilder hobby = "AAA";
		
		//静态变量 可以直接使用类名访问，无序创建类的对象
		HelloWorld.hobby;

		//创建类的对象
		HelloWorld hello = new HelloWorld();
		//使用对象名来访问静态变量
		hello.hobby;

		//使用对象名的形式修改静态变量值
		hello.hobby = "BBB";

		//在此使用类名访问静态变量，值已经被修改
		HelloWorld.hobby;//输出 BBB
	

	要注意哦：静态成员属于整个类，当系统第一次使用该类时，就会为其分配内存空间直到该类被卸载才会进行资源回收！~~

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

5.Java 中的 static 使用之静态方法

	public class HelloWorld {
		//使用 static 关键字 声明静态方法
		public static void print() {
			;
		}

		public static void main(String[] args) {
			//直接使用类名调用静态方法
			HelloWorld.println();

			//通过对象名调用，当然更推荐类名调用的方式
			HelloWorld hello = new HelloWorld();
			hello.print();
		}
	}



	需要注意：

	1、 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员。如：

			public class HelloWorld {
				String name = "AAA"; //非静态变量name;
				static String hobby = "BBB"; //静态变量 hobby

				//在静态方法调用非静态变量
				public static void print() {
					name;//不能直接调用
					hobby;//可以直接调用静态变量
				}
			}
			

		如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量。如
			public static void print() {		
				HelloWorld hello = new HelloWorld();				
				hello.name;
			}

	2、 在普通成员方法中，则可以直接访问同类的非静态变量和静态变量，

			public void show() {		
				name;
				hobby;
			}

	3、 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法。如：

			//普通成员方法
			public void show() {
				;
			}
			//静态方法
			public static void print() {
				;
			}
			public static void main(String[] args) {
				//普通成员方法通过对象调用
				HelloWorld hello = new HelloWorld();
				hello.show();

				//可以直接调用静态方法
				print();
			}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

6.Java 中的 static 使用之静态初始化块

	public class HelloWorld {
	    
	    String name; // 声明变量name
		String sex; // 声明变量sex
		static int age;// 声明静态变量age
	    
	    // 构造方法
		public HelloWorld() { 
			System.out.println("通过构造方法初始化name");
			name = "tom";
		}
	    
	    // 初始化块
		{ 
			System.out.println("通过初始化块初始化sex");
			sex = "男";
		}
	    
	    // 静态初始化块
		static { 
			System.out.println("通过静态初始化块初始化age");
			age = 20;
		}
	    
		public void show() {
			System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
		}
	    
		public static void main(String[] args) {
	        
	        // 创建对象
			HelloWorld hello = new HelloWorld();
			// 调用对象的show方法
	        hello.show();
		}
	}

	1.	在类的声明中，可以包含多个初始化块，当创建类的实例时，就会依次执行这些代码块。
		如果使用 static 修饰初始化块，就称为静态初始化块。

	2.	静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。

	3.	程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。
		由于静态初始化块只在类加载时执行一次，所以当再次创建对象 hello2 时并未执行静态初始化块。


		public class HelloWorld {
			int num1;//声明变量num1
			int num2;//声明变量num2
			static int num3;//声明静态变量num3
			public HelloWorld() {//构造方法
				num1 =91;
				System.out.println("通过构造方法为变量num1赋值");
			}
			{
				//初始化块
				num2 = 74；
				System.out.println("通过初始化块为变量num2赋值");
			}
			static {
				num3 = 83;
				System.out.println("通过静态初始化块为静态变量num3赋值");
			}
			public static void main(String[] args) {
				HelloWorld hello = new HelloWorld();
				System.out.println("num1:" + hello.num1);
				System.out.println("num2:" + hello.num2);
				System.out.println("num3:" + num3);
				HelloWorld hello2 = new HelloWorld();
			}
		}

		输出：
			通过静态初始化块为静态变量num3赋值
			通过初始化块为变量num2赋值
			通过构造方法为变量num1赋值
			num1:91
			num2:74
			num3:83
			通过构造方法为变量num2赋值
			通过构造方法为变量num1赋值



/**
 
 */
封装：将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问。

好处：
	1、只能通过规定的方法访问数据。
	2、隐藏类的实例细节，方便修改和实现


封装的步骤：

	1、修改属性的可见性，设为 private
	2、创建个 getter/setter 方法用于属性的读写
	3、在 getter/setter 方法中加入属性控制语句，对属性值的合法性进行判断
	

	众所周知，JAVA是面向对象的一门语言，每个对象都有各自的属性和方法．但是有的属性涉及安全因素或秘密因素不能让外面的程序调用，所以就用到了private,
	经过它定义的变量只能在此对象内部调用，外部程序就无法调用，也就是说只能供其自身调用.

java中的包

	1.包的作用：
		管理java文件
		解决同名文件冲突

	2.定义包：package包名
		注：必须放在java源程序的第一行
		包名间可以使用"."号隔开
		eg:com.imooc.MyClass

	3.系统中的包
		java.(功能).(类)
		java.lang.(类)包含java语言基础的类
		java.util.(类)包含java语言中各类工具类
		java.io.(类)包含输入、输出相关功能的类

	4.包的使用
		1）可以使用import关键字，在某个文件使用其他文件中的类。
		import com.imooc.music.MyClass
		2）java中，包的命名规范是全小写字母拼写
		3）使用的时候不但可以加载某个包下的所有文件
		eg：com.imooc.*
		也可以加载某个具体子包下的所有文件
		eg:com.imooc.music.*


//////////////////////////////////////////////////////////////////////////////////////////////////////////////

2.Java 中的访问修饰符

	public-------任何地方的访问
	protected----同类、同包、子类
	默认(没写)---同类、同包
	private------同类

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

3.Java 中的 this 关键字

	1. 若在Eclipse中，类里创建了private属性，这里可以利用Eclipse快捷键自动创建get set方法. 
		
		(点击Eclipse ， Sources(源码) ,下面有一个 Generatn Getters and Setters 代表自动创建入口方法)

	2.自动创建后，属性名往往与参数名相同，为了区分，就用到this关键字. this.screen代表当前对象的属性.
		
		this.方法名()则代表调用当前对象的方法.



	This关键字： 
		（1）作用：本类一个对象的引用； 

		（2）调用方式：this.属性（成员变量） this.方法（成员方法）。 

		（3）什么情况下使用：当成员变量被局部变量或方法的参数覆盖掉时，使用this关键字明确引用的是成员变量还是局部变量还是方法参数。

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

 4.什么是 Java 中的内部类 

	1.内部类（ Inner Class ）就是定义在另外一个类里面的类。与之对应，包含内部类的类被称为外部类。

	2.内部类的主要作用如下：

		1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类

		2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据

		3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便

	3.内部类可分为以下几种：

		成员内部类
		静态内部类
		方法内部类
		匿名内部类

	//外部类HelloWorld
	public class HelloWorld {
	    
	    // 内部类Inner，类Inner在类HelloWorld的内部
	    public class Inner {
	        
			// 内部类的方法
			public void show() {
				System.out.println("welcome to imooc!");
			}
		}
	    
		public static void main(String[] args) {
	        
	        // 创建外部类对象
			HelloWorld hello = new HelloWorld();
	        // 创建内部类对象
			Inner i = hello.new Inner();
	        // 调用内部类对象的方法
			i.show();
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

5.Java 中的成员内部类

	//外部类HelloWorld
	public class HelloWorld{
	    
	    //外部类的私有属性name
	    private String name = "imooc";
	    
	    //外部类的成员属性
	    int age = 20;
	    
		//成员内部类Inner
		public class Inner {
			String name = "爱慕课";
			
			int age = 30;//如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，

	        //内部类中的方法
			public void show() { 
				System.out.println("外部类中的name：" + HelloWorld.this.name );
				System.out.println("内部类中的name：" + name );
				System.out.println("外部类中的age：" + age);
			}
		}
	    
		//测试成员内部类
		public static void main(String[] args) {
	        
	        //创建外部类的对象
			HelloWorld o = new HelloWorld (); 
	        
	        //创建内部类的对象
			Inner inn =   o.new Inner()           ;
	        
	        //调用内部类对象的show方法
			inn.show();
		}
	}

	外部类中的name：imooc
	内部类中的name：爱慕课
	外部类中的age：20

	1、 外部类是不能直接使用内部类的成员和方法滴

		可先创建内部类的对象，然后通过内部类的对象来访问其成员变量和方法。

	2、 如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，

		如果要访问外部类的成员变量，可以使用 this 关键字。如：
			HelloWorld.this.age;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

6.Java 中的静态内部类

	静态内部类是 static 修饰的内部类，这种内部类的特点是：

		1、 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 

		2、 如果外部类的静态成员与内部类的成员名称相同，可通过 “ 类名.静态成员 ” 访问外部类的静态成员；
			如果外部类的静态成员与内部类的成员名称不相同，则可通过 “ 成员名 ” 直接调用外部类的静态成员

		3、 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();

	//外部类
	public class HelloWorld {
	    
	    // 外部类中的静态变量score
	    private static int score = 84;
	    
	    // 创建静态内部类
		public static class SInner {
	        // 内部类中的变量score
	        int score = 91;
	        
			public void show() {
				System.out.println("访问外部类中的score：" + HelloWorld.score );
				System.out.println("访问内部类中的score：" + score);
			}
		}

		// 测试静态内部类
		public static void main(String[] args) {
			
			// 直接创建内部类的对象
	        SInner si = new SInner();
	        // 调用show方法
			si.show();
		}
	}


	访问外部类中的score：84
	访问内部类中的score：91


//////////////////////////////////////////////////////////////////////////////////////////////////////////////


7.Java 中的方法内部类

	方法内部类
		1、定义在外部方法中。
		2、只能在本方法中使用。
		3、在方法内，内部类外声明对象，通过对象调用内部类中的方法和变量。

	//外部类
	public class HelloWorld {
	    
	    private String name = "爱慕课";
	    
	    // 外部类中的show方法
	    public void show() { 
	    	// 定义方法内部类
			class MInner {
				int score = 83;
				public int getScore() {
					return score + 10;
				}
			}
	        
			// 创建方法内部类的对象
	        MInner mi = new MInner();        
	        // 调用内部类的方法
			int newScore = mi.getScore();       
			System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
		}
	    
		// 测试方法内部类
		public static void main(String[] args) {
	        
			// 创建外部类的对象
	        
	        HelloWorld mo = new HelloWorld();
	        // 调用外部类的方法
			mo.show();
		}
	}


	姓名：爱慕课
	加分后的成绩：93

	一定要注意哦：由于方法内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用访问控制符和 static 修饰符。

/**
 
 */
Java中的继承

	1、继承就是类与类的一种关系，Java中的继承是单继承，也就是一个类只有一个父类
	
	2、继承的好处：子类拥有父类的所有属性和方法（父类属性和方法修饰符不能是private）；实现代码复用；
	
	3、语法规则：class 子类 extends 父类{...}
	
	Eclipse创建Java类的选项里，superclass可以选择父类(可能需要手动输入搜索；

		public Dog extends Animal {

		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
1.方法的重写
	如果子类对继承父类懂得方法不满意，是可以重写父类继承的方法的，当调用方法时会优先调用子类的方法

2.语法规则
	a.返回值类型
	b.方法名
	c.参数类型及个数

都要与父类继承的方法相同，才叫方法的重写


重写与重载
	1.重写必须继承， 重载不用。

	2.重写的方法名，参数数目相同，参数类型兼容， 重载的方法名相同，参数列表不同。

	3.重写的方法修饰符大于等于父类的方法， 重载和修饰符无关。

	4.重写不可以抛出父类没有抛出的一般异常，可以抛出运行时异常


//////////////////////////////////////////////////////////////////////////////////////////////////////////////

继承的初始化顺序：

	1.初始化父类再初始化子类。

	2.先执行初始化对象中的属性，再执行构造方法中的初始化。
		
		父类对象-->属性初始化--->构造方法
		子类对象-->属性初始化--->构造方法

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

final关键字： 表示“最终的”，即不可修改。
	
	final可以修饰类、方法、属性和变量

	1、修饰类：不允许被继承

	2、修饰方法：不允许被重写

	3、修饰属性：则该属性不会进行隐式初始化（不会自动初始化），需要手动初始化或者在构造方法中初始化 （但二者只能选一，即只能初始化一次后便不能更改）
	
	4、修饰变量，只能在声明的时候赋一次值，成为常量。 （static final 会使其成为全局常量）

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

在子类中使用父类的属性、方法时用super
	super.age;
	super.eat();

子类的构造过程中必须调用父类的构造方法。即先调用父类的构造方法，再执行子类的构造
	super();


1.子类的构造过程当中必须要调用其父类的构造方法。

2.如果子类的构造方法中没有显式的调用父类的构造方法，则系统默认调用父类的无参构造方法；

3.如果显式的调用父类的构造方法，则必须在子类的构造方法的第一行；

4.如果子类构造方法中没有显式的调用父类的构造方法，而父类又没有无参的构造方法，则编译出错；

/**
 
 */

Object类是所有类的父类,如果一个类没有使用extends关键字明确标识继承另外一个类,那么这个类默认继承Object类,且Object类中的方法适合所有子类

1.toString() 方法
	在Object类里面定义toString()方法的时候返回的对象的哈希code码(对象地址字符串)
	如果我们在代码里面直接输出一个对象,会输出这个对象在内存中的地址,我们把它称为哈希码,哈希码是通过哈希算法生成的一个字符串用来唯一区分对象的

	可以通过重写toString()方法表示出对象的属性

	我们经常在输出对象的时候希望得到子类的属性值,那么我们就要重写从父类继承来的toString()方法,

		eclipse中右键菜单栏-源码source-生成generate toString(),

		他就会根据我们对象的属性帮我们生成一个toString()方法来输出属性值



2.equals() 方法
	equals()----返回值是布尔类型
	
	比较的是对象的引用是否指向同一块内存地址（与==运算符相像）-------对象实例化时，即给对象分配内存空间
	
	使用方法如：dog.equals(dog2);
	
	如果是两个对象，但想判断两个对象的属性是否相同，则重写equals()方法
	
		[source菜单的generate hashCode() and equals()可快速改写equals方法]
	
		1.地址是否相同----if (this == obj)
		
		2.对象是否为空----if (obj == null)
		
		3.getClass() 可以得到类对象，判断类型是否一样-----if 
			(getClass() != obj.getClass())
			类的对象：new出来的，关注的是类的属性的具体的数据；
			类对象类的代码信息，关注的是类有什么属性和方法
		
		4.属性值是否一样----if (age != other.age)】

/**
 
 */

多态
多态指对象的多种形态
	
	1.引用多态
		
		a：父类的引用可以指向本类的对象 Animal Obj1 = new Animal(); 正确
		
		b：父类的引用可以指向子类的对象 Animal Obj2 = =new dog(); 正确
	
	注：子类的引用不可以调用父类的对象 Dog Obj3 = new Aniaml(); 错误



	2.方法的多态
		
		a：创建本类对象时，调用的方法为本类的方法
			Obj1.eat(); 父类调用本类方法
		
		b：创建子类对象时，调用的方法为子类重写的方法或者继承的方法
			Obj2.eat(); 父类调用子类方法（重写的方法）
			Obj3.eat(); 如果子类没有eat方法，则子类继承父类方法被父类调用

	注：父类引用不可以调用子类独有的方法

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		Animal obj1 = new Animal();
		Animal obj2 = new Dog();//父类的引用可以指向子类的引用

		Dog obj3 = new Animal();//错误的

		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		public class Animal {
			public void eat {
				System.out.println("动物吃东西！");
			}
		}

		public class Dog extends Animal {
			public void eat {
				System.out.println("狗吃东西");
			}
		}

		//测试类
			obj1.eat();//父类中的方法
			obj2.eat();//子类中的方法

		创建一个新子类Cat
		public class Cat extends Animal {
			//没有重写eat的方法
		}

		//测试类
			Anim obj4 = new Cat();

		 	obj4.eat();//子类继承了父类的方法

		特殊情况下多态的特性不能使用的

		在子类中添加独有的方法，，并不是从父类继承来的

		public class Dog extends Animal {
			public void eat {
				System.out.println("狗吃东西");
			}
			public void watchDoor() {
				System.out.println("狗看门");
			}
		}
		//测试类
		 obj2.watchDoor();//错误的


/**
 
 */

多态的类型转换

引用类型转换
	1.向上类型转换（隐式/自动转换类型）。是小类型到大类型的转换

	2.向下类型转换（强制类型转换），是大类型达到小类型

	3.instanceof运算符，来解决引用对象的类型，避免类型转换的安全性问题。

	//测试类
	Dog dog = nwe Dog();
	Animal animal = dog; //自动类型提升 向上类型转换
	Dog dog2 = animal;//错误，存在风险
	Dog dog2 = (Dog)animal;//向下类型转换 强制类型转换
	Cat cat = (Cat)animal; //错误，没有办法将Dog类型转换到Cat类型
							//1.编译时Cat类型
							//2.运行时Dog类型,真正开辟的内存空间是Dog类型的，运行时发

	现两个类型不匹配。
	如果无法确定能否强制转换成功，可以使用instanceof来判断

	//如果animal类型大于Cat则输出true
	if (animal instanceof Dog) {
		Dog dog2 = (Dog)animal;
	} else {
		System.out,println("无法进行转换")
	}


	if (animal instanceof Cat) {
		Cat cat = (Cat)animal;
	} else {
		System.out,println("无法进行转换")
	}

////////////////////////////////////////////////////////////////////////////////////////////////////

抽象类

a.在某些情况下，某些父类只是知道其子类应该包含怎么样的方法，但无法准确知道这些子类如何实现这些方法
	抽象类约束子类的方法
b.从多个具有相同特征的类中抽象出一个抽象类，以这个抽象类作为子类的模板，从而避免了子类设计的随意性

作用：
	限制规定子类必须实现某些方法，但不关注实现细节

使用规则：
	a.abstract 定义抽象类
	b.abstract 定义抽象方法，只有声明，不需要实现
	c.包含抽象方法的类是抽象类
	d.抽象类中可以包含普通的方法，也可以没有抽象方法
	c.抽象类不能直接创建，可以定义引用变量


//建立一个抽象类
public abstract class Telphone {
	public abstract void call(); //抽象方法没有方法体以分号结束
	public abstract void message();
}

//建一个新的CellPhone ，继承抽象类Telphone

public class CellPhone extends Telphone {
	public void call() {
		System.out.println("通过键盘来打电话");
	}

	public void message() {
		System.out.println("通过键盘来发短信");
	}
}

//建一个新的SmartPhone ，继承抽象类Telphone
public class SmartPhone extends Telphone {
	public void call() {
		System.out.println("通过语音来打电话");
	}

	public void message() {
		System.out.println("通过语音来发短信");
	}
}

//测试类
//
//抽象类的父类引用
Telphone tel1 = new CellPhone();
tel1.call();	→通过键盘来打电话
tel1.message();	→通过键盘来发短信
Telphone tel2 = new SmartPhone();
tel2.call();	→通过语音来打电话
tel2.message();	→通过语音来发短信


////////////////////////////////////////////////////////////////////////////////////////////////////







/**
 
 */







