package Test_0327;

//import java.util.HashSet;
//import java.util.Set;

/*
 * Set�洢��Ԫ��������ġ������ظ��ġ�
 * 1.�����ԣ�����������ԣ�����ָ����Ԫ���ڵײ�洢��λ��������ġ�
 * 2.�����ظ��ԣ���Set�������ͬԪ��ʱ��������ӵ�Ԫ���޷���ӡ�
 *       ˵����Ҫ����ӽ�Set�е�Ԫ�����ڵ��࣬һ��Ҫ��дhashCode()��equals()����,
 *           ������֤Set��Ԫ�صĲ����ظ���
 * 3.Ԫ�صĴ洢��ʹ���˹�ϣ�㷨
 *           ����Set�����Ԫ��ʱ�����ȵ��ô˶����hashCode()����������˶���Ĺ�ϣֵ��
 *           �����˶�����Set�еĴ洢λ�á�����λ��֮ǰ�޶���洢����˶���ֱ�Ӵ洢�����λ�ã�
 *           ����λ���ж���洢����ͨ��equals()�����Ƚ����������Ƿ���ͬ����ͬ����һ�������޷����룬
 *           ����falseʱ�ᶼ�洢����һ��Ҫ��hashCode()��equals()����һ�£�Ҳ����˵��֤��ͬ�Ķ����ϣֵ��ͬ��
 */
//public class TestSet {
//	public static void main(String[] args) {
//		Set set = new HashSet();
//		set.add(123);
//		set.add(456);
//		set.add("AA");
//		set.add("AA");//�����ظ�
//		set.add("BB");
//		set.add(null);
//		System.out.println(set.size());//5
//		System.out.println(set);//[AA, BB, null, 456, 123] ������
//		Person p1 = new Person("С��",23);
//		Person p2 = new Person("С��",23);
//		set.add(p1);
//		set.add(p2); 
//		System.out.println(set.size());//6
//		//[AA, BB, null, Person [name=С��, age=23], 456, 123]
//		//�ж��ظ�ʱ�����equals�����ж�
//		System.out.println(set);
//
//	}
//}
/*
�³���
��Ŀ����
ţţ�볢��һЩ�µ�����ÿ��������ҪһЩ��ͬ�Ĳ��ϣ���������е�������Ҫ׼�������ֲ�ͬ�Ĳ��ϡ�
��������:
ÿ��������� 1 ������������ÿ�����������ĵ� i �У���ʾ��ɵ� i ��������Ҫ��Щ���ϣ����������ÿո����������ֻ������дӢ����ĸ�Ϳո������ļ������� 50 �У�ÿһ�в����� 50 ���ַ���
�������:
���һ��һ�����ֱ�ʾ�������������Ҫ�����ֲ�ͬ�Ĳ��ϡ�
ʾ��1
����
BUTTER FLOUR
HONEY FLOUR EGG
���
4
 */
/*
 * ������
 * ��������ᷢ������������ȥ�أ����Ի���ʹ��Set,���ڲ�֪���û���������У�
 * ����ʹ�õ�Scanner�е�hasNext()�������ж��Ƿ񻹴�����һ�У��˷�����Ҫ�û��ֶ�����ѭ����
 * window������ʹ��ctrl+z��������ѭ����linux������ʹ��ctrl+d��������ѭ����
 */
import java.util.Scanner;
import java.util.HashSet;
public class TestSet {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();
        while(sc.hasNext()){
            String s = sc.next();
            String[] temp = s.split(" ");
            for(int i=0; i<temp.length; i++){
                hs.add(temp[i]);
            }
        }
        System.out.println(hs.size());
	}
}