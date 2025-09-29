package problems;

public class Staircase {

    /**
     * If n = 4
     *      #
     *     ##
     *    ###
     *   ####
     *   Length of the staircase = Height of the staircase
     */
    public static void main(String[] args) {
        staircase(4);
    }
    /**
     * @param n
     *  Find the difference between n and number of # that needs to be printed.
     *  These will be spaces, followed by #
     */
    public static void staircase(int n) {
//        String str = "";
//        for(int i = 1; i < n+1; i++) {
//            str = " ".repeat(n-i) + "#".repeat(i);
//            System.out.println(str);
//        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
