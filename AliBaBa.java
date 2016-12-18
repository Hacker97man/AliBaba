package ali.baba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AliBaBa {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int T=in.nextInt();
        for(int q1=0;q1<T;q1++)
        { int N = in.nextInt();
        int M = in.nextInt();
        Integer diamond[] = new Integer[N];
        Integer price[] = new Integer[M];
        for (int i = 0; i < N; i++) {
            diamond[i] = in.nextInt();
        }
        for (int i = 0; i < M; i++) {
            price[i] = in.nextInt();
        }
        ArrayList<Integer> diamonds = new ArrayList<>(Arrays.asList(diamond));
        ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(price));
        diamonds.sort( (o1, o2) -> {
            if(o1 > o2) return -1;
            else if (o1 < o2) return 1;
            else return 0;
        });
        prices.sort( (o1, o2) -> {
            if(o1 > o2) return -1;
            else if (o1 < o2) return 1;
            else return 0;
        });
        int result = 0;
        while(!prices.isEmpty() && !diamonds.isEmpty()) {
            int d = diamonds.get(0);
            int p = prices.get(0);
            result += p*d;
            prices.remove(0);
            diamonds.remove(0);
        }
        System.out.println(result);
    } 
}
}
