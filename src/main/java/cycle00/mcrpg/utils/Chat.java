package cycle00.mcrpg.utils;

import org.bukkit.ChatColor;

public class Chat {
    public static String chat(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
