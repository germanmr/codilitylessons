package glovo.test.ex1solution2;
// JAVA Code for Dynamic Programming |
// Set 9 (Binomial Coefficient)
import java.util.*;

public class DPBinomialCoefficient {


    static int binomialCoeff(int n, int k)
    {
        int C[] = new int[k + 1];

        // nC0 is 1
        C[0] = 1;

        for (int i = 1; i <= n; i++)
        {
            // Compute next row of pascal
            // triangle using the previous row
            for (int j = Math.min(i, k); j > 0; j--)
                C[j] = C[j] + C[j-1];
        }
        return C[k]%10^9+7;
    }

    /* Driver program  */
    public static void main(String[] args)
    {
        int n = 5, k = 3;
        System.out.printf("Value of C(%d, %d) is %d "
                , n, k, binomialCoeff(n, k));
    }
}
