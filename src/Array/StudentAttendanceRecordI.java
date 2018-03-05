package Array;

public class StudentAttendanceRecordI {

    public static boolean checkRecord(String s) {

        int count[] = new int[3];

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'A') {
                count[0]++;
            } else if((s.charAt(i) == 'L' && s.charAt(i-1) == 'L') || (s.charAt(i) == 'L' && s.charAt(i+1) == 'L')) {
                count[1]++;
            } else {
                count[2]++;
            }
        }

        if(count[0]>1 || count[1]>2){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
    }

}

