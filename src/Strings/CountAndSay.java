package Strings;

public class CountAndSay {

	public static String countAndSay(int n) {
	    String str = "1";
	    while(n > 1){
	       str = sayIt(str);
	        n--;
	    }
	    return str;
	}

	public static String sayIt(String s){
	    if(s == null || s.length() == 0){
	        return "";
	    }
	    StringBuilder sb = new StringBuilder();
	    char curr = s.charAt(0);
	    int count = 1;
	    for(int i = 1; i < s.length(); i++){
	        if(curr == s.charAt(i)){
	            count++;
	        }
	        else{
	            sb.append(count);
	            sb.append(curr);
	            curr = s.charAt(i);
	            count = 1;
	        }
	    }
	    sb.append(count);
	    sb.append(curr);
	    
	    return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountAndSay.countAndSay(3));
	}

}
