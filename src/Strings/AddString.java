package Strings;

public class AddString {

	public static String addString(String num1, String num2){
		int l1 = num1.length();
		int l2 = num2.length();
		int carry=0;
		StringBuilder sb = new StringBuilder();
		for(int i=l1-1, j=l2-1;i>=0||j>=0||carry==1;i--,j--){
			int a = i<0?0:num1.charAt(i)-'0';
			int b = j<0?0:num2.charAt(j)-'0';
			int sum = a+b+carry;
			sb.append(sum%10);
			carry = sum/10;
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AddString.addString("99", "99"));
	}

}
