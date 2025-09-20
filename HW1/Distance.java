import java.util.Scanner;

public class Distance {
    /**
     * Ex 18 in 1.2
     *
     * @param parameters
     * @return answer
     */
    public static void  main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double ans = Math.sqrt(x*x + y*y);
        System.out.println(ans);
    }
}
