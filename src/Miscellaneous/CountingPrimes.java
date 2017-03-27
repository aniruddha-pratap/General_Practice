package Miscellaneous;

public class CountingPrimes {
	
	public static int countPrimes(int n) {
		boolean checkPrime[]= new boolean[n];
		int count =0;
		for(int i=2;i<n;i++){
			if(!checkPrime[i]){
				count++;
				for(int j=2;j*i<n;j++){
					checkPrime[i*j]=true;
				}
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		System.out.println(CountingPrimes.countPrimes(10)); 
	}

}
