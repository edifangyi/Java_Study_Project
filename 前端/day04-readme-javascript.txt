
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



