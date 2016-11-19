基础核心 Java SE  面向对象 API JVM
企业	 Java EE  JSP EJB 服务
		 JAva ME  移动设备 游戏 通信

JVM( Java Virtual Machine ) ：跨平台通过 JVM实现的
JDK( Java Development Kit ) ：java开发工具包
JRE( Java Runtime Environment)：java运行环境

	源文件(.java) → 编译器(compiler) → 字节码文件(.class) → 解释器(interpreter)


"".equals(args)

/**
 
 */

1.认识Java标识符

	标识符可以由字母、数字、下划线（_）、美元符（$）组成，但不能包含 @、%、空格等其它特殊字符，不能以数字开头。譬如：123name 就是不合法滴

2.  标识符不能是 Java 关键字和保留字（ Java 预留的关键字，以后的升级版本中有可能作为关键字），但可以包含关键字和保留字。如：不可以使用 void 作为标识符，但是 Myvoid 可以

3.  标识符是严格区分大小写的。 所以，一定要分清楚 imooc 和 IMooc 是两个不同的标识符哦！

4.  标识符的命名最好能反映出其作用，做到见名知意。





5.Java 语言是一种强类型语言。通俗点说就是，在 Java 中存储的数据都是有类型的，而且必须在编译时就确定其类型。 

		 String     name="爱慕课";
		 char     sex='男';
		 int     num=18;
		 double     price=120.5;
		 boolean     isOK=true;


6.Java 中变量的使用规则

	1、Java 中的变量需要先声明后使用
	2、变量使用时，可以声明变量的同时进行初始化，也可以先声明后赋值
	3、变量中每次只能赋一个值，但可以修改多次
	4、main 方法中定义的变量必须先赋值，然后才能输出


7.Java 中的强制类型转换
		double heightAvg1=176.2;
		int heightAvg2=(int)heightAvg1;


8.Java 常量
	语法：final 常量名 = 值;


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
 		int[] scores={1,2,3,4,5};
 	等价
 		int scores = new int[]{1,2,3,4,5};



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


		
11.使用 Arrays 类操作 Java 中的数组

	Arrays 类是 Java 中提供的一个工具类，在 java.util 包中。
	该类中包含了一些方法用来直接操作数组，比如可直接实现数组的排序、搜索等

		// 定义一个字符串数组
		String[] hobbys = { "sports", "game", "movie" };
        
		// 使用Arrays类的sort()方法对数组进行排序  首字母a-z
		Arrays.sort(hobbys);
        
		// 使用Arrays类的toString()方法将数组转换为字符串并输出
		System.out.println( Arrays.toString(hobbys) );


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
			for ( int scores :scores     ) {
				System.out.println(score);
			}

13.Java 中的二维数组
	
	
	1.声明数组并分配空间

		数据类型[][] 数组名 = new 数据类型[行][列];

		数据类型[][] 数据名;
		数组名 = new 数据类型[行][列];

	2.赋值

		二维数组的赋值，和一维数组类似，可以通过下标来逐个赋值，注意索引从 0 开始	

		数据类型[][] 数组名 = {{1,2},{11,22},{21,22}};	


		// 定义两行三列的二维数组并赋值
		         names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
                 
		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i < numes.length    ; i++) {
            
			for (int j = 0; j < names[i].length; j++) {
                
				System.out.println( numes[i][j] );
			}
            
			System.out.println();
		}

	3.
		int[][] num = new int[3][]; //定义一个三行的二维数组
		num[0] = new int[2];	//为第一行分配两列
		num[1] = new int[3];	//为第二行分配三列
		num[2] = new int[4];	//为第三行分配四列

		num[0][0] = 1;	//第一行第一列赋值1
		num[1][1] = 2;	//第二行第二列赋值2
		num[2][2] = 3;	//第三行第四列赋值3


14.如何定义 Java 中的方法

	所谓方法，就是用来解决一类问题的代码的有序组合，是一个功能模块。

	一般情况下，定义一个方法的语法是：



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


17.Java 中带参无返回值方法的使用

	1、 调用带参方法时，必须保证实参的数量、类型、顺序与形参一一对应
	2、 调用方法时，实参不需要指定数据类型，如 
	3、 方法的参数可以是基本数据类型，如 int、double 等，也可以是引用数据类型，如 String、数组等
	4、 当方法参数有多个时，多个参数间以逗号分隔


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


2.
	成员变量：在类中定义，用来描述对象将要有什么（属性）。可被本类方法和其他跟当前类有关系的方法使用。
	局部变量：在类的方法中定义，在方法中临时保存数据。（只能在当前的方法中使用）
	
	区别：
	1.作用域不同：局部变量的作用域仅限于定义它的方法，成员变量的作用域在整个类内部都是可见的。
	2.初始值不同：java会给成员变量一个初始值，java不会给局部变量赋予初始值。
	3.在同一个方法中，不允许有同名局部变量；在不同的方法中，可以有同名局部变量。
	4.成员变量和局部变量同名时，局部变量具有更高的优先级。



3.构造方法：

	1.使用new+构造方法=创建新对象
	
	2.用于定义类中初始化对象的方法
	（构造也是方法的一种）
	
	3.与类同名且没有返回值
		public 构造方法名（）{

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

	        HelloWorld hello2 = new HelloWorld();
	        
		}
	}

	1.	在类的声明中，可以包含多个初始化块，当创建类的实例时，就会依次执行这些代码块。
		如果使用 static 修饰初始化块，就称为静态初始化块。

	2.	静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。

	3.	程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。
		由于静态初始化块只在类加载时执行一次，所以当再次创建对象 hello2 时并未执行静态初始化块。

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



2.Java 中的访问修饰符

	public-------任何地方的访问
	protected----同类、同包、子类
	默认(没写)---同类、同包
	private------同类



3.Java 中的 this 关键字

	1. 若在Eclipse中，类里创建了private属性，这里可以利用Eclipse快捷键自动创建get set方法. 
		
		(点击Eclipse ， sources(源码) ,下面有一个setter...代表自动创建入口方法)

	2.自动创建后，属性名往往与参数名相同，为了区分，就用到this关键字. this.screen代表当前对象的属性.
		
		this.方法名()则代表调用当前对象的方法.



	This关键字： 
		（1）作用：本类一个对象的引用； 

		（2）调用方式：this.属性（成员变量） this.方法（成员方法）。 

		（3）什么情况下使用：当成员变量被局部变量或方法的参数覆盖掉时，使用this关键字明确引用的是成员变量还是局部变量还是方法参数。



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
	外部类中的age：30

	1、 外部类是不能直接使用内部类的成员和方法滴

		可先创建内部类的对象，然后通过内部类的对象来访问其成员变量和方法。

	2、 如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，

		如果要访问外部类的成员变量，可以使用 this 关键字。如：
			HelloWorld.this.age;


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




/**
 
 */




//在方法体外，类体内声明的变量成为成员变量
public void method(){
	int i;
	int j=i+5;//编译出错，变量i还未被初始化
	double d= 3.14;
	Dog dog;
	dog = new Dog(22,7,1964);
}
//注：以上程序目前还不能编译


//4类八种基本数据类型
//逻辑类型-boolean
//文本型-char
//整数型-byte short int long
//浮点数型- float double
//
//
//boolean 类型适用于逻辑运算，一般用于程序流程控制
//boolean 类型数据只准许取值true或false，不可以0或非0的整数代替true和false，这一点和c语言不同。
//举例：
	boolean flag;
	flag=true;
	if (flag) {
		//do something
	}

//char型数据用来便是通常意义上的“字符”
//字符常量为用单引号括起来的单个字符，例如：
	char eChar='a';char cCher='中';
//java字符采用unicode编码，每个字符占用两个字节，因而可用16进制编码形式表示，
	char c1='\u0061';
//java语言还准许使用转义字符'\'来将其后的字符转义为其他含义
	char c2='\n';


public class OddSum{
	public static void main(String[] args){
		long result = 0;
		for (int i=1;i<=99;i+=2) {
			result +=i;
		}
	System.out.println("sum="+sum);
	}
}

public class Person {
	int id;
	int age = 20;

	Person(int _id,int _i) {
		id = _id;
		age = _age;
	}
	public static void main(String[] args) {
		Person tom = new Person(1,25);
		tom.Person(1,24);
		Person john = new Person(2,27);
		//Person jerry = new Person();
		Point p = new Point();
	}
}


class Point {
	Point () { }//系统默认，自己定义编译器不再添加
	int x;
	int y;
}



/////////////////////////////////////////////////////////////////////////////////////////////////////
class BirthDate {
	private int day;
	private int month;
	private int year;
	
	public BirthDate (int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	public void setDay(int d){
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYeay(int y) {
		year = y;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	public void display(){
		System.out.println(day + " - " + month + " - " + year);
	}
}

public class Test{
	public static void main(String args[]){
		Test text = new Test();
		int date = 9;
		BirthDate d1 = new BirthDate(7, 7, 1970);
		BirthDate d2 = new BirthDate(1, 1, 2000);
		text.change1(date);
		text.change2(d1);
		text.change3(d2);
		System.out.println("date=" + date);
		d1.display();
		d2.display();
	}
	
	public void change1(int i){
		i = 1234;
	}
	public void change2(BirthDate b) {
		b = new BirthDate(22, 2, 2004);
	}
	public void change3(BirthDate b) {
		b.setDay(22);
	}
}




////////////////////////////////////////////////////////////////

package import

//如果想将一个类放入包中，在这个类源文件第一句话写 package
//必须保证该类的class文件位于正确目录下
//	该类的源码可能会产生影响
//	删除或转移到另外的目录
//另外的类想访问的话
//	写全名
//	引入
//		*
//		具体类名
//	访问位于同一个包中的泪并不需要引入
//必须class文件的最上层包的父目录位于classpath下


/////////////////////////////////////////////////////////////////////

jar -cvf test.jar *.*(当前目录全部打包)


///////////////////////////////////////////////////////////////////////
///
///java中使用 extends 关键字实现类的继承机制
///
///通过继承，子类自动拥有了基类（superclass）的所有成员（成员变量和方法）
///
///java只支持单继承，不允许多继承：
///		一个子类只能有一个基类，一个基类可以派生出多个子类

class Parent{
	private int n_private = 1;
			int n_friendly = 2;
	protected int n_protected = 3;
	public int n_public = 4;
}

class Child extends Parent {
	public void f(){
		n_private = 10;
		n_friendly = 20;
		n_protected = 30;
		n_public = 40;
	}
}

////////////////////////////////////////////////////////////////////////////
///对于class的权限修饰只可以用public和default
///public 类可以在任意地方被访问
///default类只可以被同一个包内部的类访问
///

//////////////////////////////////////////////////////////////////////////////
//方法的重写
//
//在子类中可以根据需要对从基类中继承来的方法进行重写
//重写方法把必须和被重写方法具有相同方法名称、参数列表和返回类型
//重写方法不能使用比被重写方法更严格的访问权限
//
//
//
//

class Person {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getInfo(){
		return "Name: " + name + "\n" + " age: "+ age;
	}
}

class Student extends Person {
	private String school;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
//重写方法
	public String getInfo(){
		return "Name: " + getName() + "\n" + " age: "+ getAge() + "\nschool: "+ school;
	}
}

public class TestPerson {
	public static void main(String arg[]) {
		Student student = new Student();
		Person person = new Person();
		person.setName("none");
		person.setAge(1000);

		student.setName("John");
		student.setAge(18);
		student.setSchool("SCH");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getSchool());
	}
}


///////////////////////////////////////////////////////////////////////////////

//super 关键字
//在java类中使用super类引用基类的成分

class FartherClass {
	public int value;
	public void f() {
		value = 100;
		System.out.println("FartherClass.value="+value);
	}
}

class ChildClass extends FartherClass {
	public int value;
	public void f() {
		super.f();
		value = 200;
		System.out.println("ChildClass.value="+value);
		System.out.println(value);
		System.out.println(super.value);
	}
}

public class TestInherit {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.f();
	}
}



///////////////////////////////////////////////////////////////////////////////////
///继承中的构造方法
///子类的构造的过程中必须调用其基类的构造方法
///子类可以在自己的构造方法中使用super（argument_list参数列表）调用基类的构造方法
///		使用this（argument_list）调用本类的另外的构造方法
///		如果调用了super，必须写在子类构造方法的第一行
///如果子类的构造方法中没有显示地调用基类构造方法，则系统默认调用基类无参数的构造方法
///如果子类构造方法中既没有显式调用基类构造方法，而基类中又没有无参的构造方法，则编译出错
///
///
class A {
	protected void print(String s) {
		System.out.println(s);
	}
	A(){
		print("A()");
	}
	public void f() {
		print("A:f()");
	}
}

class Hollow extends A{
	Hollow() {
		print("B()");
	}
	public void f() {
		print("B:f()");
	}
	public static void main(String arg[]) {
		Hollow b = new Hollow();
		b.f();
	}
}


打印：	A()//子类的构造的过程中必须调用其基类的构造方法
		B()
		B:f()
///////////////////////////////////////////////////////////////////////////////////////////
///


Object类
如果在类的声明中未使用extends关键字指明其基类，则默认基类为Object类、
	public class Person{
		~~~~
	}
等价于
	public class Person extends Object{
		~~~~
	}
/////////////////////////////////////////////////////////////////////////////////////////////
toString方法
Object类中定义有 public String toString() 方法，其返回值是String类型,描述当前对象的有关信息

在进行String与其他类型数据的链接操作时（如：System.out.println("info" + person)）,将自动调
用该对象类的toString()方法

可以根据需要在用户自定义类型中重写toString()方法
				public String toString()



public class TsetToString{
	public static void main(String[] arge){
		Dog d = new Dog();
		Cat C= new Cat();
		System.out.println("d:" + d.toString());
		System.out.println("d:" + d.toString(3));
		System.out.println("C:" + C.toString());
	}
}

class Dog{
	public String toString() {
		return "I'm a cool Dog!";
	}
	public String toString(int c) {
		return "ggagaggagag";
	}
}

class Cat{
	public String toString() {
		return "ggagaggagag";
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////
equals方法

Object类中定义有：
	public boolean equals(Object obj)方法
		提供定义对象是否系“相等”的逻辑。

Object的equals方法定义为：x.equals(y)当x和y是同一个对象的应用时返回true否则返回false
	
J2SDK提供的一些类，，如String，Date等，重写了Object的equals方法，调用这些类equals方法
x.equals(y),当x和y所引用的对象是同一类对象属性内容相等时（并不一定是相同对象），返
回true否则返回false。


可以根据需要在用户自定义类型中重写equals方法



public class Hollow {
	public static void main(String[] arge){
		Dog d = new Dog();
		//Cat C = new Cat();
		
		Cat c1 = new Cat(1, 2, 3);
		Cat c2 = new Cat(1, 2, 6);
	//	Cat c3 = new Cat();
		
		
		System.out.println("d:" + d.toString());
		System.out.println("d:" + d.toString(3));
	//	System.out.println("C:" + C.toString());
		
		System.out.println("1: " + (c1 == c2));
		System.out.println("2: " + c1.equals(c2));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println("3: " + (s1 == s2));
		System.out.println("4: " + s1.equals(s2));
		//将此字符串与指定的对象比较。当且仅当该参数不为 null，并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。 
		
	}
}

class Dog{
	public String toString() {
		return "I'm a cool Dog!";
	}
	public String toString(int c) {
		return "ggagaggagag";
	}
}

class Cat {
	int color;
	int height, weight;
	
	public String toString() {
		return "ggagaggagag";
	}
	
	public Cat(int color, int height, int weight){
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	
//	public boolean equals(Object obj) {
//		return true;
//	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if(obj instanceof Cat) {
				Cat c = (Cat)obj;
				if(c.color == this.color && 
						c.height == this.height && 
						c.weight == this.weight) {
					return true;
				}
			}
		}
		return false;
	}
}


///////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
///
///对象转型（castiing）
///
///一个基类的引用类型变量可以“指向”其子类的对象
///
///一个基类的引用不可以访问其子类对象新增加的成员（属性和方法）
///
///可以使用 引用变量 instanceof 类名来判断该引用型变量所“指向”的对象是否属于该类或该类的子类
///
///子类的对象可以当作基类的对象来使用称作向上转型（upcasting），反之称为向下转型（downcasting）
	class Animal {
		public String name;
		Animal (String name) {
			this.name= name;
		}
	}
	class Cat extends Animal {
		public String eyesColor;
		Cat(String n, String c) {
			super(n); eyesColor = c;
		}
	}
	class Dog extends Animal {
		public String furColor;
		Dog(String n, String c) {
			super(n);
			furColor = c;
		}
	}

	public class Hollow {
	public static void main(String[] args){
		Animal a = new Animal("name");
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		
		System.out.println(a instanceof Animal);//true
		System.out.println(c instanceof Animal);//true
		System.out.println(d instanceof Animal);//true
		System.out.println(a instanceof Cat);//false
		
		a = new Dog("bigyellow", "yellow");
		System.out.println(a.name);//bigyellow
		//System.out.println(a.furname);//！error
		System.out.println(a instanceof Animal);///true/true
		System.out.println(a instanceof Dog);
		Dog d1 = (Dog)a;//强制转换
		System.out.println(d1.furColor);//yellow
	}
}




///////////////////////////////////////////////////////////////////////////////
///
class Animal {
	public String name;
	Animal (String name) {
		this.name= name;
	}
}
	class Cat extends Animal {
		public String eyesColor;
		Cat(String n, String c) {
			super(n); eyesColor = c;
		}
	}
	class Dog extends Animal {
		public String furColor;
		Dog(String n, String c) {
			super(n);
			furColor = c;
		}
	}

public class Hollow {
	public static void main(String[] args){
		Hollow hollow = new Hollow();
		
		Animal a = new Animal("name");
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		hollow.f(a);
		hollow.f(c);
		hollow.f(d);
		
//		System.out.println(a instanceof Animal);//true
//		System.out.println(c instanceof Animal);//true
//		System.out.println(d instanceof Animal);//true
//		System.out.println(a instanceof Cat);//false
//		
//		a = new Dog("bigyellow", "yellow");
//		System.out.println(a.name);//bigyellow
//		//System.out.println(a.furname);//！error
//		System.out.println(a instanceof Animal);///true/true
//		System.out.println(a instanceof Dog);
//		Dog d1 = (Dog)a;//强制转换
//		System.out.println(d1.furColor);//yellow
	}
	
	public void f(Animal a) {
		System.out.println("name:" +a.name);
		if(a instanceof Cat) {
			Cat cat = (Cat)a;
			System.out.println(" "+cat.eyesColor+" eyes");
		} else if (a instanceof Dog) {
			Dog dog = (Dog)a;
			System.out.println(" "+dog.furColor+" fur");
		}
	}
}



//////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
///
///
/动态绑定和多态   53课时
///动态绑定是指“在执行期间（而非编译期）判断所引用对象的实际类型，根据其实际的
///类型调用其对应的方法
///
class Bird extends Animal {
	private String featherColor;
	Bird (String n, String f) {
		super(n); +
		featherColor = f;
	}
	public void enjoy() {
		System.out.println("niaojiao!!!!____");
	}
}
public class Test {
	public static void main(String args[]) {
		Lady 13 = new Lady
			("13", new Bird("birdname", "green"));
			13.myPetEnjoy();	
	}
}


1:要有继承
2:要有重写
3:父类引用指向子类对象


class Animal {
	public String name;
	Animal (String name) {
		this.name= name;
	}
	
	public void enjoy() {
		System.out.println("叫声！！！！！");
	}
 }


class Cat extends Animal {
	public String eyesColor;
	Cat(String n, String c) {
		super(n); eyesColor = c;
	}
	public void enjoy() {
		System.out.println("猫咪！！！！！");
	}
}

class Dog extends Animal {
	public String furColor;
	Dog(String n, String c) {
		super(n);
		furColor = c;
	}
	public void enjoy() {
		System.out.println("小狗！！！！！");
	}
}

class Lady {
	private String name;
	private Animal pet;
	Lady(String name, Animal pet) {
		this.name = name;
		this.pet =pet;
	}
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

class Bird extends Animal {
	Bird() {
		super("bird");
	}
	public void enjoy() {
		System.out.println("鸟鸟叫声");
	}
}


public class Hollow {
	public static void main(String[] args){
		Bird b = new Bird();
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		
		Lady l1 = new Lady("11", c);
		Lady l2 = new Lady("12", d);
		Lady l3 = new Lady("13", b);
		
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
	}
}
	


///根据Lady对象的成员变量pet所引用的不同的实际类型而调用相应的enjoy方法
///
///
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
///
///
///
///
///
///
///
///
///
用 abstract 关键字来修饰一个类时，这个类叫做抽象类；
///用abstract来修饰一个方法时，该方法叫做抽象方法。
///
///
///含有抽象方法的类必须被声明为抽象类，抽象类必须被继承，抽象方法必须被重写
///抽象类不能被实例化
///抽象方法只需声明，而不需实现
///
abstract class Animal {
	public String name;
	Animal (String name) {
		this.name= name;
	}
	
//	public void enjoy() {
//		System.out.println("叫声！！！！！");
//	}
	
	public abstract void enjoy();
}


class Cat extends Animal {
	public String eyesColor;
	Cat(String n, String c) {
		super(n); eyesColor = c;
	}
	public void enjoy() {
		System.out.println("猫咪！！！！！");
	}
}

class Dog extends Animal {
	public String furColor;
	Dog(String n, String c) {
		super(n);
		furColor = c;
	}
	public void enjoy() {
		System.out.println("小狗！！！！！");
	}
}
class Lady {
	private String name;
	private Animal pet;
	Lady(String name, Animal pet) {
		this.name = name;
		this.pet =pet;
	}
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

class Bird extends Animal {
	Bird() {
		super("bird");
	}
	public void enjoy() {
		System.out.println("鸟鸟叫声");
	}
}


public class Hollow {
	public static void main(String[] args){
		Bird b = new Bird();
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		
		Lady l1 = new Lady("11", c);
		Lady l2 = new Lady("12", d);
		Lady l3 = new Lady("13", b);
		
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
	}
}
	




abstract class Animal {
	public String name;
	Animal (String name) {
		this.name= name;
	}
	
//	public void enjoy() {
//		System.out.println("叫声！！！！！");
//	}
	
	public abstract void enjoy();
}


abstract class Cat extends Animal {
	public String eyesColor;
	Cat(String n, String c) {
		super(n); eyesColor = c;
	}
//	public void enjoy() {
//		System.out.println("猫咪！！！！！");
//	}
	public abstract void enjoy();
}

class Dog extends Animal {
	public String furColor;
	Dog(String n, String c) {
		super(n);
		furColor = c;
	}
	public void enjoy() {
		System.out.println("小狗！！！！！");
	}
}
class Lady {
	private String name;
	private Animal pet;
	Lady(String name, Animal pet) {
		this.name = name;
		this.pet =pet;
	}
	public void myPetEnjoy() {
		pet.enjoy();
	}
}

class Bird extends Animal {
	Bird() {
		super("bird");
	}
	public void enjoy() {
		System.out.println("鸟鸟叫声");
	}
}


public class Hollow {
	public static void main(String[] args){
		Bird b = new Bird();
		//Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		
	//	Lady l1 = new Lady("11", c);
		Lady l2 = new Lady("12", d);
		Lady l3 = new Lady("13", b);
		
	//	l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
	}
}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
Final 关键字
final 的变量的值不能够被改变
	final 的成员变量
	final 的局部变量（形参）
final的方法不能够被重写
final的类不能够被继承



///////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
接口

多个无关的类可以实现同一个接口
一个类可以实现多个无关的接口
与继承关系类似，接口与实现类之间存在多态性

接口（interfac）是抽象方法和常量值的定义的集合

本质上讲，，接口是一种特殊的抽象类，这种抽象类中只包含常量和方法的定义，而没有变量和方法的实现

public interface Runner{
	public static final int id = 1;
	public void start();
	public void run();
	public void stop();
}


接口的特性

	接口可以多重实现

	接口中声明的属性默认为 public static final 的，也只能是 public static final 的；

	接口中只能定义抽象方法，而且这些方法默认为public的，也只能是public的；

	接口可以继承其他的接口，并添加新的属性和抽象方法

interface Singer {
	public void sing();
	public void sleep();
}

interface Painter {
	public void paint();
	public void eat();
}

class Student implements Singer {
	private String name;
	Student(String name) {
		this.name = name;
	}
	public void study() {
		System.out.println("studying");
	}
	public String getName() {
		return name;
	}
	public void sing() {
		System.out.println("student is singing");
	}
	public void sleep() {
		System.out.println("student is sleeping");
	}
}

class Teacher implements Singer, Painter {
	private String name;
	public String getString() {
		return name;
	}
	Teacher(String name) {
		this.name = name;
	}
	public void paint() {
		System.out.println("painting");
	}
	public void sing() {
		System.out.println("Teacher is singing");
	}
	public void sleep() {
		System.out.println("Teacher is sleeping");
	}
	public void eat() {
		System.out.println("Teacher is eating");
	}
}

public class Test {
	public static void main(String[] args) {
		Singer s1 = new Student("le");
		s1.sing();
		s1.sleep();
		
		Singer s2 = new Teacher("steven");
		s2.sing();
		s2.sleep();
		Painter p1 = (Painter)s2;
		p1.paint();
		p1.eat();


///可以定义一个方法
		f(Singer s) {
			s.sing();
		}
	}
}

输出：
student is singing
student is sleeping
teacher is singing
teacher is sleeping
teacher is painting
teacher is eating






//////////////////////////////////////////////////////////////////////////////


package mo;
public interface Valuable {
	public double getMoney();
}

interface Protectable {
	public void beProtected();
}

interface A extends Protectable {
	void m();
}

abstract class Animal {
	private String name;
	
	abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable, Protectable {
	public double getMoney() {
		return 100;
	}
	public void beProtected() {
		System.out.println("live in the room");
	}
	public void enjoy() {
		
	}
	
	public void test() {
		Valuable v = new GoldenMonkey();
		v.getClass();
		Protectable p = (Protectable)v;
		p.beProtected();
	}
}

class Hen implements A {
	public void m() {}
	
	public void beProtected() {}
}


//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////




///数据输入

package com.imooc;
import java.util.Scanner;//←使用输入必须添加
/*输入用户数据
 * 1.导入java。util。Scanner
 * 2.创建Scanner对象
 * 3.接收并保存用户输入的值
 * 
 */
public class Demo_1 {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in); //创建Scanner对象，才能获得用户的数据
		System.out.println("输入：");
		
		int score = input.nextInt();//获取用户输入的成绩并保存变量中
		int count = 0;
		System.out.println("加分前：");
		while(score <= 60) {
			score ++;
			count ++;
		}
		System.out.println("输出：：：：："+ score);
		System.out.println("加次数：：：：" + count);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.imooc;
import java.util.Scanner;//←使用输入必须添加
public class Demo_2 {
	public static void main(String[] args) {
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double avg = 0;
		
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <=classNum; i++) {
			sum = 0;
			System.out.println("*******输入第" + i +"个班级的成绩*******");
			for(int j = 1; j <= stuNum; j++) {
				System.out.println("输入第" + j +"个学员的成绩");
				int score = input.nextInt();
				sum = sum +score;
			}
			
			avg = sum/stuNum;
			System.out.println("地"+ i +"个学员的平均分成绩：" + avg);
		}
		
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////


声明数组：
	语法：  数据类型[ ] 数组名；

	或者   数据类型 数组名[ ]；
int[] scores;
double height[];
String[] names;

分配空间：
	数组名 = new  数据类型 [ 数组长度 ];
scores = new int[5];
height = new double[5];
names = new String[5];

int[] scores = new int[5];


3、 赋值

	分配空间后就可以向数组中放数据了，数组中元素都是通过下标来访问的，例如向 scores 数组中存放学生成绩

scores[0] = 89;
scores[1] = 79;

int[] scores = {79,91,84,86}; //创建一个长为4的整形数组
int[] scores = new int[]{79,91,84,86} //中括号中必须要为空，不能指定长度、

for (int i = 0; i<scores.length ; i++ ) {
	//.length 循环变量i从0开始递增直接数组的最大长度scores.length
	//其中，  数组名.length  用于获取数组的长度
	//1、 数组下标从 0 开始。因此 scores[3] ，表示数组中的第 4 个元素，而并非第 3 个元素

	//2、 数组下标的范围是 0 至 数组长度-1 ，如果越界访问，就会报错。如：
}





//////////////////////////////////////////////////////////////////////////////////////////////////
Arrays 类是 Java 中提供的一个工具类，在 java.util 包中。该类中包含了一些方法用来直接操作数组，
比如可接实现数组的排序、搜索等（关于类和方法的相关内容在后面的章节中会详细讲解滴~~）。

Arrays 中常用的方法：

1、 排序

语法：  Arrays.sort(数组名);

可以使用 sort( ) 方法实现对数组的排序，只要将数组名放在 sort( ) 方法的括号中，就可以完成对该数
组的排序（按升序排列），如：

import java.util.Arrays; //←使用Arrays必须添加
public class HelloWorld {
	int[] scores = {79,91,84,86,63};
	Arrays.sort(scores);
	System.out.println("排序后数组中元素的值：");

	for (int i = 0; i<scores.length ; i++ ) {
		System.out.println(scores[i]);
	}
}

2、 将数组转换为字符串

语法：  Arrays.toString(数组名);

可以使用 toString( ) 方法将一个数组转换成字符串，该方法按顺序把多个数组元素连接在一起，多个元素之
间使用逗号和空格隔开，如：

	int[] scores = {79,91,84,86,63};
	//使用Arrays类的toString()方法将数组转换为字符串并输出
	System.out.println("输出数组nums中的元素：" + Arrays.toString(nums));




///////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////



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
 
       // 将数组的从0数，第2和第3个元素赋值为8
       /* Arrays.fill（ a1, fromIndex, toIndex,value）;
         作用：填充 a1 数组中的从索引为 fromIndex 开始到索引为 toIndex-1 为止每个元素都是 value
       */
       Arrays.fill(array, 2, 4, 8);
       System.out.println("将数组从0数，的第2和第3个元素赋值为8：Arrays.fill(array, 2, 4, 8)：");
       System.out.println(Arrays.toString(array));
      
       int[] array1 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };
       
       // 对数组的第2个到第6个进行排序
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




////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
使用 foreach 操作数组
foreach 并不是 Java 中的关键字，是 for 语句的特殊简化版本，在遍历数组、集合时， 
foreach 更简单便捷。从英文字面意思理解 foreach 也就是“ for 每一个”的意思

for (元素类型 元素变量：遍历对象 ) {
	执行的代码
}

public static void main(String[] args) {
	String[] hobbys = {"imooc", "kooc", "ACD"};
	System.out.println("******使用for循环输出数组中的元素");
	for (int i = 0; i <hobbys.length; i++) {
		System.out.println( hobbys[i] );
	}

	System.out.println("******使用foreach循环输出数组中的元素");
	for(String hobbys :hobbys) {
		System.out.println( hobbys );
	}
}


///////////////////////////////////////////////////////////////////////////////////////
Java 中的二维数组
所谓二维数组，可以简单的理解为是一种“特殊”的一维数组，它的每个数组空间中保存的是一个一维数组。

那么如何使用二维数组呢，步骤如下：

1、 声明数组并分配空间
	数据类型[][] 数组名 = new 数据类型[ 行的个数 ][ 列的个数 ];
	int[][] num = new int[2][3];

2、 赋值

	二维数组的赋值，和一维数组类似，可以通过下标来逐个赋值，注意索引从 0 开始

	数组名[行的索引][列的索引] = 值;
			//也可以在声明数组的同时为其赋值
			//
			//
	数据类型[][] 数组名 = { {值1，值2···},{值11，值22···},{值21，值22···}};

3、 处理数组

二维数组的访问和输出同一维数组一样，只是多了一个下标而已。在循环输出时，需要里面再内嵌
一个循环，即使用二重循环来输出二维数组中的每一个元素。如：

for( i; ; ){
	for( j; ; ){
		System.out.println(num[i][j]);
	}
}

需要了解的：在定义二维数组时也可以只指定行的个数，然后再为每一行分别指定列的个数。
如果每行的列数不同，则创建的是不规则的二维数组，如下所示：

int[][] num = new int[3][];//定义一个三行的二维数组
num[0] = new int[2]; //为第一行分配两列
num[1] = new int[3]; //为第二行分配三列
num[2] = new int[4]; //为第三行分配四列
num[0][0] = 1;//第一行第一列赋值为1
num[1][1] = 2;//第二行第二列赋值为2
num[2][3] = 3;//第三行第四列赋值为3



/////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
如何定义 Java 中的方法
所谓方法，就是用来解决一类问题的代码的有序组合，是一个功能模块。

一般情况下，定义一个方法的语法是：

访问修饰符 返回值类型 方法名（参数列表）{
	方法体；
}

其中：

1、 访问修饰符：方法允许被访问的权限范围， 可以是 public、protected、private 甚至可以省略 ，
	其中 public 表示该方法可以被其他任何代码调用，其他几种修饰符的使用在后面章节中会详细讲解滴

2、 返回值类型：方法返回值的类型，如果方法不返回任何值，则返回值类型指定为 void ；如果方法
	具有返回值，则需要指定返回值的类型，并且在方法体中使用 return 语句返回值

3、 方法名：定义的方法的名字，必须使用合法的标识符

4、 参数列表：传递给方法的参数列表，参数可以有多个，多个参数间以逗号隔开，每个参数由参数类
	型和参数名组成，以空格隔开 

根据方法是否带参、是否带返回值，可将方法分为四类：

Ø 无参无返回值方法

Ø 无参带返回值方法

Ø 带参无返回值方法

Ø 带参带返回值方法


///////////////////////////////////////////////////////////////////////////////////////
ava 中无参无返回值方法的使用
如果方法不包含参数，且没有返回值，我们称为无参无返回值的方法。

方法的使用分两步：

第一步，定义方法

例如：下面代码定义了一个方法名为 show ，没有参数，且没有返回值的方法，
执行的操作为输出 “ welcome to imooc. ”

public void show(){
	XX;
}



注意哦：

	1、 方法体放在一对大括号中，实现特定的操作

	2、 方法名主要在调用这个方法时使用，需要注意命名的规范，一般采用第一个单词首字母小写，
	其它单词首字母大写的形式

第二步，调用方法

	当需要调用方法执行某个操作时，可以先创建类的对象，然后通过  对象名.方法名();  来实现
	（关于类和对象的概念在后面章节中会详细讲解滴，先熟悉语法，表着急哦~~）

例如：在下面的代码中，我们创建了一个名为 hello 的对象，然后通过调用该对象的 show( ) 
方法输出信息



////////////////////////////////////////////////////////////////////////////////////////
///
类
//定义一个类
public class Telphone {
	//属性（成员变量）有什么
	float screen;
	float cpu;
	float mem;
	//方法 干什么
	void call() {
		System.out.println("Telphone有打电话的功能！");
	} 
	void sendMessaage() {
		System.out.println("screen: "+ screen +" CPU: "+cpu+" mem: "+mem+" Telphone有发短信的功能！");
	}
 }

///////////////////////////////////////////////////////////////////////////////////////////
///
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
////////////////////////////////////////////////////////////////////////////////////////////////////
1.成员变量：
	在类中定义，用来描述对象将要有什么。
	作用域：成员变量的作用域在整个类内部都是可见的
	java会给成员变量一个初始值



2.局部变量
	在类的方法中定义，在方法中临时保存数据
	作用域：局部变量的作用域仅限于定义它的方法
	java不会给局部变量赋予初始值

	在同一个方法中，不允许有同名局部变量
	在不同的方法中，可以有同名的局部变量

	两类变量同名时，局部变量更具有更高的优先级 

public class Telphone {
	//成员变量
	float screen;//			→本类的方法，其他类的方法
	float cpu;
	float mem;

	void call() {				
		//局部变量			→方法一中
	} 
	void sendMessaage() {
		//局部变量			→方法二中
	}
 }




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


////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
///
构造方法
1.使用new+构造方法，创建一个新的对象
2.构造方法是定义在java类中的一个用来初始化对象的方法
	构造方法与类名相同的，没有返回值的
	public 构造方法名() {	//没有返回值类型
							//与类名相同
		//初始化代码		//可以指定参数
	}

3.无参构造方法的使用
	main():
		Telphone phone = new Telphone();
	class Telphone:
		public Telphone() {
			System.out.println("Telphone无参构造方法执行了");
		}


4.有参的构造方法使用
	main():
		Telphone phone = new Telphone(4.0f, 2.0f, 2.0f);
	class Telphone:
		public Telphone(float newSceen, float newCpu, float newMem) {
			screen = newSceen;
			cpu = newCpu;
			mem = newMem;
			System.out.println("Telphone有参构造方法执行了");
		}
	


5.当没有指定构造方法时，系统会自动添加无参的构造方法
6.当有指定构造方法，无论是有参、无参的构造方法，都不会自动添加无参的构造方法
7.构造方法的重载：方法名相同，但参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法
8.构造方法不但可以给对象的属性赋值，还可以保证给对学习的属性赋一个合理的值


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



///////////////////////////////////////////////////////////////////////////////////////////////////


java 中的 static 使用之静态变量
大家都知道，我们可以基于一个类创建多个该类的对象，每个对象都拥有自己的成员，互相独立。然而在某些时候，
我们更希望该类所有的对象共享同一个成员。此时就是 static 大显身手的时候了！！

Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，即被类的所有对
象所共享。静态成员可以使用类名直接访问，也可以使用对象名进行访问。当然，鉴于他作用的特殊性更推荐用类名
访问~~

使用 static 可以修饰变量、方法和代码块。

本小节，我们先认识一下静态变量。

例如，我们在类中定义了一个 静态变量 hobby ，操作代码如下所示：

public class HelloWorld {
    
    // 定义静态变量，保存班级名称
	   static        String className = "JAVA开发一班";

	public static void main(String[] args) {
        
		// 访问静态变量，输出班级名称
		System.out.println(  className  );
	}
}


与静态变量一样，我们也可以使用 static 修饰方法，称为静态方法或类方法。其实之前我们一直写的 main 方法就
是静态方法。静态方法的使用如：


public class HelloWorld {
    //使用static关键字生命静态方法
    public static void print() {
    	System.out.println("欢迎您：爱mooc！");
    }


	public static void main(String[] args) {
        //直接使用类名调用静态方法
        HelloWorld.print();
        //也可以通过对象名调用，当然更推荐使用类名调用的方式
        HelloWorld Demo_2 = new HelloWorld();
        Demo_2 = print();
		
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////

1、 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员。如：
public class HelloWorld {
	String name = "I Love imooc";//非静态变量name;
	static String hobby = "imooc";// 静态变量hobby

	//静态方法调用非静态变量			不能直接调用非静态变量
	public static void print() {			↑
		System.out.println("huan ying: " + name + "@!");
		System.out.println("ai hao " + hobby + "@1");
	}									↓ 	
}									可以直接调用静态变量

如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量。如：

public static void print() {
		//创建类的对象
		HelloWorld hello = new HelloWorld();
		//通过对象来实现在静态方法中调用非静态变量
		System.out.println("huan ying: " + name + "@!");
		System.out.println("ai hao " + hobby + "@1");
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
///
///
2、 在普通成员方法中，则可以直接访问同类的非静态变量和静态变量，如下所示：

	String name = "I Love imooc";//非静态变量name;
	static String hobby = "imooc";// 静态变量hobby

	//普通成员方法可以直接访问非静态变量和静态变量
	public static void print() {
		System.out.println("huan ying: " + name + "@!");
		System.out.println("ai hao " + hobby + "@1");
	}		
/////////////////////////////////////////////////////////////////////////////////////////////////
///
///
3、 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法。如：
//普通成员方法
public void show() {
	System.out.println("欢迎来到imooc");
}
public static void main(String[] args) {
	//普通成员方法必须通过对象来调用
	HelloWorld hello = new HelloWorld();
	hello.show();
	//可以直接调用静态方法
	print();
}


////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
在编辑器中分别定义了两个静态变量 score1 和 score2 ，用于保存成绩信息。定义了一个静态方法 sum ，
用于计算成绩总分，在 main 方法中通过调用静态方法输出成绩总分

public class HelloWorld {
    
    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
	static int score2 = 92; 

    // 定义静态方法sum，计算成绩总分，并返回总分
	public  static int sum() { 
      
      return (score1 + score2);
      
	}

	public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        // 调用静态方法sum并接收返回值
		int allScore = h.sum();
        
		System.out.println("总分：" + allScore);
	}
}
//////////////////////////////////////////////////////

public class HelloWorld {
    
    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
	static int score2 = 92; 

    // 定义静态方法sum，计算成绩总分，并返回总分
	public  static int sum() { 
      
      return (score1 + score2);
      
	}

	public static void main(String[] args) {
        // 调用静态方法sum并接收返回值
		int allScore = HelloWorld.sum();
        
		System.out.println("总分：" + allScore);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
Java 中可以通过初始化块进行数据赋值。如：
public class HelloWorld {
	String name;//定义一个成员变量
	//通过初始化块为成员变量赋值
	{
		name = "imooc";
	}
}

在类的声明中，可以包含多个初始化块，当创建类的实例时，就会依次执行这些代码块。如果使用 static 修饰初
始化块，就称为静态初始化块。

需要特别注意：静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能
初始化普通的成员变量。

我们来看一段代码：
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






通过输出结果，我们可以看到，程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。
由于静态初始化块只在类加载时执行一次，所以当再次创建对象 hello2 时并未执行静态初始化块。


//////////////////////////////////////////////////////////////////////////////////////////////////、
///
///
封装
///
package com.imooc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	

	////////////////////////////////////
	public float getScreen() {
		return screen;
	}
	public void setScreen(float newScreen) {
		screen = newScreen;
	}
	/////////////////////////////////////////////、


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

public class InitailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub、
		//通过无参的构造方法可以创建对象
		Telphone phone1 = new Telphone();
		//通过又参的构造方法也可以创建对象，并且可以给对象实例变量赋值
		Telphone phone2 = new Telphone(3.0f, 2.0f, 2.0f);
		//phone2.cpu = 6.0f;
		phone2.setScreen(6.f);
		System.out.println("screen" + phone2.getScreen());
	}

}

////////////////////////////////////////////////////////////////////////////////////////////////
///
///
java中的包

1.包的作用：
	管理java文件
	解决同名文件冲突
2.定义包：package 包名
	注：必须放在java源程序的第一行
	包名件可以使用"."号隔开
	eg：com.imooc.MyClass

例如：音乐类——MyClassMusic
-music
	com.imooc.music.MyClassMusic
-movie
	com.imooc.movie.MyClassMusic

3.系统中的包
	java.(功能).(类)
	java.lang.(类)包含java语言基础的类
	java.util.(类)包含java语言中各种工具类
	java.io.(类)包含输入、输出相关功能的类
4.包的使用
	（1）可以通过import关键字，在某个文件使用其他文件中的类
	import com.imooc.music.MyClass
	 (2)java中，包的命名规范是全小写字母拼写
	 (3)使用的时候不但可以加载某一个包下的所有文件
	 eg：com.imooc.*
	 也可以加载某个具体子包下的所有文件
	 eg：com.imooc.music.*
/////////////////////////////////////////////


package com.imooc.screend;

public class Telphone {
	public Telphone() {
		System.out.println("com.imooc.screend.Telphone无参的构造方法执行了");
	}
}


////////////////////////////////////////////
package com.imooc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	
	public float getScreen() {
		return screen;
	}
	public void setScreen(float newScreen) {
		screen = newScreen;
	}
	public Telphone() {
		System.out.println("com.imooc.Telphone无参的构造方法执行了");
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
///////////////////////////////////////

package com.imooc;
//import com.imooc.Telphone;
import com.imooc.screend.Telphone;
public class InitailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub、
		//通过无参的构造方法可以创建对象
		Telphone phone1 = new Telphone();
//		//通过又参的构造方法也可以创建对象，并且可以给对象实例变量赋值
//		Telphone phone2 = new Telphone(3.0f, 2.0f, 2.0f);
//		//phone2.cpu = 6.0f;
//		phone2.setScreen(6.f);
//		System.out.println("screen" + phone2.getScreen());
	}

}

////////////////我自己///我房间//我朋友我屋子//////所有人//////////////////////////////////////////////
访问修饰符 		本类 	同包		子类 			其他
private 		√
默认			√		√
protected 		√		√			√
public  		√		√			√				√
////////////////////////////////////////////////////////////////////////////////////
this

1.this关键字代表当前对象
	this.属性 操作当前对象的属性
	this.方法 调用当前对象的方法
2.封装对象的属性的时候，经常会使用this关键字

自动生成get/set的方法
	Source → Generatn Getters and Setters →自动检测当前类有哪些属性
public void setScreen(float screen) {
		this.screen = screen; //将一个参数的值 赋给 当前对象的属性=this.screen
		this.sendMessage; 调用我们当前对象的某个方法
	}

添加一个方法
public void sendMessage() {
	System.out.println(XXXX);
}

////////////////////////////////////////////////////////////////////////////////////
///什么是 Java 中的内部类
什么是 Java 中的内部类

问：什么是内部类呢？

答：内部类（ Inner Class ）就是定义在另外一个类里面的类。与之对应，包含内部类的类被称为外部类。

问：那为什么要将一个类定义在另一个类里面呢？清清爽爽的独立的一个类多好啊！！

答：内部类的主要作用如下：

1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类

2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据

3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便

问：内部类有几种呢？

答：内部类可分为以下几种：

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


运行结果为 :  welcome to imooc! 

////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////、
成员内部类

内部类中最常见的就是成员内部类，也称为普通内部类。我们来看如下代码：内部类中最常见的就是成员
内部类，也称为普通内部类。我们来看如下代码：

//外部类HelloWorld
public class HelloWorld {
    private int a = 99;	//外部类的私有属性
    // 内部类Inner，类Inner在类HelloWorld的内部
    public class Inner {
        int b = 2 //内部类的成员属性
		// 内部类的方法
		public void show() {
			System.out.println("访问外部类中的a：" + a);
			System.out.println("访问内部类中的b：" + b);
		}
	}
    
	public static void main(String[] args) {
        
        // 创建外部类对象
		HelloWorld hello = new HelloWorld();
        // 创建内部类对象
		Inner i = hello.new Inner();  XXXX重点！！！！！！！！！
        // 调用内部类对象的方法
		i.show();
	}
}


	从上面的代码中我们可以看到，成员内部类的使用方法：

1、 Inner 类定义在 HelloWorld 类的内部，相当于 HelloWorld 类的一个成员变量的位置，Inner 类可以使用任意
	访问控制符，如 public 、 protected 、 private 等

2、 Inner 类中定义的 show() 方法可以直接访问 HelloWorld 类中的数据，而不受访问控制符的影响，如直
	接访问 HelloWorld 类中的私有属性a

3、 定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，
	即：内部类 对象名 = 外部类对象.new 内部类( );

4、 编译上面的程序后，会发现产生了两个 .class 文件
		HelloWorld$Inner.class
		HelloWorld.class
		其中，第二个是外部类的 .class 文件，第一个是内部类的 .class 文件，外部类名$内部类名.class

友情提示哦：

1、 外部类是不能直接使用内部类的成员和方法滴

public class HelloWorld {
    
    // 内部类Inner，类Inner在类HelloWorld的内部
    public class Inner {
        
		// 内部类的方法
		public void show() {
			System.out.println("welcome to imooc!");
		}
	}
    
    public voud print() {
    	show(); //外部类调用内部类的成员方法
    			外部类不能直接访问内部类中的成员方法
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

可先创建内部类的对象，然后通过内部类的对象来访问其成员变量和方法。


2、 如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，如果要访问外部类
	的成员变量，可以使用 this 关键字。如：


public class HelloWorld {
    private int b = 99;	//外部类的私有属性
    // 内部类Inner，类Inner在类HelloWorld的内部
    public class Inner {
        int b = 2 //内部类的成员属性
		// 内部类的方法
		public void show() {
			System.out.println("访问外部类中的a：" + HelloWorld.this.b);
			System.out.println("访问内部类中的b：" + b);
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////、
Java 中的静态内部类

静态内部类是 static 修饰的内部类，这种内部类的特点是：

1、 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 

2、 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；
	如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员

3、 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();

//外部类
public class HelloWorld {
    
    // 外部类中的静态变量score
    private static int score = 84;
    
    // 创建静态内部类
	public   static       class SInner {
        // 内部类中的变量score
        int score = 91;
        
		public void show() {
			System.out.println("访问外部类中的score：" +   HelloWorld.score         );
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
////////////////////////////////////////////////////////////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////、
Java 中的方法内部类
方法内部类就是内部类定义在外部类的方法中，方法内部类只在该方法的内部可见，即只在该方法内可以使用。
一定要注意哦：由于方法内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用访问控制符和 static 修饰符。
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
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
继承
1.继承的概念
继承是类与类的一种关系，是一种"is a"关系

狗是动物，狗是继承动物   狗类是动物类的子类，派生类
						 动物类是狗类的父类、基类
注：java中的继承是单继承
		只有一个父类

2.继承的好处
	子类拥有父类的所有属性和方法
		private 修饰的无效
	代码的复用
3.语法规则
	class 子类 extends 父类
package com.imooc;

public class Animal{
	public int age;
	public String name;
	public void eat() {
		System.out.println("动物吃东西！");
	}
}

package com.imooc;	//在新建工程的第六行（Superclass） 中选可以选父类 
public Dog extends Animal {

}

////////////////////////////////////////////////////////////////////////////////////////////////、
1.方法的重写
如果子类对继承父类懂得方法不满意，是可以重写父类继承的方法的，当调用方法时会优先调用子类的方法
2.语法规则
	a.返回值类型
	b.方法名
	c.参数类型及个数
都要与父类继承的方法相同，才叫方法的重写


package com.imooc;	//在新建工程的第六行（Superclass） 中选可以选父类 
public Dog extends Animal {
	public void eat() {
		System.out.println("狗！！！吃东西！");
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////
final 关键字（ const 一样）
 使用final关键字做标识有“最终的”含义
 final可以修饰类、方法、属性和变量
 	final修饰类，则该类不允许被继承
 	final修饰方法，则该方法不允许被覆盖（重写）
 	final修饰属性
 		则该类的属性不会被进行隐式的初始化（类的初始化属性必须有值）
 		或在构造方法中赋值（但只能选其一）
 	final修饰变量，则该变量的值只能赋值一次值，即变为常量
//////////////////////////////////////////////////////////////////////////////////////////////、
super 关键字
	在对象的内部使用，，可以代表父类对象
1.访问父类的属性
	super.age
2.访问父类的方法
	super.eat();

子类的构造的过程当中必须调用其父类的构造方法

如果子类额构造方法中没有显式调用父类的构造方法，则系统系默认调用父类无参的构造方法

如果显式的调用构造方法，必须在子类的构造方法的第一行

如果子类构造方法中既没有显式调用父类的构造方法。而父类又没有无参的构造方法，则编译错误
public Dog extends Animal {
	public Dog(){
		super();//显式调用父类的构造方法
		System.out.println("我是狗类的构造方法");
	}	
	public void eat() {
		System.out.println("狗！！！吃东西！");
	}
}

//////////////////////////////////////////////////////////////////////////////////////////、
Object类是有所类的父类，如果一个类没有使用extends关键字明确标识继承另外一个类，那么这个类默认继承Object

Object类中的方法，适合所有子类
1.toString()方法
	在Object类里面定义 toString()方法 时候返回的对象的哈希code码（对象地址字符串）
	可以通过重写 toString() 方法表示出对象的属性

	Object > Animal > Dog

	自动生成 ：Source → Generatn toString()

2.equals() 方法
	比较的是对象的引用是否指定向同一块内存地址
	Dog dog = new Dog();
	Dog dog2 = new Dog();

 	一般情况下比较两个对象性时比较他的值是否一致，所以要进行重写

	自动生成 ：Source → Generatn hashCode() and equals()
/////////////////////////////////////////////////////////////////////////////////////////////
多态 			继承是多态的基础

1.引用多态
	父类的引用可以指向本类的对象		
	父类的引用可以指向子类的引用
		Dog类继承Animal类

		Animal obj1 = new Animal();
		Animal obj2 = new Dog();//父类的引用可以指向子类的引用

		Dog obj3 = new Animal();//错误的



2.方法多态
	创建本类对象时，调用的方法为本类的方法
	创建子类对象时，调用的方法为子类重写的方法或者继承的方法

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


//////////////////////////////////////////////////////////////////////////////////////////////////】
/////////////////////////////////////////////////////////////////////////////////////////////////
引用类型转换
1.向上类型转换（隐式/自动转换类型）。是小类型到大类型的转换

2.向下类型转换（强制类型转换），是大类型达到小类型

3.instanceof运算符，来解决引用对象的类型，避免类型转换的安全性问题

//测试类
Dog dog = nwe Dog();
Animal animal = dog; //自动类型提升 向上类型转换
Dog dog2 = animal;//错误，存在风险
Dog dog2 = (Dog)animal;//向下类型转换 强制类型转换
Cat cat = (Cat)animal; //错误，没有办法将Dog类型转换到Cat类型
						//1.编译时Cat类型
						//2.运行时Dog类型
通过 instanceof 运算符避免类型转换的安全性问题
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

////////////////////////////////////////////////////////////////////////////////////////////////////、
///
///
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
///////////////////////////////////////////////////////////////////////////////////////////////////
接口

1.接口概念
	接口可以理解为一种特殊的类，由全局常量和公共的抽象方法所组成

	类是一种具体实现体，而接口定义了某一批类所需要遵守的规范，接口不关心这些类的内部数据，也不关心
	这些类里方法的实现细节，它只规定这些类里面必须提供某些方法

2.接口定义
	和类定义不同，定义接口不使用 class 关键字，而是使用 interface 关键字

3.接口定义基本语法

		abstract
[修饰符] ↑ interface 接口名[extends 父接口1,父接口2···] {
	零个到多个常量定义			
	零个到多个抽象方法的定义
}

接口就是用类被继承、被实现的，修饰符一般建议用public 
注意：不能使用 private 和 protected 修饰接口


3.接口定义
	常量：
		接口中的属性是常量，即使定义时不添加
		public static final 修饰符，系统也会自动加上
	方法：
		接口中的方法只能是抽象方法，总是使用，即使定义时不添加
		public abstract 修饰符，系统也会自动加上

		接口中方法不能有方法体，同时方法的访问修饰符不能是 private 和 protected



4.使用接口
	一个类可以实现一个或多个接口，实现接口的使用 implements 关键字。java中一个类只能继承一个父类，是不够灵活的，
	通过实现多个接口可以做补充


继承父类实现接口的语法为：

[修饰符] class 类名 extends 父类 implements 接口1, 接口2,···{
	类体部分//如果继承了抽象类，需要实现继承的抽象方法；要实现接口的抽象方法
}

如果要继承父类，继承父类必须在实现接口之前

//智能手机 SmartPhone 与 PSP 具有相同的玩游戏功能

//创建一个接口，新建New → Interface → neme：通常在前面加一个I，以区分类
public [系统自动添加 abstract ,有和没有，没有区别,通常不写] interface  IPlayGame {
	public [系统自动添加 abstract ,有和没有，没有区别，通常不写] void playGame();
}


public class SmartPhone extends Telphone [添加]→（ implements IPlayGame ） {
	public void call() {
		System.out.println("通过语音来打电话");
	}

	public void message() {
		System.out.println("通过语音来发短信");
	}

	public void playGame() {
		System.out.println("具有玩游戏的功能");
	}
}

//创建Psp这个类，但是跟手机没有继承关系，但是具有游戏的特性所以添加接口
//在创建类的窗口里选择 Imterface 选择接口，自动创建
public class Psp implements IPlayGame {
	public void playGame() {
		System.out.println("具有玩游戏的功能");
	}
}

//测试类
IPlayGame ip1 = new SmartPhone();
ip1.playGame;
IPlayGame ip2 = new Psp();
ip2.playGame;

///////////////////////////////////////////////////////////////////////////////////////////////
接口在使用过程中，还经常与匿名内部类配合使用
匿名内部类就是没有名字的内部类，多用于关注实现而不关注实现类的名称

语法格式：
	Interface i = new Interface() {
		public void method() {
			System.out.println("匿名内部类实现接口的方式");
		}
	}

//测试类
//
//方法1
IPlayGame ip3 = new IPlayGame() {
	public void playGame() {
		System.out.println("匿名内部类实现接口的方式1");
	}
}； //注意有一个分号的结束

ip3.playGame();

//方法2
new IPlayGame() {
	public void playGame() {
		System.out.println("匿名内部类实现接口的方式2");
	}
}.playGame();  //注意，通过一个点直接调用方法


//////////////////////////////////////////////////////////////////////////////////////////////////、
/////////////////////////////////////////////////////////、//////////////////////////////////////、
///////////////////////////////////////////////////////////////////////////////////////////////////、

UML  Java入门第二季 4-7

1.UML概念
	Unified Modeling Language (UML)
	又称统一建模语言或标准建模语言

	是一个支持建模化和软件系统开发的图形语言
	为软件开发的所有阶段提供模型化和可视化支持

2.UML图示
	UML 2.2一共定义了14种图示（diagrams）

3.用例图（The Use Case Diagram）
	以例图能够以可视化的方式，表达系统如何满足所收集的业务规则，以及特定的用户需求等信息

							小人	  Restauran（simplified）
						(Food Critic) 	  → Eat Food
										  → Pay for Food
										  → Drink Wine
										    Cook Food	← 	小人（Chef）

  序列图（The Sequence Diagram）
  	序列图用于按照交互发生的一系列顺序，显示对象之间的这些交互

				  	用户		柜台窗口	点账窗口	取钱		账户后台
				  	· 				· 			· 		  · 		   ·
				  	·  表明身份		· 			·         · 		   ·
				  	·—————————→ █ 	· 			·	      · 		   ·
				  	·  			█	·		请求取钱 				   ·
				  	· 			█———————————————————————→ █ 		   ·
				  	· 				·			·		  █ 确认并取款 ·
				  	· 				·			·		  █	——————————→█
				  	· 				·			· 授权合法█ 		   ·
				  	· 		发布货币			█ ←———————█			   ·
				  	·←——————————————————————————█		  · 		   ·
				  	· 				· 			· 		  · 		   ·

  类图（The Class Diagram）
  	UML类图、业务逻辑和所有支持结构一同被用于定义
  	全部的代码结构

				▁▁▁▁▁▁▁▁▁▁▁▁▁▁
  		类名	▏		Animal 			  ▕ 
  				▏▔▔▔▔▔▔▔▔▔▔▔▔▔▏
  		属性	▏- name : java.lang.String ▏- 表示私有的
  				▏- age  : int 				▏
  				▏▔▔▔▔▔▔▔▔▔▔▔▔▔▏
  		方法能力▏+ eat () : void			▏+ 表示公有的   返回值类型是void
  				▔▔▔▔▔▔▔▔▔▔▔▔▔▔
  							   △（空的箭头）
  							   ↑ 表示继承
  				▁▁▁▁▁▁▁▁▁▁▁▁▁▁
  				▏			  Dog 			▏
  				▏▁▁▁▁▁▁▁▁▁▁▁▁▁▏
  				▏▁▁▁▁▁▁▁▁▁▁▁▁▁▏
  				▏+《Override》eat():void ▕ 子类方法不满意，要重写父类的方法的《Override》
  				▔▔▔▔▔▔▔▔▔▔▔▔▔▔

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////、
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////、
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////、


//父类
package imooc;

public class Person {
	public void say() {
		System.out.println("人类具有说话的能力");
	}
}
//创建一个子类

package imooc;

public class American extends Person {
	public void say() {
		System.out.println("美国人说英语");
	}
}

package imooc;

public class Chinese extends Person{
	public void say() {
		System.out.println("中国人说中国话");
	}
}

//测试类
package imooc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese p = new Chinese();
		American p2 = new American();
		
		p.say();
		p2.say();

		//父类的引用指向子类的对象，多态语法，必须有继承关系
		Person p = new Chinese();
		Person p2 = new American();
		
		p.say();
		p2.say();

		//抽象类
		APerson p = new Chinese();
		APerson p2 = new American();
		
		p.say();
		p2.say();

	}

}


//抽象类
package imooc;

public abstract class APerson {
	public abstract void say();
}

//修改子类，让他们继承抽象类
package imooc;

public class American extends APerson {
}
public class Chinese extends APerson{
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////、
/////////////////////////////////////////////////////////////////////////////////////////////////////////////、、
项目练习
一、项目背景介绍
	根据所学知识，编写一个控制台版的“答答租车系统”
	功能：
	1、展示所有可租车辆
	2、选择车型、租车辆
	3、展示租车清单，包含：总金额、总载货量及其车型、总在人量及其车型
二、项目分析
	1、数据模型分析
		1.通过对现实世界的事与物主要特性的分析、抽象，为信息系统的实施提供数据存取额数据结构以及相应的约束。
		2.数据结构组成：操作（方法）、属性
	2、业务模型分析
		1.在设计应用程序之前，应该明确该应用程序必须执行哪些任务。
			分析业务需求是应用程序开发中最重要的步骤之一。
			确认业务需求的目的在于创建一个能同时满足零售商和消费者需要的解决方案
		2.答答租车系统：选车，租车天数，统计金额，载客和货量
	3、显示和流程分析
		1.显示：用户可以看到的信息提示界面
		2.流程：显示信息额执行过程、步骤
		3.答答租车系统中，要以命令行的方式显示提示信息和输出结果信息，要考虑其样式，用户输入的数据不同，信息该如何
		提示、如何处理并显示出结果，这部分知识囊括了显示与流程的内容。
		例：请选择车辆 → 请输入序号 → 输出总金额···


//////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
异常
Throwable 类

	1.Error类		直接挂掉

	2.Exception类		主要讨论这个，编码、环境、用户操作输入出现问题
		1.RuntimeException （非检查异常） 运行时异常
			a.NullPointerException(空指针异常)
			b.ArrayIndexOutOfBoundsException(数组下标越界异常)
			c.ClassCastException(类型转换异常)
			d.ArithmeticException(算术异常)
			···
		2.检查异常
			a.IOException(文件异常)
			b.SQLException


////////////////////////////////////////////////////////////////////////////////////////////////////////////
处理异常
try-catch以及try-catch-finally

	try {
		//一些会抛出异常的方法
	} catch (Exception) {
		//处理该异常的代码块
	}


例如：
	try {
		System.out.print("请输入你的年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		System.out.println("十年后你" + (age + 10) +"岁");
	} catch (InputMismatchException e) {
		System.out.println("你应该输入整数！！！");
	}
	System.out.println("程序结束");

展示：
	请输入你的年龄：hello
	你应该输入整数！！！
	程序结束



	顺序： 子类 → 父类
	try {
		//一些会抛出异常的方法
	} catch (Exception) {
		//处理该异常的代码块
	} catch (Exception2) {
		//处理该异常的代码块
	} ··· (n个Exception) {
		//处理该异常的代码块
	} finally {
		//最终将要执行的一些代码
	}


package com.imooc;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tcTest = new TryCatchTest();
		int result = tcTest.test();
		System.out.println("test()方法，执行完毕！返回值为：" + result);
		int result2 = tcTest.test2();
		System.out.println("test2()方法，执行完毕！返回值为：" + result2);
		int result3 = tcTest.test3();
		System.out.println("我想大声告诉你！test3执行完了 result：：：："+ result3);

	}
	
	/**
	 * divier(除数)
	 * result(结果)
	 * try-cath捕获while循环
	 * 每次循环，divider减一，result=result+10/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！！”，返回-1
	 * 否则：返回resul
	 * @return
	 */
	public int test() {
		int divider = 10;
		int result =100;
		try {
			while(divider > -1) {
				divider--;
				result = result + 100/divider; 
			}
			return result;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环抛出抛出异常了！！！！");
			return -1;
		}
	}
	/**
	 * divier(除数)
	 * result(结果)
	 * try-cath捕获while循环
	 * 每次循环，divider减一，result=result+10/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！！”，返回 result = 999
	 * 否则：返回resul
	 * finally:打印输出“这是Ifinally！！！哈哈哈！！！”，同时打印输出result
	 * @return
	 */
	public int test2() {
		int divider = 10;
		int result =100;
		try {
			while(divider > -1) {
				divider--;
				result = result + 100/divider; 
			}
			return result;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环抛出抛出异常了！！！！");
			return result = 999;
		} finally {
			System.out.println("这是Ifinally！！！哈哈哈！！！result返回值：" + result);
		}
	}
	/**
	 * divier(除数)
	 * result(结果)
	 * try-cath捕获while循环
	 * 每次循环，divider减一，result=result+10/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！！”
	 * 否则：返回resul
	 * finally:打印输出“这是Ifinally！！！哈哈哈！！！”，同时打印输出result
	 * ，最后返回返回 result = 1111作为结果
	 * @return
	 */
	public int test3() {
		int divider = 10;
		int result =100;
		try {
			while(divider > -1) {
				divider--;
				result = result + 100/divider; 
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环抛出抛出异常了！！！！");
		} finally {
			System.out.println("这是finally！！！哈哈哈！！！result返回值：" + result);
		}
		System.out.println("我是test3！，，我运行结束");
		return result = 1111;
	}
	
}
//////////////////////////////////////////////////////////////////////////////////////////////////////、
///
java中的异常抛出
throw - 将产生的异常抛出（动作）

throws - 声明将要抛出何种类型的异常（声明）
		public void 方法名(参数列表)
						throws 异常列表 {
							//调用会抛出异常的方法或者:
							throws new Exception();
						}

public void divide(int one, int two) throws Exception {
	if(two == 0)
		throws new Exception("两数相除，除数不能为0！");
	else
		System.out.println("两数相除，结果为:" + one/two);
}




public void computer() {
	/*
	此处省略····代码·····
	 */
	try {
		divide(5, 0);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}


public void computer() throws Exception {
	/*
	此处省略····代码·····
	 */
	divide(5, 0);
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////、

throw与throws的区别

 throws语句　  
  throws总是出现在一个函数头中，用来标明该成员函数可能抛出的各种异常。如果你想明确地抛出一个RuntimeException，
  你必须用throws语句来声明它的类型。  
   
 throw语句　  
  throw总是出现在函数体中，用来抛出一个异常。程序会在throw语句后立即终止，它后面的语句执行不到，然后在包含它的
  所有try块中（可能在上层调用函数中）从里向外寻找含有与其匹配的catch子句的try块。


try {
			test1();
		} catch (DrunkException e) {
			
			RuntimeException newExc = 
				new RuntimeException(e);    //直接将当前e异常 通过构造方法创建并传给 newExc
			throw newExc;				//抛出当前异常
		}

=================================================================
		try {
			test1();
		} catch (DrunkException e) {

			RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪~~");   

			newExc.initCause(e);			//调用 initCause()方法并传入try语句块中的异常
			throw newExc;						//抛出当前异常
		}

RuntimeException(String message)用指定的详细消息构造一个新的运行时异常。
initCause() 此方法通常从构造方法中调用，或者在创建 throwable 后立即调用。





//////////////////////////////////////////////////////////////////////////////////////////////////////、
自定义异常
class 自定义异常类 extends 异常类型 {

}

例如

package com.imooc;

public class DrunkException extends Exception{
	public DrunkException() {
		
	}
	public DrunkException(String message) {
		super(message);
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////、
java中的异常链


package com.imooc;

public class ChainTest {
	/*
	 * test1()：抛出“喝大了”异常
	 * test2()：调用test1()，捕获“喝大了”异常，并且包装成运行时异常，继续抛出main方法中，调用test2()，，
	 * 尝试捕获test2()方法抛出的异常
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		try {
			ct.test2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	public void test1() throws DrunkException {
		throw new DrunkException("喝车别开酒");
	}
	public void test2() {
		try {
			test1();
			
		} catch (DrunkException e) {
			// TODO: handle exception
			RuntimeException newExc = new RuntimeException("司机一滴酒，亲人两行泪···");
			newExc.initCause(e);
			throw newExc;
		}
	}

}

//////////////
改一下test2()

	public void test2() {
		try {
			test1();
			
		} catch (DrunkException e) {
			// TODO: handle exception
			RuntimeException newExc = new RuntimeException(e);

			throw newExc;
		}
	}





实际应用中的经验与总结

1.处理运行时异常时，采用逻辑去合理规避同时辅助try-catch处理
2.在多重catch块后面，可以加在一个 catch(Exception) 来处理可能会被遗漏的异常
3.对于不确定的代码，也可以加上try-catch，处理潜在的异常
4.尽量去处理异常，切忌只是简单的调用 prinStackTrace() 去打印输出
5.具体如何处理异常，要根据不同的业务需求和异常类型去决定
6.尽量添加finally语句块去释放占用的资源



////////////////////////////////////////////////////////////////////////////////////////////////////////、



String 类的常用方法：

	方法 											说明
int length()									返回当前字符串的长度
int indexOf(int ch)								查找ch字符在该字符串中第一次出现的位置
int indexOf(String str)							查找str子字符串在该字符串中第一次出现的位置
int lastIndexOf(int ch)							查找ch字符在该字符串中最后一次出现的位置
int lastIndexOf(String ch)						查找str子字符串在该字符串中最后出现的位置
String substring(int beginIndex)				获取从beginIndex位置开始到结束的字符串
String substring(int beginIndex, int endIndex)	获取从beginIndex位置开始到enIndex位置的子字符串
String trim()									返回去除了前后空格的字符串
boolean equals(Object obj)						将该字符串与指定对象比较，返回true或false 
String toLowerCase()							将字符串转换为小写
String toUpperCase()							将字符串转换为大写
char charAt(int index)							获取字符串中指定位置的字符
String[] split(String regex, int limit)			将字符串分割为子字符串，返回字符串数组
byte[] getBytes()								将该字符串转换为byte数组



//定义一个字符串“学习 JAVA 编程”。
String str = "学习 JAVA 编程";

//打印出字符串长度
System.out.println(str.length());

//查找字符‘编’的位置
char c = '编';
System.out.println(str.indexOf());

//查找字符串'JAVA'的位置
System.out.println(str.indexOf("JAVA"));

//查找字符串‘imooc’的位置，如果找不到返回-1
System.out.println(str.indexOf("imooc"));

//按空格把字符串拆分成一个数组，并输出数组元素
String[] arr = str.split(" ");
System.out.println(Arrays.toString(arr));
System.out.println();

//获取索引位置[3,,7)之间的子串
System.out.println(str.substring(3, 7));

//将字符串转化为小写
System.out.println(str.toLowerCase());

//获取索引位置为1的字符串
System.out.println(str.charAt(1));

//获取索引位置为i的字符
String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
			// 出现次数
					int num = 0;
			        
			         // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
					for (int i = 0;i<s.length() ;i++                         )
					{
			            // 获取每个字符，判断是否是字符a
						if (   s.charAt(i) == 'a' ) {
			                // 累加统计次数
							num++; 
						}
					}
//将字符串转换为byte[]，并打印输出
byte[] b =str.getBytes();
for (int i = 0; i <b.length; i++) {
	System.out.print(b[i] + " ");	
}


//将另外一个字符串“学习 JAVA 编程”进行比较
String str2 = new String("学习 JAVA 编程");
System.out.println("str和str2的内存地址相同？" + (str == str2));
System.out.println("str和str2的内容相同？" + str.equals(str2));


输出：
	10
	8
	3
	-1
	[学习, JAVA, 编程]

	JAVA
	学习 java 编程
	习
	-47 -89 -49 -80 32 74 65 86 65 32 -79 -32 -77 -52 
	str和str2的内存地址相同？false
	str和str2的内容相同？true


1. 字符串 str 中字符的索引从0开始，范围为 0 到 str.length()-1

2. 使用 indexOf 进行字符或字符串查找时，如果匹配返回位置索引；如果没有匹配结果，返回 -1

3. 使用 substring(beginIndex , endIndex) 进行字符串截取时，包括 beginIndex 位置的字符，不包括 endIndex 位置的字符

4. 那么，“==” 和 equals() 有什么区别呢？

	==: 判断两个字符串在内存中首地址是否相同，即判断是否是同一个字符串对象

	equals(): 比较存储在两个字符串对象中的内容是否一致

	PS：字节是计算机存储信息的基本单位，1 个字节等于 8 位， gbk 编码中 1 个汉字字符存储需要 2 个字节，1 个英文字符存储需要 1 个字节。
	所以我们看到上面的程序运行结果中，每个汉字对应两个字节值，如“学”对应 “-47 -89” ，而英文字母 “J” 对应 “74” 。同时，我们还发现汉字
	对应的字节值为负数，原因在于每个字节是 8 位，最大值不能超过 127，而汉字转换为字节后超过 127，如果超过就会溢出，以负数的形式显示。
	（关于编码，我们在后面课程中会详细介绍，小小期待哦~~）




public class HelloWorld {
    public static void main(String[] args) {
        // Java文件名
		String fileName = "HelloWorld.java"; 
        // 邮箱
		String email = "laurenyang@imooc.com";
		
		// 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        */
        //获取文件名中最后一次出现"."号的位置
		int index = fileName.lastIndexOf(".");
        
        // 获取文件的后缀
		String prefix = fileName.substring(index + 1, fileName.length());
        
		// 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
		if ( index != -1 && index != 0 && prefix.equals("java")) {
			System.out.println("Java文件名正确");
		} else {
			System.out.println("Java文件名无效");
		}

        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
         /*
        参考步骤：
        1、获取文件名中"@"符号的位置
        2、获取邮箱中"."号的位置
        3、判断必须包含"@"符号，且"@"必须在"."之前
        */
	    // 获取邮箱中"@"符号的位置
		int index2 = email.indexOf('@');
        
        // 获取邮箱中"."号的位置
		int index3 = email.indexOf('.');
        
		// 判断必须包含"@"符号，且"@"必须在"."之前
		if (index2 != -1 && index3 > index2) {
			System.out.println("邮箱格式正确");
		} else {
			System.out.println("邮箱格式无效");
		}
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
认识 Java 中的 StringBuilder 类
在Java中，除了可以使用 String 类来存储字符串，还可以使用 StringBuilder 类或 StringBuffer 类存储字符串，那么它们
之间有什么区别呢？

String 类具有是不可变性。如
	String str = "hello";
	System.out.println(str + "world");
	System.out.println(str);
运行结果：  helloworld
			hello


从运行结果中我们可以看到，程序运行时会额外创建一个对象，保存 "helloworld"。当频繁操作字符串时，就会额外产生很多
临时变量。使用 StringBuilder 或 StringBuffer 就可以避免这个问题。至于 StringBuilder 和 StringBuffer ，它们基本相
似，不同之处，StringBuffer 是线程安全的，而 StringBuilder 则没有实现线程安全功能，所以性能略高。因此一般情况下，
如果需要创建一个内容可变的字符串对象，应优先考虑使用 StringBuilder 类。

那么如何定义 StringBuilder 类的对象呢？ 我们来看下面的代码：
	StringBuilder str1 = new StringBuilder();
							//创建一个空的StringBuilder对象
	StringBuilder str2 = new StringBuilder("imooc");
							//创建一个字符串"imooc"
	System.out.println(str2);

运行结果：  imooc；


StringBuilder 类提供了很多方法来操作字符串：


	方法 								说明
StringBuilder append(参数)			追加内容到当前 StringBuilder 对象的末尾
StringBuilder insert(位置，参数) 	将内容插入到 StringBuilder 对象的指定位置
String toString()					将 Stringbuilder 对象转化为 String 对象
int length()						获取字符串的长度


在下面的示例代码中，创建了 StringBuilder 对象，用来存储字符串，并对其做了追加和插入操作。这些操作修改了 str 对象的值，
而没有创建新的对象，这就是 StringBuilder 和 String 最大的区别。

	StringBuilder str = new StringBuilder("hello");
	str.append(" imooc");//在字符串后面追加字符串
	str.append(520);//在字符串后面追加整数
	System.out.println("字符串长度：" + str.length());
	System.out.println("插入前：" + str);

	str.insert(11, '!');//在指定位置插入内容
	string str2 = str.toString();//z转换为String对象
	System.out.println("插入后：" + str2);

运行结果：
			字符串长度：14
			插入前：hello imooc520
			插入后：hello imooc!520


	// 创建一个空的StringBuilder对象
    StringBuilder str = new StringBuilder();
	// 追加字符串
	str.append("jaewkjldfxmopzdm");
    // 从后往前每隔三位插入逗号
	for (int i = str.length() - 3; i>0 ; i = i -3 ) {
         str.insert(i, ',');  
    }
    // 将StringBuilder对象转换为String对象并输出
	System.out.print(str.toString());

运行效果： j,aew,kjl,dfx,mop,zdm

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
基本数据类型是不具备对象的特性的，比如基本类型不能调用方法、功能简单。。。，为了让基本数据类型也具备对象的特性， 
Java 为每个基本数据类型都提供了一个包装类，这样我们就可以像操作对象那样来操作基本数据类型。 
	
	基本类型	对应的包装类
	byte 			Byte
	short  			Short
	int 			Integer		
	long 			Long
	float 			Float
	double 			Double
	char 			Character
	boolean 		Boolean



包装类主要提供了两大类方法：

	1. 将本类型和其他基本类型进行转换的方法

	2. 将字符串和本类型及包装类互相转换的方法

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Integer 包装类的构造方法：

Integer(int value) 	创建一个 Integer 对象，表示指定的int值
Integer(String s)	创建一个 Integer 对象，表示String参数所指示的int值

如下代码所示：
int i = 2;	//定义int类型变量，值为2
Integer m = new Integer(5);	//定义 Integer 包装类对象，值为5
Integer n = new Integer("8");//定义 Integer 包装类对象，值为8

Integer 包装类的常用方法：

	返回值 			方法名 				解释
	byte 			byteValue()			将该Integer转为byte类型
	int 			intValue()			转为int类型
	long 			longValue() 		转为long类型
	float 			floatValue()		转为float类型
	double 			doubleValue()		转为doublle类型
	static int  	parseInt(String s)	将字符串转换为int类型
	String 			toString()			转为doublle类型
	static Integer	valueOf(String s)	将字符串转换为Integer类型




public class HelloWorld {
    public static void main(String[] args) {
        
		// 定义int类型变量，值为86
		int score1 = 86; 
        
		// 创建Integer包装类对象，表示变量score1的值
		Integer score2=new Integer(score1);
        
		// 将Integer包装类转换为double类型
		double score3=score2.doubleValue();
        
		// 将Integer包装类转换为float类型
		float score4=score2.floatValue();
        
		// 将Integer包装类转换为int类型
		int score5 =score2.intValue();

		System.out.println("Integer包装类：" + score2);
		System.out.println("double类型：" + score3);
		System.out.println("float类型：" + score4);
		System.out.println("int类型：" + score5);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////、
基本类型和包装类之间经常需要互相转换，以 Integer 为例（其他几个包装类的操作雷同哦）：
Integer a = new Integer(3); //创建Integer包装类对象，值为3
int b = a + 5;// 将对象和基本类型下进行运算

在 JDK1.5 引入自动装箱和拆箱的机制后，包装类和基本类型之间的转换就更加轻松便利了。

那什么是装箱和拆箱呢？我们分别来看下

1.装箱：把基本类型转换成包装类，使其具有对象的性质，又可分为手动装箱和自动装箱

int i =10l //定义一个int基本类型值
Integer x = new Integer(i);	//手动装箱
Integer y = i; // 自动装箱

2.拆箱：和装箱相反，把包装类对象转换成基本类型的值，又可分为手动拆箱和自动拆箱
Integer j = new Integer(8); //定义一个Integer包装类对象，值为8
int m = j.intValue(); //手动拆箱为int类型
int n = j; //自动拆箱为int类型


 定义double类型变量
		double a = 91.5;
         // 手动装箱
		Double b = new Double(a);    
        // 自动装箱
		Double c = a;
        System.out.println("装箱后的结果为：" + b + "和" + c);
        // 定义一个Double包装类对象，值为8
		Double d = new Double(87.0);   
        // 手动拆箱
		double e = d.doubleValue();
        // 自动拆箱
		double f = d;
         System.out.println("拆箱后的结果为：" + e + "和" + f);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////、
Java 中基本类型和字符串之间的转换
在程序开发中，我们经常需要在基本数据类型和字符串之间进行转换。

其中，基本类型转换为字符串有三种方法：

1. 使用包装类的 toString() 方法

2. 使用String类的 valueOf() 方法

3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串

//将基本类型转换为字符串
	int c = 10;
	double d = 78.5;
	String str1 = Integer.toString(c); 	方法1
	String str1 = Double.toString(d);

	String str2 = String.valueOf(c);	方法2
	String str2 = String.valueOf(d);

	String str3 = c + "";				方法3
	String str3 = m + "";

PS：其他基本类型与字符串的相互转化这里不再一一列出，方法都类似

将字符串转换为基本类型的两种方法
String str = “1800.20”；
	1.调用包装类的parseXxx静态方法
		Double a = Double.parseDouble(str);
	2.调用包装类的 valueOf()方法转换为基本类型的包装类，会自动拆箱
		Double b = Double.valueOf(str);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
使用 Date 和 SimpleDateFormat 类表示时间

在程序开发中，经常需要处理日期和时间的相关数据，此时我们可以使用 java.util 包中的 Date 类。这个类最主要的作用就是
获取当前时间，我们来看下 Date 类的使用：

	Date d = new Date(); // 使用默认的构造方法创建Date对象
	System.out.println(d);	//输出Date对象，表示当期时间

使用 Date 类的默认无参构造方法创建出的对象就代表当前时间，我们可以直接输出 Date 对象显示当前的时间，显示的结果如下：

Wed Jun 11 09:22:30 CST 2015
Wed 代表 Wednesday (星期三)， Jun 代表 June (六月)， 11 代表 11 号， CST 代表 China Standard Time (中国标准时间，也就是北京时间，东八区)。

此时就到了 java.text 包中的 SimpleDateFormat 类大显身手的时候了！！可以使用 SimpleDateFormat 来对日期时间进行格式化，
如可以将日期转换为指定格式的文本，也可将文本转换为日期。


1. 使用 format() 方法将日期转换为指定格式的文本
	//创建Date对象，表示当期时间
	Date d = new Date();
	//创建SimpleDateFormat对象，指定目标格式
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//调用format()方法，格式化时间，转换唯一指定格式字符串
	String today = sdf.format(d);
	//输出
	System.out.println(today);

运行结果： 2014-06-11  09:55:48


代码中的 “yyyy-MM-dd HH:mm:ss” 为预定义字符串， 
yyyy 表示四位年， MM 表示两位月份， dd 表示两位日期， 
HH 表示小时(使用24小时制)， mm 表示分钟， ss 表示秒，
这样就指定了转换的目标格式，最后调用 format() 方法将时间转换为指定的格式的字符串。




2. 使用 parse() 方法将文本转换为日期
	//创建日期格式字符串
	String day = "2014年02月14日10:30:25";
	//创建SimpleDateFormat对象
	SimpleDateFormat df = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
	//调用parse()将字符串转换为日期
	Date date = df.parse(day);
	//输出转换后的时间
	System.out.println("当前时间：" + date);

代码中的 “yyyy年MM月dd日 HH:mm:ss” 指定了字符串的d日期格式，调用 parse() 方法将文本转换为日期。

运行结果： Fir Feb 14 10:30:25 CST 2014






一定要注意哦：

1、 调用 SimpleDateFormat 对象的 parse() 方法时可能会出现转换异常，即 ParseException ，因此需要进行异常处理

2、 使用 Date 类时需要导入 java.util 包，使用 SimpleDateFormat 时需要导入 java.text 包

package com.imooc;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class hkiiqjwhd {
	public static void main(String[] args) throws ParseException{
		String day="2015年05月04日 20:15:12";
		SimpleDateFormat dre=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date today=dre.parse(day);
		System.out.println(today);
	}
}


public class hkiiqjwhd {
	public static void main(String[] args){
		String day="2015年05月04日 20:15:12";
		SimpleDateFormat dre=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		
		try{						//parse 可以预知会出现异常，所以必须处理可能会出现的异常要用try catch语句包裹
			Date today=dre.parse(day);
			System.out.println(today);	
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Calendar 类的应用

Date 类最主要的作用就是获得当前时间，同时这个类里面也具有设置时间以及一些其他的功能，但是由于本身设计的问题，
这些方法却遭到众多批评，不建议使用，更推荐使用 Calendar 类进行时间和日期的处理。

java.util.Calendar 类是一个抽象类，可以通过调用 getInstance() 静态方法获取一个 Calendar 对象，此对象已由当前
日期时间初始化，即默认代表当前时间，如 Calendar c = Calendar.getInstance();

那么如何使用 Calendar 获取年、月、日、时间等信息呢？我们来看下面的代码：


Calendar c = Calendar.getInstance(); //创建Canlendar对象
int year = c.get(Calendar.YEAR);//获取年
int month = c.get(Calendar.MONTH) +1 ;//获取月份，0表1月份
int day = c.get(Calendar.DAY_OF_MONTH);	//获取日期
int hour = c.get(Calendar.HOUR_OF_DAY);	//获取小时
int minute = c.get(Calendar.MINUTE);	//获取分钟
int second = c.get(Calendar.SECOND);	//获取秒

System.out.println("当前时间：" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);

1.	调用 Calendar 类的 getInstance() 方法获取一个实例，然后通过调用 get() 方法获取日期时间信息，
	参数为需要获得的字段的值， Calendar.Year 等为 Calendar 类中定义的静态常量。



2.	Calendar 类提供了 getTime() 方法，用来获取 Date 对象，完成 Calendar 和 Date 的转换，
	还可通过 getTimeInMillis() 方法，获取此 Calendar 的时间值，以毫秒为单位。如下所示：


Date date = c.getTime(); //将Calendar对象转换为Date对象
long time = c.getTimeInMillis(); //获取当前毫秒数
System.out.println("当前时间：" + date);
System.out.println("当前毫秒数：" + tiime);


输出：
	当前时间：2016-1-12 19:25:10
	当前时间：Tue Jan 12 19:25:10 CST 2016
	当前毫秒数：1452597910615



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
    
    public static void main(String[] args) {
		// 创建Canlendar对象
		Calendar c = Calendar.getInstance();
        
		// 将Calendar对象转换为Date对象
		Date date = c.getTime();
        
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		// 将日期转换为指定格式的字符串
		String now = sdf.format(date);
		System.out.println("当前时间：" + now);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
使用 Math 类操作数据

Math 类位于 java.lang 包中，包含用于执行基本数学运算的方法， Math 类的所有方法都是静态方法，所以使用该类中的方法时，
可以直接使用类名.方法名，如： Math.round();

常用的方法

返回值 			方法名 			解释
long 			round()			返回四舍五入后的整数
double 			floor()			返回小于参数的最大整数
double 			ceil()			返回大于参数的最小整数
double 			random()		返回[0,1)之间的随机数浮点数


double a = 12.81; //定义一个double类型变量
int b = (int) a; //将double类型强制转换为int类型，去掉小数点
System.out.println("强制类型转换：" + b);

long c = Math.round(a);//调用round方法，进行四舍五入
System.out.println("四舍五入：" + c);

double d = Math.floor(a);//调用floor方法，返回小于参数的最大整数
System.out.println("floor：" + d);

double e = Math.ceil(a);//调用ceil方法，返回大于参数的最小值
System.out.println("ceil：" + e);

double x = Math.random();//调用random方法，返回[0,1)之间的随机数浮点数
System.out.println("随机数：" + e);

int y = (int)(Math.random() * 99); //返回[0,99)之间的随机整数
System.out.println("[0,99)之间的随机整数：" + y);



强制类型转换：12
四舍五入：13
floor：12.0
ceil：13.0
随机数：13.0
[0,99)之间的随机整数：22



public class HelloWorld {
    
    public static void main(String[] args) {
        
        // 定义一个整型数组，长度为10
		int[] nums = new it[10];
        
        //通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
			int x = (int)(Math.random() * 10);
            
			nums[i] = x;// 为元素赋值
		}
        
		// 使用foreach循环输出数组中的元素
		for ( int nums: nums ) {
			System.out.print(num + " ");
		}
	}
}public class HelloWorld {
    
    public static void main(String[] args) {
        
        // 定义一个整型数组，长度为10
		int[] nums = new it[10];
        
        //通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
			int x = (int)(Math.random() * 10);
            
			nums[i] = x;// 为元素赋值
		}
        
		// 使用foreach循环输出数组中的元素
		for ( int nums: nums ) {
			System.out.print(num + " ");
		}
	}
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
集合框架
	java中的集合类：是一种工具类，就像是容器，存储任意数量的具有共同属性的对象

	集合的作用
		在类的内部，对数据进行组织；
		简单而快速的搜索大数量的条目
		有的集合接口，提供了一系列排列有序的元素并且可以在序列中间快速的插入或者删除有关元素
		有的集合接口，提供了映射关系，可以通过关键字（key）去快速查找到对应的唯一对象，而这个关键字可以是任意类型

	与数组的对比——为何选择集合而不是数组
		数组的长度固定，集合长度可变
		数组只能通过下标访问元素，类型固定，而有的集合可以通过任意乐享查找所映射的具体对象

	java集合框架体系结构
	Collection
		List（序列）
			ArraysList
		Queue（队列）
			LinkedList（列表）（Collection也指向它）
		Set（集）
			HashSet（哈希集）
	Map（内部<Key, Value>两个对象为一个映射去存储数据，这样一个映射就是 Entry类(键值对) 实例）
		HashMap

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Collection接口、子接口以及实现类

Collection接口
	是List、Set和Queue接口的父接口
	定义了可用于操作List\Set\Queue的方法——增删改查

	List接口及其实现类————ArrayList
		list是元素有序并且可以重复的集合，被称为序列
		List可以精确的控制每个元素的插入位置，或删除某个位置元素
		ArraysList——数组序列，是List的一个重要实现类
		ArraysList底层是由数组实现的
			.add()
			.addAll()
			.remove()
			.removeAll()
Set接口及其实现类
	Set是元素无序并且不可以重复的集合，被称为集
	HashSet——哈希集，是Set的一个重要实现类
			.add()
			.addAll()
			.remove()
			.removeAll()


泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则会报错！
public List<Course> coursesToSelect;


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////



package com.imooc.collection;

public class ChildCourse extends Course {

}
////////////////////////////////////////////////////////////////////////////////////////
package com.imooc.collection;

/**
 * 课程类
 * @author Administrator
 *
 */
public class Course {

	public String id;
	
	public String name;
	
	public Course(String id, String name) {
		this.id = id ;
		
		this.name = name;
	}
	
	public Course() {
		
	}
}

////////////////////////////////////////////////////////////////////////////////////////
package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 * @author Administrator
 *
 */
public class ListTest {

	/**
	 * 用于存放备选课程的List
	 */
	public List coursesToSelect;
	
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void testAdd() {
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1" , "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name); 
		
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(2);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name); 
		
		
		//以下方法会抛出数组下标越界异常
//		Course cr3 = new Course("3", "test");
//		coursesToSelect.add(4, cr3);
		
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		
		System.out.println("添加了两门课程：" + temp3.id + ":" + 
				temp3.name + ";" + temp4.id + ":" + temp4.name);
		
		Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程：" + temp5.id + ":" + 
				temp5.name + ";" + temp6.id + ":" + temp6.name);
		
	}
	
	/**
	 * 取得List中的元素的方法
	 * @param args
	 */
	public void testGet() {
		int size = coursesToSelect.size();//长度
		System.out.println("有如下课程待选：");
		for(int i= 0 ; i < size; i++) {
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 通过迭代器来遍历List
	 * @param args
	 */
	public void testIterator() {
		//通过集合的iterator方法，取得迭代器的实例
		Iterator<Course> it = coursesToSelect.iterator();
		System.out.println("有如下课程待选(通过迭代器访问)：");
		while(it.hasNext()) {
			Course cr = it.next();
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 通过for each方法访问集合元素
	 * @param args
	 */
	public void testForEach() {
		System.out.println("有如下课程待选(通过for each访问)：");
		for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 修改List中的元素
	 * @param args
	 */
	public void testModify() {
		coursesToSelect.set(4, new Course("7", "毛概"));
	}
	
	/**
	 * 删除List中的元素
	 * @param args
	 */
	public void testRemove() {
//		Course cr = (Course) coursesToSelect.get(4);
		System.out.println("即将删除4位置和5位置上的课程！");
		Course[] courses = {(Course) coursesToSelect.get(4), (Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		//		coursesToSelect.remove(4);
		System.out.println("成功删除课程！");
		testForEach();
	}
	
	/**
	 * 往List中添加一些奇怪的东西
	 * @param args
	 */
	public void testType() {
		System.out.println("能否往List中添加一些奇怪的东西呢！？");
		coursesToSelect.add("我不是课程，我只是一个无辜的字符串！！");
	}
	
	public static void main( String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();

		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();

		
//		lt.testType();
//		lt.testForEach();
	}
}

//////////////////////////////////////////////////////////////////////////////////////////
package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * @author Administrator
 *
 */
public class Student {

	public String id;
	
	public String name;
	
	public Set<Course> courses;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////
package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;

	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}

	/**
	 * 用于往coursesToSelect中添加备选课程
	 */
	public void testAdd() {
		// 创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		// System.out.println("添加了课程：" + temp.id + ":" + temp.name);

		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		// System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);

		// coursesToSelect.add(cr1);
		// Course temp0 = (Course) coursesToSelect.get(2);
		// System.out.println("添加了课程：" + temp.id + ":" + temp.name);

		// 以下方法会抛出数组下标越界异常
		// Course cr3 = new Course("3", "test");
		// coursesToSelect.add(4, cr3);

		Course[] course = { new Course("3", "离散数学"), new Course("4", "汇编语言") };
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);

		// System.out.println("添加了两门课程：" + temp3.id + ":" +
		// temp3.name + ";" + temp4.id + ":" + temp4.name);

		Course[] course2 = { new Course("5", "高等数学"), new Course("6", "大学英语") };
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		// System.out.println("添加了两门课程：" + temp5.id + ":" +
		// temp5.name + ";" + temp6.id + ":" + temp6.name);

	}

	/**
	 * 通过for each方法访问集合元素
	 * 
	 * @param args
	 */
	public void testForEach() {
		System.out.println("有如下课程待选(通过for each访问)：");
		for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		// 创建一个学生对象
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生：" + student.name + "选课！");
		// 创建一个Scanner对象，用来接收从键盘输入的课程ID
		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr : st.coursesToSelect) {
				if (cr.id.equals(courseId)) {
					student.courses.add(cr);
					/**
					 * Set中，添加某个对象，无论添加多少次， 最终只会保留一个该对象（的引用）， 并且，保留的是第一次添加的那一个
					 */
					// student.courses.add(null);
					student.courses.add(cr);
				}
			}
		}
		st.testForEachForSet(student);
	}

	public void testForEachForSet(Student student) {
		// 打印输出，学生所选的课程！
		System.out.println("共选择了：" + student.courses.size() + "门课程！");
		for (Course cr : student.courses) {
			System.out.println("选择了课程：" + cr.id + ":" + cr.name);
		}
	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////
package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	/**
	 * 带有泛型――Course，的List类型属性
	 */
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	
	/**
	 * 测试添加
	 */
	public void testAdd() {
		Course cr1 = new Course("1","大学语文");
		courses.add(cr1);
		//泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则会报错！
//		courses.add("能否添加一些奇怪的东西呢？？");
		Course cr2 = new Course("2","Java基础");
		courses.add(cr2);
	}
	
	/**
	 * 测试循环遍历
	 */
	public void testForEach() {
		for (Course cr : courses) {
			System.out.println(cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * 泛型集合可以添加泛型的子类型的对象实例
	 */
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "我是子类型的课程对象实例~~";
		courses.add(ccr);
	}
	
	/**
	 * 泛型不能使用基本类型
	 */
	public void testBasicType() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本类型必须使用包装类作为泛型！" + list.get(0));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Map 接口
	Map 提供了一种映射关系，其中的元素是以键值对（key-value）的形式存储的，能够实现根据key快速查找value
	Map 中的键值对以Entry类型的对象实例形式存在
	键（key值）不可重复，value值可以
	每个键最多只能映射到一个值（key值）
	Map 接口提供了分别返回key值集合、value值集合以及Entry（键值对）集合的方法
	Map 支持泛型，形如：Map<K,,V>
		put(K key, V value) 
			将指定的值与此映射中的指定键关联
		remove(Object key)方法
			如果存在一个键的映射关系，则将其从此映射中移除
		keySet()
			返回此映射中包含的键的 Set 视图
		values()
		 	返回此映射中包含的值 Collection 视图
		entrySet()
			返回此映射中包含的映射关系 Set 视图
HashMap类
	HashMap是Map的一个重要实现类，也是最常用的，基于哈希表实现
	HashMap中的entry对象时无序排列的
	Key值和value值都可以为null，但是一个HashMap只能有一个Key值为null的映射（key值不可重复）







package com.imooc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	/**
	 * 用来承装学生类型对象
	 */
	public Map<String, Student> students;

	/**
	 * 在构造器中初始化students属性
	 */
	public MapTest() {
		this.students = new HashMap<String, Student>();
	}

	/**
	 * 测试添加：输入学生ID，判断是否被占用 若未被占用，则输入姓名，创建新学生对象，并且 添加到students中
	 */
	public void testPut() {
		// 创建一个Scanner对象，用来获取输入的学生ID和姓名
		Scanner console = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("请输入学生ID：");
			String ID = console.next();
			// 判断该ID是否被占用
			Student st = students.get(ID);
			if (st == null) {
				// 提示输入学生姓名
				System.out.println("请输入学生姓名：");
				String name = console.next();
				// 创建新的学生对象
				Student newStudent = new Student(ID, name);
				// 通过调用students的put方法，添加ID-学生映射
				students.put(ID, newStudent);
				System.out.println("成功添加学生：" + students.get(ID).name);
				i++;
			} else {
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
	}

	/**
	 * 测试Map的keySet方法
	 */
	public void testKeySet() {
		// 通过keySet方法，返回Map中的所有“键”的Set集合
		Set<String> keySet = students.keySet();
		// 取得students的容量
		System.out.println("总共有：" + students.size() + "个学生！");
		// 遍历keySet，取得每一个键，再调用get方法取得每个键对应的value
		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if (st != null)
				System.out.println("学生：" + st.name);
		}
	}

	/**
	 * 测试删除Map中的映射
	 */
	public void testRemove() {
		// 获取从键盘输入的待删除学生ID字符串
		Scanner console = new Scanner(System.in);
		while (true) {
			// 提示输入待删除的学生的ID
			System.out.println("请输入要删除的学生ID！");
			String ID = console.next();
			// 判断该ID是否有对应的学生对象
			Student st = students.get(ID);
			if (st == null) {
				// 提示输入的ID并不存在
				System.out.println("该ID不存在！");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生：" + st.name);
			break;
		}
	}

	/**
	 * 通过entrySet方法来遍历Map
	 */
	public void testEntrySet() {
		// 通过entrySet方法，返回Map中的所有键值对
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键：" + entry.getKey());
			System.out.println("对应的值为：" + entry.getValue().name);
		}
	}

	/**
	 * 利用put方法修改Map中的已有映射
	 */
	public void testModify() {
		// 提示输入要修改的学生ID
		System.out.println("请输入要修改的学生ID：");
		// 创建一个Scanner对象，去获取从键盘上输入的学生ID字符串
		Scanner console = new Scanner(System.in);
		while (true) {
			// 取得从键盘输入的学生ID
			String stuID = console.next();
			// 从students中查找该学生ID对应的学生对象
			Student student = students.get(stuID);
			if (student == null) {
				System.out.println("该ID不存在！请重新输入！");
				continue;
			}
			// 提示当前对应的学生对象的姓名
			System.out.println("当前该学生ID，所对应的学生为：" + student.name);
			// 提示输入新的学生姓名，来修改已有的映射
			System.out.println("请输入新的学生姓名：");
			String name = console.next();
			Student newStudent = new Student(stuID, name);
			students.put(stuID, newStudent);
			System.out.println("修改成功！");
			break;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		// mt.testRemove();
		// mt.testEntrySet();
		// mt.testModify();
		// mt.testEntrySet();

	}

}




//////////////////////////////////////////////////////////////////////////////////////////////////////////////


Contains方法
ContainsAll方法


hasshCode方法

Collections工具类
sort()排序

Comparable 默认比较规则
	可比较的
	实现该接口表示:这个类的实例可以比较大小，可以进行自然排序
	定义了默认的比较规则
	其实现类需实现 compareTo()方法
	compareTo()方法返回正数表示大，负数表示小，0表示相等


Comparator 临时比较规则
	比较工具接口
	用于定义临时比较规则，而不是默认比较规则
	其实现类需要 compare()方法
	Comparator 和 Comparable 都是java集合框架的成员




java集合框架
	Collection接口
	Collections工具类
	Map接口
	Comparator接口
	Comparable接口

































































































































































