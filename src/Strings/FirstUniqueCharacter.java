package Strings;

public class FirstUniqueCharacter {
	
	public char firstUniqChar(String s) {
        int n = s.length();
        s=s.toLowerCase();
        int count[]= new int[26];
        for(int i=0;i<n;i++){
        	count[s.charAt(i)-'a']++;
        }
        for(int j=0;j<n;j++){
        	if(count[s.charAt(j) - 'a']==1){
        		return s.charAt(j);
        	}
        }
        return ' ';
    }
	
	public static void main(String []args){
		FirstUniqueCharacter f =new FirstUniqueCharacter();
		System.out.println(f.firstUniqChar("Aniruddh"));
	}
}
