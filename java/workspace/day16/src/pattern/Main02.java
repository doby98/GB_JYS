package pattern;

public class Main02 {

	public static void main(String[] args) {
		String str1 = "ㅇ ";
		String str2 = "12345d";
		String str3 = "yooseopㅇ";
		String str4 = "유섭1";
		String str5 = "yooseop123ㅇ";
		String str6 = "유섭123s";
		String str7 = "ysj_98@nav@er.com";
		String str8 = "01046.788753";
		
		System.out.println(RegexHelper.getInstance().isValue(str1));
		System.out.println(RegexHelper.getInstance().isNum(str2));
		System.out.println(RegexHelper.getInstance().isEng(str3));
		System.out.println(RegexHelper.getInstance().isKor(str4));
		System.out.println(RegexHelper.getInstance().isEngNum(str5));
		System.out.println(RegexHelper.getInstance().isKorNum(str6));
		System.out.println(RegexHelper.getInstance().isEmail(str7));
		System.out.println(RegexHelper.getInstance().isCellPhone(str8));
	}

}
