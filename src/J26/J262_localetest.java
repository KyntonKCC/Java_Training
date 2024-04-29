package J26;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

public class J262_localetest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE);
		Locale currentLocale1 = Locale.getDefault();
		System.out.println(currentLocale1);
		ResourceBundle messages1 = ResourceBundle.getBundle("Language", currentLocale1);// Langeage 為資源檔名稱
		System.out.println(messages1.getString("message"));
		Locale currentLocale2 = new Locale.Builder().setLanguage("en").build();
		System.out.println(currentLocale2);
		ResourceBundle messages2 = ResourceBundle.getBundle("Language", currentLocale2);
		System.out.println(messages2.getString("message"));
		Locale currentLocale3 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println(currentLocale3);
		ResourceBundle messages3 = ResourceBundle.getBundle("Language", currentLocale3);
		System.out.println(messages3.getString("message"));

		double salary = 3.15;
		Locale local = Locale.FRANCE;
		NumberFormat instance = NumberFormat.getInstance(local);
		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(local);
		System.out.println("=====數字格式========");
		String displayName1 = instance.format(salary);
		String displayName2 = currencyInstance.format(salary);
		System.out.println(displayName1);
		System.out.println(displayName2);
		System.out.println("=====貨幣代碼========");
		Currency currency1 = instance.getCurrency();
		Currency currency2 = currencyInstance.getCurrency();
		System.out.println(currency1);
		System.out.println(currency2);
		System.out.println("=====貨幣名稱========");
		String displayName3 = currency1.getDisplayName();
		String displayName4 = currency2.getDisplayName();
		System.out.println(displayName3);
		System.out.println(displayName4);

	}

}
