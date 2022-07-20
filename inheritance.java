class parent {
	int house =1;
}
class child extends parent {
	double money =10000;
}
class grandchild extends child {
	String car ="BMW";
}

public class multi {

public static void main (String[] args) {
		grandchild g=new grandchild();
		
		System.out.println(g.house);
		System.out.println(g.money);
		System.out.println(g.car);
}
	}
	