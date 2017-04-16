package Miscellaneous;

public class Factorial {

	//iterative
	public static int factorial(int num){
		int fac = 1;
		while(num>0){
			fac = fac * num;
			num--;
		}
		return fac;
	}
	
	//recursive
	public static int recursiveFact(int num){
		if(num==1){
			return 1;
		}else{
			return num*recursiveFact(num-1);
		}
	}
	public static void main(String[] args) {
		//System.out.println(Factorial.factorial(4));
		System.out.println(Factorial.recursiveFact(4));
	}

}
