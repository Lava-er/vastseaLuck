package cn.zcc.vastsea.message;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;

//Message Sender~~~
public class MessageSender {
    //send message to Player or CommandSender
    public static void sendMessage(CommandSender commandSender, String msg) {
        TextComponent textComponent = new TextComponent(msg.replace("&", "§"));
        commandSender.sendMessage(textComponent);
    }
}
