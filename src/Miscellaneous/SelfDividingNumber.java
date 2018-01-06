package Miscellaneous;

import java.util.List;
import java.util.ArrayList;


public class SelfDividingNumber {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int num = i;
            while(num>0){
                int digit = num%10;
                if(digit==0 || i%digit!=0)
                    break;
                num = num /10;
            }
            if(num==0)
                res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list= SelfDividingNumber.selfDividingNumbers(1,22);
        for(int i =0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
