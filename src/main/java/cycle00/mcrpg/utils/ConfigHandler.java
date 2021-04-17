package cycle00.mcrpg.utils;

import cycle00.mcrpg.Main;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigHandler {

    Main plugin;

    private static Map<FileConfiguration, File> configs = new HashMap<>();

    private static FileConfiguration currencyConfig;

    public ConfigHandler(Main plugin) {
        this.plugin = plugin;

        createConfigs();
        plugin.getLogger().info(Chat.chat("&6[ConfigHandler] &fLoaded Configs."));
    }

    public static FileConfiguration getCurrency() {
        return currencyConfig;
    }

    public static void write(FileConfiguration config, Object value, String name) {
        config.set(name, value);

        try {
            config.save(configs.get(config));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createConfigs() {
        File currencyConfigFile = new File(plugin.getDataFolder(), "currency.yml");

        configs.put(currencyConfig, currencyConfigFile);

        if (!currencyConfigFile.exists()) {
            currencyConfigFile.getParentFile().mkdirs();
            plugin.saveResource("currency.yml", false);
        }

        currencyConfig = new YamlConfiguration();
        try {
            currencyConfig.load(currencyConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
