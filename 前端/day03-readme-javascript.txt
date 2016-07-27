
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


