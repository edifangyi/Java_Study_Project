
javascript

1、JavaScript的简介
	* 是基于对象 和 事件驱动语言，应用于客户端
	** 基于对象：在js里面提供好了一些对象，直接使用
	** 事件驱动：响应事件（比如鼠标每次滑动，产生一个新的图片）
	** 客户端：浏览器

	* javascript实现网页简单的动态的效果

	* 三个特点
	*** 交互性
	*** 安全性：JavaScript不可以访问本地磁盘的文件
	*** 跨平台性：只有浏览器可以支持JavaScript都可以运行js代码

	* JavaScript和java区别（雷锋和雷峰塔）
	** java是sun公司，现在oracle公司；js是网景公司。
	** JavaScript 是基于对象的，java是面向对象
	** java运行需要虚拟机，js直接使用浏览器可以运行
	** js是弱类型语言，java强类型的语言
		** 比如在java里面定义变量 int i = 10; 但是int m = "10";不正确的。
		** 在js里面没有这样的限制。var n = 10; var m = "10"; var a = true;
	
	* js的组成（三部分）
	* 第一部分：ECMAScript
		* ECMA：欧洲计算机协会
		* 由这个组织制定的一个js规范（包含语句，语法）

	* 第二部分：BOM：浏览器对象模型
		
	* 第三部分：DOM：文档对象模型

2、js和html两种结合方式
	* 第一种：使用html的标签 <script type="text/javascript"> js代码; </script>
		* 代码
		<script type="text/javascript">
			alert("aaaa");
		</script>
	* 第二种：
		** 首先创建js文件
		** <script type="text/javascript" src="js文件路径"> </script>
		** 就不要在script标签里面写js代码了，也不会执行
		** <script type="text/javascript" src="js文件路径"/>这种写法找不到js文件

3、js的数据类型和变量声明
	* java里面基本数据类型 byte short int long float double char boolean
	* 在js里面定义变量，都使用一个关键字 var

	* 提供了方法 typeof(变量名称)： 查看变量的类型

	* js原始类型（五个）
	** string
		var str = "aaa";
	** number
		var m = 10;
	** boolean
		var flag = true;

	** null：表示对象的引用为空，空对象
		** var date = null; //new Date();
	** undifined：定义变量，但是变量没有赋值 var m;
	
	* js的注释
	** 和java里面的单行注释和多行注释一样的
	** 单行注释 //
	** 多行注释 /*  */
 
4、js的语句
	* java里面的语句 : 
	** 循环 for  while  do-while
	** 判断语句 if() {} else if() {}else{}
	** switch语句，在jdk1.7开始支持string类型
		*** switch(m) {
			case 1:
				break;
			case 2:
				break;
			default:
		}
	
	* js的判断语句if
		** //if语句
		var i = 100;
		if(i==10) {
			alert("i==10");
		} else {
			alert("i!=10");
		}
	
	* switch语句
		** //switch语句
		var m = 50;
		switch(m) {
			case 3:
				alert("m==3");
				break;
			case 5:
				alert("m==5");
				break;
			default:
				alert("other");
		}
	
	* 循环语句 for
		** //for循环语句
		for(var i=0;i<3;i++) {
			alert(i);
		}

		** i++和++i区别

	* 引入：向页面输出内容
		** document.write("aaa");
		** 向页面输出html代码

5、使用js的语句实现99乘法表
	* 	document.write("<table border='1' bordercolor='blue'>");
		for(var i=1;i<=9;i++) { //循环9行 
			document.write("<tr>");
			//循环列
			for(var j=1;j<=i;j++) {
				document.write("<td>");
				document.write(j+"*"+i+"="+i*j);
				document.write("</td>");
			}
			//document.write("<br/>");
			document.write("</tr>");
		}
		document.write("</table>");

6、js的运算符
	* 数字运算不区分整数和小数
	   var m = 123/1000*1000;  结果：123
	
	* 字符串的操作
		//字符串的运算
		var str = "123";
		document.write(str+1); //字符串的拼接
		document.write("<br/>");
		document.write(str-1); //相减的运算

		* 如果字符串不是一个数字，如果相减操作，显示 NaN：表示不是一个数字

	* boolean类型的运算
		** 如果值true，把值当成1
		** 如果值flase，把值当成0
		//boolean类型加减
		//var flag = true;
		//document.write(flag+1); //把true当成1
		//document.write("<br/>");

		var flag1 = false;
		alert(flag1+1); //把false当成0
	
	* ==和===区别
		* == 比较的是值，和类型无关
		* === 比较的是类型和值

7、js的数组
	* java里面定义数组 String[] arr = {"aa","cc"};
	* js的数组三种定义方式
	* 第一种方式： var arr1 = [1,2,"3",true];
	* 第二种方式：使用到一个内置对象Array
		var arr2 = new Array(3);
		** 定义数组名称是arr2，数组的长度是3
		** 赋值：
		arr2[0] = "aaa";
		arr2[1] = "bb";
		arr2[2] = "ccc";
	* 第三种方式：使用到一个内置对象Array
		var arr3 = new Array(4,5,6);
		** 定义数组名称是arr3，数组里面的元素是4 5 6
	
	* 在js的数组里面有一个属性length：表示数组的长度
		** document.write("length: "+arr2.length);
	
	* js里面的数组的长度是可变的
		* 比如定义一个数组长度是3，但是赋值时候可以随便写下标的值
		* 数组的长度就是最大的下标+1

8、js的函数
	* 在java里面定义方法
	** public void/int 方法名(参数列表) {
		方法体;
		返回值;
	}
	public void get1(int a) {}

	** js里面定义函数有三种方式
	** 第一种方式：需要使用一个关键字 function
		** 格式： 
		function 方法名(参数列表) {
			方法体和返回值;
		} 

		** 示例
		function add1(a,b) {
			方法体;
			返回值;(可以有也可以没有)
		}

		* 方法定义之后，需要调用才能执行
		* 代码
		//第一种方式创建函数
		function test1() {
			alert("abcd");
		}

		//调用方法
		//test1();

		function add1(a,b) {
			var sum = a+b;
			return sum;
		}
		alert(add1(2,3));

	** 第二种方式(动态函数)：使用js里面的内置对象 Function
		var add2 = new Function("参数列表","方法体和返回值");
		* var arguments1 = "a,b";
		var method1 = "var sum;sum=a+b;return sum;";
		//第二种方式创建函数
		var add1 = new Function(arguments1,method1);
		alert(add1(3,4));
	
	** 第三种方式（匿名函数）：直接使用function的关键字
		var add3 = function(参数列表) {
			方法体和返回值;
		}
		* //第三种创建方式
		var add2 = function(m,n) {
			return m+n;
		}
		//调用
		alert(add2(5,6));

9、js的重载
	* 什么是重载：方法名称相同，参数列表不同
	* JS里面不存在重载，但是执行过程

10、js的全局变量和局部变量
	* 全局变量：在script标签里面定义一个变量，这个变量在当前页面的所有的script标签里面都可以使用
		**<script type="text/javascript">
		//定义变量m值10
		var m = 10;
		//直接在script标签里面使用变量
		alert("在script标签里面使用变量: "+m);
		//定义方法
		function test11() {
			alert("在方法内部使用变量："+m);
		}
		test11();
		</script>

		<script type="text/javascript">
			alert("在另外的一个script标签使用变量: "+m);
		</script>

	* 局部变量：在方法里面定义一个变量，这个变量只能在这个方法里面使用
		* 	//定义方法
			function test13() {
				var aa = 5;
				alert("in method： "+aa);
			}

			test13();

			alert("outer method: "+aa);
		* 出现错误：SCRIPT5009: “aa”未定义 
	
	* 调试工具的使用
	** 在ie里面使用f12，在页面下面出现一个条，选择控制台
	** 在火狐里面使用f12，在页面下面出现一个条，选择控制台 

11、script标签放在什么位置
	* 获取输入项里面的值： document.getElementById("nameid").value;
	* script标签放到</body>后面
	** html的加载顺序是从上到下加载的，如果把script标签放到head里面，如果也要在js里面获取下面的输入框里面的值，
	这个时候会有问题，因为页面还没有加载到输入框地方，所有这个值肯定取不到。
	//无法获取属性“value”的值: 对象为 null 或未定义

12、eclipse和myeclipse区别
	* eclipse：免费开发工具
	* myeclipse：是一个收费的插件
	** 破解myeclipse工具
	** 建议安装myeclipse10版本




