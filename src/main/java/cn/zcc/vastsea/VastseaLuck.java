package cn.zcc.vastsea;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class VastseaLuck extends Plugin {
    public static VastseaLuck vastseaLuck;

    @Override
    public void onLoad() {
        vastseaLuck = this;
        getLogger().info("Luck!!!~");
    }

    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new CommandRuntime("luck"));
    }
}
