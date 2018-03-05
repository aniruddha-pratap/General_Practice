package Array;

public class IncreasingTripletSequence {

    public static boolean increasingTriplet(int[] nums) {
        int c1 = Integer.MAX_VALUE, c2 = Integer.MAX_VALUE;
        for(int i : nums){
            System.out.println("i "+i+" c1 "+c1+" c2 "+c2);
            if(i<=c1){
                c1 = i;
            } else if(i<=c2){
                c2 = i;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] ={5,6,1,2,4,3,5};
        System.out.println(IncreasingTripletSequence.increasingTriplet(a));
    }
}
