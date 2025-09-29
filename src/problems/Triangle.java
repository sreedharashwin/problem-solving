package problems;

public class Triangle {

    /**
     *  Print this triangle
     *          *
     *          **
     *          ***
     *          ****
     *          *****
     *          ******
     */
    public static void main(String[] args) {
       int n  = 6;
       /*  for (int i = 1; i <= n; i++) { //line
            for (int j = 1; j <= i; j++) { //number of * on each line
                System.out.print("*");
            }
            System.out.println();
        }*/

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append("*".repeat(i));
            builder.append(System.lineSeparator());
        }
        System.out.println(builder.toString());
    }
}
