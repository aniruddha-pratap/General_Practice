package Set;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {

    public static String getHint(String secret, String guess) {
        int bull=0, cow=0;
        int cows[] = new int[10];
        for(int i =0;i<secret.length();i++) {
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            } else {
                if(cows[Character.getNumericValue(secret.charAt(i))] < 0)
                    cow++;
                if(cows[Character.getNumericValue(guess.charAt(i))] >0)
                    cow++;
                cows[Character.getNumericValue(secret.charAt(i))]++;
                cows[Character.getNumericValue(guess.charAt(i))]--;
            }
        }
        return bull+"A"+cow+"B";
    }

    public static void main(String[] args) {
        System.out.println(BullsAndCows.getHint("1123", "0111"));
    }
}
