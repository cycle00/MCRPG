package cycle00.mcrpg.listeners;

import cycle00.mcrpg.Main;
import cycle00.mcrpg.currency.Rupee;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinLeave implements Listener {
    public JoinLeave(Main plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if (!Rupee.currencyMap.containsKey(p.getUniqueId())) {
            Rupee.add(p.getUniqueId(), 0);
        }
    }
}
