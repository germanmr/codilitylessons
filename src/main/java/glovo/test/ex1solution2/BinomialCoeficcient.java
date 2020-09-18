package glovo.test.ex1solution2;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class GFG2 {

    public static void main (String[] args) {
//code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0)
        {
            int n = sc.nextInt();
            int r = sc.nextInt();
            BigInteger nn = new BigInteger("1");
            for(int i=1;i<=n;i++)
            {
                nn = nn.multiply(BigInteger.valueOf(i));
            }
            BigInteger n_r = new BigInteger("1");
            for(int i=1;i<=n-r;i++)
            {
                n_r = n_r.multiply(BigInteger.valueOf(i));
            }
            BigInteger rr = new BigInteger("1");
            for(int i=1;i<=r;i++)
            {
                rr = rr.multiply(BigInteger.valueOf(i));
            }
            BigInteger n_rr = n_r.multiply(rr);
            BigInteger ans = nn.divide(n_rr);
            BigInteger modulo = new BigInteger("1000000007");
            BigInteger res = ans.mod(modulo);
            System.out.println(res);
        }
    }
}