package day11.case3;

public class TVFactory {	// ��ü ������ ��� ���ִ� ���� ���������� facrory��� ��
	public static TV getTV(String beanName){
		TV obj = null;
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}