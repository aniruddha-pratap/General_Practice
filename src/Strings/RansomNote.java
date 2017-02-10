package Strings;

public class RansomNote {

	 public boolean canConstruct(String ransomNote, String magazine) {
	     char b[]=magazine.toCharArray();
	     char a[]=ransomNote.toCharArray();
	     int m=ransomNote.length();
	     int n=magazine.length();
	     int ctr=0;
	     for(int i=0;i<n;i++){
	         for(int j=0;j<m;j++){
	             if(a[j]==b[i]){
	            	 System.out.println(ctr+" for "+a[j]);
	                 b[i]='0';
	                 a[j]='1';
	                 ctr++;
	             }
	         }
	         
	     }
	     System.out.println(ctr);
	     System.out.println(b);
	     System.out.println(a);
	     if(ctr == m){
	         return true;
	     }else{
	        return false;    
	     }
	     
	    }
	 
	 public static void main(String args[]){
		 RansomNote rm = new RansomNote();
		 boolean result = rm.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh");
		 System.out.println(result);
	 }
	
}