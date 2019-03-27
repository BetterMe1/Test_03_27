package Test_0327;

//import java.util.HashSet;
//import java.util.Set;

/*
 * Set存储的元素是无序的、不可重复的。
 * 1.无序性：不等于随机性，无序指的是元素在底层存储的位置是无序的。
 * 2.不可重复性：向Set中添加相同元素时，后面添加的元素无法添加。
 *       说明：要求添加进Set中的元素所在的类，一定要重写hashCode()和equals()方法,
 *           用来保证Set中元素的不可重复性
 * 3.元素的存储：使用了哈希算法
 *           当向Set中添加元素时，首先调用此对象的hashCode()方法，计算此对象的哈希值，
 *           决定此对象在Set中的存储位置。若此位置之前无对象存储，则此对象直接存储到这个位置，
 *           若此位置有对象存储，在通过equals()方法比较两个对象是否相同，相同，后一个对象无法存入，
 *           返回false时会都存储，但一般要求hashCode()与equals()方法一致，也就是说保证不同的对象哈希值不同。
 */
//public class TestSet {
//	public static void main(String[] args) {
//		Set set = new HashSet();
//		set.add(123);
//		set.add(456);
//		set.add("AA");
//		set.add("AA");//不可重复
//		set.add("BB");
//		set.add(null);
//		System.out.println(set.size());//5
//		System.out.println(set);//[AA, BB, null, 456, 123] 无序性
//		Person p1 = new Person("小红",23);
//		Person p2 = new Person("小红",23);
//		set.add(p1);
//		set.add(p2); 
//		System.out.println(set.size());//6
//		//[AA, BB, null, Person [name=小红, age=23], 456, 123]
//		//判断重复时会调用equals方法判断
//		System.out.println(set);
//
//	}
//}
/*
下厨房
题目描述
牛牛想尝试一些新的料理，每个料理需要一些不同的材料，问完成所有的料理需要准备多少种不同的材料。
输入描述:
每个输入包含 1 个测试用例。每个测试用例的第 i 行，表示完成第 i 件料理需要哪些材料，各个材料用空格隔开，输入只包含大写英文字母和空格，输入文件不超过 50 行，每一行不超过 50 个字符。
输出描述:
输出一行一个数字表示完成所有料理需要多少种不同的材料。
示例1
输入
BUTTER FLOUR
HONEY FLOUR EGG
输出
4
 */
/*
 * 分析：
 * 看完此题后会发现题的用意就是去重，所以会想使用Set,由于不知道用户输入多少行，
 * 所以使用的Scanner中的hasNext()方法来判断是否还存在下一行，此方法需要用户手动结束循环，
 * window环境下使用ctrl+z结束输入循环，linux环境下使用ctrl+d结束输入循环。
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