import java.util.Scanner;


public class WaterMelon {
    public static void main( String[] args ){Scanner scan = new Scanner( System.in );
        int weight = scan.nextInt();
        OddOrEven oddOrEven1 = new OddOrEven();
        String massage = oddOrEven1.oddOrEven( weight );
        System.out.print( massage );
    }
}
class OddOrEven {
    public String oddOrEven( int weight ){
        if ( weight != 2 && weight % 2 ==0 )
            return "YES";
        else return "NO";
    }
}