package lamdatest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ccc");
		Collections.sort(list);
		System.out.println("湲곕낯�� �삤由꾩감�닚 : "+list);
		
		Collections.sort(list, (String s1,String s2) -> s2.compareTo(s1) );
		
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});
		System.out.println("�궡由쇱감�닚�쑝濡� �젙�젹�븯�젮硫� �몢踰덉㎏ 留ㅺ컻蹂��닔瑜� 湲곗��쑝濡� 鍮꾧탳�븯�뒗 Comparator 媛앹껜 �쟾�떖 : "+list);
	}
}
