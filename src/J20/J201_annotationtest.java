package J20;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Arrays;

@J201_MyNotion1(name = "hello", value = { 100, 200 })
@J201_MyNotion1(name = "OK", value = { 1000, 2000 })
public class J201_annotationtest {

	@J201_MyNotion1(name = "hello", value = { 100, 200 })
	public static void main(String[] args) {
		Class test = J201_Son.class;
		Annotation[] an = test.getAnnotations();
		System.out.println(Arrays.toString(an));
		int a = (@J201_MyNotion1 int) 10.5;

	}

}

class J201_Son extends J201_annotationtest {

}

class J201_SomeClass<@J201_MyNotion1 T> {

}

//自訂註釋註解 @interface 註解名稱
@Repeatable(J201_MyNotion2.class)
@Inherited // 子類別可以繼承父類別的註解
@Retention(RUNTIME)
@Target({ METHOD, TYPE, TYPE_USE, TYPE_PARAMETER, FIELD }) // 中繼註解,用來說明此註解可套用在哪些地方
@interface J201_MyNotion1 {
	// 定義成員變數,以無參數方法的形式來定義成員變數,再利用default修飾字來設定初始值,但default可有可無
	// 預設成員變數名稱 String value()
	String name() default "ok";

	int[] value() default 1;
}

@Inherited
@Retention(RUNTIME)
@Target({ METHOD, TYPE, TYPE_USE, TYPE_PARAMETER, FIELD }) // 中繼註解,用來說明此註解可套用在那些地方
@interface J201_MyNotion2 {
	J201_MyNotion1[] value();
}