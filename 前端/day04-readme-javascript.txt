
day04

�Ͻ����ݻع�
	1��js����

	2��js�ĺ�������

	3��js��bom���������
		* navigator screen history location window
	
	4��window����
		** �򿪴��� open����
		** ���ö�ʱ���ķ���
			** setInterval
			** setTimeout

	5��dom����html�Ĺ���

	6��ʲô��DHTML
		
	7��document����
		* getElementById
		* getElementsByName
		* getElementsByTagName
	
	8��opener����

1����������ĩβ��ӽڵ�
	* ����
	��һ��������li��ǩ
		document.createElement("��ǩ����");
	�ڶ����������ı�
		document.createTextNode("�ı�����");
	�����������ı��ŵ�li����
		li.appendChild(node);
	���Ĳ�����li�ŵ�ul����
		ul.appendChild(node)
	* ����
	function add1() {
		//����li��ǩ
		var li1 = document.createElement("li");
		//�����ı�
		var tex1 = document.createTextNode("DDD");
		//���ı���ӵ�li����
		li1.appendChild(tex1);
		//��li��ӵ�ul������
		//��ȡ��ul��ǩ
		var ul1 = document.getElementById("ulid");
		ul1.appendChild(li1);
	}

2��Element���󣨱�ǩ����
	* ����Ҫ�õ���ǩ����

	* ��ȡ���ԣ�getAttribute(name)������
		* //getAttribute(name)�������õ����Ե�ֵ
		var input1 = document.getElementById("textid");
		//alert(input1.value);
		alert(input1.getAttribute("value"));

	* �������ԣ�setAttribute(name,value)������
		* //setAttribute(name,value)����
		alert(input1.getAttribute("name"));
		input1.setAttribute("name","textname");
		alert(input1.getAttribute("name"));

	* ɾ�����ԣ�removeAttribute(name)������
		* alert(input1.id);
		input1.removeAttribute("id");
		alert(input1.id);
		* ����ɾ��value��ֵ

	* �õ���ǩ������ӱ�ǩ�Ĳ���
		** childNodes���ԣ��õ���ǩ������ӱ�ǩ��������ļ����Ժܲ����һ�㲻ʹ���������
		** ��ȡ��ǩ������ӱ�ǩ��Ψһ��Ч��������ʹ��getElementsByTagName()����
		//getElementsByTagName()����
		var lis1 = ul1.getElementsByTagName("li");
		alert(lis1.length);

3��Node����
	* Node�ڵ��������������ĸ�����
	* ����
		* ��dom����ʱ����Ҫ��html�����в��ֶ���װ�ɶ��󣬰�����ǩ ���� �ı�
		
		* nodeName
		* nodeType
			** �����ǩ���� 1
			** ������Զ��� 2
			** ����ı����� 3
		* nodeValue

		** ��ǩ��Ӧ�����Ե�ֵ
		var div1 = document.getElementById("div1");
		alert(div1.nodeName);  // DIV (��д�ı�ǩ����)
		alert(div1.nodeType);  // 1
		alert(div1.nodeValue); // null

		** ���Զ����Ӧ��node������������Ե�ֵ
		var id1 = div1.getAttributeNode("id");
		alert(id1.nodeName); //id ��������
		alert(id1.nodeType); // 2
		alert(id1.nodeValue); //div1 ���Ե�ֵ

		** �ı������Ӧ��node������������Ե�ֵ
		var tex1 = div1.firstChild;
		alert(tex1.nodeName);  //#text
		alert(tex1.nodeType);  // 3
		alert(tex1.nodeValue); //�ı�����

		* parentNode����ȡ���ڵ�
		** //��ȡ��li�ı�ǩ
		var li1 = document.getElementById("li1");
		//�õ�����ǩul
		var ul1 = li1.parentNode;
		alert(ul1.id);

		* ���ڵ㣬�ӽڵ㣬ͬ���ڵ�

	* ����
	** appendChild()��
	*** ��ӵ�ĩβ
	*** �ص㣺���Ƽ��������Ч��

	** insertBefore(newNode,oldNode): ������ĳ���ڵ�֮ǰ����
	** ����������������������һ������Ҫ��ӵĽڵ㣬�ڶ�����������˭֮ǰ���
	*** 	/*
		1���õ���˭֮ǰ��ӵĽڵ� li4
		2�������ڵ� 
			* ������ǩ li
			* �����ı� 
			* ���ı���ӵ���ǩ����
		3���õ�ul��ǩ
		4��ͨ��ul��ǩ������� insertBefore(newNode,oldNode)
		*/

	** removeChild()��ɾ���ڵ�
	*** ���Ȳ����Լ�ɾ���Լ���ͨ�����ڵ�ɾ��
	*** /*
		1���õ�Ҫɾ���ı�ǩ
		2���õ�ɾ���ڵ�ĸ��ڵ�
		3��ͨ�����ڵ�ɾ�� removeChild()
		*/
	
	** replaceChild(newNode,oldNode)����:�滻�ڵ�
	** ��������������һ���滻�ɵĽڵ㣬�ڶ������滻�Ľڵ�
	** /*
		1���õ�Ҫ�滻�Ľڵ�
		2�������µĽڵ�
			* ������ǩ
			* �����ı�
			* ���ı���ӵ���ǩ����
		3����ȡ���ڵ�
		4��ͨ�����ڵ�����滻
	 */

	 ** cloneNode(boolean)����:���ƽڵ�
	 *** �������Ƿ����ӽڵ�
	 *** 	//�õ�ul��ǩ
		var ul1 = document.getElementById("ul1");
		var ul21 = ul1.cloneNode(true)
		//�ŵ�div����
		var divv = document.getElementById("divv");
		divv.appendChild(ul21);
	
4��Node�������ܽ�
	* ��ȡ��ǩ����
	** getElementById("id��ֵ")
	** getElementsByName("name��ֵ")����������
	** getElementsByTagName("��ǩ����")����������

	* ���ұ�ǩ���ӱ�ǩ��Ψһ��Ч������ getElementsByTagName("��ǩ����");

	* appendChild��������ĩβ��ӽڵ㣬���Ƽ������Ч��
	* insertBefore() replaceChild() removeChild(): ͨ�����ڵ����

5��innerHTML����
	* �����������֧�ָ����ԣ������� DOM ��׼����ɲ��֡�
	* ʵ�ֵĹ��ܣ�
	** ��һ������ȡ��ǩ������ı�����
		*** //�õ�div��ǩ
		var div11 = document.getElementById("div11");
		alert(div11.innerHTML);
		
	** �ڶ��������ǩ�����������ݣ��ı����ݣ�html���룩
		** var div12 = document.getElementById("div12");
		//div12.innerHTML = "����������������";
		//��div�������ñ�� <table border='1'><tr><td>123456</td></tr></table>
		div12.innerHTML = "<table border='1'><tr><td>123456</td></tr></table>";
	**  var tab = "<table>";
		tab += "<tr>";
		tab += "</tr>";
		tab += "</table>";

6����������̬��ʾʱ��
	* �õ���ǰ��ʱ�� var date = new Date();  date.toLocaleString();
	* ����
		/*
		1���õ���ǰ��ʱ�� 
			new Date(); ʹ��toLocaleString����
		2��ʹ�ö�ʱ����div����ÿһ��дһ��ʱ�� setInterval("����",1000);
			* ���ȵõ�div
			* ʹ��innerHTML����дʱ��
		*/

7��������ȫѡ��ϰ
	* ҳ�� ��ѡ��Ͱ�ť
	** ��ѡ��nameֵ����Ҫһ��
	** ����ж��Ƿ�ѡ�У�ͨ��checked���Խ����ж�
	***ͨ������checked�����checked==true ��ʾ��ѡ����ѡ�еģ����checked==false ��ʾ��ѡ����û��ѡ��
	
	* ����
	��1��ȫѡ��ȫ��ѡ�Ĳ���
	/*
	1���õ�Ҫȫѡ�ĸ�ѡ��
		* ͨ��name�õ���Щ��ѡ�� ʹ�÷��� getElementsByName()
	2�����ص����飬�������飬�õ�ÿһ����ѡ��
	3����ÿһ����ѡ������checkedֵ���ó�true | false
	*/	

	��2����ѡ�Ĳ���
	/*
	1���õ�Ҫȫѡ�ĸ�ѡ��
		* ͨ��name�õ���Щ��ѡ�� ʹ�÷��� getElementsByName()
	2���������飬�������飬�õ�ÿһ����ѡ��
	3���жϵ�ǰ�ĸ�ѡ����ѡ�л��ǲ�ѡ�У�
		* if��� checked==true ѡ�У���checked��ֵ���ó�false
		* ���checked==false ��ѡ�У���checkedֵ���ó�true
	*/

	��3��ʹ�ø�ѡ��ʵ��ȫѡ��ȫ��ѡ�Ĳ���
	/*
	1���ж�ȫѡ��ȫ��ѡ�ĸ�ѡ���״̬ 
		* ���ȵõ���ѡ��
		* ʹ��checked���Խ����ж� ѡ�� true ��ѡ�� false
	2�������ѡ�У�����ȫѡ�ķ���
	3�����û��ѡ�У�����ȫ��ѡ�ķ���
	*/

8�������������б������ѡ��
	* ����ҳ��
	* ʵ��˼·��
	** ����ж��Ƿ���ѡ�У�ʹ������selected�����жϣ����selected==true��ʾѡ��״̬��selected==false��ʾû��ѡ��״̬
	** appendChild�� ���Ƽ��������Ч��
	** ����ߵ�option�ı�ǩ�ӵ��ұߵ�select����
		*** ���Ȼ�ȡ���ѡ�е�option
		*** ��ȡ�ұ�select��ǩ����selectʹ�÷���appendChild
	
	��1��ʵ��ѡ����ӵ��ұ�
	/*
	1���õ���ߵ�select��ǩ
	2���õ�select1�����option�ı�ǩ ʹ�÷���getElementsByTagName����
	3�����ص������飬�������飬�õ�ÿһ��option��ǩ
	4���ж��Ƿ���ѡ�е�״̬
		* ʹ��if��䣬ʹ������selected�����жϣ�true��ѡ�У�falseû��ѡ��
	5�������ѡ��״̬����ӵ��ұ�
		* ��ȡselect2�ı�ǩ���ұߵı�ǩ��
		* ��select2�ı�ǩִ��appendChild����������
	*/ 

	��2��ʵ��ȫ����ӵ��ұ�
	/*
	1���õ���ߵ�select��ǩ
	2���õ�select1�����option�ı�ǩ ʹ�÷���getElementsByTagName����
	3�����ص������飬�������飬�õ�ÿһ��option��ǩ
	4���õ�select2�ı�ǩ
	5����select2����ִ��appendChild����������
	*/

	��3��ʵ��ѡ����ӵ����
	/*
	1���õ��ұ�select��ǩ
	2���õ�select�����option
	3�����ص������飬�������飬�õ�ÿһ��option
	4���ж�ÿһ��option�Ƿ���ѡ�е�״̬
	5�������ѡ�е�״̬����ӵ����
		* �õ���ߵ�select��ǩ
		* ����ߵ�select��ǩִ��appendChild����
	*/

	��4��ʵ��ȫ����ӵ����
	/*
	1���õ��ұ�select��ǩ
	2���õ�select�����option
	3�����ص������飬�������飬�õ�ÿһ��option
	4���õ���ߵ�select��ǩ
	5��ִ��appendChild���������ӵ����
	*/

	*** дjs�ķ�������ʱ�򣬲�Ҫʹ�õ����ĵ��ʣ�add��select
	* add_1()  add1()
	* ��Ҫ����д��_add1();

9��������ʡ������
	* ����ҳ�棺������������������������������ݣ��ұ߿�
	* ʵ�ֲ���
	/*
	** ���ս���������ߵĹ��ң��ѹ��Ҷ�Ӧ�ĳ�����ӵ��ұߵ�select����
	ʵ�ֵĲ��裺
	** ʹ�õ��¼� onchange�¼����ı��¼�
	** onchange="add1(this.value);�õ���ǰѡ���ֵ
	** �õ���������ֵ������������ĵ�һ��ֵ���бȽ�
		*** ���ȱ������飬��Ϊ��һ����ά���飬ÿ�α���֮��Ľ������һ������
		*** ��ȡ������֮�������ĵ�һ��ֵ���ʹ�������ֵ���бȽ�

	** ����Ƚϵ�ֵ��ͬ���ѵ�һ��ֵ�����������ӵ��ڶ���select����
		*** �õ���һ��ֵ��������е�ֵ���������飬���Ǳ�����Ҫ��1��ʼ
	
	** �����ֵ�ŵ�select2����
		*** �õ�select2
		*** Ҫ��select2������ӵ���option��ǩ��������Ҫ������������
		*** ��option��ǩ��ӵ�select2����ʹ��appendChild����
	
	** �������⣺
	��һ��ѡ����ң��ڵڶ����������������������ʾ���ҵĳ��У����ǵڶ����ڵ��һ������֮�󣬻�ѵڶ������ҵĳ���
	�ڵ�һ�����ҳ��к�����һ��׷��

	** ���������
	*** ֻ�е��÷�����ʱ�򣬰��ұߵ���������գ�ɾ���ұߵ�select�����option�Ϳ����ˣ�
	*** ʹ��removeChild����ɾ����ͨ�����ڵ㣨�õ�s2��
	*/

10����������̬���ɱ��
	* ����ҳ�棺����������һ����ť���¼���
	* ʵ�ֲ���
	/*
	1���õ�����������ֵ
	2�����������ֵ�������
		* ������ <tr> ʹ��forѭ��������
		** �����У���tr���� <td> ʹ��forѭ�����ɵ�Ԫ��
		* ��������Ҫ<table>
	3�������ɵı��Ĵ���д��div���棨ʹ��innerHTML���ԣ�
	*/
	* ����Ƭ��
	//���ɱ��Ĵ���
	var tab = "<table border='1' bordercolor='blue'>";
	//������
	for(var i=1;i<=h;i++) {
		tab += "<tr>";
		//ѭ����
		for(var j=1;j<=lie;j++) {
			tab += "<td>AAAAAAAAAAA</td>";
		}
		tab += "</tr>";
	}
	tab += "</table>";

11��junit��Ԫ����
	* ���һ���������еĲ���
	* ��java����Ĭ��û��junit�ģ������Ҫʹ��junit����Ҫ����֧��jar��
	* ������myeclipse���������У��Դ���jar���ù���ֱ��ʹ��

	* jnnit���� 3.x  4.x  ʹ��4.x
	** ʹ�õ�Ԫ���ԣ�дһ����Ԫ���Եķ�������������д�淶�� public void get1() { }

	* ʹ��ע�� @Test����ʾ�Է������е�Ԫ����
	** ���е�Ԫ���� ѡ��������������JUnit Test��ɵ�Ԫ���ԣ���������ɫ����ʱ�򣬱�ʾ����ͨ�������ǳ��ֺ���ɫ����
	��ʾ����ʧ��



