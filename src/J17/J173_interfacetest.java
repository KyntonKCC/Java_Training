package J17;

public class J173_interfacetest {

	public static void main(String[] args) {
		new J173_Ball("hello").play();

	}

}

interface J173_Baseketball {
	void play();
}

interface J173_Football {
	void play();
}

interface J173_Game extends J173_Baseketball, J173_Football {
	/** public static final */ J173_Ball ball = new J173_Ball("Go");
}

class J173_Ball implements J173_Game {
	private String name;

	public String getName() {
		return name;
	}

	public J173_Ball(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		// ball = new Ball("Football");//cannot be assigned
		System.out.println(ball.getName());
	}
}