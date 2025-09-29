package problems;

public class TimeConversion {

    /**
     *
     * @param s
     * If the time is 07:48:05PM, it should print 19:48:05
     * If the time is 12:03:08AM, it should print 00:03:08
     */

    public static String convert (String s) {
        String str = "";
        int hours = Integer.parseInt(s.substring(0, 2));
        String substringed = s.substring(2, s.length() - 2);
        if (s.endsWith("PM") && hours != 12) {
            str += 12 + Integer.parseInt(s.substring(0, 2));
            str += substringed;
        } else if (s.endsWith("AM") && hours == 12) {
            str += "00";
            str += substringed;
        } else {
            str += s.substring(0, s.length() - 2);
        }
        return str;
    }
    public static void main(String[] args){
        System.out.println ("06:40:03AM");

    }
    }
