import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ʵ�ֹ��ܣ�
 * 1����List,���������10������ַ���
 * 2ÿ���ַ����ĳ���Ϊ10���ڵ��������
 * 3ÿ���ַ�����ÿ���ַ���Ϊ������ɵģ������ظ�
 * 4ÿ���ַ��������ظ�
 *
 */
public class RandTest {
    /**
	 * ����List�������ַ���
	 */
	public List<String> listrand = new ArrayList<String>();
    
	/**
	 * ��������ַ���
	 */
	public void StringRand(){
		Random random = new Random();
		int k;
		String st;
		String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //����10������ַ���
		for(int i=0;i<10;i++){ 
			do{
			    k = random.nextInt(10);
				char[] c = new char[k];
				do{
                    //��������ַ����е�ÿ���ַ�
					for(int j=0;j<k;j++){
						int number = random.nextInt(base.length());
						c[j] = base.charAt(number);	
					}
					st = new String(c);
				}while(listrand.contains(st));
				listrand.add(st);
		    }while(k==0);
		}
		
	}
	/**
	 * ��ӡ���List
	 */
	public void printList(){
		System.out.println("------------����ǰ-------------");
		for(String s:listrand){
			System.out.println("����������ַ�����"+s);
		}
		System.out.println("------------�����-------------");
		Collections.sort(listrand);
		for(String s:listrand){
			System.out.println("����������ַ�����"+s);
		}
	}
	public static void main(String[] args) {
		RandTest rt = new RandTest();
		rt.StringRand();
		rt.printList();
	}

}