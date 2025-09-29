package problems;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntList();
            String s = "                        ";
            s = s.trim().replaceAll("\\s+", " ");
            String[] arr = s.split("[^A-Za-z]+");
            System.out.println(s);
            System.out.println(s.isEmpty() ? "0" : arr.length);
            for(String str: arr){
                System.out.println(str);
            }
    }
}