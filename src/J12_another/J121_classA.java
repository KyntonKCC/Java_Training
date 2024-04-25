package J12_another;

public class J121_classA {
	//宣告四種存取權限的物件變數
	private int privateVar = 1;
	int defaultVar = 2;
	protected int protectedVar = 3;
	public int publicVar = 4;
}

class J121_Person1{
	void test() {
		//System.out.println(new J121_classA().privateVar);
		System.out.println(new J121_classA().defaultVar);
		System.out.println(new J121_classA().protectedVar);
		System.out.println(new J121_classA().publicVar);
	}
}

class J121_Person2{
	
}

/*					package1				package2
 *  存取修飾字		同一類別		同一套件		子類別		全域		
 *  			A.class(父)	B.class		C.class(子)	D.class
 *  private		Yes			No			No			No
 *  default		Yes			Yes			No			No
 *  protected	Yes			Yes			Yes			No
 *  public		Yes			Yes			Yes			Yes
 */