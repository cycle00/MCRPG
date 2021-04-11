package cycle00.mcrpg.utils;

import cycle00.mcrpg.Main;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConfigHandler {

    Main plugin;

    private static FileConfiguration currencyConfig;

    public ConfigHandler(Main plugin) {
        this.plugin = plugin;

        createConfigs();
        plugin.getLogger().info("[ConfigHandler] Loaded Configs.");
    }

    public static FileConfiguration getCurrency() {
        return currencyConfig;
    }

    public static void writeBool(FileConfiguration config, Boolean value, String name) {
        config.
    }

    public static void writeInt(FileConfiguration config, int value, String name) {

    }

    public static void writeDouble(FileConfiguration config, double value, String name) {

    }

    public static void writeString(FileConfiguration config, String value, String name) {

    }

    public static void writeStringList(FileConfiguration config, List<String> value, String name) {

    }

    private void createConfigs() {
        File currencyConfigFile = new File(plugin.getDataFolder(), "currency.yml");

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
