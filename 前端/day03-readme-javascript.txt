
day03

�Ͻ����ݻع�
	1��html�������ǩ
		* form��action method
		* �����text password radio checkbox select textarea submit reset image hidden file
		** <input type="image" src=""/>

	2��css���ֽ�Ϸ�ʽ
		* style���� <style>��ǩ   link��ǩ  @import url

	3��css�Ļ���ѡ����
		��ǩѡ����  id  class

	4��js��ԭʼ����
		var�ؼ���
		string number boolean  null undefined
	
	5�������
		* string���� �� ���ʱ�����������������������������NaN
		* var m = 10; ������������С��
		* boolean���͵Ĳ���
	
	6��js������
		* var arr1 = [];
		* var arr2 = new Array(3);
		* var arr3 = new Array(3,4,5);
		** ���鳤�ȣ�����±�+1
		* ����length

	7��js�ĺ���
		* function add1(a,b) { }
		* new Function("","");
		* function(c,d) {}

	8��js��ȫ�ֱ����;ֲ�����


1��js��String����
	* ���ԣ�length���ַ����ĳ���

	* ����
	** ��html��صķ���
		*** bold()���Ӵ��ַ���
		*** fontcolor(): �����������ɫ
		*** fontsize()����������Ĵ�С
		*** link(): ���ַ������óɳ�����
		*** sub(): �±�
		*** sup()���ϱ�

	** ��java���Ƶķ���
		*** charAt(): ����ָ��λ�õ��ַ�
		**** ���� �ַ���λ�ô�0��ʼ��ʹ�����������ʱ�����λ�ó������ַ�������ʾ���ַ���
		//charAt����
		var str = "abcd";
		document.write(str.charAt(4));

		*** concat()�������ַ���
		**** ����
		var str1 = "java";
		document.write(str.concat(str1));

		*** indexOf()�������ַ���
		**** ����  ����ַ����ڣ�����λ�ã���������ڷ��ص���-1
		var str2 = "ABCDEFG";
		document.write(str2.indexOf("T"));

		*** substr()���������� ���� substr(1,3)
			- ��һ�����������ĸ�λ�ÿ�ʼ���ַ����Ŀ�ʼλ����0
			- �ڶ������������ĸ�λ�ÿ�ʼ�����ȡ��λ�ַ�

		*** substring()���������� ���� substring(1,3)
			- ��һ�����������ĸ�λ�ÿ�ʼ���ַ����Ŀ�ʼλ����0
			- �ڶ������������ĸ�λ�ý��������ǲ�����������λ�� [1,3)
		**** ����
		//substr��substring����
		document.write("<hr/>");
		var str3 = "abcdefg";
		document.write("substr: "+str3.substr(1,3));  // bcd
		document.write("<br/>");
		document.write("substring: "+str3.substring(1,3)); // bc  [1,3)

2��js��Array����
	* �������飨���ַ�ʽ��
	** var arr1 = [1,2,3];
	** var arr2 = new Array(4);
	** var arr3 = new Array(5,6,7);

	* ���ԣ�length������ĳ���
	** //length����
	var arr1 = [1,2,3,4];
	document.write(arr1.length);

	* ����
	** concat()����������
	*** ����
	//concat()����
	document.write("<hr/>");
	var arr2 = [6,7,8];
	document.write(arr1.concat(arr2));

	** join(): ����ָ���ķָ�����зָ�
	*** ����
	//join����
	document.write("<hr/>");
	var arr3 = ["AA","BB","CC"];
	document.write(arr3);
	document.write("<br/>");
	document.write(arr3.join("-"));

	** push()���������ĩβ���Ԫ�أ��������֮��ĳ���
	*** ����
	//push����
	document.write("<hr/>");
	var arr4 = ["tom","jack","mary"];
	document.write("before: "+arr4);
	document.write("<br/>");
	document.write("length: "+arr4.push("zhangsan"));
	document.write("<br/>");
	document.write("after: "+arr4);

	*** ���ʹ��push������ӵ���һ�����飬�����鵱��һ�����壨Ԫ�أ���ӽ�ȥ
	//ʹ��push�������
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

	** pop() ɾ����������������һ��Ԫ�� 
	*** ����
	//pop()����
	document.write("<hr/>");
	var arr7 = ["zhangsan","lisi","wangwu"];
	document.write("before: "+arr7);
	document.write("<br/>");
	document.write("return: "+arr7.pop());
	document.write("<br/>");
	document.write("after: "+arr7);

	** reverse() �ߵ�������Ԫ�ص�˳�� 
	*** ����
	//reverse() �ߵ�������Ԫ�ص�˳�� 
	document.write("<hr/>");
	var arr8 = [10,20,30];
	document.write(arr8);
	document.write("<br/>");
	document.write(arr8.reverse());

3��js��Date����
	* ����Date���� var date = new Date();

	* ����
	** toLocaleString()����ʱ��ת���ɱ��ظ�ʽ��ʱ��
	*** ����
	var date = new Date();
	document.write(date.toLocaleString());

	** �õ���ǰ����  getFullYear() �� Date ��������λ���ַ������ 
		//�õ���ǰ����
		document.write("<hr/>");
		document.write(date.getFullYear());
	
	** �õ���ǰ���� getMonth() �� Date ���󷵻��·� (0 ~ 11) 
		** ����ֵ 0-11���õ�׼ȷ���·� +1
		document.write(date.getMonth()+1);
	
	** �õ���ǰ������ getDay() �� Date ���󷵻�һ���е�ĳһ�� (0 ~ 6) 
		*** �����ǰ��ʱ���������գ�ͨ����������õ�ֵ��0
	
	** �õ���ǰ���� getDate() �� Date ���󷵻�һ�����е�ĳһ�� (1 ~ 31) 
		//�õ���ǰ����
		document.write("<hr/>");
		document.write(date.getDate());
	
	** �õ���ǰ��Сʱ  getHours()

	** �õ���ǰ�ķ���  getMinutes()

	** �õ���ǰ����   getSeconds()
	*** document.write(date.getHours()+" - "+date.getMinutes()+" - "+date.getSeconds());

	** �õ��������� getTime() ���� 1970 �� 1 �� 1 ������ĺ����� 
		*** document.write(date.getTime());  ��ֹҳ��Ļ���

4��js��Math����
	* ��Math����ķ����Ǿ�̬������ֱ��ʹ��Math.�������Ƶ���

	** ceil(x) ��һ�������������롣 
		* ֻҪС���������ֵ��+1
	** floor(x) ��һ�������������롣 
		* С������������Ǽ�����ȥ
	** round(x) ��һ������������Ϊ��ӽ������� 

	**var m = 10.4;
	document.write(Math.ceil(m));  // 11
	document.write("<br/>");
	document.write(Math.floor(m)); // 10
	document.write("<br/>");
	document.write(Math.round(m)); // 11

	** random()���õ������
		*** document.write(Math.ceil(Math.random()*10));

5��js��ȫ�ֺ���
	* �����������κ�һ��������Щ����ʹ�ã�ֱ��д����������ʹ��
	
	* ����
	** eval()�������ַ�����һ��js���룬ʹ���������ִ��js����
	*** 	var str = "alert('abc');";
		//alert(str);
		eval(str);
	
	** encodeURI(): ���ַ������б���
	** decodeURI()���Ա���֮����ַ������н���
	*** 	var str1 = "aacc��������";
		var encode1 = encodeURI(str1);
		document.write(encode1);
		document.write("<hr/>");
		var decode1 = decodeURI(encode1);
		document.write(decode1);

	** isNaN():�ж��Ƿ�������
		** ���ص�ֵ��true��false
		*** �����һ�����֣�����false
		*** �������һ�����֣�����true

	** parseInt()�� ת��������

6��js�ĺ���������
	* js���治���ں�������
	* ��js�ĺ���������һ�������� arguments
	** arguments�������ڴ洢�򷽷����洫�ݵĲ���
	** ʹ��argumentsģ�����ص�Ч��
		//ģ�����ص�Ч��
		function add1() {
			var sum = 0;
			//��������
			for(var i=0;i<arguments.length;i++) {
				sum += arguments[i];
			}
			return sum;

	* js�������������	
	** js���治��������
	** ���ǿ���ͨ����������arguments����ģ�����ص�Ч��

7��js��bom����
	* bom��browser object model�����������ģ��
	* ��bom�����ṩ��һЩ����ʹ����Щ������Բ���

	* navigator���õ��������һЩ��Ϣ
		document.write(navigator.appName);

	* screen���õ���Ļ��Ϣ 
		document.write(screen.width+" "+screen.height);

	* location��ʹ������href����һ�����ܣ��õ���ǰ����ĵ�ַ���ڶ������ܣ���������ĵ�ַ
		** ��һ�����ܣ�document.write(location.href);
		** �ڶ������ܣ�location.href = "hello.html";
		*** ֪ʶ���룬�ڱ����������棬button��<input type="button" value="href" onclick="js�ķ���"/>
		*** ��button�������� onclick����ʾ��������¼� onclick="js�ķ���"

	* history���õ�����ĵ�ַ����ʷ
		** ��������ҳ��
		** //����һ��ҳ��
		function forward1() {
			history.back();
		}

		//����һ��ҳ��	
		function next1() {
			history.forward();
		}

		** ����һ������ʵ����ͬ��Ч�� go()
		history.go(-1);
		history.go(1);
	
	* window��****�������ڶ�����һ���������
	** ����
	*** alert()����ҳ�浯��һ����
	*** confirm()��ȷ�Ͽ�
		//confirm����
		var flag = window.confirm("ȷ��ɾ��?");
		//alert(flag);
		if(flag) {
			alert("ɾ���ɹ�");
		} else {
			alert("ɾ��ʧ��");
		}
	
	*** prompt(): �����
		window.prompt("please input:","10");
	
	*** open(): ��һ���´���
		* window.open("��ҳ��url��ַ","","��������");
		* window.open("hello.html","","width=200,height=100");

	*** close()���رմ���

	*** ��������Ҫ�ķ��������ڶ�ʱ��Ч����
	**** setInterval("js����",������): ��ʾ��һ����ʱ���ڣ��ظ�ִ��js����
		*** window.setInterval("alert('12345');",3000);

	*** setTimeout("js����",������)����ʾ��һ��ʱ��֮��ִ��js����һ��
		*** window.setTimeout("alert('abc');",4000);
	
	*** clearInterval() ȡ���� setInterval() ���õ� timeout��
		window.clearInterval(id1);
	*** clearTimeout() ȡ���� setTimeout() �������õ� timeout�� 
		window.clearTimeout(id2);


8��js��dom����
	* document object model: �ĵ�����ģ��
	** �ĵ���������ĵ� html xml
	** ���󣺶������������Ժͷ���
	*** ʹ��js��dom�����ṩ�Ķ���ʹ����Щ��������Ժͷ������Ա�����ĵ����в���

	** �����Ҫ�Ա�����ļ����в��������Ƚ���������ĵ�
	*** ��һ������Ҫ�ѱ�����ĵ�������������ݶ���װ�ɶ���
		** ��ǩ �� ���ԡ� �ı����ݶ���װ�ɶ���
	
	*** ʹ��dom����html���̣���ͼ�������̣�
	** ����html�Ĳ㼶�ṹ���ڴ��з���һ�����νṹ
	** dom�����ṩ�˺ܶ�Ķ���ʹ����Щ������Զ�html���в���
	** document���������ĵ�
	** element���󣺱�ǩ����Ԫ�ض���
	** ���Զ���
	** �ı�����
	** Node�ڵ���������������������ĸ�����

9��DHTML�Ľ���
	* ����һ�ּ������Ǻܶ༼���ļ��

	* html�� ��װ���ݵ�����
	* css��ʹ�����Ժ�����ֵ�����ʽ
	* ECMAScript: ר��js�������﷨
	* dom���Ա�����ĵ����в���

10��document����
	* document������������ĵ�
	**ͨ��document������Եõ�html�б�ǩ����

	** ����
	*** getElementById(): ����ͨ��id�õ���ǩ�Ķ���
	*** �����Ҫ�õ���ǩ��������Ե�ֵ����ǩ����.��������
	**** 	//�õ�����input��ǩ����
		var input1 = document.getElementById("testid");
		//�õ�input��ǩ�����value��ֵ
		alert(input1.value);
	
	*** getElementsByName(): ͨ��name��ֵ�õ����б�ǩ�����ص���һ������,
	**** ��������õ�ÿһ����ǩ����ͨ����ǩ��������.��������, �õ�����ֵ
	**** 	var inputs1 = document.getElementsByName("testname");
		//alert(inputs1.length);
		//��������
		for(var i=0;i<inputs1.length;i++) {
			//��ȡÿһ��input����
			var input1 = inputs1[i];
			//�õ�ÿһ��input��valueֵ
			alert(input1.value)
		}

	**** ���Ҫ�õ��ı�ǩֻ��һ�������Ҳ��ͨ��name���Եõ������ص�Ҳ��һ�����飬������һ������
	**** ����ֱ��ͨ��������±��ȡ��ǩ����ͨ����ǩ��������.��������, �õ�����ֵ
	**** var inputs2 = document.getElementsByName("username")[0].value;

	*** getElementsByTagName(): ���ݱ�ǩ���Ƶõ���ǩ�Ķ��󣬷��ص���һ������,
	**** ��������õ�ÿһ����ǩ����ͨ�� ��ǩ��������.��������, �õ�����ֵ
	**** 	//getElementsByTagName������������
		var inputs3 = document.getElementsByTagName("input");
		alert(inputs3.length);
		//��������
		for(var a=0;a<inputs3.length;a++) {
			//�õ�ÿһ��input��ǩ����
			var input3 = inputs3[a];
			//�õ�value��ֵ
			alert(input3.value);
		}
	**** ���Ҫ�õ��ı�ǩֻ��һ�������Ҳ��ͨ��Tagname���Եõ������ص�Ҳ��һ�����飬������һ������
	**** ����ֱ��ͨ��������±��ȡ��ǩ����ͨ�� ��ǩ��������.��������, �õ�����ֵ
	**** var inputs4 = document.getElementsByTagName("input")[0]; //��������
	
	*** write��������ҳ��������ݣ����html����

11����ϰ��window��ϰ
	* ��������ҳ��
	* ��һ��ҳ��window.html
		** ������������һ����ť
		** �ڰ�ť�������¼�������һ���´��ڣ�
	* �ڶ���ҳ��user.html
		** ��һ�����
		** �������Ǳ�ţ���������������ť���¼�����ֵ��
		*** opener�����ԣ����ضԴ����˴��ڵĴ��ڵ����á� 
		** 	//��������ֵ��ֵ����һ��ҳ��windowҳ��
			//�õ�����user���ڵĴ���window����
			var pwin = window.opener;
			pwin.document.getElementById("usernum").value = num1;
			pwin.document.getElementById("username").value = name1;
			//�رմ���
			window.close();
	
	* �����ϰ�ڹȸ���������治��ʹ�ġ�
	** js�İ�ȫ�ԣ����ܷ��ʱ��ص��ļ�
	** �ȸ��������ȫ�Ժܸߣ��ϸ���js�淶�����ܷ��ʱ��ص��ļ� file:///

	** ��ʵ�ʿ����У�һ�㲻����ʱ��ص��ļ���ͨ�������ַ���з��ʣ����ͨ�������ַ�������������

12��debug���ԣ��ϵ����ģʽ��
	* �������öϵ㣬˫����ߣ�������ɫ�ĵ�
	* ���г��򣬲�Ҫʹ��run as����Ҫʹ��debug as����
	* ����ִ�� ��ݼ� F6

	* ȥ���ϵ�

13��myeclipse��װ
	* �ƽ�����в�Ҫ�������
	* �ڵ����ϲ�Ҫ��װ�����汾��myeclipse
	* �ƽ�֮ǰ�������ϱ���Ҫ��װjdk��ͬʱ���û�������

14�����ݲ���
	* list�ı����������ַ�ʽ����ͨforѭ��������������ǿfor
	* set�ı������֣�����������ǿfor
	* map�ı������֣���һ�ֵõ����е�key��ͨ��key�õ�value���ڶ��ֵõ�key��value�Ĺ�ϵ

	* �ɱ���� public void get1(int...nums){}
	** �ڷ����Ĳ����б���ֻ����һ���ɱ�������ɱ�����ŵ������б�����

	* ���� List<Integer> list = new ArrayList<Integer>();
		Map<String,String> map = new HashMap<String,String>();
	
	* 


