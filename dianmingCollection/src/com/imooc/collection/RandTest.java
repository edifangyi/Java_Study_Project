import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 实现功能：
 * 1创建List,往其中添加10条随机字符串
 * 2每条字符串的长度为10以内的随机整数
 * 3每条字符串的每个字符都为随机生成的，可以重复
 * 4每条字符串不可重复
 *
 */
public class RandTest {
    /**
	 * 创建List存放随机字符串
	 */
	public List<String> listrand = new ArrayList<String>();
    
	/**
	 * 生成随机字符串
	 */
	public void StringRand(){
		Random random = new Random();
		int k;
		String st;
		String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //生成10条随机字符串
		for(int i=0;i<10;i++){ 
			do{
			    k = random.nextInt(10);
				char[] c = new char[k];
				do{
                    //随机生成字符串中的每个字符
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
	 * 打印输出List
	 */
	public void printList(){
		System.out.println("------------排序前-------------");
		for(String s:listrand){
			System.out.println("产生的随机字符串："+s);
		}
		System.out.println("------------排序后-------------");
		Collections.sort(listrand);
		for(String s:listrand){
			System.out.println("产生的随机字符串："+s);
		}
	}
	public static void main(String[] args) {
		RandTest rt = new RandTest();
		rt.StringRand();
		rt.printList();
	}

}