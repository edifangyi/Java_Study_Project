
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


