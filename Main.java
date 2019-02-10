package pra_2019_02_10_02;

public class Main extends Parents{

	/*
	public void show()    //show()はParentsクラスでfinalで定義されているので新しく定義する事が出来ないです。
	{
		System.out.println("こんばんは");
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int number = 10;
		//number = 5;  変数numberはfinalで定義されているので新しく定義する事が出来ないです。
		System.out.println(number);
		Main m = new Main();
		m.show();
	}

}
