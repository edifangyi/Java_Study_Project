
day02

�������ݻع�
	1��html�Ĳ���˼��

	2��font��ǩ

	3��html��ע�ͺ�javaע��

	4��ͼ���ǩ

	5��·������
		* ���·��
		* ͬ��Ŀ¼ֱ��д�ļ�����
		* �ϲ�Ŀ¼ ../
		* �²�Ŀ¼ 
	
	6�������ӱ�ǩ
		<a href="" target="_self/_blank"></a>

	7������ǩ
		* �������У���ÿ�������ж��ٸ���Ԫ��
		** <th>: ���кͼӴ�
		* rowspan  colspan
	
	8������ǩ
		* form����action method
		* get��post����

		* text password radio checkbox submit reset select textarea file hidden image
		
		* Ҫ�󣺱���name���ԣ���radio checkbox select��valueֵ
		* <input type="image" src=""/>

	9��div��span

1��css�ļ��
	* �����ʽ��
	** ��ʽ���кܶ�����Ժ�����ֵ
	** �����һ��һ��ġ����ȼ�
	
	** ��һ��������ʽ��html�ֿ���ʾ
	** �ڶ�����html�����Ժ��٣�css������ʽ��ǿ��

2��css��html��Ϸ�ʽ
	* �����ֽ�Ϸ�ʽ
	* ��һ�ֽ�Ϸ�ʽ����ÿ��html��ǩ���涼��һ������ style����style��������дcss����
		** ���� 
		** <div style="background-color:red;color:black;">��֮����������������㣬�ǹ���ʤʵ������ʤ���ࡣ</div>
		** ��ʽ�� style="��������1:����ֵ;��������2:����ֵ;"
	
	* �ڶ��ֽ�Ϸ�ʽ��ʹ��html�ı�ǩʵ�֣�<style type="text/css"> css���� </style>
		** ����
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
	 
	 * �����ֽ�Ϸ�ʽ��
	 ** ���ȴ���css�ļ�����css�ļ�����дcss����
	 ** ���ʹ��html�ı�ǩʵ�֣�<style type="text/css"> @import url(css·��); </style>
	 ** ���⣺��ĳЩ��������棬 @import��ʽ��������

	 * �����ֽ�Ϸ�ʽ�������ⲿ����Դ�ļ���ʹ��ͷ��ǩ��link��ǩ
	 ** ���ȴ���css�ļ�����css�ļ�����дcss����
	 ** ��html��ʹ��ͷ��ǩlink��Ϊ�ⲿ��css�ļ�
		** <link rel="stylesheet" type="text/css" href="css·��" />

	* ���ȼ�����һ�������£����ϵ��£����⵽�ڡ����ȼ��ɵ͵��ߡ�
	** ����ص����ȼ���

	* css�����ע�ͺ�java�Ķ���ע����ͬ�ģ�/* */

	* ��ǩ���� {��������1:����ֵ;
	            ��������2:����ֵ;}

3��css�Ļ���ѡ����
	* ѡ������Ҫ����һ����ǩ��������ݽ�����ʽ���޸�
	* �����ֻ���ѡ����
	* ��һ�֣���ǩѡ����
		** �ѱ�ǩ������Ϊѡ����������
		** ���� 
		div {
			background-color:orange;
			color:white;
		}

	* �ڶ��֣�classѡ����
		** ÿ��html��ǩ���涼��һ������ class���ԣ�ͨ��class���Ե�ֵ��Ϊѡ����������
		** ����
		.haha {
			background-color:green;
			color: white;
		}

	* �����֣�idѡ����
		** ÿ��html��ǩ����һ������ id���ԣ�ͨ��id���Ե�ֵ��Ϊѡ����������
		** ����
		#hehe {
			background-color:green;
			color: white;			
		}

4��css����չѡ����
	* ����ѡ����
		* ��һ����ǩ����Ƕ����һ����ǩ�����ñ�ǩ����Ƕ�ױ�ǩ����ʽ
		** ���� <div><p>AAAAAAAABBBBBBBBCCCCCCCCCC</p></div>
		div p {
			background-color: green;
		}

	* ���ѡ����
		* ���ò�ͬ�ı�ǩ������ͬ����ʽ
		** ���� 
		div,p {
			background-color: red;
		}

	* αԪ��ѡ����
		* ����ʵ��һЩ�򵥵Ķ�̬��Ч��
		* ���糬���ӣ�����Щ״̬
		** ԭʼ״̬   ������ȥ��״̬����ͣ��  ���״̬     ���֮��
		    :link          :hover                :active      :visited
		** ���䷽���� lv ha

5��css�Ļ���ѡ���������ȼ�
	style > idѡ���� > classѡ���� > ��ǩѡ����

6��css�ĺ���ģ��
	* ������Ҫ�����ݷ�װ��һ���������棬�������һ�㶼ʹ��div���з�װ
	* �߿�
		* ʹ������border��ͳһ���� border : border-width || border-style || border-color 
		* ���������������ߵ����� border-top  bottom  left  right ���ֱ����������ߵ���ʽ

	* �ڱ߾�
		* ʹ������padding��ͳһ���ã��ֱ����� padding : length 

	* ��߾�
		* ʹ������margin��ͳһ���ã��ֱ����� margin : length 

7��css�Ĳ��֣�Ư����
	* css������ float
	** left: ��ʾ��ǰ����������Ե�div��λ�þ��󣬺���ı�ǩƮ���ұ�ȥ
	** right����ʾ��ǰ����������Ե�div��λ�þ��ң�����ı�ǩƮ�����ȥ

8��css�Ĳ��֣���λ��
	* position��absolute��relative
	** absolute: ��������ĵ������ϳ�
	** relative: ���Ὣ������ĵ������ϳ�

9��ͼ�Ļ���
	* ��ͼƬ�����ַŵ�div����

10��ͼ��ǩ������ͼƬ������ʾ���֣�


