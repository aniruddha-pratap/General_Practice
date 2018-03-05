package Strings;

import java.util.Arrays;

public class ValidStrings {

    public static boolean isAnagram(String s, String t) {
        /*int count[] = new int[28];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<t.length();i++){
            if(count[i]<0)
                return false;
        }
        return true;*/

        //noob method
        char st[] = s.toCharArray();
        char tt[] = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        for(int i=0;i<st.length;i++){
            if(st[i] != tt[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidStrings.isAnagram("car", ""));
    }

}
