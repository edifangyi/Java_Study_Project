
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
		在之前</complexType>写
	
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

company.xsd
	<?xml version="1.0" encoding="UTF-8"?>
	<schema xmlns="http://www.w3.org/2001/XMLSchema" 
	targetNamespace="http://www.example.org/company" 
	elementFormDefault="qualified">
		<element name="company">
			<complexType>
				<sequence>
					<element name="employee">
						<complexType>
							<sequence>
								<!-- 引用任何一个元素 -->
								<any></any>
								<!-- 员工名称 -->
								<element name="name"></element>
							</sequence>
							<!-- 为employee元素添加属性 -->
							<attribute name="age" type="int"></attribute>
						</complexType>
					</element>
				</sequence>
			</complexType>
		</element>
	</schema>

department.xsd
	<?xml version="1.0" encoding="UTF-8"?>
	<schema xmlns="http://www.w3.org/2001/XMLSchema"
	targetNamespace="http://www.example.org/department" 
	elementFormDefault="qualified">
		<!-- 部门名称 -->
		<element name="name" type="string"></element>
	</schema>

==================================================================================================

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

	public class TestSax {

		public static void main(String[] args) throws Exception, SAXException {
			//创建解析器工厂
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			//创建解析器
			SAXParser saxParser = saxParserFactory.newSAXParser();
			//执行parse方法
			saxParser.parse("src/person.xml", new MyHandler1());
				
		}
	}

==================================================================================================	
	
	* 打印整个xml文档

	//打印整个文档
	class MyHandler extends DefaultHandler {

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			System.out.print("<"+qName+">");
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			System.out.print(new String(ch,start,length));
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			System.out.print("</"+qName+">");
		}
		
	}
==================================================================================================
	* 得到所有name标签的值
		* 定义一个成员变量 boolean
		* 判断，如果解析到name标签时候，把布尔类型修改成true
		* 判断如果true，打印文本内容
		* 如果执行到结束name标签时候，把设置成false


	//得到所有name标签的文本内容
	class MyHandler1 extends DefaultHandler {

		boolean flag = false;
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if("name".equals(qName)) {
				flag = true;
			}
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			if(flag == true) {
				System.out.println(new String(ch,start,length));
			}
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			if("name".equals(qName)) {
				flag = false;
			}
		}
		
	}


==================================================================================================	
	* 得到第一个name标签的文本的值
		* 定义一个成员变量 int idx = 1
		* 每次解析完成之后name标签，需要在结束的位置把idx+1，
		* 通过索引值得到某个标签
		*** if(flag == true && idx==2) {}
		*** flag值要是true同时idx的值是2，这两个条件同时满足 && 


			//得到第一个name的值
	class MyHandler1 extends DefaultHandler {

		boolean flag = false;
		int idx = 1;
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if("name".equals(qName)) {
				flag = true;
			}
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			if(flag == true && idx==2) {//改这个，得到第二个name
				System.out.println(new String(ch,start,length));
			}
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			if("name".equals(qName)) {
				flag = false;
				idx++;
			}
		}
		
	}
==================================================================================================
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
==================================================================================================
4、使用dom4j实现查询的操作
	* 查询所有的name标签的文本的内容
	* 步骤
	//查询所有的name标签的文本的内容
	public static void listNames() throws Exception {
		/*
		 * 1、得到解析器
		 * 2、执行read方法，得到document
		 * 3、得到根节点
		 * 4、得到多个p1节点 elements(QName qName) 
		 * 5、遍历list集合，得到每一个p1标签
		 * 6、得到p1下面的name标签element(String name) 
		 * 7、得到name文本内容
		 * */
		//得到解析器
//		SAXReader saxReader = new SAXReader();
//		//得到document
//		Document document = saxReader.read("src/person.xml");
		
		Document document = Dom4jUtils.getDocument1();
		//得到根节点
		Element root = document.getRootElement();
		//得到所有的p1
		List<Element> p1s = root.elements("p1");
		//遍历list集合
		for (Element p1 : p1s) {
			//得到p1下面的name标签
			Element name1 = p1.element("name");
			//得到name的文本内容
			String s = name1.getText();
			System.out.println(s);
		}
	}
==================================================================================================

	* 查询第一个name标签的值
	* 步骤

	//查询第一个name标签的值
	public static void listName1() throws Exception {
		/*
		 * 1、得到解析器
		 * 2、执行read方法，得到document
		 * 3、得到根节点
		 * 
		 * 4、得到第一个p1标签  element("p1") 
		 * 5、得到第一个p1下面的name标签 element("name") 
		 * 6、得到name的文本内容getText()
		 * */
		//得到解析器
//		SAXReader saxReader = new SAXReader();
//		//得到document
//		Document document = saxReader.read("src/person.xml");
		
		Document document = Dom4jUtils.getDocument1();
		//得到根节点
		Element root = document.getRootElement();
		//得到第一个p1标签
		Element p1 = root.element("p1");
		//得到第一个name标签
		Element name1 = p1.element("name");
		//得到name的文本内容
		System.out.println(name1.getText());
	}
	
==================================================================================================
	 * 查询第二个name标签的值
	 * 步骤
	//查询第二个name标签的值
	public static void listName2() throws Exception {
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
		//得到解析器
//		SAXReader saxReader = new SAXReader();
//		Document document = saxReader.read("src/person.xml");
		Document document = Dom4jUtils.getDocument1();
		//得到根节点
		Element root = document.getRootElement();
		//得到所有的p1标签
		List<Element> list1 = root.elements("p1");
		//得到第二个p1标签 使用get方法
		Element p12 = list1.get(1);
		//得到第二个p1下面的name标签
		Element name2 = p12.element("name");
		//得到name的值
		System.out.println(name2.getText());
	}

==================================================================================================
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


	public class Dom4jUtils {

		//封装得到document的方法
		public static Document getDocument1() throws Exception {
			//得到解析器
			SAXReader saxReader = new SAXReader();
			//得到document
			Document document = saxReader.read("src/person.xml");
			return document;
		}
		
		//封装回写xml的方法
		public static void xmlWriter1(Document document) throws Exception {
			//格式化操作
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(new FileOutputStream("src/person.xml"), format);
			writer.write(document);
			//关闭流
			writer.close();
		}
	}
==================================================================================================
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

			//在第一个p1标签末尾添加 <sex>nv</sex>
	public static void addSex() throws Exception {
		/*
		 * 1、使用工具类得到document
		 * 2、得到根节点
		 * 3、得到第一个p1标签
		 * 4、在p1上面直接添加 addElement("标签名称")
		 * 5、在添加之后的标签上面添加内容  setText方法
		 * 6、回写xml
		 * */
		//得到document
		Document document = Dom4jUtils.getDocument1();
		//得到根节点
		Element root = document.getRootElement();
		//得到第一个p1标签
		Element p1 = root.element("p1");
		//在p1上面添加标签 sex
		Element sex = p1.addElement("sex");
		//在标签上面添加内容
		sex.setText("nv");
		//回写xml
		Dom4jUtils.xmlWriter1(document);
	}

==================================================================================================

	* 在第一个p1下面的 <age>100</age>  之前添加标签 <sch>ecit.edu.cn</sch>
	* 步骤
	//在第一个p1下面的 <age>100</age>  之前添加标签 <sch>ecit.edu.cn</sch>
	public static void addBeforeAge() throws Exception {
		/*
		 * 1、使用工具类得到document
		 * 2、得到根节点
		 * 3、得到第一个p1标签
		 * 4、得到p1下面的所有的子标签 elements()，返回list集合
		 * 5、在第二个位置添加一个标签 sch
		 * 	** 在list里面在特定位置添加元素的方法  add(int index, E element) 
		 *  ** 创建元素 DocumentHelper工具类
		 * 6、回写xml
		 * */
		//得到document
		Document document = Dom4jUtils.getDocument1();
		//得到根节点
		Element root = document.getRootElement();
		//得到第一个p1标签
		Element p1 = root.element("p1");
		//得到p1下面的所有的子标签
		List<Element> list = p1.elements();
		//创建标签
		Element sch = DocumentHelper.createElement("sch");
		//在sch上面创建文本
		sch.setText("ecit.edu.cn");
		list.add(1, sch);
		//回写xml
		Dom4jUtils.xmlWriter1(document);
	}
	

==================================================================================================

6、使用dom4j实现修改标签内容的操作
	* 修改第一个p1下面的<sex>nv</sex>的值nan

	//修改第一个p1下面的<sex>nv</sex>的值nan
		public static void modifySex() throws Exception {
			/*
			 * 1、得到document
			 * 2、得到根节点
			 * 3、得到第一个p1标签
			 * 4、得到第一个p1标签下面的sex标签
			 * 5、修改sex的值 使用方法setText方法
			 * 6、回写xml
			 * */
			//得到document
			Document document = Dom4jUtils.getDocument1();
			//得到根节点
			Element root = document.getRootElement();
			//得到第一个p1标签
			Element p1 = root.element("p1");
			//得到sex标签
			Element sex = p1.element("sex");
			//修改sex的文本内容
			sex.setText("nan");
			//回写xml
			Dom4jUtils.xmlWriter1(document);
		}


	
==================================================================================================

7、使用dom4j实现删除标签的操作
	* 删除：使用父节点删除

	* getParent()：得到父节点

	* 删除第一个p1标签下面的<sex>nan</sex> 

	* 步骤
	//删除第一个p1标签下面的<sex>nan</sex>
	public static void deleteSex() throws Exception {
		/*
		 * 1、得到document
		 * 2、得到根节点
		 * 3、得到第一个p1标签
		 * 4、得到p1下面的sex标签
		 * 5、使用sex的父标签删除 sex标签
		 * 6、回写xml
		 * */
		//得到document
		Document document = Dom4jUtils.getDocument1();
		//得到根节点
		Element root = document.getRootElement();
		//得到第一个p1标签
		Element p1 = root.element("p1");
		//得到p1下面的sex标签
		Element sex = p1.element("sex");
		//使用sex的父标签删除
		//得到sex的父标签   sex.getParent();
		p1.remove(sex);
		//回写xml
		Dom4jUtils.xmlWriter1(document);
	}

==================================================================================================

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
	//得到person标签上面的id1的属性的值
	public static void getAttribute1() throws Exception {
		/*
		 * 1、得到document
		 * 2、得到根节点 person
		 * 3、得到person上面的属性的值 
		 * */
		//得到document
		Document document = Dom4jUtils.getDocument1();
		//得到person标签 （根节点）
		Element person = document.getRootElement();
		//得到person上面的属性值
		String a1 = person.attributeValue("id1");
		System.out.println(a1);
	}

==================================================================================================

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


==================================================================================================
	

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


==================================================================================================

	public class TestXpath {


		public static void main(String[] args) throws Exception {
	//		getNames();
			getName1();
		}
		
		//得到属性名称是id2，并且属性值是BBB标签 下面的name标签的文本内容
		public static void getName1() throws Exception {
			/*
			 * 1、得到document
			 * 2、 得到属性名称是id2，并且属性值是BBB标签  //p1[@id2='BBB']/name
			 * */
			//得到document
			Document document = Dom4jUtils.getDocument1();
			//得到属性名称是id2，并且属性值是BBB标签
			Node name1 = document.selectSingleNode("//p1[@id2='BBB']/name");
			System.out.println(name1.getText());
		}
		
		//获取所有name元素的文本内容
		public static void getNames() throws Exception {
			/*
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
		}

	}

==================================================================================================

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



day08

昨天内容回顾
	1、tomcat安装
	** 前提条件：jdk，配置JAVA_HOME
	** 端口冲突

	2、目录结构
	** conf：配置文件
	** webapps：项目

	3、动态网站的目录结构
	** WEB-INF
	*** web.xml
	*** classes
	*** lib
	
	4、在tomcat中部署项目有几种方式
	** 在webapps下面创建
	** 使用myeclipse部署
	** 配置虚拟路径

	5、配置虚拟路径的两种方式
	** 在server.xml进行配置
	** 找到catalina/localhost 创建xml文件，访问，通过xml文件名称进行访问

	6、网站访问的过程

	7、http协议的请求组成
	** 请求行
	** 请求头
		** 重要头信息
		** referer User-Agent If-Modified-Since
	** 请求体

	8、http协议的响应组成
	** 响应行
		*** 状态码
		200 302 304 404 500 503
	** 响应头
		** 重要头信息
		*** Location Refresh Last-Modified
	** 响应体
		** 在页面显示的内容

1、servlet的快速入门
	* 什么是servlet？通过文档（不是jdk文件，而是javaee的文档）
	** servlet就是一个java程序，可以接收和响应来自客户端的请求。

	** 实现servlet？
	*** 实现Servlet接口
	*** 继承GenericServlet类
	*** 继承HttpServlet类

	*** 如果实现Servlet接口，需要把接口里面的所有方法都实现
	**** 但是如果使用继承类的方式，不需要把类里面的所有的方法都实现

	* 第一个servlet程序。向页面输出内容 hello servlet
	** 使用记事本开发一个servlet程序

	** 开发步骤
	（1）继承GenericServlet类实现servlet
	（2）向页面输出内容：使用service方法里面参数response向页面输出
	（3）部署到tomcat里面，通过配置让服务器知道不是一个普通的java程序，而是一个servlet
	** 找到文件 web.xml
	<servlet>
		<servlet-name>hello</servlet-name>
		<servlet-class>cn.itcast.servlet.Hello</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>hello</servlet-name>
		<url-pattern>/hello</url-pattern>
	</servlet-mapping>

2、servlet的执行过程
	* 画图分析执行过程

	* 根据地址栏输入的地址找到servlet配置文件中url-pattern里面相同地址
	* 找到地址对应的servlet名称
	* 找到另外一个servlet标签里面和servlet名称相同的servlet
	* 找到servlet包类的路径，最终使用反射使用servlet里面的方法执行

3、servlet的生命周期
	* 什么是生命周期：从出生到死亡全过程
	* servlet的生命周期：servlet从创建到销毁全过程

	* servlet接口里面有五个方法，有三个方法是与servlet生命周期相关的方法
	** init方法，servlet创建时候执行这个方法，servlet在第一次访问时候创建，创建一次
	** service方法，每次请求时候都会执行这个方法，执行多次
	** destroy方法，销毁servlet时候执行这个方法，关闭服务器时候销毁servlet，执行一次

4、接口的继承关系

	ServletRequest  HttpServletRequest
	ServletResponse HttpServletResponse

	** HttpServletRequest和HttpServletResponse是ServletRequest和ServletResponse子接口

	** HttpServletRequest和HttpServletResponse这两个接口专注于http协议的接口
	** ServletRequest和ServletResponse针对任何的网络的协议
	** sun公司设计这些接口时候最开始时候野心的，未来互联网发展可能不只是http协议，可能还有其他协议，但是目前只有http

5、Servlet开发注意细节
	（1）GenericServlet里面init有参数的方法和没有参数init方法关系
	** init有参数的方法最终也会执行init没有参数的方法，所以直接使用init没有参数的方法就可以了
	
	（2）HttpServlet里面service方法和doXX方法
	** 根据提交的方式执行相应的doXX方法，比如提交方式是get，执行doGet方法；比如提交方式post，执行doPost方法
	** 直接实现doXX就可以了，实现doGet和doPost方法就可以了

	*** 在实际开发一般都是使用继承HttpServlet实现servlet，直接实现doGet和doPost方法

	（3）简化编程
	** 无论什么提交方式，都会执行到这个代码
	*** 在doPost方法里面调用doGet方法 ： this.doGet(request, response);

	（4）Servlet启动时候创建
	** 想要servlet在服务器启动时候创建，而不是第一次访问时候创建
	*** 如果在创建servlet时候需要做很多事情，比如读文件，读数据库，这个时候谁第一次访问肯定会很慢

	** 需要进行配置，配置servlet启动时候创建
	** 在web.xml中找到要启动的servlet，<load-on-startup>正整数的值</load-on-startup>
	*** 要求： 正整数的值，没有固定的范围，但是这个值不要写成 1，不能和默认servlet冲突

	** 具体配置
	  <servlet>
		<servlet-name>servletDemo1</servlet-name>
		<servlet-class>cn.itcast.servlet.ServletDemo1</servlet-class>
		<load-on-startup>2</load-on-startup>
	</servlet>

	（5）修改servlet模板
	*** 在资料里面文档

6、url-pattern配置
	* 有三种配置

	* 第一种：完全路径匹配
		** 使用 / 开头 /hello  /aa/hello
	* 第二种：目录匹配
		** 使用 / 开头 /aa/ *  / *

	* 第三种：扩展名匹配
		** 不使用/开头 *.action *.do 
	
	* 如果在配置文件里面配置了多个url-pattern，最终只能有一个执行
	** 匹配优先级： 完全路径匹配 > 目录匹配 > 扩展名匹配

	* 把ppt上面的几个练习掌握就可以了

7、开发中的路径问题
	* 相对路径（和html一样）
	** 在同一级目录下面
		*** 直接写文件的名称
		*** <img src="w01.png"/>

	** 在下一级目录
		*** <img src="img1/w01.png"/>

	** 在上一层目录 ../
		*** <img src="../img/w01.png"/>
	
	** 相对路径缺点：如果图片变化了位置，每次写的路径都不一样


	* 绝对路径（一般开发中都使用绝对路径）

	** 第一种写法：http://127.0.0.1/day08/img/w01.png

	** 第二种写法：(经常使用的写法)
		* 直接访问页面 http://127.0.0.1 /day08/html/my1.html
		* 直接访问图片 http://127.0.0.1 /day08/img/w01.png
		** 直接 /day08/img/w01.png
	
	* 路径分类有两类
	** 第一类：客户端路径 :带项目名称 /day08/img/w01.png，一般使用重定向

	** 第二类：服务器端路径：不需要带项目名称
		*** 在服务器内部进行的访问的操作，经常使用在转发操作
		*** 不需要带项目名称 /img/w01.png

8、ServletConfig对象使用	
	* 第一个作用：获取初始化参数
	** 配置初始化参数，只能在当前配置的servlet里面使用，不能再其他的servlet里面使用
	* 配置初始化参数：
	** 在web.xml中找到要配置servlet，
	*** <init-param>
		<param-name>url</param-name>
		<param-value>192.0.0.1</param-value>
	   </init-param>

	** 方法
	*** getInitParameter(String name) ：获取初始化参数的值
	*** 代码
		//得到servletconfig对象
		ServletConfig config =  getServletConfig();
		//执行 getInitParameter(String name) 
		String url = config.getInitParameter("url");

	*** getInitParameterNames() ：获取所有的初始化参数的名称
	*** 代码
		//得到servletconfig对象
		ServletConfig config =  getServletConfig();
		//执行 getInitParameterNames()所有初始化参数的名称
		Enumeration<String> enumeration =  config.getInitParameterNames();
		//遍历
		while(enumeration.hasMoreElements()) {
			//得到每一个初始化参数的名称
			String name1 = enumeration.nextElement();
			//得到初始化参数的值
			String value1 = config.getInitParameter(name1);
			System.out.println(name1+" :: "+value1);
		}

	* 第二个作用：得到当前运行的servlet的名称 <servlet-name>servletDemo1</servlet-name>
	** getServletName() 
	** 代码
		//得到servletconfig对象
		ServletConfig config =  getServletConfig();
		//得到servlet名称
		String servletname = config.getServletName();
		System.out.println("name: "+servletname);

	* 第三个作用：得到ServletContext对象，直接使用 getServletContext()
	** getServletContext() 

	* 如果想要使用，得到ServletConfig对象，直接使用 getServletConfig()方法

9、servletContext对象（***）
	* 启动tomcat服务器，在tomcat里面可能有很多的项目，这个时候服务器会为每一个项目创建一个对象servletContext。
	* 在这个项目里面，如果通过servlet1向servletContext里面存一个值，这个时候在项目里面其他所有的servlet里面都
	可以取到这个值
	
	* servletContext域：在一定的范围以内，做存值和取值操作
	** servletContext域范围：整个的web项目

	* 存值和取值
	** 存值：setAttribute(String name, Object object) ：两个参数，第一个参数设置值的名称，第二个参数是值
	** 取值：getAttribute(String name) ：参数是设置值的名称

	* 创建servlet1，通过servlet1向servletContext里面设置一个值
	* 创建servlet2，在servlet2取通过servlet1设置的值

	* 得到ServletContext对象，使用getServletContext()方法

10、通过servletContext对象读取全局的初始化参数
	* 全局的初始化参数：所有的servlet里面都可以使用
	* 配置全局初始化参数
	** 在web.xml中，但是不能配置在任何的一个servlet里面
	** <context-param>
		<param-name>url</param-name>
		<param-value>192.0.0.1</param-value>
	 </context-param>

	* 方法：
	** getInitParameter(String name) ：得到全局初始化参数的值
	*** 代码
		//得到servletContext对象
		ServletContext context = getServletContext();
		//得到username的值
		String username = context.getInitParameter("username");
		System.out.println("username: "+username);

	** getInitParameterNames() ：得到所有的全局初始化参数的名称
	*** 代码
		//得到servletContext对象
		ServletContext context = getServletContext();
		//得到所有的全局初始化参数的名称
		Enumeration<String> enumeration = context.getInitParameterNames();
		//遍历
		while(enumeration.hasMoreElements()) {
			//每一个全局初始化参数的名称
			String namev = enumeration.nextElement();
			//得到值
			String valuev = context.getInitParameter(namev);
			System.out.println(namev+" :: "+valuev);
		}

11、练习：使用servletContext域对象统计网站的访问次数
	* 实现步骤：
	* 创建一个servlet11，增加次数操作
	* 创建一个servlet12，读取次数

	* 在count的servlet里面首先初始化一个值，在init方法里面初始化
	** //得到servletContext对象
	ServletContext context = getServletContext();
	// 向servletContext里面设置一个值 count 0
	context.setAttribute("count", 0);

	* 首先从servletContext里面取出count的值
	* 把这个值+1
	* 把这个+1之后的值放回到servletContext里面
	** 	//得到servletContext对象
		ServletContext context = getServletContext();
		//获取servletContext里面的count的值
		int count = (Integer) context.getAttribute("count");
		//把+1之后的值放回servletContext里面
		context.setAttribute("count", count+1);

	* 在show的servlet里面获取count的值（访问的次数）
	** //得到servletContext对象
	ServletContext context = getServletContext();
	//得到servletContext里面的值
	int count = (Integer) context.getAttribute("count");

12、使用传统方式读取web项目中的文件
	* properties文件格式
	** 读取数据 url username 
	** 里面的格式类似key value形式
	**      url=localhost
		username=tom
		password=123456
		ip=172.11.1.3
	
	** 读取properties文件
	*** 使用到一个类 Properties，在java.util 包里面
	*** load(InputStream inStream) 加载文件流
	*** 字节流和字符流 ： 字符流只能操作文本文件，如果是图片不能操作，一般都是字节流
	*** getProperty(String key) 得到配置文件里面值，参数是名称

	 **classes/db.properties路径是一个相对路径，相对jvm路径
	 * web项目，jvm什么时候创建，tomcat启动时候创建jvm。
	 * tomcat在bin目录里面startup.bat启动

13、使用servletContext对象读取web项目中的文件
	* 方法
	** InputStream getResourceAsStream(String path) ：得到文件的输入流

	* 读取src下面的文件
	** 使用getResourceAsStream("文件的路径")
	*** 首先第一个位置是固定 / : 理解为项目的名称，后面的部分是文件在tomcat里面具体的路径
	** 	//得到servletContext对象
		ServletContext context = getServletContext();
		//使用getResourceAsStream(String path) 读取文件输入流
		// 首先第一个位置是固定 /，后面的部分文件在tomcat里面具体的路径		
		InputStream in = context.getResourceAsStream("/WEB-INF/classes/db.properties");


	* 读取包下面的文件
	** 使用getResourceAsStream("文件的路径")
	*** 首先第一个位置是固定 / : 理解为项目的名称，后面的部分是文件在tomcat里面具体的路径
	** 	//得到servletContext对象
		ServletContext context = getServletContext();
		//得到文件流
		//路径：首先第一个位置固定的 / 
		//后面的部分是文件在tomcat里面的具体的路径
		InputStream in = context.getResourceAsStream("/WEB-INF/classes/cn/itcast/read/db1.properties");

	
	* 读取webroot下面的文件
	** 使用getResourceAsStream("文件的路径")
	*** 首先第一个位置是固定 / : 理解为项目的名称，后面的部分是文件在tomcat里面具体的路径
		//得到servletContext对象
		ServletContext context = getServletContext();
		//读取文件流
		//第一个位置 /
		//后面的位置 文件在tomcat里面具体的路径
		InputStream in = context.getResourceAsStream("/db2.properties");

	* 如果文件放到项目路径下（webroot在同一级目录），文件不能使用servletContext对象读取到
	** 文件根本没有发布到tomcat里面

	** String getRealPath(String path)  ：得到文件的完全路径 带盘符
 
14、使用传统方式读取web项目中的文件
	InputStream in = new FileInputStream("完全路径 比如 c:\\a.txt");

	* 需要得到文件的完全路径 带盘符
	** 需要使用servletContext里面的另外的一个方法 getRealPath(String path) 
	** 参数传递文件的路径：第一个位置是 /: 项目的名称，后面的部分是文件在tomcat里面具体的路径

	* 	//得到servletContext对象
		ServletContext context = getServletContext();
		//得到文件的完全路径 带盘符
		//第一个位置 /
		//后面写文件在tomcat里面具体的路径
		String path = context.getRealPath("/db2.properties");
		//I:\0518\apache-tomcat-7.0.53\webapps\day08\db2.properties
//		System.out.println("path: "+path);
		//使用传统方式读取文件了
		InputStream in = new FileInputStream(path);

15、反射的原理
	* 反射是一些通用性比较高的代码，一般使用在框架里面

	* 通过反射得到类里面的所有的内容
	** 所有内容包含：构造方法（有参数和没有参数），属性，普通方法

	* 画图分析反射的过程
	* 创建一个java文件，
	第一步：保存到本地硬盘，
	第二步：编译成.class文件
	第三步：使用类加载器加载到内存中（依赖于jvm）

	** class文件在内存中可以使用Class类进行表示
	** 首先得到Class类
	** 有三种方式
	*** 类名.class
	*** 对象.getClass()
	*** Class.forName("包类路径")

	** 构造方法使用Constructor类表示
	** 属性使用Filed类表示
	** 普通方法使用Method类表示

16、url和uri的区别
	* url：专门指的是网络地址 比如 http://www.itcast.cn  http://www.baidu.com
	* uri: 所有的网络地址 比如 test@163.com

17、类的加载器来读文件
	* 使用类加载器使用范围：读取web项目中classes里面的文件
	
	* 得到类加载器
	** 首先Class类（有三种方式）
	** 通过Class类里面.getClassLoader()得到类加载器
	** 在类加载器里面使用方法 getResourceAsStream()得到文件的输入流
		*** 直接写classes里面的文件的名称

	** 	//得到Class类
//		Read4.class
		Class clazz = this.getClass();
		//得到类加载器
		ClassLoader classLoader = clazz.getClassLoader();
		//读取文件
		InputStream in = classLoader.getResourceAsStream("db.properties");

18、默认servlet
	* 如果页面出现404问题，由默认的servlet操作

	* 在tomcat的web.xml中找默认的servlet

	* 配置启动时候创建servlet ，使用<load-on-startup>这里面的值不能写成1，会与默认的servlet冲突

	*  <url-pattern>/</url-pattern>
	** 如果把项目里面的一个servlet里面url-pattern写成／，就会成为一个默认的servlet

	* 在默认的servlet里面配置
	<init-param>
            <param-name>listings</param-name>
            <param-value>false</param-value>
        </init-param>

	* 需要把listings值设置成true，直接访问项目里面一个文件夹，可以把文件夹里面的所有的内容显示出来


/**
 
 */



day09

上节内容回顾
	1、servlet的生命周期
		* init  service  destroy
	
	2、url-pattern配置
		* 完全路径匹配 > 目录 > 扩展名 

今天主要学习 request对象和response对象
* http操作，服务器会为每次请求创建一个对象request，同时创建响应的对象response

* 请求：在浏览器地址输入一个地址，点击回车，访问到服务器，这个过程称为请求
* 响应：服务器接受到请求，根据请求返回数据到浏览器进行显示，这个过程称为响应

1、response响应的对象
	* HttpServletResposne对象，代表一个响应，父接口是ServletResponse 
	** 通过api文档查看这个对象里面的方法

	* 响应包含三部分
	** 响应行
		*** 状态码
		* setStatus(int sc) 
		* 比如 setStatus(302);

	** 响应头
		*** 结构：key value，一个key可以有一个或者多个value
		* setHeader(java.lang.String name, java.lang.String value) ：第一个参数头的名称 ，第二个值
		** 针对一个key对应一个value的情况
		** setHeader("aa","AA");
		   setHeader("aa","BB");
		   最终的结果：aa BB
		 
		** 针对特殊的类型有设置头的方法
		* setIntHeader(java.lang.String name, int value)：值是int类型
		* setDateHeader(java.lang.String name, long date) ：值是毫秒数
		
		* addHeader(java.lang.String name, java.lang.String value) ：第一个参数头的名称 ，第二个值
		** 针对一个key对应多个value的情况
		** addHeader("cc","CC");
		   addHeader("cc","QQ");
		   结果： cc CC,QQ

		** 针对特殊类型的设置头的方法
		* addIntHeader(java.lang.String name, int value) ：值是int类型
		* addDateHeader(java.lang.String name, long date) ：值是毫秒数

	** 响应体
		*** 显示在浏览器里面的内容
		** 使用字节流和字符流向页面输出内容
		* getOutputStream() 
		* getWriter() 

	** 把服务器上面的内容显示到浏览器，这个过程都可以使用response来实现

2、案例一：使用response实现登录的重定向操作
	* 创建一个登录页面，表单，提交一个servlet里面
	* 判断用户名和密码是否正确，如果正确向页面输出 success
	* 如果用户名或者密码错误，重定向到登录页面

	* 重定向 302
	* 头信息 Location

	* 步骤
	/**
	 * 1、得到输入的用户名和密码
	 * 	* request方法 getParameter("输入项里面的name属性的值")方法
	 * 2、判断用户名和密码是否正确，比如固定值  admin  123456
	 * 3、如果用户名和密码都正确，向页面输出一个值 SUCESS
	 * 4、如果用户名或者密码错误，重定向到登录页面
	 * 	* 使用 302 设置状态码 setStatus方法
	 *  * 使用头 Location 设置头方法  setHeader方法
	 */

	* 代码
		//重定向到登录页面
		//设置302状态码
		response.setStatus(302);
		response.setHeader("Location", "/day09/response/login.html");

		//简写的方式：实现重定向的操作
		response.sendRedirect("/day09/response/login.html");

3、案例二：使用response实现页面的定时跳转
	* 使用 Refresh头
	** response.setHeader("Refresh","3;url=/day09/.....");
	* 代码
	response.setHeader("Refresh", "3;url=/day09/response/login.html");

	* 可以在html页面中使用meta头标签实现
	** <meta http-equiv="Refresh" content="3;url=/day09/response/login.html">

	* 使用js实现倒计时
	  	var m = 5;		
  		function load1() {			
  			var span1 = document.getElementById("spanid");
  			span1.innerHTML = m;
  			m--;
  		}
  		setInterval("load1();",1000);

4、案例三：使用Response实现禁用浏览器缓存
	* 使用到头信息
	    Cache-Control : no-cache
	    Pragma : no-cache 
	    Expires: -1 ：使用什么方法，setDateHeader("",毫秒数)：毫秒数，1970-1-1至今的毫秒数
	
	* 这些头信息禁用浏览器缓存的效果，在一些版本低的浏览器里面，ie6
	* 	response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", -1);

5、response向页面输出中文问题解决
	* 向页面输出内容 ： 有两种方式，使用字节流和字符流输出

	* 使用字节流向页面输出中文
	* /**
	 * 会出现中文乱码？
	 * * 不一定，和浏览器的默认编码有关
	 * 
	 * * 解决乱码问题
	 * ** 首先设置浏览器的编码
		response.setHeader("Content-Type", "text/html;charset=utf-8");
	 * ** 设置字节数组的编码
		response.getOutputStream().write("字节流中文".getBytes("utf-8"));
	 * *** 浏览器的编码和字节数组的编码一致
	 */

	* 使用字符流向页面输出中文
	* /**
	 * 使用字符流输出中文会有乱码？
	 * 一定会有乱码
	 * 
	 * * 字符流会产生一个缓冲区，首先会输出的内容先放到缓冲区里面，通过缓冲区进行输出
	 * * response缓冲区会有一个默认的编码 iso8859-1，但是这个编码不支持中文
	 * 
	 * ** 解决方法
	 * ** 首先设置response缓冲区的编码
		response.setCharacterEncoding("utf-8");
	 * ** 设置浏览器的编码
		response.setHeader("Content-Type", "text/html;charset=utf-8");
	 * *** 让response缓冲区的编码和浏览器编码一致
	 */

6、response开发中一些细节问题
	* 第一个细节问题： 使用字符流向页面输出中文解决，有一种简写方式
	** //使用一种简写方式 
	  response.setContentType("text/html;charset=utf-8");
	
	* 第二个细节问题：
	* 字节流和字符流是互斥的，两个流不能在一起使用

	* 第三个细节问题：
	"text/html;charset=utf-8"，使用分号进行隔开，而不能使用其他的符号

	* 第四个细节问题：
	* 不能使用字符流直接向页面输出数字
	** /*
	 * 使用字符流向页面直接输出一个数字，
	 * 到utf-8码表查找数字对应的值，把数字对应的字符输出，而不会直接输出数字
	 */
	
	* 第五个细节问题：
	* 重定向操作时候，简写方式
	response.sendRedirect("/day09/....");

7、案例四：使用response实现文件的下载
	* 首先服务器上面有可以下载的文件

	* 下载的步骤
	** 第一步：得到文件流，输入流
		* 得到文件的完全路径 使用servletContext对象里面getRealPath方法
		InputStream in = new FileInputStream("文件完全路径");

	** 第二步：使用输出流把文件输入流写到浏览器
		OutputStream out = response.getOutputStream() 
	** 第三步：流对接

	** 设置头信息：Content-Disposition，如果下载的文件是一个图片，如果不设置这个头信息，会把图片直接打开，
	无论是什么格式的文件，都会提示下载这个文件

	*如果下载的文件名称里面包含中文，这个下载时候显示不能正常显示
	** 首先在不同的浏览器里面有不同的编码，需要根据不同的浏览器进行相应的处理
	*** 使用头 User-Agent得到不同的浏览器类型
	** ie里面采用的编码url编码，火狐采用的编码base64（到day20专门讲解文件的上传和下载）

	** 代码
		//得到文件的完全路径
		String path = getServletContext().getRealPath("/img/b.jpg");
		//		System.out.println(path); c:\tomcat\img\a.jpg
		//得到文件的名称 使用字符串截取
		int lens = path.lastIndexOf("\\");
		String filename = path.substring(lens+1);
		//设置头信息
		response.setHeader("Content-Disposition", "attachment;filename="+filename);
		//得到文件流
		InputStream in = new FileInputStream(path);
		//使用输出流写到浏览器
		OutputStream out = response.getOutputStream();
		//流对接
		int len = 0;
		byte[] b = new byte[1024];
		while((len=in.read(b))!=-1) {
			out.write(b, 0, len);
		}
		//关闭流
		in.close();
	
8、案例五：使用response实现验证码
	* 什么是验证码：防止恶意注册，灌水

	* 实现的步骤
	第一步：生成图片
	第二步：生成随机的数字和字母
	第三步：把数字和字母画到图片上
	第四步：把图片显示到页面上
	
	* 实现中文的验证码
	** 汉字：\u4e00 —— \u9fa5，但是这个范围后面的那些汉字不认识，使用常用汉字的范围

	* 实现看不清换一张
	** 首先在登陆页面里面增加验证码，使用img标签，src属性值加上验证码的servlet
	** 创建一个超链接，写一个事件，通过js实现这样操作
	*** 首先得到img标签，重新请求servlet，使用src属性，
	*** 产生一个问题：有缓存，在请求的地址后面增加一个随机数
	** 代码
		//得到img标签
		var img1 = document.getElementById("img1");
		//向src重新设置地址
		img1.src = "/day09/code?"+new Date().getTime();


		/**
		 * 使用response实现验证码
		 * @author asus
		 *
		 */
		public class Code extends HttpServlet {

			/**
			 * 1、生成图片
			 * 2、生成随机的数字和字母
			 * 3、把数字和字母画到图片上
			 * 4、把图片显示到页面上
			 */
			public void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				//生成图片
				int width = 200;
				int height = 50;
				BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
				//生成的图片背景颜色 默认是黑色
				//得到画笔
				Graphics2D g2d = (Graphics2D) bufferedImage.getGraphics();
				//设置颜色
				g2d.setColor(Color.gray);
				g2d.fillRect(0, 0, width, height);
				
				//生成四个随机的数字和字母
				String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
								Random r = new Random();
				int x = 30;
				int y = 30;
				g2d.setColor(Color.red);
				//设置字体的样式
				g2d.setFont(new Font("宋体",Font.BOLD,25));
				//旋转的效果 
				//弧度： 角度*3.14/180
				for(int i=1;i<=4;i++) {
					//返回字符串里面字符的下标
					int len = r.nextInt(words.length());
					
					//旋转的角度 +-30度
					int jiaodu = r.nextInt(60)-30;
					double h = jiaodu*Math.PI/180;
					//根据位置得到具体字符
					char ch = words.charAt(len);
					
					//实现旋转
					g2d.rotate(h, x, y);
					
					//把生成的字符画到图片
					g2d.drawString(ch+"", x, y);
					
					//再转回来
					g2d.rotate(-h, x, y);
					x += 25;
				}
				
				//增加三条干扰线 drawLine(int x1, int y1, int x2, int y2) 
				int x1,x2,y1,y2;
				g2d.setColor(Color.green);
				for(int j=1;j<=3;j++) {
					x1 = r.nextInt(width);
					y1 = r.nextInt(height);			
					x2 = r.nextInt(width);
					y2 = r.nextInt(height);
					//把线画到图片
					g2d.drawLine(x1, y1, x2, y2);
				}
			
				//把图片显示到页面上
				ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
			}

			/**
			 * 
			 */
			public void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				doGet(request, response);
			}
			
			public static void main(String[] args) {
				String words = "\u9fa5\u9fa4\u9fa3\u9fa2";
				Random r1 = new Random();
				int lens = r1.nextInt(words.length());
				System.out.println(words.charAt(lens));
			}

		}

--------------------------------------------------------------------------------------------------------------

		  <body>
		    <h1>登录页面</h1>
		    <form action="/day09/login" method="post">
		    	username:<input type="text" name="username"/>
		    	<br/>
		    	passwrod:<input type="password" name="password"/>
		    	<br/>
		    	code:<input type="text" name="code"/>
		    	<img id="img1" src="/day09/code"/> <a href="javascript:void(0)" onclick="loadCode();">看不清,换一张</a>
		    	<br/>
		    	<input type="submit" value="登录"/>
		    </form>
		  </body>
		  <script type="text/javascript">
		  	//实现看不清换一张
		  	function loadCode() {
				//得到img标签
				var img1 = document.getElementById("img1");
				//向src重新设置地址
				img1.src = "/day09/code?"+new Date().getTime();
			}
		  </script>


9、request对象
	* HttpServletRequest，代表请求对象，父接口是 ServletRequest

10、获取到客户机的信息
	** 获取表单提交方式
		getMethod() 

	** 获取到请求地址
		getRequestURL()

	** 获取到请求的项目名称
		getContextPath() 

	** 获取请求的客户端的ip地址
		getRemoteAddr() 


		/请求方式
		String method = request.getMethod();
		//项目名称
		String path = request.getContextPath();
		
		//ip
		String ip = request.getRemoteAddr();
		//请求地址
		System.out.println("url: "+request.getRequestURL());
		System.out.println("method: "+method);
		System.out.println("path: "+path);
		System.out.println("ip: "+ip);




11、获取到请求的头信息
	* 使用方法getHeader("头信息名称");
	* 重要的头信息
	* Referer  User-Agent If-Modified-Since
	** request.getHeader("Referer");
	   request.getHeader("User-Agent");

12、获取通过表单提交的数据
	* 方法
	** getParameter(java.lang.String name)
		- 获取表单提交的数据方法，参数输入项name的值
		- String username = request.getParameter("username");

	** getParameterValues(java.lang.String name)，返回String[]
		- 针对复选框 ，获取多个提交的数据，参数输入项name的值
		- //得到复选框里面的所有值
		String[] loves = request.getParameterValues("love");
		//Arrays
		System.out.println(Arrays.toString(loves));

	** getParameterMap() ：返回 Map<java.lang.String,java.lang.String[]>
		- 获取表单输入项的name的值，和输入的值
		- //得到输入项name的值，和输入的值
		Map<String,String[]> map = request.getParameterMap();
		//遍历map 有两种 
		//得到所有的key
		Set<String> keys = map.keySet();
		//遍历set，得到value ，set遍历有两种方式 
		for (String key : keys) {
			//根据key得到value
			String[] values = map.get(key);
			System.out.println(key+" :: "+Arrays.toString(values));
		}
	
	** getParameterNames() ： Enumeration<java.lang.String>
		- 获取所有表单输入项的name的值

	** 在表单输入项里面，输入中文，出现中文乱码



	//getParameterMap()
	private void test3(HttpServletRequest request) {
		//得到输入项name的值，和输入的值
		Map<String,String[]> map = request.getParameterMap();
		//遍历map 有两种 
		//得到所有的key
		Set<String> keys = map.keySet();
		//遍历set，得到value ，set遍历有两种方式 
		for (String key : keys) {
			//根据key得到value
			String[] values = map.get(key);
			System.out.println(key+" :: "+Arrays.toString(values));
		}
	}
	
	
	//使用 getParameterValues(java.lang.String name)
	private void test2(HttpServletRequest request) {
		//得到复选框里面的所有值
		String[] loves = request.getParameterValues("love");
		//Arrays
		System.out.println(Arrays.toString(loves));
	}
	
	//使用 getParameter(java.lang.String name)
	private void test1(HttpServletRequest request) {

		String username = request.getParameter("username");
		System.out.println("username:: "+username);
		
//		String love = request.getParameter("love");
//		System.out.println("love:: "+love);
	}



13、获取表单提交中文数据乱码问题解决
	* 表单提交方式，常用get 和 post

	* 使用post提交中文数据时候乱码问题解决 （设置request缓冲区的编码）
	** 使用post提交数据，放到请求体里面
	//post提交中文数据有乱码问题
	//request获取通过post提交的数据，也会把数据放到request缓冲区里面
	//response缓冲区默认编码是 iso8859-1，而request缓冲区里面默认编码也是iso8859-1，不支持中文
	//解决方式：设置request缓冲区的编码
	request.setCharacterEncoding("utf-8");
	//获取提交的数据有中文
	String username = request.getParameter("username");
	System.out.println("username:: "+username);

	* 使用get提交中文数据时候乱码问题的解决
	** get提交数据放到浏览器地址栏里面，对中文数据进行url编码。
	** 三种解决方式：
	* 在tomcat里面配置
		** 找到tomcat目录conf下面server.xml，在配置端口地方，最后加 URIEncoding="utf-8"
	* 首先先对中编码，到servlet里面解码
	* 使用string构造方法编码转换(重点掌握)
		* username = new String(username.getBytes("ISO8859-1"),"utf-8");
	** 代码：String username = request.getParameter("username");
		username = new String(username.getBytes("iso8859-1"),"utf-8");

===================================================
（1）向页面输出中文乱码
	* 字节流
		** 设置浏览器编码和字节数组的编码一致
	* 字符流
		** 设置response缓冲区的编码和浏览器的编码一致

（2）获取表单提交的中文数据乱码
	* post： 设置request缓冲区的编码
	* get：三种，使用string构造完成编码转换


14、request域
	* 域：在一定的范围内，存值和取值
	** servletContext域：整个web项目
	*** 存值：setAttribute
	*** 取值：getAttribute

	* request也是一个域对象
	** 范围: 一次请求
	*** 存值：setAttribute
	*** 取值：getAttribute

	* request域对象经常和转发在一起使用
	** request.getRequestDispatcher("转发的路径 不带项目名称").forward();


			request.setAttribute("msg", "itcast");
			//转发到demo2
	//		request.getRequestDispatcher("/demo2").forward(request, response);
			//重定向到demo2
			response.sendRedirect("/day09/demo2");



	* 创建一个Demo1，在这个servlet里面向request域设置一个值 msg itcast，转发到Demo2
	* 在Demo2，获取通过demo1向request域里面设置的值
			

			response.getWriter().print(request.getAttribute("msg"));



15、转发和重定向区别
	* 重定向：
	** 请求两次，重定向的地址带项目名称
	* 转发：
	** 请求一次，转发地址不需要带项目名称

	* 重定向：从一个网站到另外一个网站
	* 转发：请求里面需要带数据

10、案例六：使用转发完成登录操作
	* 如果用户名或者密码错误，回到登陆页面，但是携带错误提示在登录页面显示出来

	* 引入知识点 
	** jsp ：sun公司提供用于开发动态网站的技术 servlet

	** el表达式：获取域对象里面的值
	*** 语法： ${域对象名称}

	* 创建jsp页面，写登录表单
	** 转发的代码
	//向request域里面设置一个值
	request.setAttribute("msg1", "用户名或者密码错误");
	//转发到登录页面
	request.getRequestDispatcher("/request/login.jsp").forward(request, response);

	** 在jsp里面获取域对象的值
	<h2><font color="red">${msg1}</font></h2>

11、debug调试web项目
	* 设置断点，单步执行 F6

	* 需要使用debug模式启动tomcat服务器
	** 点击 debug server



/**

 */



day10

昨天内容回顾
	1、response方法
	** 响应行：设置状态码 setStatus方法
	** 响应头：setHeader()
	** 响应体：字节流和字符流

	2、重定向代码 302+Location

	3、refresh实现页面定时跳转

	4、response向页面输出中文乱码解决
		* 字节流
			** 设置浏览器编码和设置字节数组的编码一致
		* 字符流
			** 设置response缓冲区的编码和设置浏览器编码一致

	5、文件下载 设置头 Content-Disposition

	6、request获取通过表单提交的数据
		* getParameter()
		* getParameterValues()
		* getParameterMap();
	
	7、通过表单提交数据有中文乱码
		* post：设置缓冲区的编码
		* get：有三种解决方法
		** 在tomcat配置文件server.xml中URIEncoding
		** 先编码，之后再解码
		** 使用String的构造

	8、request域
		** 范围：一次请求
		** 经常和转发一起使用
		

1、jsp的入门
	* sun公司提供的用于开发动态网站的技术 servlet jsp
	* jsp 就是一个servlet，最终会编译成servlet
	* 使用servlet向页面输出内容，需要使用字节流或者字符流向页面输出
	** jsp：java server pages，java服务器端的页面

	* jsp包含：html+java代码+jsp自身的指令...

	* jsp的执行过程：jsp最终也会被编译成servlet，什么时候编译？
	** 访问jsp的时候，编译成servlet
	** 放到tomcat的work目录

	* 在jsp里面如何嵌入java代码
	* 有三种方式
	* 第一种： <%!  %>: 定义的变量是成员变量
		** <%! int mm = 10; %>

	* 第二种： <%= %>：向页面输出内容 输出固定的值，输出变量
		** <%="HELLO" %>
		** 生成到service方法里面
		** 代码后面不能写;
		
	* 第三种： <%   %>
		**   <%
				for(int i=0;i<=3;i++) {
				
				}
		    %>
		** 生成到service方法里面
	
	* 在实际开发中，把html代码和java代码混合使用
	** 使用java代码+html代码实现：在页面显示五行五列表格
	*     <table border="1" bordercolor="blue">
    	<!-- 循环五行 -->
		<% 
		for(int i=1;i<=5;i++) {
		%>
			<tr>
				<!-- 循环五个单元格 -->  			
				<%
					for(int j=1;j<=5;j++) {
				%>
						<td>AAAAAA</td>
				<% 
					}
				 %>
			</tr>
		<% 
		}
		%>
	    </table>

2、el的入门
	* el表达式：获取域对象里面的值
	* 语法：${域对象值的名称}

	*  <!-- 向域对象里面设置值 -->
  	<%
  		//向servletContext里面设置值
  		getServletContext().setAttribute("msg1", "itcast100");
  		//向request域里面设置值
  		request.setAttribute("msg2", "itcast200");
  	 %>
  	 
  	 <!-- 使用传统方式获取域对象里面的值 -->
  	 <%=getServletContext().getAttribute("msg1")%>
  	 <%=request.getAttribute("msg2") %>
  	 
  	 <hr/>
  	 <!-- 使用el表达式获取 -->
   	${msg1 }
   	${msg2 }

	* 如果多个域对象名称是相同的，使用el表达式获取的值是域对象范围小的里面的值

	* 通过下面的方式分别得到不同的域对象里面的值
	<!-- 使用el表达式获取 -->
   	${requestScope.msg11 }
   	${applicationScope.msg11 }

	* 使用el表达式获取域对象里面的值，如果名称不存在，得到空字符串 ""

3、会话管理
	* 什么是会话：打开浏览器，进行网页的浏览，到关闭浏览器的过程，这个过程称为一次会话

	* 购物信息存到什么地方？
	* 使用域对象是否可以存储购物信息
	** servletContext域对象和request域对象

	* request域对象是否可以存储购物信息
		** 范围：一次请求
		** 因为request域一次请求有效，最终结算时候，没有任何购物信息

	* servletContext域对象是否可以存储购物信息
		** 范围：整个web项目
		*** 因为每个项目都有servletContext域，谁先结算，把域里面的所有的商品都结算
	
	* 可以使用会话存储购物信息
	** 有两种技术
	*** cookie技术：客户端的技术
		* 使用cookie存储购物信息：
		** 首先第一次买东西是九阴真经，到服务器得到九阴真经，把这个值通过cookie返回到浏览器的内存中，
		** 第二次买六脉神剑，携带者内存中的这个值发送请求，到服务器端得到买的六脉神剑，同时得到携带九阴真经，
		把这两个值返回到浏览器的内存中
		** 最终进行结算：把内存中这两个值携带者进行发送，在服务器端得到这两个值，完成结算

	*** session技术：服务器端的技术
		* 使用session存储购物信息
		* 买一个电视，到服务器开辟空间，把电视放到空间里面，返回打开这个空间的钥匙，把这把钥匙返回到浏览器的内存中，
		* 第二次买手电，带着这把钥匙发送请求，在服务器端，拿着这把钥匙打开空间，把手电放到空间里面
		返回打开这个空间的钥匙，把这把钥匙返回到浏览器的内存中，
		* 结算：拿着这把钥匙发送请求，到服务器端使用钥匙打开空间，取出商品，完成结算

4、案例一：使用cookie记录用户上次访问时间
	* 第一次访问，向页面输出 welcome
	* 第二次访问，把第一次产生的访问时候显示出来
	* 第三次访问，显示第二次产生访问时间
	
	* 实现步骤：
	** 首先第一次访问，向页面输出一个欢迎信息
	产生一个访问时间，得到这个时候，使用cookie把时间返回到浏览器的内存中
	** 第二次访问，带着内存中第一次的时间进行访问，到服务器得到第一次时间，把显示到页面上，
	产生新的时间，把新的时间通过cookie返回到浏览器的内存中
	以此类推.....

	** 如何判断是否是第一次访问
	*** 得到cookie，判断cookie里面是否有时间，如果有，不是第一次，没有是第一次    visit

	*** 方法：
	** 得到cookie
	 Cookie[] getCookies() 
	 ** 	//得到所有cookie
		Cookie[] cookies = request.getCookies();
	
	** 通过cookie把值返回到浏览器的内存中（回写）
	addCookie(Cookie cookie) 

	** 使用Cookie的构造
	Cookie(java.lang.String name, java.lang.String value) 
	*** name：cookie的名称
	*** value：cookie值

	** 	//创建cookie
		Cookie cfirst = new Cookie("visit",times);
		//把times回写到浏览器的内存中
		response.addCookie(cfirst);

--------------------------------------------------------------------------------------------

		/**
		 * 记录用户上次的访问时间
		 * @author asus
		 *
		 */
		public class CookieDemo1 extends HttpServlet {

			/**
			 * 	** 首先第一次访问，向页面输出一个欢迎信息
			*产生一个访问时间，得到这个时候，使用cookie把时间返回到浏览器的内存中
			** 第二次访问，带着内存中第一次的时间进行访问，到服务器得到第一次时间，把显示到页面上，
			*产生新的时间，把新的时间通过cookie返回到浏览器的内存中
			*以此类推.....
			 */
			public void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				//得到所有cookie
				Cookie[] cookies = request.getCookies();
				//判断是否是第一次访问 visit
				Cookie cookie = findCookie(cookies,"visit");
				//如果是第一次
				if(cookie == null) {//第一次
					response.getWriter().write("welcome");
				} else {
					//得到上次访问的值
					String times1 = cookie.getValue();
					response.getWriter().write(times1);			
				}
				//产生新的时间
				Date date = new Date();
				String times = date.toLocaleString();
				
				//创建cookie
				Cookie cfirst = new Cookie("visit",times);
				//设置有效时长    60*60
				cfirst.setMaxAge(3600);
				//设置有效路径
				cfirst.setPath("/");
				//把times回写到浏览器的内存中
				response.addCookie(cfirst);
			}

			//判断cookie里面是否有名称是visit的cookie
			private Cookie findCookie(Cookie[] cookies, String name) {
				
				if(cookies == null) {
					return null;
				}
				
				for (Cookie cookie : cookies) {
					//判断cookie里面是否有与name相同名称的cookie
					if(name.equals(cookie.getName())) {
						return cookie;				
					}
				}
				return null;
			}

			/**
			 * 
			 */
			public void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
				doGet(request, response);
			}

		}

--------------------------------------------------------------------------------------------------



5、cookie的api的使用
	* getName()：得到cookie名称
	* getValue(): 得到cookie的值

	* setMaxAge(int expiry) ：设置cookie的有效时长
	
	** cookie的分类有两种
	** 第一种会话级别的cookie，特点浏览器关闭之后，cookie销毁了，在默认的情况下就是会话级别的cookie

	** 第二种持久性的cookie：在一定的范围内cookie会一直有效
	*** 设置有效时长：使用setMaxAge方法设置 setMaxAge(int expiry)参数：秒
	*** 设置有效路径：使用setPath(java.lang.String uri)
	*** 技巧 setPath("/");

	*** 销毁持久性的cookie
	*** 设置有效时长 0 setMaxAge(0)
	*** 设置有效路径 保证销毁路径和持久性cookie路径要相同 一般 setPath("/");
	*** 回写到浏览器的内存中

	* setPath(java.lang.String uri) 
	** 有效路径：
	*** 通过这个访问，会携带cookie信息
	** 比如setPath("/day10");
	** 在地址栏写一个地址 http://127.0.0.1/day10/aa ， 会携带cookie信息
	** 在地址栏输入另外一个地址 http://127.0.0.1/day11/bb ，不会携带cookie信息

	* setDomain(java.lang.String pattern) 
	** 有效域名的路径
	** 通过这个域名访问，会携带cookie信息
	** 比如 setDomain("www.sina.com");
	** 在地址栏输入一个地址 http://www.sina.com ,会携带cookie信息
	** 在地址栏输入一个地址 http://news.sina.com , 不会携带cookie信息
	** setDomain(".sina.com");
	
6、cookie的细节问题
	* 一个Cookie只能标识一种信息，它至少含有一个标识该信息的名称（NAME）和设置值（VALUE）。 

	* 一个WEB站点可以给一个WEB浏览器发送多个Cookie，一个WEB浏览器也可以存储多个WEB站点提供的Cookie。

	* 浏览器一般只允许存放300个Cookie，每个站点最多存放20个Cookie，每个Cookie的大小限制为4KB。

	* 如果创建了一个cookie，默认情况下它是一个会话级别的cookie（即存储在浏览器的内存中），
	用户退出浏览器之后即被删除。若希望浏览器将该cookie存储在磁盘上，则需要使用maxAge和有效路径，
	并给出一个以秒为单位的时间。

	* 删除持久cookie，可以将cookie最大时效设为0，注意，删除cookie时，path必须一致，否则不会删除

7、案例二：使用cookie记录用户浏览的商品记录
	* 实现步骤
	** 创建一个页面，在页面里面点击的商品
	* 首先使用不同的id区分不同的商品 
	** 超链接 <a href="/day10/aa?id=1">aa</a>
	* 第一次购买，在服务器得到商品的id值，把id值回写到浏览器的内存中
	* 第二次购买，带着第一次回写的id进行访问，在服务器端获取id值（第二次买的商品的id和第一次的id），
	把这两个id值回写到浏览器的内存中
	以此类推....

	* 如果判断是否是第一次购买？ his
	** 首先得到所有cookie  
	** 遍历cookie数组，判断是否有与his名称相同的cookie，有相同的cookie的名称不是第一次，否则是第一次

	*** 判断商品的id值，是否已经存在于cookie里面，如果存在的话，不需要回写，不存在才需要回写到浏览器的内存中

	* 实现清空浏览记录
	** 销毁cookie，清空浏览记录
	** 销毁持久性的cookie
	** 具体的步骤
	** 创建一个和要销毁的cookie相同的名称的cookie	
		Cookie c1 = new Cookie("his","");
	** 设置有效时长 0
		setMaxAge(0)
	** 设置有效路径 
		setPath("/")
	** 把cookie回写到浏览器的内存中
	* 代码
		//创建相同的名称的cookie
		Cookie c1 = new Cookie("his","");
		//设置有效时长 0
		c1.setMaxAge(0);
		//设置有效路径
		c1.setPath("/");
		//把cookie回写到浏览器的内存中
		response.addCookie(c1);


8、session的简介
	* session是服务器端技术
	** session在服务器开辟一个空间，返回一把打开这个空间的钥匙，
	*** 把这把钥匙返回到浏览器的内存中，使用技术cookie
	*** session基于cookie来实现的

	* session创建
	 通过request里面的getSession() 方法创建session，返回的是HttpSession

	* session也是一个域对象
	** 范围：会话里面
	** 存值：setAttribute
	** 取值：getAttribute

	* 一个浏览器独占一个session对象
	* 创建第一个servlet1，得到session，打印session的id，向session域里面设置一个值，
	超链接到servlet2里面
	* 创建第二个servlet2，得到session，打印session的id，获取session域里面设置的值

9、案例三：使用session实现简单的购物车
	* 创建一个商品列表
	* 步骤：
	/**
	 * 0、根据id，得到商品名称，使用数组
	 * 1、判断是否第一次购物
	 * 2、如果是第一次购物，创建购物车，把商品名称和数量1放到购物车
	 * 3、如果不是第一次购物，
	 *  *** 判断购物车里面是否存在相同名称的商品，
	 *  **** 如果存在，把商品原有数量+1，放到购物车
	 *  **** 如果不存在，把商品名称和数量1放到购物车
	 *  4、把购物车放到session里面
	 */

=====================================================
	list set map操作
	** list和set的区别
	** 在list有 ArrayList  LinkedList  Vector

	** map特点key-value存储
	*** HashMap的结构

10、session创建和销毁
	* session创建 ，执行request方法getSession创建
	* session销毁有三种方式
	** 第一种方式：非正常关闭服务器
	** 第二种方式：session有一个默认的过期时间 30分钟
	    <session-config>
		<session-timeout>30</session-timeout>
	    </session-config>
	** 第三种方式：调用session方法进行销毁（一般使用这种方式）
		invalidate()
	
	* 清空购物车的功能
	* 代码
		//得到session
		HttpSession session = request.getSession();
		//销毁session
		session.invalidate();

11、案例四：使用session实现验证码的校验
	* 域对象存值和取值
	** request域对象不能放验证码
	** servletContext域对象不能放验证码
	* 可以使用session域对象放验证码

	* 步骤：
	** 页面输入框，输入验证码
	** 每次生成的验证码放到session里面
	** 判断输入的验证码和session里面的验证码是否相同
	*** 如果不相同，校验失败

	** //得到输入的验证码
		request.setCharacterEncoding("utf-8");
		String codeInput = request.getParameter("code");
		//得到session里面的验证码
		String codeSession = (String) request.getSession().getAttribute("code");
		//判断这两个验证码是否相同
		if(!codeInput.equals(codeSession)) {//不相同
			//设置一个值到request
			request.setAttribute("msg12", "验证码错误");
			//转发到登录页面
			request.getRequestDispatcher("/session/login.jsp").forward(request, response);
			return;
		}

12、禁用cookie之后session的使用
	* session技术也是基于cookie，
	** 回写浏览器一把钥匙 jsessionid=qwwe233445

	* 禁用cookie之后使用session
	*在地址后面;jsessionid=sessionid的值

	* response. encodeRedirectURL(java.lang.String url) 
	用于对sendRedirect方法后的url地址进行重写。

	* response. encodeURL(java.lang.String url)
	用于对表单action和超链接的url地址进行重写 

	* 在一般网站中，如果禁用了cookie，直接不让登录


/**

 */