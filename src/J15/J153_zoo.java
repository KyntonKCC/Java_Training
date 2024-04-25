package J15;

public class J153_zoo {

	public static void main(String[] args) {
		J153_Animal a = new J153_Tiger();
		if (a instanceof J153_Birds) {// 有無直系關係
			System.out.println("有關係");
		} else {
			System.out.println("沒有關係");
		}
		a.move();
		((J153_Cat) a).skill();// 轉型
		((J153_Tiger) a).skill();// 轉型
		// ((J153_Birds)a).skill();//java.lang.ClassCastException//旁系血親

		J153_Cat c = new J153_Tiger();
		c.skill();
		c.move();

		J153_Tiger t = new J153_Tiger();
		t.skill();
		t.move();

	}

}

class J153_Animal {
	public void move() {
		System.out.println("我是Animal,我會移動");
	}
}

class J153_Birds extends J153_Animal {
	@Override
	public void move() {
		System.out.println("我是Birds,我會飛來飛去");
	}

	public void skill() {

	}
}

class J153_Cat extends J153_Animal {
	@Override
	public void move() {
		System.out.println("我是Cat,我會跑跑跳跳");
	}

	public void skill() {
		System.out.println("我是Cat,我的技能是抓魚");
	}
}

class J153_Tiger extends J153_Cat {
	@Override
	public void skill() {
		System.out.println("我是Tiger,我的技能是狩獵");
	}
}