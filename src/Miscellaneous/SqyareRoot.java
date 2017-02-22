package Miscellaneous;

public class SqyareRoot {

	public static boolean isPerfectSquare(int num) {
        if(num==0){
            return false;
        }
        if(num<10){
            if(num==1 ||num==4 || num==9){
            	
                return true;
            }else{
                return false;
            }
        }else{
            int n = num%10;
            System.out.println(n);
            if(n==2 || n==3 || n==7 || n==8){
                return false;
            }else{
                return true;
            }    
        }
        //return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SqyareRoot.isPerfectSquare(681));
		
	}

}
