package Strings;

import java.util.List;
import java.util.ArrayList;

public class KeyboardRow {

    public static String[] findWords(String[] words){
        String topRow = "QWERTYUIOPqwertyuiop", middleRow = "ASDFGHJKLasdfghjkl", bottomRow = "ZXCVBNMzxcvbnm";
        int top=0, middle=0, bottom=0;
        List<String> list = new ArrayList<String>();
        for(String word: words){
            for(int i=0;i<word.length();i++){
                if(topRow.contains(word.charAt(i)+"")){
                    top++;
                }
                else if(middleRow.contains(word.charAt(i)+"")) {
                    middle++;
                } else if(bottomRow.contains(word.charAt(i)+"")){
                    bottom++;
                }
            }
            if(top == word.length() || middle == word.length() || bottom == word.length())
                list.add(word);
            top=0; middle=0; bottom=0;
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String a[] = {"Hello", "Alaska", "Dad", "Peace"};
        String res[] = KeyboardRow.findWords(a);
        for(String r : res){
            System.out.print(r+" ");
        }
    }
}
