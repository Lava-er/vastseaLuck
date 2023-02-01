package cn.zcc.vastsea;

import cn.zcc.vastsea.util.DateFormat;
import cn.zcc.vastsea.util.Md5Code;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

import java.math.BigInteger;

public class CommandRuntime extends Command {
    public CommandRuntime(String name) {
        super(name);
    }

    public void execute(CommandSender commandSender, String[] strings) {

    }


    //Test Block

    public int getLuck(long bindQQ) {
        long playerBindQQ = 2957202260L;
        String seedCode = playerBindQQ + DateFormat.getNowDate("yyyy-MM-dd");
        String seedMd5 = Md5Code.strToMd5(seedCode).substring(0, 8);
        long seed = new BigInteger(seedMd5, 16).longValue();

        long m = 4294967296L;
        long a = 1103515245L;
        long c = 12345L;

        double v = (((a * seed) + c) % m) / ((double) (m - 1));
        return (int) (v * 100);
    }
}
