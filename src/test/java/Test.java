import cn.zcc.vastsea.util.DateFormat;
import cn.zcc.vastsea.util.Md5Code;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        long playerBindQQ = 2957202260L;
        String seedCode = playerBindQQ + DateFormat.getNowDate("yyyy-MM-dd");
        String seedMd5 = Md5Code.strToMd5(seedCode).substring(0, 8);
        long seed = new BigInteger(seedMd5, 16).longValue();

        long m = 4294967296L;
        long a = 1103515245L;
        long c = 12345L;

        double v = (((a * seed) + c) % m) / ((double) (m - 1));
        System.out.println(v * 100);
    }
}
