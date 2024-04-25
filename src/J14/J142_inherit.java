package J14;

public class J142_inherit {

	public static void main(String[] args) {
		/* 繼承架構下的建構子 
		 * 1.當建構子類別時,一定要先建構父類別,因為沒有爸爸,哪來的您.
		 * 2.所以子類別的每個建構子,編譯器會在"第一行"填入無參數的super()用來呼叫父類別的建構子
		 *  ,因為super()一定要在建構子的第一行 ,所以super()與this()是絕對不可能同時出現在建構子內
		 * 3.子類別的多個建構子內,一定有一個建構子會用super()呼叫父類別的建構子,否則又變成recursive
		 */
		J142_Taipei t = new J142_Taipei();

	}

}

class J142_PersonA {									// 3
	J142_PersonA(int a) { 								
		System.out.println("人類A"); 					// 4
	}
}

class J142_PersonB extends J142_PersonA {				// 2
	J142_PersonB() { 									
		super(10); 										
		System.out.println("人類B"); 					// 5
	}
}

class J142_Taipei extends J142_PersonB {				// 1
	J142_Taipei() { 
		this(10); 										// 6
		System.out.println("台北人A"); 					// 12
	}

	J142_Taipei(int a) { 								// 7
		this("hello"); 									// 8
		System.out.println("台北人B"); 					// 11
	}

	J142_Taipei(String b) { 							// 9
		// this();//Recursive constructor invocation
		// super();//此行是用來調用父類別無參數的建構子 	
		System.out.println("台北人C"); 					// 10
	}
}