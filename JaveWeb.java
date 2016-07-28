
day01

课程内容介绍

1、html的简介
	* HyperText Markup Language：超文本标记语言，网页语言。

	** 超文本：超出文本的范畴。
	** 标记：标签，html的所有操作都是通过标签来实现
	** 网页的语言

	** 如何使用html？
	
	** 第一个html程序 后缀名是.html .htm
	*** 这是我的第一个<font color="red" size="5">html程序！</font>

	** 写html程序时候规范：
	（1）html程序以<html>开始，同时</html>结束，范围
		** java方法范围 public void test1() { }
	（2）在<html>范围里面包含两部分：<head>设置html一些相关的信息</head>  和 <body>在页面上显示的内容都写到body里面</body>
		** <head>
			<title>hello html</title>
		 </head>
	（3）html的标签不区分大小写
	（4）html的标签有开始标签，也要有结束标签   <title> </title>
	（5）如果想要对html里面数据进行样式的变化，
	需要使用标签把数据包起来，通过修改标签的属性和属性值实现标签内数据样式的变化	
	（6）个别的标签，没有结束标签,在标签内结束 比如换行标签 <br/>

2、html的操作思想（***）
	* 在网页中可能有很多的数据，但是不同的数据可能需要不同的显示效果，这个时候使用标签把数据包起来，通过修改标签
	的属性值来实现标签内数据样式的变化。而一个标签相当于容器，修改容器的属性值可以实现容器内数据样式的变化。

3、html的常用的标签（一）
	（1）文字标签和注释标签
	* 字体标签 ： <font></font>
	** color: 字体的颜色
		** 使用英文单词 ：red  blue  green  yellow  orange  gray....
		** 使用十六进制数进行表示 #ffffff, RGB，直接使用工具 
	** size: 字体的大小
		** 使用值 1-7 字体大小的范围 ，大小超过7，还是按照大小7显示
	
	* 标题标签 
		<h1></h1>  <h2></h2>........<h6></h6>
		** 自动换行，从h1到h6字体大小依次变小的
	
	* 水平线标签
		<hr/>
		** color: 水平线的颜色
		** size: 水平的粗细 使用值 1-7 字体大小的范围
	
	* 特殊字符
		** 比如想要在html中显示这样的效果 <html>:是html程序的开始
		** 特殊字符需要进行转义
		**  <  ：&lt;
		     >  : &gt;
		     &  : &amp;
		   空格 ：&nbsp;
	
	* 注释标签
		** java里面注释有三种  ： 单行注释 //  多行注释 /*  */  文档注释 /** */
		** html的注释 <!--  -->


	* 列表标签
		** 想要在页面中实现这样的效果
			上海黑马
			     财务部
			     人事部
			     教育部
		** <dl> </dl> : 表示列表的范围
		** 在dl标签里面 <dt></dt>: 上层内容   <dd></dd>：下层的内容
		** 代码
		<dl>
			<dt>上海黑马</dt>
			<dd>财务部</dd>
			<dd>人事部</dd>
			<dd>教育部</dd>
		</dl>


		** 想要在页面中显示这样的效果(有序列表)
			1.财务部
			2.人事部
			3.教育部

			a.财务部
			b.人事部
			c.教育部

			  i.财务部
			 ii.人事部
			iii.教育部
		** <ol></ol>: 表示有序列表的范围
			** 属性 type： 表示根据什么进行排序 默认的情况下，使用 1 
			            type属性里面的值 1 a  i
		** 在ol里面 使用 <li>写具体的内容</li>


		** 无序列表 
			使用符号（黑点）财务部
			使用符号（黑点）人事部
			使用符号（黑点）教育部
		** <ul></ul>: 表示无序列表的范围 type属性：使用什么符号
			*** 空心圆circle 、实心圆disc 、实心方块square ，默认disc

		** 在ul里面 使用 <li>写具体的内容</li>

	** 图像标签
		*** 可以在页面中显示图片
		*** <img src="图片的路径"/>
		**** 属性
		**** width：图片的宽度
		**** height：图片的高度

		**** alt: 在图片上显示的文字（在某些浏览器下面，不支持）
			** 如果图片存在，鼠标放到图片上，显示文字；如果图片不存在，在图片的位置显示文字


	** 路径的介绍

		*** 两种：绝对路径和相对路径
		*** 绝对路径：图片的完全路径  C:\Users\asus\Desktop\0518\day01\code\a.jpg
		                              http://www.baidu.com/1.png
		
		*** 相对路径
			* 如果图片和html文件在一个目录下面，可以直接写图片的名称

			* 图片在html所在目录的下层目录
			** C:\Users\asus\Desktop\0518\day01\code\ .html
			** C:\Users\asus\Desktop\0518\day01\code\ img\.jpg
			*** 找html文件所在路径是什么 code
			*** 找图片所在的路径在 code路径的什么位置 
				 img/a.jpg
				 - <img src="img/w02.jpg" width="400" height="400"/>
			
			* 图片在html所在目录的上层目录
			** C:\Users\asus\Desktop\0518\day01\ code\.html
			** C:\Users\asus\Desktop\0518\day01\ w01.png
			*** 找html所在路径 code
			*** 找图片的所在的路径和code路径什么位置 
			- day01在code上层目录  ../ : 表示上层目录
				../w01.png
			*** 表示上层目录的上层目录 ../../


4、练习：使用列表标签实现商品的列表
	** 核心代码
	<dl>
		<dt><img src="images/photo_01.jpg"/></dt>
		<dd>一口价：49.00</dd><br/>
		全国包邮！韩版修身长袖T恤 打底衫 纯棉圆领T恤</dd>
	</dl>


===================================================== 
      任务一：完成商品的列表练习剩余的部分


5、html的常用的标签（二）
	** 超链接标签：一般实现两个功能
	** 第一个功能：链接资源
	** 超链接标签的使用
	** <a href="链接到地址"> 在页面上显示的内容</a>
	** 属性：设置打开方式，默认的情况下，在当前页打开
	*** target: _self:在当前页面打开   _blank：在新窗口打开
	
	** 第二个功能：定位资源
	*** 首先第一步，定义位置 <a name="位置的名称">顶部</a>
	*** 第二步：回到位置 <a href="#位置的名称">回到位置</a>

	*** 引入标签
		<pre></pre>: 原样输出

	
	** 表格标签
		** 对数据进行格式化操作
		** 技巧：首先数表格里面有多少行，数每行里面有多少个单元格

		** <table></table>: 表示定义了表格的范围
			*** 属性 border：表格线 1-7
			*** bordercolor: 设置表格线的颜色
			*** cellspacing: 设置单元格之间的距离
			*** cellpadding: 设置内容和单元格之间的距离
			*** width:表格的宽度
			*** height：表格的高度

		** <tr></tr>: 每一行
			*** 设置显示方式 align: left center right
		** <td></td>：单元格
			*** 设置显示方式 align: left center right
		
		** 表示单元格时候，除了使用td之外，<th></th>
			*** 居中和加粗
		
		** 合并单元格的操作
		** 操作思想：首先数表格里面有多少行，数每行里面有多少个单元格
		*** rowspan: 跨行
			** 代码
			<tr>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td rowspan="4">人员信息</td>
			</tr>
		*** colspan：跨列
			** 代码
			<tr>
				<td colspan="4">人员信息</td>
			</tr>
		
		** 标题标签 <caption>标题名称</caption>
			

6、html的表单标签
	* 比如注册页面，使用表单标签可以实现把填写的注册信息，提交到服务器

	*** 使用表单提交的时候，
	要求一：在每个输入项里面必须要有一个name属性
	要求二：在单选框、复选框、下拉框里面必须value

	* <form></form>: 表单的范围
	** 如果不设置，默认提交到当前页面
	** 使用form里面属性 action:设置提交到页面
	** 属性method：设置表单的提交方式，在默认的情况下，提交方式是 get方式
	*** 表单提交方式有很多种，但是常用的就是两种 get和post
		***如果使用提交方式是post，提交的数据放到请求体里面（在第七天详细讲到）

	*** 表单的提交方式get和post区别
		* get请求在地址栏会携带数据，但是post请求不会携带数据
		* get请求安全性很低，post安全性比较高
		* get请求数据的大小会有限制，post大小没有限制


	* 在form标签里面 输入项：可以输入内容的地方，选择内容的地方

	* 大多数的输入项 使用 <input type=""/>标签

	** 普通输入项： <input type="text"/>
	** 密码输入项： <input type="password"/>

	** 单选输入项： <input type="radio"/>
		*** 要求：必须有属性 name， 同时name的属性值必须相同
		*** 默认选中 checked="checked"

	** 复选输入项：<input type="checkbox"/>
		*** 要求：必须有属性 name， 同时name的属性值必须相同
		*** 默认选中 checked="checked"

	** 文件上传项：<input type="file"/>

	** 提交按钮： <input type="submit"/>,默认显示的内容：提交查询内容，但是可以修改显示的内容
		** 属性 value

		** file:///C:/Users/asus/Desktop/0518/day01/code/08-表单标签的使用一.html
		?sex=on&love=on&school=aaaa

		** file:///C:/Users/asus/Desktop/0518/day01/code/08-表单标签的使用一.html
		?username=wwww&password=wwwww&sex=on&love=on&love=on&school=bbbb&description=wwwwww
		** 提交数据在地址后面?输入项name值=输入的值

		** 设置了value值 
		file:///C:/Users/asus/Desktop/0518/day01/code/08-表单标签的使用一.html
		?username=qqq&password=qqq&sex=nv&love=lanqiu&love=pingpang&love=wangqiu&school=cccc&description=qqqq
	
	** 提交操作使用图片：<input type="image" src="图片的路径"/>
		*** <input type="image" src="a.jpg"/>

	** 重置按钮：<input type="reset" value=""/>： 回到输入项的初始状态

	** 隐藏项：<input type="hidden" name="hid" value="aaaaaa"/>
		*** 输入项不在页面中显示，但是可以提交到服务器

	** 下拉选择框：不是使用input标签了
	<select name="school">
		<option>石家庄跌路学院</option>
		<option selected="selected">蓝翔学院</option>
		<option>上海黑马</option>
	</select>

	** 文本域： 不使用input标签
		<textarea rows="" clos=""></textarea>

7、练习：使用表单标签实现注册页面

=============================================
	任务二：对照页面效果图，完成注册页面


8、html中的其他的标签的使用
	b : 加粗
	u ：下划线
	i ：斜体
	p : 段落标签
	s : 在文字上面显示删除线
	pre ：原样输出	
	sub : 下标
	sup : 上标
	
	div ：自动换行
	span：在一行显示

9、html的头标签的使用
	** 头标签需要写在 <head></head>里面
	* title：显示在标签栏内容
		<head>
			<title>标题内容</title>
		</head>

	* base：设置超链接的信息
		** <base target="_blank"></base>
		
	* meta：设置页面一些相关的信息
		<meta name="keywords" content="复仇者联盟,速度与激情,大头儿子小头爸爸">

	* link：引入外部资源文件
		* 在html里面使用css文件，可以使用link标签

10、html的框架标签（会用）
	* <frameset>: 页面划分方式
		** 两个属性 rows：上下划分  cols：左右划分
	* <frame>：具体封装的页面

	** <frameset rows="80,*">                 //首先把页面划分上下两部分
		<frame name="top" src="a.html">   //划分的上面部分，上面的部分页面是a.html

		<frameset cols="150,*">           //划分的下面部分，划分成左右两部分
			<frame name="lower_left" src="b.html">   
			<frame name="lower_right" src="c.html"> 
		</frameset> 
	</frameset> 

	* 在b.html里面的内容显示到c.html的位置，需要在b.html里面的超链接里面 
	   <a href="hello.html" target="lower_right">超链接一</a>

	** 这个标签不能写到body里面，但是也不能写在body外面，需要把body去掉

=================================
需要安装浏览器类型： ie浏览器（ie9 10）、火狐浏览器、谷歌浏览器
** 有一个快捷键：无缓存刷新 ctrl f5

11、扩展a标签（了解）
	* 在a标签里面访问的是一个网络资源，这个时候，必须要写 协议 http://www.baidu.com
	** 如果不写协议，到本地文件夹里面去找资源
	
	*  http是一个网络的公共协议，所有浏览器都支持，但是有一些协议，不是公共的协议，是由一些公司自己开发的协议
	** thunder:///kkkkk
	** ed2k://2222
	** mailto:123@163.com
	*** 比如下载迅雷资源，这个时候启动迅雷软件，浏览器不支持的协议，
	如果访问时候，会到本地系统里面，找支持这个协议的软件


/**
 
 */


day02

昨天内容回顾
	1、html的操作思想

	2、font标签

	3、html的注释和java注释

	4、图像标签

	5、路径问题
		* 相对路径
		* 同级目录直接写文件名称
		* 上层目录 ../
		* 下层目录 
	
	6、超链接标签
		<a href="" target="_self/_blank"></a>

	7、表格标签
		* 数多少行，数每行里面有多少个单元格
		** <th>: 居中和加粗
		* rowspan  colspan
	
	8、表单标签
		* form里面action method
		* get和post区别

		* text password radio checkbox submit reset select textarea file hidden image
		
		* 要求：必须name属性，在radio checkbox select有value值
		* <input type="image" src=""/>

	9、div和span

1、css的简介
	* 层叠样式表
	** 样式表：有很多的属性和属性值
	** 层叠：一层一层的。优先级
	
	** 第一个：把样式和html分开显示
	** 第二个：html的属性很少，css里面样式很强大

2、css和html结合方式
	* 有四种结合方式
	* 第一种结合方式：在每个html标签里面都有一个属性 style，在style属性里面写css代码
		** 代码 
		** <div style="background-color:red;color:black;">天之道，损有余而补不足，是故虚胜实，不足胜有余。</div>
		** 格式： style="属性名称1:属性值;属性名称2:属性值;"
	
	* 第二种结合方式：使用html的标签实现，<style type="text/css"> css代码 </style>
		** 代码
		  <style type="text/css">
			div {
				background-color:black;
				color:white;
			}

			p {
				background-color:green;
				color:white;
			}
		  </style>
	 
	 * 第三种结合方式：
	 ** 首先创建css文件，在css文件里面写css代码
	 ** 其次使用html的标签实现，<style type="text/css"> @import url(css路径); </style>
	 ** 问题：在某些浏览器下面， @import方式会有问题

	 * 第四种结合方式：引入外部的资源文件，使用头标签是link标签
	 ** 首先创建css文件，在css文件里面写css代码
	 ** 在html中使用头标签link因为外部的css文件
		** <link rel="stylesheet" type="text/css" href="css路径" />

	* 优先级：在一般的情况下，由上到下，由外到内。优先级由低到高。
	** 后加载的优先级高

	* css里面的注释和java的多行注释相同的，/* */

	* 标签名称 {属性名称1:属性值;
	            属性名称2:属性值;}

3、css的基本选择器
	* 选择器：要对哪一个标签里面的数据进行样式的修改
	* 有三种基本选择器
	* 第一种：标签选择器
		** 把标签名称作为选择器的名称
		** 代码 
		div {
			background-color:orange;
			color:white;
		}

	* 第二种：class选择器
		** 每个html标签上面都有一个属性 class属性，通过class属性的值作为选择器的名称
		** 代码
		.haha {
			background-color:green;
			color: white;
		}

	* 第三种：id选择器
		** 每个html标签都有一个属性 id属性，通过id属性的值作为选择器的名称
		** 代码
		#hehe {
			background-color:green;
			color: white;			
		}

4、css的扩展选择器
	* 关联选择器
		* 在一个标签里面嵌套了一个标签，设置标签里面嵌套标签的样式
		** 代码 <div><p>AAAAAAAABBBBBBBBCCCCCCCCCC</p></div>
		div p {
			background-color: green;
		}

	* 组合选择器
		* 设置不同的标签具有相同的样式
		** 代码 
		div,p {
			background-color: red;
		}

	* 伪元素选择器
		* 可以实现一些简单的动态的效果
		* 比如超链接，有哪些状态
		** 原始状态   鼠标放上去的状态（悬停）  点击状态     点击之后
		    :link          :hover                :active      :visited
		** 记忆方法： lv ha

5、css的基本选择器的优先级
	style > id选择器 > class选择器 > 标签选择器

6、css的盒子模型
	* 首先需要把数据封装到一块区域里面，这个区域一般都使用div进行封装
	* 边框
		* 使用属性border，统一设置 border : border-width || border-style || border-color 
		* 有上下左右四条边的属性 border-top  bottom  left  right ，分别设置四条边的样式

	* 内边距
		* 使用属性padding，统一设置，分别设置 padding : length 

	* 外边距
		* 使用属性margin，统一设置，分别设置 margin : length 

7、css的布局（漂浮）
	* css的属性 float
	** left: 表示当前设置这个属性的div的位置居左，后面的标签飘到右边去
	** right：表示当前设置这个属性的div的位置居右，后面的标签飘到左边去

8、css的布局（定位）
	* position：absolute和relative
	** absolute: 将对象从文档流中拖出
	** relative: 不会将对象从文档流中拖出

9、图文混排
	* 把图片和文字放到div里面

10、图像签名（在图片上面显示文字）


/**
 
 */


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




/**
 
 */


day03

上节内容回顾
	1、html里面表单标签
		* form：action method
		* 输入项：text password radio checkbox select textarea submit reset image hidden file
		** <input type="image" src=""/>

	2、css四种结合方式
		* style属性 <style>标签   link标签  @import url

	3、css的基本选择器
		标签选择器  id  class

	4、js的原始类型
		var关键字
		string number boolean  null undefined
	
	5、运算符
		* string操作 ： 相减时候，如果数字做减法操作，不是数字NaN
		* var m = 10; 不区分整数和小数
		* boolean类型的操作
	
	6、js的数组
		* var arr1 = [];
		* var arr2 = new Array(3);
		* var arr3 = new Array(3,4,5);
		** 数组长度：最大下标+1
		* 属性length

	7、js的函数
		* function add1(a,b) { }
		* new Function("","");
		* function(c,d) {}

	8、js的全局变量和局部变量


1、js的String对象
	* 属性：length，字符串的长度

	* 方法
	** 与html相关的方法
		*** bold()：加粗字符串
		*** fontcolor(): 设置字体的颜色
		*** fontsize()：设置字体的大小
		*** link(): 把字符串设置成超链接
		*** sub(): 下标
		*** sup()：上标

	** 与java相似的方法
		*** charAt(): 返回指定位置的字符
		**** 代码 字符的位置从0开始，使用这个方法的时候，如果位置超过了字符串，显示空字符串
		//charAt方法
		var str = "abcd";
		document.write(str.charAt(4));

		*** concat()：连接字符串
		**** 代码
		var str1 = "java";
		document.write(str.concat(str1));

		*** indexOf()：检索字符串
		**** 代码  如果字符存在，返回位置；如果不存在返回的是-1
		var str2 = "ABCDEFG";
		document.write(str2.indexOf("T"));

		*** substr()：两个参数 比如 substr(1,3)
			- 第一个参数：从哪个位置开始，字符串的开始位置是0
			- 第二个参数：从哪个位置开始，向后取几位字符

		*** substring()：两个参数 比如 substring(1,3)
			- 第一个参数：从哪个位置开始，字符串的开始位置是0
			- 第二个参数：到哪个位置结束，但是不包含结束的位置 [1,3)
		**** 代码
		//substr和substring方法
		document.write("<hr/>");
		var str3 = "abcdefg";
		document.write("substr: "+str3.substr(1,3));  // bcd
		document.write("<br/>");
		document.write("substring: "+str3.substring(1,3)); // bc  [1,3)

2、js的Array对象
	* 创建数组（三种方式）
	** var arr1 = [1,2,3];
	** var arr2 = new Array(4);
	** var arr3 = new Array(5,6,7);

	* 属性：length，数组的长度
	** //length属性
	var arr1 = [1,2,3,4];
	document.write(arr1.length);

	* 方法
	** concat()：连接数组
	*** 代码
	//concat()方法
	document.write("<hr/>");
	var arr2 = [6,7,8];
	document.write(arr1.concat(arr2));

	** join(): 根据指定的分割符进行分割
	*** 代码
	//join方法
	document.write("<hr/>");
	var arr3 = ["AA","BB","CC"];
	document.write(arr3);
	document.write("<br/>");
	document.write(arr3.join("-"));

	** push()：向数组的末尾添加元素，返回添加之后的长度
	*** 代码
	//push方法
	document.write("<hr/>");
	var arr4 = ["tom","jack","mary"];
	document.write("before: "+arr4);
	document.write("<br/>");
	document.write("length: "+arr4.push("zhangsan"));
	document.write("<br/>");
	document.write("after: "+arr4);

	*** 如果使用push方法添加的是一个数组，把数组当成一个整体（元素）添加进去
	//使用push添加数组
	document.write("<hr/>");
	var arr5 = ["A","B","C"];
	var arr6 = ["T","Q","W"];
	document.write("before: "+arr5);
	document.write("<br/>");
	document.write("length: "+arr5.push(arr6));
	document.write("<br/>");
	document.write("after: "+arr5);
	for(var i=0;i<arr5.length;i++) {
		alert(arr5[i]);
	}

	** pop() 删除并返回数组的最后一个元素 
	*** 代码
	//pop()方法
	document.write("<hr/>");
	var arr7 = ["zhangsan","lisi","wangwu"];
	document.write("before: "+arr7);
	document.write("<br/>");
	document.write("return: "+arr7.pop());
	document.write("<br/>");
	document.write("after: "+arr7);

	** reverse() 颠倒数组中元素的顺序。 
	*** 代码
	//reverse() 颠倒数组中元素的顺序。 
	document.write("<hr/>");
	var arr8 = [10,20,30];
	document.write(arr8);
	document.write("<br/>");
	document.write(arr8.reverse());

3、js的Date对象
	* 创建Date对象 var date = new Date();

	* 方法
	** toLocaleString()：把时间转换成本地格式的时间
	*** 代码
	var date = new Date();
	document.write(date.toLocaleString());

	** 得到当前的年  getFullYear() 从 Date 对象以四位数字返回年份 
		//得到当前的年
		document.write("<hr/>");
		document.write(date.getFullYear());
	
	** 得到当前的月 getMonth() 从 Date 对象返回月份 (0 ~ 11) 
		** 返回值 0-11，得到准确的月份 +1
		document.write(date.getMonth()+1);
	
	** 得到当前的星期 getDay() 从 Date 对象返回一周中的某一天 (0 ~ 6) 
		*** 如果当前的时间是星期日，通过这个方法得到值是0
	
	** 得到当前的天 getDate() 从 Date 对象返回一个月中的某一天 (1 ~ 31) 
		//得到当前的天
		document.write("<hr/>");
		document.write(date.getDate());
	
	** 得到当前的小时  getHours()

	** 得到当前的分钟  getMinutes()

	** 得到当前的秒   getSeconds()
	*** document.write(date.getHours()+" - "+date.getMinutes()+" - "+date.getSeconds());

	** 得到毫秒数： getTime() 返回 1970 年 1 月 1 日至今的毫秒数 
		*** document.write(date.getTime());  防止页面的缓存

4、js的Math对象
	* 在Math里面的方法是静态方法，直接使用Math.方法名称调用

	** ceil(x) 对一个数进行上舍入。 
		* 只要小数点后面有值，+1
	** floor(x) 对一个数进行下舍入。 
		* 小数点后面无论是几，舍去
	** round(x) 把一个数四舍五入为最接近的整数 

	**var m = 10.4;
	document.write(Math.ceil(m));  // 11
	document.write("<br/>");
	document.write(Math.floor(m)); // 10
	document.write("<br/>");
	document.write(Math.round(m)); // 11

	** random()：得到随机数
		*** document.write(Math.ceil(Math.random()*10));

5、js的全局函数
	* 方法不属于任何一个对象，这些方法使用，直接写方法名称来使用
	
	* 方法
	** eval()：比如字符串是一个js代码，使用这个方法执行js代码
	*** 	var str = "alert('abc');";
		//alert(str);
		eval(str);
	
	** encodeURI(): 对字符串进行编码
	** decodeURI()：对编码之后的字符串进行解码
	*** 	var str1 = "aacc测试中文";
		var encode1 = encodeURI(str1);
		document.write(encode1);
		document.write("<hr/>");
		var decode1 = decodeURI(encode1);
		document.write(decode1);

	** isNaN():判断是否是数字
		** 返回的值是true和false
		*** 如果是一个数字，返回false
		*** 如果不是一个数字，返回true

	** parseInt()： 转换成数字

6、js的函数的重载
	* js里面不存在函数重载
	* 在js的函数里面有一个数组是 arguments
	** arguments数组用于存储向方法里面传递的参数
	** 使用arguments模拟重载的效果
		//模拟重载的效果
		function add1() {
			var sum = 0;
			//遍历数组
			for(var i=0;i<arguments.length;i++) {
				sum += arguments[i];
			}
			return sum;

	* js里面存在重载吗？	
	** js里面不存在重载
	** 但是可以通过函数里面arguments数组模拟重载的效果

7、js的bom对象
	* bom：browser object model，浏览器对象模型
	* 在bom里面提供了一些对象，使用这些对象可以操作

	* navigator：得到浏览器的一些信息
		document.write(navigator.appName);

	* screen：得到屏幕信息 
		document.write(screen.width+" "+screen.height);

	* location：使用属性href，第一个功能：得到当前请求的地址；第二个功能：设置请求的地址
		** 第一个功能：document.write(location.href);
		** 第二个功能：location.href = "hello.html";
		*** 知识引入，在表单输入项里面，button，<input type="button" value="href" onclick="js的方法"/>
		*** 在button上面属性 onclick，表示是鼠标点击事件 onclick="js的方法"

	* history：得到请求的地址的历史
		** 创建三个页面
		** //到上一个页面
		function forward1() {
			history.back();
		}

		//到下一个页面	
		function next1() {
			history.forward();
		}

		** 还有一个方法实现相同的效果 go()
		history.go(-1);
		history.go(1);
	
	* window（****）：窗口对象，是一个顶层对象
	** 方法
	*** alert()：在页面弹出一个框
	*** confirm()：确认框
		//confirm方法
		var flag = window.confirm("确认删除?");
		//alert(flag);
		if(flag) {
			alert("删除成功");
		} else {
			alert("删除失败");
		}
	
	*** prompt(): 输入框
		window.prompt("please input:","10");
	
	*** open(): 打开一个新窗口
		* window.open("打开页面url地址","","窗口特征");
		* window.open("hello.html","","width=200,height=100");

	*** close()：关闭窗口

	*** 两个很重要的方法（用于定时器效果）
	**** setInterval("js代码",毫秒数): 表示在一定的时间内，重复执行js代码
		*** window.setInterval("alert('12345');",3000);

	*** setTimeout("js代码",毫秒数)：表示在一定时间之后，执行js代码一次
		*** window.setTimeout("alert('abc');",4000);
	
	*** clearInterval() 取消由 setInterval() 设置的 timeout。
		window.clearInterval(id1);
	*** clearTimeout() 取消由 setTimeout() 方法设置的 timeout。 
		window.clearTimeout(id2);


8、js的dom对象
	* document object model: 文档对象模型
	** 文档：标记型文档 html xml
	** 对象：对象里面有属性和方法
	*** 使用js的dom里面提供的对象，使用这些对象的属性和方法，对标记型文档进行操作

	** 如果想要对标记型文件进行操作，首先解析标记型文档
	*** 第一步：需要把标记型文档里面的所有内容都封装成对象
		** 标签 、 属性、 文本内容都封装成对象
	
	*** 使用dom解析html过程（画图分析过程）
	** 根据html的层级结构在内存中分配一个树形结构
	** dom里面提供了很多的对象，使用这些对象可以对html进行操作
	** document对象：整个文档
	** element对象：标签对象（元素对象）
	** 属性对象
	** 文本对象
	** Node节点对象，这个对象是其他对象的父对象

9、DHTML的介绍
	* 不是一种技术，是很多技术的简称

	* html： 封装数据的作用
	* css：使用属性和属性值添加样式
	* ECMAScript: 专门js的语句和语法
	* dom：对标记型文档进行操作

10、document对象
	* document对象代表整个文档
	**通过document对象可以得到html中标签对象

	** 方法
	*** getElementById(): 可以通过id得到标签的对象
	*** 如果想要得到标签里面的属性的值：标签对象.属性名称
	**** 	//得到的是input标签对象
		var input1 = document.getElementById("testid");
		//得到input标签里面的value的值
		alert(input1.value);
	
	*** getElementsByName(): 通过name的值得到所有标签，返回的是一个数组,
	**** 遍历数组得到每一个标签对象，通过标签对象名称.属性名称, 得到属性值
	**** 	var inputs1 = document.getElementsByName("testname");
		//alert(inputs1.length);
		//遍历数组
		for(var i=0;i<inputs1.length;i++) {
			//获取每一个input对象
			var input1 = inputs1[i];
			//得到每一个input的value值
			alert(input1.value)
		}

	**** 如果要得到的标签只有一个，如果也是通过name属性得到，返回的也是一个数组，而不是一个对象
	**** 可以直接通过数组的下标获取标签对象，通过标签对象名称.属性名称, 得到属性值
	**** var inputs2 = document.getElementsByName("username")[0].value;

	*** getElementsByTagName(): 根据标签名称得到标签的对象，返回的是一个数组,
	**** 遍历数组得到每一个标签对象，通过 标签对象名称.属性名称, 得到属性值
	**** 	//getElementsByTagName，返回是数组
		var inputs3 = document.getElementsByTagName("input");
		alert(inputs3.length);
		//遍历数组
		for(var a=0;a<inputs3.length;a++) {
			//得到每一个input标签对象
			var input3 = inputs3[a];
			//得到value的值
			alert(input3.value);
		}
	**** 如果要得到的标签只有一个，如果也是通过Tagname属性得到，返回的也是一个数组，而不是一个对象。
	**** 可以直接通过数组的下标获取标签对象，通过 标签对象名称.属性名称, 得到属性值
	**** var inputs4 = document.getElementsByTagName("input")[0]; //返回数组
	
	*** write方法：向页面输出内容，输出html代码

11、练习：window练习
	* 创建两个页面
	* 第一个页面window.html
		** 有两个输入框和一个按钮
		** 在按钮上面有事件（弹出一个新窗口）
	* 第二个页面user.html
		** 有一个表格
		** 有数据是编号，姓名，操作（按钮有事件，赋值）
		*** opener是属性：返回对创建此窗口的窗口的引用。 
		** 	//把这两个值赋值到另一个页面window页面
			//得到创建user窗口的窗口window窗口
			var pwin = window.opener;
			pwin.document.getElementById("usernum").value = num1;
			pwin.document.getElementById("username").value = name1;
			//关闭窗口
			window.close();
	
	* 这个练习在谷歌浏览器里面不好使的。
	** js的安全性，不能访问本地的文件
	** 谷歌浏览器安全性很高，严格按照js规范，不能访问本地的文件 file:///

	** 在实际开发中，一般不会访问本地的文件，通过网络地址进行访问，如果通过网络地址不会有这个问题

12、debug调试（断点调试模式）
	* 首先设置断点，双击左边，出现蓝色的点
	* 运行程序，不要使用run as，而要使用debug as运行
	* 单步执行 快捷键 F6

	* 去掉断点

13、myeclipse安装
	* 破解过程中不要启动软件
	* 在电脑上不要安装其他版本的myeclipse
	* 破解之前，电脑上必须要安装jdk，同时配置环境变量

14、内容补充
	* list的遍历常用三种方式：普通for循环，迭代器，增强for
	* set的遍历两种：迭代器，增强for
	* map的遍历两种：第一种得到所有的key，通过key得到value；第二种得到key和value的关系

	* 可变参数 public void get1(int...nums){}
	** 在方法的参数列表中只能有一个可变参数，可变参数放到参数列表的最后

	* 泛型 List<Integer> list = new ArrayList<Integer>();
		Map<String,String> map = new HashMap<String,String>();
	
	* 


/**

 */


day04

上节内容回顾
	1、js对象

	2、js的函数重载

	3、js的bom对象（五个）
		* navigator screen history location window
	
	4、window对象
		** 打开窗口 open方法
		** 设置定时器的方法
			** setInterval
			** setTimeout

	5、dom解析html的过程

	6、什么是DHTML
		
	7、document对象
		* getElementById
		* getElementsByName
		* getElementsByTagName
	
	8、opener属性

1、案例：在末尾添加节点
	* 步骤
	第一步：创建li标签
		document.createElement("标签名称");
	第二步：创建文本
		document.createTextNode("文本内容");
	第三步：把文本放到li下面
		li.appendChild(node);
	第四步：把li放到ul下面
		ul.appendChild(node)
	* 代码
	function add1() {
		//创建li标签
		var li1 = document.createElement("li");
		//创建文本
		var tex1 = document.createTextNode("DDD");
		//把文本添加到li下面
		li1.appendChild(tex1);
		//把li添加到ul的下面
		//获取到ul标签
		var ul1 = document.getElementById("ulid");
		ul1.appendChild(li1);
	}

2、Element对象（标签对象）
	* 首先要得到标签对象

	* 获取属性：getAttribute(name)方法。
		* //getAttribute(name)方法：得到属性的值
		var input1 = document.getElementById("textid");
		//alert(input1.value);
		alert(input1.getAttribute("value"));

	* 设置属性：setAttribute(name,value)方法。
		* //setAttribute(name,value)方法
		alert(input1.getAttribute("name"));
		input1.setAttribute("name","textname");
		alert(input1.getAttribute("name"));

	* 删除属性：removeAttribute(name)方法。
		* alert(input1.id);
		input1.removeAttribute("id");
		alert(input1.id);
		* 不能删除value的值

	* 得到标签下面的子标签的操作
		** childNodes属性，得到标签下面的子标签，浏览器的兼容性很差，所以一般不使用这个属性
		** 获取标签下面的子标签的唯一有效方法，是使用getElementsByTagName()方法
		//getElementsByTagName()方法
		var lis1 = ul1.getElementsByTagName("li");
		alert(lis1.length);

3、Node对象
	* Node节点对象，是其他对象的父对象
	* 属性
		* 在dom解析时候，需要把html的所有部分都封装成对象，包含标签 属性 文本
		
		* nodeName
		* nodeType
			** 如果标签对象 1
			** 如果属性对象 2
			** 如果文本对象 3
		* nodeValue

		** 标签对应的属性的值
		var div1 = document.getElementById("div1");
		alert(div1.nodeName);  // DIV (大写的标签名称)
		alert(div1.nodeType);  // 1
		alert(div1.nodeValue); // null

		** 属性对象对应的node里面的三个属性的值
		var id1 = div1.getAttributeNode("id");
		alert(id1.nodeName); //id 属性名称
		alert(id1.nodeType); // 2
		alert(id1.nodeValue); //div1 属性的值

		** 文本对象对应的node里面的三个属性的值
		var tex1 = div1.firstChild;
		alert(tex1.nodeName);  //#text
		alert(tex1.nodeType);  // 3
		alert(tex1.nodeValue); //文本内容

		* parentNode：获取父节点
		** //获取到li的标签
		var li1 = document.getElementById("li1");
		//得到父标签ul
		var ul1 = li1.parentNode;
		alert(ul1.id);

		* 父节点，子节点，同辈节点

	* 方法
	** appendChild()：
	*** 添加到末尾
	*** 特点：类似剪切黏贴的效果

	** insertBefore(newNode,oldNode): 可以在某个节点之前插入
	** 方法里面有两个参数：第一个参数要添加的节点，第二个参数是在谁之前添加
	*** 	/*
		1、得到在谁之前添加的节点 li4
		2、创建节点 
			* 创建标签 li
			* 创建文本 
			* 把文本添加到标签下面
		3、得到ul标签
		4、通过ul标签进行添加 insertBefore(newNode,oldNode)
		*/

	** removeChild()：删除节点
	*** 首先不能自己删除自己，通过父节点删除
	*** /*
		1、得到要删除的标签
		2、得到删除节点的父节点
		3、通过父节点删除 removeChild()
		*/
	
	** replaceChild(newNode,oldNode)方法:替换节点
	** 有两个参数：第一个替换成的节点，第二个被替换的节点
	** /*
		1、得到要替换的节点
		2、创建新的节点
			* 创建标签
			* 创建文本
			* 把文本添加到标签下面
		3、获取父节点
		4、通过父节点进行替换
	 */

	 ** cloneNode(boolean)方法:复制节点
	 *** 参数：是否复制子节点
	 *** 	//得到ul标签
		var ul1 = document.getElementById("ul1");
		var ul21 = ul1.cloneNode(true)
		//放到div里面
		var divv = document.getElementById("divv");
		divv.appendChild(ul21);
	
4、Node方法的总结
	* 获取标签对象
	** getElementById("id的值")
	** getElementsByName("name的值")：返回数组
	** getElementsByTagName("标签名称")：返回数组

	* 查找标签的子标签的唯一有效方法是 getElementsByTagName("标签名称");

	* appendChild方法：在末尾添加节点，类似剪切黏贴效果
	* insertBefore() replaceChild() removeChild(): 通过父节点操作

5、innerHTML属性
	* 浏览器几乎都支持该属性，但不是 DOM 标准的组成部分。
	* 实现的功能：
	** 第一个：获取标签里面的文本内容
		*** //得到div标签
		var div11 = document.getElementById("div11");
		alert(div11.innerHTML);
		
	** 第二个：向标签里面设置内容（文本内容，html代码）
		** var div12 = document.getElementById("div12");
		//div12.innerHTML = "张三李四王二赵六";
		//向div里面设置表格 <table border='1'><tr><td>123456</td></tr></table>
		div12.innerHTML = "<table border='1'><tr><td>123456</td></tr></table>";
	**  var tab = "<table>";
		tab += "<tr>";
		tab += "</tr>";
		tab += "</table>";

6、案例：动态显示时间
	* 得到当前的时间 var date = new Date();  date.toLocaleString();
	* 步骤
		/*
		1、得到当前的时间 
			new Date(); 使用toLocaleString方法
		2、使用定时器向div里面每一秒写一次时间 setInterval("方法",1000);
			* 首先得到div
			* 使用innerHTML属性写时间
		*/

7、案例：全选练习
	* 页面 复选框和按钮
	** 复选框name值必须要一样
	** 如果判断是否被选中，通过checked属性进行判断
	***通过属性checked，这个checked==true 表示复选框是选中的，如果checked==false 表示复选框是没有选中
	
	* 步骤
	（1）全选和全不选的操作
	/*
	1、得到要全选的复选框
		* 通过name得到这些复选框 使用方法 getElementsByName()
	2、返回的数组，遍历数组，得到每一个复选框
	3、把每一个复选框属性checked值设置成true | false
	*/	

	（2）反选的操作
	/*
	1、得到要全选的复选框
		* 通过name得到这些复选框 使用方法 getElementsByName()
	2、返回数组，遍历数组，得到每一个复选框
	3、判断当前的复选框是选中还是不选中，
		* if语句 checked==true 选中，把checked的值设置成false
		* 如果checked==false 不选中，把checked值设置成true
	*/

	（3）使用复选框实现全选和全不选的操作
	/*
	1、判断全选和全不选的复选框的状态 
		* 首先得到复选框
		* 使用checked属性进行判断 选中 true 不选中 false
	2、如果是选中，调用全选的方法
	3、如果没有选中，调用全不选的方法
	*/

8、案例：下拉列表的左右选择
	* 创建页面
	* 实现思路：
	** 如果判断是否是选中：使用属性selected进行判断，如果selected==true表示选中状态，selected==false表示没有选中状态
	** appendChild： 类似剪切黏贴的效果
	** 把左边的option的标签加到右边的select下面
		*** 首先获取左边选中的option
		*** 获取右边select标签，在select使用方法appendChild
	
	（1）实现选择添加到右边
	/*
	1、得到左边的select标签
	2、得到select1下面的option的标签 使用方法getElementsByTagName方法
	3、返回的是数组，遍历数组，得到每一个option标签
	4、判断是否是选中的状态
		* 使用if语句，使用属性selected进行判断，true是选中，false没有选中
	5、如果是选中状态，添加到右边
		* 获取select2的标签（右边的标签）
		* 在select2的标签执行appendChild方法完成添加
	*/ 

	（2）实现全部添加到右边
	/*
	1、得到左边的select标签
	2、得到select1下面的option的标签 使用方法getElementsByTagName方法
	3、返回的是数组，遍历数组，得到每一个option标签
	4、得到select2的标签
	5、在select2里面执行appendChild方法完成添加
	*/

	（3）实现选择添加到左边
	/*
	1、得到右边select标签
	2、得到select下面的option
	3、返回的是数组，遍历数组，得到每一个option
	4、判断每一个option是否是选中的状态
	5、如果是选中的状态，添加到左边
		* 得到左边的select标签
		* 在左边的select标签执行appendChild方法
	*/

	（4）实现全部添加到左边
	/*
	1、得到右边select标签
	2、得到select下面的option
	3、返回的是数组，遍历数组，得到每一个option
	4、得到左边的select标签
	5、执行appendChild方法完成添加到左边
	*/

	*** 写js的方法名称时候，不要使用单个的单词：add、select
	* add_1()  add1()
	* 不要这样写：_add1();

9、案例：省市联动
	* 创建页面：有两个下拉框，左边下拉框里面有内容，右边空
	* 实现步骤
	/*
	** 最终结果：点击左边的国家，把国家对应的城市添加到右边的select里面
	实现的步骤：
	** 使用到事件 onchange事件，改变事件
	** onchange="add1(this.value);得到当前选择的值
	** 拿到传过来的值，和数组里面的第一个值进行比较
		*** 首先遍历数组，因为是一个二维数组，每次遍历之后的结果就是一个数组
		*** 获取到遍历之后的数组的第一个值，和传过来的值进行比较

	** 如果比较的值相同，把第一个值后面的内容添加到第二个select里面
		*** 得到第一个值后面的所有的值，遍历数组，但是遍历需要从1开始
	
	** 把这个值放到select2里面
		*** 得到select2
		*** 要向select2里面添加的是option标签，但是需要创建（三步）
		*** 把option标签添加到select2下面使用appendChild方法
	
	** 遇到问题：
	第一个选择国家，在第二个下拉框里面可以正常显示国家的城市，但是第二次在点击一个国家之后，会把第二个国家的城市
	在第一个国家城市后面做一个追加

	** 解决方法：
	*** 只有调用方法的时候，把右边的下拉框清空（删除右边的select里面的option就可以了）
	*** 使用removeChild方法删除，通过父节点（得到s2）
	*/

10、案例：动态生成表格
	* 创建页面：两个输入框和一个按钮（事件）
	* 实现步骤
	/*
	1、得到输入框里面的值
	2、根据输入的值创建表格
		* 生成行 <tr> 使用for循环生成行
		** 生成列：在tr里面 <td> 使用for循环生成单元格
		* 在最外面要<table>
	3、把生成的表格的代码写到div里面（使用innerHTML属性）
	*/
	* 代码片段
	//生成表格的代码
	var tab = "<table border='1' bordercolor='blue'>";
	//生成行
	for(var i=1;i<=h;i++) {
		tab += "<tr>";
		//循环列
		for(var j=1;j<=lie;j++) {
			tab += "<td>AAAAAAAAAAA</td>";
		}
		tab += "</tr>";
	}
	tab += "</table>";

11、junit单元测试
	* 针对一个方法进行的测试
	* 在java里面默认没有junit的，如果想要使用junit，需要引入支持jar包
	* 但是在myeclipse开发工具中，自带了jar，拿过来直接使用

	* jnnit包含 3.x  4.x  使用4.x
	** 使用单元测试，写一个单元测试的方法，方法有书写规范， public void get1() { }

	* 使用注解 @Test：表示对方法进行单元测试
	** 运行单元测试 选择这个方法，点击JUnit Test完成单元测试，当出现绿色的条时候，表示测试通过，但是出现红棕色的条
	表示测试失败



/**

 */



day05

昨天内容回顾
	1、元素对象
		* 查找元素下面的子元素的方法：使用getElementsByTagName方法

	2、Node对象
		** 两个属性 
		** 方法
	
	3、innerHTML属性

0、表单提交的方式
	* 写提交按钮 <input type="submit" />进行提交

	* 使用button进行提交 <input type="button" value="提交" onclick="form1();"/>
	** 	//得到form
		var form1 = document.getElementById("form1");
		//执行方法submit(),进行提交
		form1.submit();
	
	* 使用超链接进行提交(类似get提交的方式)
		<a href="hello.html?username=wangwu">超链接</a>


1、xml的简介
	* eXtensible Markup Language：可扩展标记型语言
	** 标记型语言：都是使用标签进行操作的，html是标记型语言
	** 可扩展：在html中每个标签都有固定的含义，但是xml中标签是自己定义的。
		比如<person></person>  <猫></猫>
	
	** 作用：xml主要的作用不是显示数据，主要功能是存储数据

	* xml是W3C组织发布的技术

	* xml版本 1.0  1.1 ，但是现在都使用1.0
 
 2、xml的应用
	* xml应用在不同的系统之间传输数据
		** 使用qq之间发送数据

	* xml用来表示生活中有关系的数据

	* xml经常用在系统的配置文件中
		** 操作数据库，知道数据库的地址 用户名 密码
		** 但是如果数据库的地址 用户名 密码写到程序里面，如果修改数据库的信息，需要修改程序
		** 直接数据库的地址 用户名 密码写到配置文件中，通过程序读取配置文件里面的信息

3、xml的语法
	（1）文档声明(****)
		* 如果写一个xml文件 后缀名是 .xml
		* 首先必须要有一个 文档声明
			<?xml version="1.0" encoding="gbk"?>
		*** 文档声明必须写在第一行第一列
		* 属性
		** version：xml版本，一般都使用1.0，在文档声明里面必须要有，
		*** 下面两个属性可以没有
		** encoding：xml的编码方式 gbk  utf-8  iso8859-1(不支持中文)
		** standalone：xml文件是否依赖于其他的文件 yes/no

		* 第一个xml文件
		<?xml version="1.0" encoding="gbk"?>
		<person>
			<name>zhangsan</name>
			<age>100</age>
		</person>

4、xml的乱码问题的解决(****)
	* 设置xml的编码是utf-8，但是把xml文件保存到本地硬盘使用的编码gbk，所以这两个编码不一致了，因此出现了乱码
	** 设置xml的编码和保存到本地硬盘时候的编码一致，就不会出现乱码了


5、xml中标签的定义(****)
	* xml中定义标签有开始标签必须要有结束标签
		<person></person>
	* 标签可以嵌套，但是必须合理嵌套
		<a><b></b></a>
		* 这样写是不正确的 <a><b></a></b>
	* 一个xml中只能有一个根标签
	
	* 在xml中会把空格和换行都当成内容来解析，所有
		<a>AAAA</a>
		<a>
		  AAAA
		</a>
	** 书写的规范：
	* xml区分大小写的 <p>和<P>不一样的
	* 不能以数字和下划线开头 <2a> <_bb>:这样写是不正确的
	* 不能以xml XML Xml开头
	* 标签里面不能包含空格和冒号 <a b> <b:a>:这样写是不正确的

6、xml的属性的定义(****)
	* 在xml的标签上面可以有多个属性，每个属性都有自己的名称和值，不能有相同名称的属性
		<person id1="aa" id2="bb">
	* 属性名称和属性值之间使用= ，属性使用引号包起来 （可以是单引号，双引号）
	* 属性的名称规范和元素的命名规范一致的

7、xml的注释(****)
	* <!-- 注释的内容  -->
	** xml中的注释不能嵌套
		这样是不正确的：<!-- <!--这是一个注释--> -->

8、xml的特殊字符
	> : &lt;
	> : &gt;

9、xml的CDATA区
	* 写在CDATA里面的内容，xml解析时候把里面的内容当成普通文本，而不是标签
	* 写法 <![CDATA[ 内容 ]]>

10、xml的处理指令
	* 设置xml的样式
	* 对中文命名的标签元素不起作用

	** xml语法的总结
	*** 所有 XML 元素都须有关闭标签 <p></p>
	*** XML 标签对大小写敏感  <p> <P>这两个标签是不一样的
	*** XML 必须正确地嵌套顺序  <a><b></b></a>
	*** XML 文档必须有根元素(只有一个)
	*** XML 的属性值须加引号（单引号 双引号）
	*** 特殊字符必须转义 --- CDATA
	*** XML 中的空格、回车换行会解析时被保留
		<a>AAAA</a>
		<a>
		  AAAA
		</a>

11、xml的约束
	* 为什么需要约束
	** 比如创建一个xml文档，这个文档比如只能显示人的信息，人的信息可能包含name age等等，这个时候比如在xml中
	添加一个内容<a>，但是如果运行这个xml文件没有问题，但是a肯定不是人的信息，所以就需要约束xml中只能出现人的信息

	* xml中约束两种技术 ： dtd约束 和 schema约束

	* dtd的快速入门
	** 第一步：需要创建一个约束文件 ，后缀名是 .dtd
	** 第二步：数xml中有多少个标签，写多少 <!ELEMENT>
		* 语法 <!ELEMENT 元素名称 元素约束>
	** 第三步：判断标签是简单标签还是复杂标签
		* 简单标签：在标签下面没有子标签
			<!ELEMENT 元素名称 (#PCDATA)>
		* 复杂标签：在标签下面有子标签
			<!ELEMENT 元素名称 (子标签名称1,子标签名称2)>
		* 代码
		<!ELEMENT person (name,age)>
		<!ELEMENT name (#PCDATA)>
		<!ELEMENT age (#PCDATA)>
	** 第四步：在xml引入dtd约束文件
		使用语句： <!DOCTYPE xml中根元素名称 SYSTEM "dtd路径">
		** <!DOCTYPE person SYSTEM "1.dtd">
	
	** 现在运行xml文件是通过浏览器打开的，但是浏览器只是复杂校验语法，约束浏览器不负责校验约束
	
	** 如果想要对xml文件进行约束，需要使用校验工具（myeclipse）

	*** 在myeclipse中启动时候选择工作空间，工作空间目录不能带空格和中文
	*** 注释快捷键 ctrl shif /

12、dtd的引入方式
	* 引入方式有三种
	** 第一种：引入外部的dtd文件
		*** 语句：<!DOCTYPE 根元素名称 SYSTEM "dtd路径">
	
	** 第二种：使用内部的dtd约束
		*** 在xml中写引入的语句
		** <!DOCTYPE 根元素名称 [
			dtd的代码
		]>
		** 代码
		<!DOCTYPE person [
			<!ELEMENT person (name,age)>
			<!ELEMENT name (#PCDATA)>
			<!ELEMENT age (#PCDATA)>
		]>
	
	** 第三种：使用公共的dtd
		*** 在网络上有一些dtd约束
		*** <!DOCTYPE 根元素 PUBLIC "DTD名称" "DTD文档的URL">
		*** 框架struts2里面引入公共的dtd
		** <!DOCTYPE struts PUBLIC   "-//Apache Software Foundation//DTD Struts Configuration 2.0//EN"    
		"http://struts.apache.org/dtds/struts-2.0.dtd">

13、使用dtd约束xml的元素
	* dtd语法： ：<!ELEMENT 元素名称 约束规则>

	** 如果是简单元素的约束规则（三个）
		*** (#PCDATA): 元素是一个字符串类型
		*** EMPTY：表示元素是空
		*** ANY: 任意类型
	
	** 如果是复杂元素的约束规则
		*** (元素1,元素2)：如果使用逗号把元素分割，表示元素出现的顺序
		*** (元素1 | 元素2):如果使用|把元素进行分割，表示元素只能出现其中的一个
		
		*** 子元素出现的次数约束：
		+ ：表示元素出现一次或者多次
		? : 表示元素出现零次或者一次
		* ：表示元素出现零次 一次或者多次（任意次）

14、myeclipse的快捷键
	* 代码提示 alt /
	* 快速导包 ctrl shift o
	* 单行注释 ctrl /
	* 多行注释 ctrl shift /
	* 删除一行 ctrl d

=====================================================================================================

15、使用dtd约束xml中属性
	* 语法
	<!ATTLIST 元素名称
		属性名称1 属性类型 属性约束
		属性名称2 属性类型 属性约束
	>

	* 属性类型
		** CDATA：表示字符串
		** 枚举：在一定的范围内，每次只能出现这个范围中的任意一个
			*** (aa|bb|cc)
		** ID: 属性值必须是字母开头
	
	* 属性约束
		** #REQUIRED：属性必须要出现
		** #IMPLIED：表示属性可以有也可以没有
		** #FIXED "固定值"：表示固定值(属性的值必须是固定的值)
		** 直接值: （设置了默认的值）如果属性不写使用直接值，但是如果在标签上面写了这个属性的值，使用设置的那个值

16、dtd的实体的使用
	* 定义语法 <!ENTITY 实体名称 "实体的值">
	* 使用实体 &实体的名称;

	* 注意：如果想要使用实体，使用dtd的引入方式需要使用内部的dtd的方式
	** 如果使用的高版本的浏览器，如果使用外部的dtd不能使用实体
	** 但是如果使用低版本的浏览器，比如ie6，才可以使用外部的dtd

17、W3C案例
	* 对照dtd的约束文件，写出xml文档

===============今天最重要的内容================
18、xml的解析
	* xml有两种解析技术： dom技术 和 sax技术
	** dom解析
		* js里面dom解析标记型文档
		** 首先把标记型里面的每部分都封装成对象 （标签 属性 文本）
		** 根据标记型文档的层级结构，在内存中分配一个树形结构
	*** 画图分析dom解析xml过程

	** dom解析xml的过程
	*** 首先把xml中的每部分都封装成对象（标签 属性 文本）
	*** 根据xml的层级结构，在内存中分配一个树形结构

	*** 使用dom方式解析xml缺点：如果文档过大，会造成内存溢出
	*** 使用dom方式解析xml优点：方便实现增加 修改 和删除的操作

	** sax解析xml的过程
	*** 边读边解析，一行一行的从上到下进行解析
	*** 使用sax解析xml的缺点：不能实现增加 修改 和删除的操作
	*** 使用sax解析xml的优点：如果文档过大，不会造成内存溢出

	* 如果想要解析xml，需要解析器
	** 不同的公司或者组织，针对这两种技术提供的不同的解析器
	** sun公司针对dom和sax方式提供解析器 jaxp
	** dom4j组织针对dom和sax方式提供解析器 dom4j（一般企业中都使用这种方式）
	** jdom组织针对dom和sax方式提供解析器 jdom

19、jaxp的dom方式解析xml
	* jaxp是javase的一部分，在jdk里面javax.xml.parsers
	* 有四个类，有两个类是使用sax方式解析的

	** DocumentBuilder：dom方式的解析器，是抽象类，不能new得到实例
	*** 此类的实例可以从 DocumentBuilderFactory.newDocumentBuilder() 方法获取
	** DocumentBuilderFactory：这个类也是抽象类
	*** 这个类的实例 DocumentBuilderFactory.newInstance() 得到

	** DocumentBuilder里面的方法：
	*** Document parse(String uri) : 得到整个文档
	*** Document在org.w3c.dom包里面，父接口是 Node

	*** createElement(String tagName) : 创建元素，返回Element

	*** createTextNode(String data) ： 创建文本 ，返回 Text 

	*** appendChild(Node newChild) ：把标签添加到末尾

	*** getElementsByTagName(String tagname) ：根据标签名称得到标签，返回 NodeList

	*** 遍历 NodeList
		** getLength()：得到集合的长度
		** item(int index) ：得到每一个节点
	
	*** getParentNode() ：得到父节点

	*** removeChild(Node oldChild) ：删除节点

20、使用jaxp的dom方式查询节点
	* 查询所有name标签的文本的值
	* 步骤
	/*
	 * 1、得到解析器工厂  DocumentBuilderFactory.newInstance()
	 * 2、根据工厂得到解析器  
	 * 3、得到整个文档document
	 *	使用parse方法得到

	 * 4、得到所有的name的标签 
		使用getElementsByTagName("name")
	 * 5、返回NodeList集合，遍历得到每一个name标签
		for(int i=0;i<list.getLength();i++) {
			list.item(i);//从0开始
		}
	 * 6、得到name里面的文本
		使用 getTextContent方法
	 * */

21、使用jaxp的dom方式查询某一个节点
	* 查询第一个name标签的文本的内容
	* 步骤
	/*
	 * 1、得到解析器工厂
	 * 2、得到解析器
	 * 3、得到document文档
	 * 
	 * 4、得到第一个name标签
	 * 	** 使用方法是 getElementsByTagName，但是这个方法得到所有的name标签 返回NodeList集合
	 *      ** 直接使用下标 item(0)：下标从0开始
	 * 5、得到文本内容 getTextContent方法
	 * */

	* 封装成工具类
	** 代码里面，如果某些代码通用性比较强，这个时候封装到一个工具类里面
	** 可以提高开发效率，利于代码维护
	//返回Document对象
	public static Document getDocument1() throws Exception {
		//得到解析器工厂
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		//得到解析器
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		//得到document
		Document document = builder.parse("src/person1.xml");
		return document;
	}

22、使用jaxp的dom方式实现增加节点的操作
	* 在js里面增加
	** 创建节点（三步）
	** 创建标签
	** 创建文本
	** 把文本添加到标签下面

	* 在第一个p1标签末尾添加 <sex>a</sex>
	* 步骤
	/*
	 * 1、得到解析器工厂
	 * 2、得到解析器
	 * 3、得到document文档
	 * 
	 * 4、创建标签（三步） sex
	 * 5、得到第一个p1的标签
	 * 6、在p1下面添加sex标签 使用 appendChild方法
	 * 7、回写xml
	 * */

23、使用jaxp的dom方式实现修改节点的操作
	* 修改 <sex>nv</sex>值 nan
	* 步骤
	/*
	 * 1、得到document文档
	 * 2、得到要修改的标签 sex
	 * 3、进行修改
		直接在标签上面使用方法 setTextContent方法
	 * 4、回写操作
	 * */

24、使用jaxp的dom方式实现删除节点的操作
	* 删除方法：removeChild(Node oldChild)，删除通过父节点 getParentNode()

	* 删除<sex>nan</sex>标签
	* 步骤
	/*
	 * 1、得到document文档
	 * 2、得到sex标签
	 * 3、得到sex的父节点 
	 * 4、通过父节点删除sex
	 * 5、回写xml
	 * */

25、使用jaxp的dom方式实现遍历节点
	* 把xml中所有的标签名称打印出来
	* 步骤
	/*
	 * 1、得到document文档
	 * === 使用递归实现遍历====
	 * 2、得到根节点
	 * 3、得到根节点的子节点
	 * 4、得到子节点的子节点
	 * */

	* 递归的方法
	private static void list1(Node node) {
		//判断节点类型是元素节点
		if(node.getNodeType() == Node.ELEMENT_NODE) {
			System.out.println(node.getNodeName());
		}

		//得到子节点 getChildNodes得到的是第一层子节点
		NodeList list = node.getChildNodes();
		//遍历每一个子节点
		for(int i=0;i<list.getLength();i++) {
			Node n1 = list.item(i);
			//使用递归实现
			list1(n1);
		}
	}


/**
 
 */



day06

昨天内容回顾
	1、表单提交方式
		* submit
		* button提交：执行submit()方法
		* 超链接 地址?username=zhangsan

	2、xml语法

	3、dtd约束
		* <!ELEMENT 元素名称 约束>
		* 简单元素 
		** (#PCDATA) EMPTY ANY
		** 复杂元素
		** 元素之间使用逗号：按顺序
		** 元素之间使用|隔开：只能出现其中的一个
		** 出现的次数 + * ?

		** 属性的约束

	4、jaxp的dom方式操作xml
		* xml的解析技术 dom和sax

1、xml的约束schema
	* 与dtd的比较
	** dtd语法自成一派 <!ELEMENT >,schema遵循xml的语法
	** 在一个xml中只能使用一个dtd约束，但是可以使用多个schema
		** 不同的schema使用名称空间区分（类似于java里面的包）
	** dtd没有schema支持的数据类型多
		*** 比如标签age，但是在dtd里面约束类型pcdata类型，但是在schema里面可以约束int double
	
	* schema入门案例
	** 创建schema的约束文件 后缀名.xsd
		** schema本身就是一个xml文件
		** 根节点是schema
	** 创建约束文件
		* 属性 xmlns="http://www.w3.org/2001/XMLSchema" ：表示这个文件是约束文件

		       targetNamespace：目标名称空间，在xml中如何引入schema文件，通过targetNamespace名称
			** 名称一般都使用url地址 http://www.example.org/1

		       elementFormDefault="qualified"
	** 数xml中有多少个元素，写多少个<element>	 
	** 判断元素是简单元素还是复杂元素
		* 如果复杂元素
			<element name="person">
				<complexType>
					<sequence>
					
					</sequence>
				</complexType>	
			</element>
		* 如果是简单元素
			在复杂元素里面 <element name="person" type="">

	** 在xml引入约束文件

	** 指示器
	*** <sequence>：表示元素按照顺序出现
	*** All：表示元素只能出现一次
	*** Choice：表示元素只能出现其中的一个

	*** 在元素上面 maxOccurs="unbounded" 表示出现次数没限制  

	*** 属性约束（只能在复杂元素上面）
		* <attribute name="p11" type="string" use="required"></attribute>
		</complexType>
	
	** 复杂的schema
	*** 多个schema使用名称空间进行区分 xmlns:名称
	*** 名称:要约束的元素名称  <dept:name>100</dept:name>

	<company xmlns = "http://www.example.org/company"
	xmlns:dept="http://www.example.org/department"
	xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.example.org/company company.xsd http://www.example.org/department department.xsd" 
>
	<employee age="30">
		<!-- 部门名称 --> 
		<dept:name>100</dept:name>
		<!-- 员工名称 -->
		<name>王晓晓</name>   
		</employee>
	</company>

2、sax解析的原理
	* 使用jaxp的sax方式解析xml
	** SAXParser
	** SAXParserFactory
	** parse(String uri, DefaultHandler dh) 两个参数：解析器和事件处理器

	** 在parse方法里面传递解析器和事件处理器，相当于在绑定了一个事件，当执行这个方法时候，自动触发这个事件
	** 当解析到特定的内容的时候，自动执行相应的方法
	*** 解析到开始标签时候，执行startElement方法，参数qName，返回开始标签名称
	*** 解析到文本内容时候，执行characters方法，使用string构造返回文本内容
	*** 解析到结束标签时候，执行endElement方法，参数qName，返回结束标签名称

	* 打印整个xml文档

	* 得到所有name标签的值
		* 定义一个成员变量 boolean
		* 判断，如果解析到name标签时候，把布尔类型修改成true
		* 判断如果true，打印文本内容
		* 如果执行到结束name标签时候，把设置成false
	
	* 得到第一个name标签的文本的值
		* 定义一个成员变量 int idx = 1
		* 每次解析完成之后name标签，需要在结束的位置把idx+1，
		* 通过索引值得到某个标签
		*** if(flag == true && idx==2) {}
		*** flag值要是true同时idx的值是2，这两个条件同时满足 && 

3、dom4j的简介
	* dom4j是dom4j组织开发针对xml解析器。dom4j不是javase的一部分
	** 要想使用dom4j，首先引入dom4j的jar包

	** 引入jar包的方式
	*** 在day06资料里面有dom4j-1.6.1.jar，需要把这个jar包放到项目里面
	*** 创建文件夹folder，名称：lib
	*** 把jar包黏贴到lib目录下面
	*** 右键点击jar包，选择build path --> add to build path
	*** 在项目里面多出了一个目录，当看到这个jar包前面的图标变成了 类似 “奶瓶” 图标，表示jar已经放到项目中
	
	** 操作步骤
	*** new SAXReader();
	**** 执行方法read方法，得到Document

	*** getRootElement() ：得到根节点

	*** getParent()：得到父节点

	***** 查询标签的方法
	*** element(String name) ：参数是标签名称，查询第一个子标签
	*** elements(QName qName) ：参数是标签名称，查找所有这个名称的子标签
	*** elements() ：查询所有的子标签

	*** dom4j解析 也会分配树形结构 （把dom方式和sax方式结合在一起）
	*** 解析的过程，从上到下，一层一层的进行解析

4、使用dom4j实现查询的操作
	* 查询所有的name标签的文本的内容
	* 步骤
	/*
	 * 1、得到解析器
	 * 2、执行read方法，得到document
	 * 3、得到根节点 document.getRootElement();
	 * 4、得到多个p1节点 elements(QName qName) 
	 * 5、遍历list集合，得到每一个p1标签
	 * 6、得到p1下面的name标签  element(String name) 
	 * 7、得到name文本内容 getText方法
	 * */


	* 查询第一个name标签的值
	* 步骤
	/*
	 * 1、得到解析器
	 * 2、执行read方法，得到document
	 * 3、得到根节点
	 * 
	 * 4、得到第一个p1标签  element("p1") 
	 * 5、得到第一个p1下面的name标签 element("name") 
	 * 6、得到name的文本内容getText()
	 * */

	 * 查询第二个name标签的值
	 * 步骤
	/*
	 * 1、得到解析器
	 * 2、执行read方法，得到document
	 * 3、得到根节点
	 * 
	 * 4、得到第二个p1标签
	 * 	** 首先得到所有的p1标签，返回list集合
	 *  **　获取第二个值 使用 get(1) :list集合下标从0开始
	 * 5、得到第二个p1下面的name标签 element("name") 
	 * 6、得到name的文本内容getText()
	 * */


	* 可以把通用性比较高的代码封装到一个工具类里面
	** 提高开发效率，利于程序维护
	//封装得到document的方法
	public static Document getDocument1() throws Exception {
		//得到解析器
		SAXReader saxReader = new SAXReader();
		//得到document
		Document document = saxReader.read("src/person.xml");
		return document;
	}

5、使用dom4j实现增加标签的操作
	* 在第一个p1标签末尾添加 <sex>nv</sex>

	* 回写xml : new  XMLWriter(OutputStream out, OutputFormat format) 

	* 步骤
	/*
	 * 1、使用工具类得到document
	 * 2、得到根节点
	 * 3、得到第一个p1标签 使用element方法
	 * 4、在p1上面直接添加 addElement("标签名称")，返回添加之后的标签
	 * 5、在添加之后的标签上面添加内容  使用setText("内容")方法
	 * 6、回写xml
	 ** 代码：
	 	//格式化操作
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/person.xml"), format);
		writer.write(document);
		//关闭流
		writer.close();
	 * */

	* 在第一个p1下面的 <age>100</age>  之前添加标签 <sch>ecit.edu.cn</sch>
	* 步骤
	/*
	 * 1、使用工具类得到document
	 * 2、得到根节点
	 * 3、得到第一个p1标签

	 * 4、得到p1下面的所有的子标签 elements()，返回list集合

	 * 5、在第二个位置添加一个标签 sch
	        ** 创建元素 DocumentHelper工具类 
		****使用方法createElement方法创建标签，在创建之后的标签上面执行setText方法
	 * 	** 在list里面在特定位置添加元素的方法  add(int index, E element) ，开始从0    
	 * 6、回写xml
	 * */

6、使用dom4j实现修改标签内容的操作
	* 修改第一个p1下面的<sex>nv</sex>的值nan

	* 步骤
	/*
	 * 1、得到document
	 * 2、得到根节点
	 * 3、得到第一个p1标签
	 * 4、得到第一个p1标签下面的sex标签
	 * 5、修改sex的值 使用方法setText方法
	 * 6、回写xml
	 * */

7、使用dom4j实现删除标签的操作
	* 删除：使用父节点删除

	* getParent()：得到父节点

	* 删除第一个p1标签下面的<sex>nan</sex> 

	* 步骤
	/*
	 * 1、得到document
	 * 2、得到根节点
	 * 3、得到第一个p1标签
	 * 4、得到p1下面的sex标签
	 * 5、使用sex的父标签删除 sex标签
		** 可以使用getParent()方法得到
		** 在父标签上面执行 remove(要删除标签)方法删除
	 * 6、回写xml
	 * */

8、使用dom4j得到标签上面的属性的值
	* 得到person标签上面的id1的属性的值
	* 步骤
	/*
	 * 1、得到document
	 * 2、得到根节点 person
		* 得到有属性的标签
	 * 3、得到person上面的属性的值 
		使用方法 attributeValue("属性的名称")：得到属性的值
	 * */

9、使用dom4j实现对xml的crud操作的方法总结
	* 得到根节点 getRootElement();
	* 查询操作
		** element("标签名称")：获取第一个子标签，返回 Element
		** elements("标签名称"): 获取标签下面的所有相同名称的子标签，返回list集合，集合上面可以使用泛型 Element
		** elements(): 获取标签下面的所有的子标签，返回list集合
		** 得到标签的文本内容：getText()
	
	* 在末尾添加元素
		** addElement("标签名称")：在标签上面执行这个方法，标签在标签末尾添加标签
		** 在标签上面添加文本内容：setText("内容");

	* 在特定位置添加元素
		** 使用工具类DocumentHelper
		*** 创建标签方法 createElement("标签名称");
		** 在特定位置添加方法，操作list方法 add(位置,要添加的元素);
	
	* 修改标签文本的方法
		** setText("内容");
	
	* 删除元素的方法
		* 得到父节点：getParent()
		* 删除的方法：remove(要删除的标签)
	
	* 获取属性的值
		* attributeValue("属性名称");
	
	* 回写xml
		* 格式化的操作 OutputFormat
		* new XMLWriter("文件流","Format") 
		* 把document写到文件使用 write(document)
		* 关闭流 close()	

10、使用XPath对象xml做操作
	* XPath是一种书写形式，通过这种书写形式可以直接得到某个标签

	* 在默认的情况下，dom4j不支持xpath，首先需要导入支持的jar包

	* 第一种使用 / : 表示一层一层 ，比如 /AAA/CCC：在AAA下面的CCC
	* 第二种使用 //: 无论有多少层，只有是这个名称都找到，比如//BBB，只要名称是BBB都找到
	* 第三种使用 * ：表示所有，比如 /AAA/CCC/DDD/*：表示AAA CCC DDD里面的所有的内容
	* 第四种使用 [1]:表示第一个标签
		     [last()]：表示最后一个标签
	
	* 第五种使用 //BBB[@id]： 表示名称是BBB，BBB上面有id属性的
	* 第六种使用 //BBB[@id='b1'] 表示名称是BBB 属性名称是id，属性的值是b1

	* 在dom4j里面提供两个方法支持xpath
		** 第一个方法 selectNodes("xpath表达式")
			*** 比如：得到所有的name的节点
			selectNodes("//name");

		** 第二个方法 selectSingleNode("xpath表达式")
	
	* 使用dom4j+xpath得到所有name标签文本内容
	* /*
	 * 1、得到document
	 * 2、得到所有的name标签 selectNodes("xpath"); xpath: //name
	 * 
	 * */
	//得到document
	Document document = Dom4jUtils.getDocument1();
	//得到所有的name的元素
	List<Node> list = document.selectNodes("//name");
	//遍历list，得到每一个name标签
	for (Node node : list) {
		//得到文本内容
		System.out.println(node.getText());
	}
	
	* 得到属性名称是id2，并且属性值是BBB标签p1 下面的name标签的文本内容
	/*
	 * 1、得到document
	 * 2、 得到属性名称是id2，并且属性值是BBB标签  //p1[@id2='BBB']/name
	 * */
	//得到document
	Document document = Dom4jUtils.getDocument1();
	//得到属性名称是id2，并且属性值是BBB标签
	Node name1 = document.selectSingleNode("//p1[@id2='BBB']/name");
	System.out.println(name1.getText());

	* 写项目时候，首先把需要的jar包导入到项目中

11、实现简单学生管理系统
	* 使用xml当做数据库，实现最基本crud操作

	* 首先导入支持jar包

	* 创建xml文件用于存储学生信息

	* 创建包的结构
	** cn.itcast.utils: 工具类的包
	** cn.itcast.stumanager: 实现操作学生信息的方法的类包
	** cn.itcast.test: 测试这些方法的类的包

	* 实现增加学生信息操作
	* 步骤
		/*
		 * 1、得到document
		 * 2、得到根节点
		 * 3、使用addElement方法创建stu标签
		 * 4、在创建之后的stu上面创建id name age
		 * 5、在创建之后的标签上面添加文本 （从参数对象里面得到值）
		 * 6、回写xml
		 * */


	* 实现删除学生信息的操作
		** 使用学生的id进行删除
	* 步骤
		/*
		 * 1、得到document
		 * 
		 * 2、找到所有的id
		 * 	** 使用xpath 找到所有id标签， //id   找id标签文本
		 * 3、返回list集合，遍历，判断集合里面的id值和参数的id是否相同
		 * 4、如果相同，首先找到id标签的父标签stu，再找stu的父标签，最终使用stu的父标签删除stu
		 * 5、回写xml
		 * */

	* 实现查询学生信息的操作
		** 使用id的值查询学生信息
	* 步骤
		/*
		 * 1、得到document
		 * 
		 * 2、得到所有的id 使用 xpath  //id ，返回list
		 * 3、遍历list，得到每一个id标签，得到id的文本内容
		 * 4、判断id的值和参数的id值是否相同
		 * 5、如果id相同，id标签的父标签
		 * 6、通过stu标签得到 id name  age的值
		 * 7、把id name  age里面的值，设置到对象里面 
		 * */


/**

 * 
 */