
javascript

1��JavaScript�ļ��
	* �ǻ��ڶ��� �� �¼��������ԣ�Ӧ���ڿͻ���
	** ���ڶ�����js�����ṩ����һЩ����ֱ��ʹ��
	** �¼���������Ӧ�¼����������ÿ�λ���������һ���µ�ͼƬ��
	** �ͻ��ˣ������

	* javascriptʵ����ҳ�򵥵Ķ�̬��Ч��

	* �����ص�
	*** ������
	*** ��ȫ�ԣ�JavaScript�����Է��ʱ��ش��̵��ļ�
	*** ��ƽ̨�ԣ�ֻ�����������֧��JavaScript����������js����

	* JavaScript��java�����׷���׷�����
	** java��sun��˾������oracle��˾��js��������˾��
	** JavaScript �ǻ��ڶ���ģ�java���������
	** java������Ҫ�������jsֱ��ʹ���������������
	** js�����������ԣ�javaǿ���͵�����
		** ������java���涨����� int i = 10; ����int m = "10";����ȷ�ġ�
		** ��js����û�����������ơ�var n = 10; var m = "10"; var a = true;
	
	* js����ɣ������֣�
	* ��һ���֣�ECMAScript
		* ECMA��ŷ�޼����Э��
		* �������֯�ƶ���һ��js�淶��������䣬�﷨��

	* �ڶ����֣�BOM�����������ģ��
		
	* �������֣�DOM���ĵ�����ģ��

2��js��html���ֽ�Ϸ�ʽ
	* ��һ�֣�ʹ��html�ı�ǩ <script type="text/javascript"> js����; </script>
		* ����
		<script type="text/javascript">
			alert("aaaa");
		</script>
	* �ڶ��֣�
		** ���ȴ���js�ļ�
		** <script type="text/javascript" src="js�ļ�·��"> </script>
		** �Ͳ�Ҫ��script��ǩ����дjs�����ˣ�Ҳ����ִ��
		** <script type="text/javascript" src="js�ļ�·��"/>����д���Ҳ���js�ļ�

3��js���������ͺͱ�������
	* java��������������� byte short int long float double char boolean
	* ��js���涨���������ʹ��һ���ؼ��� var

	* �ṩ�˷��� typeof(��������)�� �鿴����������

	* jsԭʼ���ͣ������
	** string
		var str = "aaa";
	** number
		var m = 10;
	** boolean
		var flag = true;

	** null����ʾ���������Ϊ�գ��ն���
		** var date = null; //new Date();
	** undifined��������������Ǳ���û�и�ֵ var m;
	
	* js��ע��
	** ��java����ĵ���ע�ͺͶ���ע��һ����
	** ����ע�� //
	** ����ע�� /*  */
 
4��js�����
	* java�������� : 
	** ѭ�� for  while  do-while
	** �ж���� if() {} else if() {}else{}
	** switch��䣬��jdk1.7��ʼ֧��string����
		*** switch(m) {
			case 1:
				break;
			case 2:
				break;
			default:
		}
	
	* js���ж����if
		** //if���
		var i = 100;
		if(i==10) {
			alert("i==10");
		} else {
			alert("i!=10");
		}
	
	* switch���
		** //switch���
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
	
	* ѭ����� for
		** //forѭ�����
		for(var i=0;i<3;i++) {
			alert(i);
		}

		** i++��++i����

	* ���룺��ҳ���������
		** document.write("aaa");
		** ��ҳ�����html����

5��ʹ��js�����ʵ��99�˷���
	* 	document.write("<table border='1' bordercolor='blue'>");
		for(var i=1;i<=9;i++) { //ѭ��9�� 
			document.write("<tr>");
			//ѭ����
			for(var j=1;j<=i;j++) {
				document.write("<td>");
				document.write(j+"*"+i+"="+i*j);
				document.write("</td>");
			}
			//document.write("<br/>");
			document.write("</tr>");
		}
		document.write("</table>");

6��js�������
	* �������㲻����������С��
	   var m = 123/1000*1000;  �����123
	
	* �ַ����Ĳ���
		//�ַ���������
		var str = "123";
		document.write(str+1); //�ַ�����ƴ��
		document.write("<br/>");
		document.write(str-1); //���������

		* ����ַ�������һ�����֣���������������ʾ NaN����ʾ����һ������

	* boolean���͵�����
		** ���ֵtrue����ֵ����1
		** ���ֵflase����ֵ����0
		//boolean���ͼӼ�
		//var flag = true;
		//document.write(flag+1); //��true����1
		//document.write("<br/>");

		var flag1 = false;
		alert(flag1+1); //��false����0
	
	* ==��===����
		* == �Ƚϵ���ֵ���������޹�
		* === �Ƚϵ������ͺ�ֵ

7��js������
	* java���涨������ String[] arr = {"aa","cc"};
	* js���������ֶ��巽ʽ
	* ��һ�ַ�ʽ�� var arr1 = [1,2,"3",true];
	* �ڶ��ַ�ʽ��ʹ�õ�һ�����ö���Array
		var arr2 = new Array(3);
		** ��������������arr2������ĳ�����3
		** ��ֵ��
		arr2[0] = "aaa";
		arr2[1] = "bb";
		arr2[2] = "ccc";
	* �����ַ�ʽ��ʹ�õ�һ�����ö���Array
		var arr3 = new Array(4,5,6);
		** ��������������arr3�����������Ԫ����4 5 6
	
	* ��js������������һ������length����ʾ����ĳ���
		** document.write("length: "+arr2.length);
	
	* js���������ĳ����ǿɱ��
		* ���綨��һ�����鳤����3�����Ǹ�ֵʱ��������д�±��ֵ
		* ����ĳ��Ⱦ��������±�+1

8��js�ĺ���
	* ��java���涨�巽��
	** public void/int ������(�����б�) {
		������;
		����ֵ;
	}
	public void get1(int a) {}

	** js���涨�庯�������ַ�ʽ
	** ��һ�ַ�ʽ����Ҫʹ��һ���ؼ��� function
		** ��ʽ�� 
		function ������(�����б�) {
			������ͷ���ֵ;
		} 

		** ʾ��
		function add1(a,b) {
			������;
			����ֵ;(������Ҳ����û��)
		}

		* ��������֮����Ҫ���ò���ִ��
		* ����
		//��һ�ַ�ʽ��������
		function test1() {
			alert("abcd");
		}

		//���÷���
		//test1();

		function add1(a,b) {
			var sum = a+b;
			return sum;
		}
		alert(add1(2,3));

	** �ڶ��ַ�ʽ(��̬����)��ʹ��js��������ö��� Function
		var add2 = new Function("�����б�","������ͷ���ֵ");
		* var arguments1 = "a,b";
		var method1 = "var sum;sum=a+b;return sum;";
		//�ڶ��ַ�ʽ��������
		var add1 = new Function(arguments1,method1);
		alert(add1(3,4));
	
	** �����ַ�ʽ��������������ֱ��ʹ��function�Ĺؼ���
		var add3 = function(�����б�) {
			������ͷ���ֵ;
		}
		* //�����ִ�����ʽ
		var add2 = function(m,n) {
			return m+n;
		}
		//����
		alert(add2(5,6));

9��js������
	* ʲô�����أ�����������ͬ�������б�ͬ
	* JS���治�������أ�����ִ�й���

10��js��ȫ�ֱ����;ֲ�����
	* ȫ�ֱ�������script��ǩ���涨��һ����������������ڵ�ǰҳ������е�script��ǩ���涼����ʹ��
		**<script type="text/javascript">
		//�������mֵ10
		var m = 10;
		//ֱ����script��ǩ����ʹ�ñ���
		alert("��script��ǩ����ʹ�ñ���: "+m);
		//���巽��
		function test11() {
			alert("�ڷ����ڲ�ʹ�ñ�����"+m);
		}
		test11();
		</script>

		<script type="text/javascript">
			alert("�������һ��script��ǩʹ�ñ���: "+m);
		</script>

	* �ֲ��������ڷ������涨��һ���������������ֻ���������������ʹ��
		* 	//���巽��
			function test13() {
				var aa = 5;
				alert("in method�� "+aa);
			}

			test13();

			alert("outer method: "+aa);
		* ���ִ���SCRIPT5009: ��aa��δ���� 
	
	* ���Թ��ߵ�ʹ��
	** ��ie����ʹ��f12����ҳ���������һ������ѡ�����̨
	** �ڻ������ʹ��f12����ҳ���������һ������ѡ�����̨ 

11��script��ǩ����ʲôλ��
	* ��ȡ�����������ֵ�� document.getElementById("nameid").value;
	* script��ǩ�ŵ�</body>����
	** html�ļ���˳���Ǵ��ϵ��¼��صģ������script��ǩ�ŵ�head���棬���ҲҪ��js�����ȡ���������������ֵ��
	���ʱ��������⣬��Ϊҳ�滹û�м��ص������ط����������ֵ�϶�ȡ������
	//�޷���ȡ���ԡ�value����ֵ: ����Ϊ null ��δ����

12��eclipse��myeclipse����
	* eclipse����ѿ�������
	* myeclipse����һ���շѵĲ��
	** �ƽ�myeclipse����
	** ���鰲װmyeclipse10�汾




