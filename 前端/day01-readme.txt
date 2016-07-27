
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



=======================================

更多黑马精品教程尽在

【perfect教程】
http://shop117393101.taobao.com

如地址失效 
可联系Q1871209564

=======================================

非此地址购买获得，均为二次倒卖、翻录
得到的视频不完整、无售后保障

本店长期更新黑马Android视频
一次购买终身售后

=======================================
