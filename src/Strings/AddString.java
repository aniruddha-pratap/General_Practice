package Strings;

public class AddString {

	public static String addString(String num1, String num2){
		int a = Integer.parseInt(num1) + Integer.parseInt(num2);
		return String.valueOf(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AddString.addString("10", "20"));
	}

}
