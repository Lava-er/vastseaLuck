package cn.zcc.vastsea;

import cn.zcc.vastsea.message.MessageSender;
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
        String s = "&b瀚海&8>> &f%player_name%您今日的幸运值是&a%player_luck%&f.";
        int luck = getLuck("2957202260");
        s = s.replace("%player_name%", commandSender.getName()).replace("%player_luck%", String.valueOf(luck));
        MessageSender.sendMessage(commandSender, s);
    }


    //Test Block

    public int getLuck(String bindQQ) {
        String seedCode = bindQQ + DateFormat.getNowDate("yyyy-MM-dd");
        String seedMd5 = Md5Code.strToMd5(seedCode).substring(0, 8);
        long seed = new BigInteger(seedMd5, 16).longValue();

        long m = 4294967296L;
        long a = 1103515245L;
        long c = 12345L;

        double v = (((a * seed) + c) % m) / ((double) (m - 1));
        return (int) (v * 100);
    }
}
