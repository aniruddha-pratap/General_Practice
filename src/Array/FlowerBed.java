package Array;

public class FlowerBed {
   
	public boolean canPlaceFlowers(int[] a, int n) {
		int length = a.length;
		int count=0;
		for(int i=1; i<length-1; i++){
			if((a[i] == 0) && (a[i-1] != 1) && (a[i+1] != 1)){
				count++;
			}
		}
		System.out.println(count);
		return count >= n;
    }

	public static void main(String args[]){
		FlowerBed f = new FlowerBed();
		int flowerbed[] = {1,1,0,0,0,1};
		System.out.println(f.canPlaceFlowers(flowerbed, 1));
	}
}
