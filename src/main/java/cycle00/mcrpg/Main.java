package cycle00.mcrpg;

import cycle00.mcrpg.currency.Rupee;
import cycle00.mcrpg.listeners.JoinLeave;
import cycle00.mcrpg.utils.ConfigHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Handlers
        new ConfigHandler(this);

        // Listeners
        new JoinLeave(this);

        // Commands


        Rupee.load();
    }
}
