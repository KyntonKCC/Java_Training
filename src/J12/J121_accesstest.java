package J12;

import J12_another.J121_classA;

public class J121_accesstest extends J121_classA{

	public static void main(String[] args) {
		//System.out.println(new J121_accesstest().privateVar);
		//System.out.println(new J121_accesstest().defaultedVar);
		System.out.println(new J121_accesstest().protectedVar);
		System.out.println(new J121_accesstest().publicVar);
		
		//System.out.println(new J121_classA().privateVar);
		//System.out.println(new J121_classA().defaultVar);
		//System.out.println(new J121_classA().protectedVar);
		System.out.println(new J121_classA().publicVar);

	}

}

class J121_Person0{
	
}

/*					package1				package2
 *  存取修飾字		同一類別		同一套件		子類別		全域		
 *  			A.class(父)	B.class		C.class(子)	D.class
 *  private		Yes			No			No			No
 *  default		Yes			Yes			No			No
 *  protected	Yes			Yes			Yes			No
 *  public		Yes			Yes			Yes			Yes
 */
