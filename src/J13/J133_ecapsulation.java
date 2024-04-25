package J13;

public class J133_ecapsulation {

	public static void main(String[] args) {

		J133_Machine m = new J133_Machine();
		m.setPower(500);
		System.out.println(m.getPower());
		m.setPower(110);
		System.out.println(m.getPower());

	}
	/* ecapsulation封裝,就是內部屬性不讓外界直接而提供 
	 * ,設值(setXXX)與取值(getXXX)的方法,讓外界利用此方法來存取
	 */
}

class J133_Machine {
	// 要求電力小於220
	private int power;
	// Source -> Generate Getter and setter
	// 設值方法
	public void setPower(int power) {
		if (power >= 220) {
			System.out.println("電力輸入錯誤");
		} else {
			this.power = power;
		}
	}
	// 取值方法
	public int getPower() {
		return power;
	}
}