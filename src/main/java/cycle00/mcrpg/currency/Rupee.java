package cycle00.mcrpg.currency;

import cycle00.mcrpg.utils.ConfigHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Rupee {
    public static Map<UUID, Integer> currencyMap = new HashMap<>();

    public static void load() {
        for (String path : ConfigHandler.getCurrency().getKeys(false)) {
            currencyMap.put(UUID.fromString(path), ConfigHandler.getCurrency().getInt(path));
        }
    }

    public static void add(UUID player, int amount) {
        currencyMap.put(player, currencyMap.get(player) + amount);
    }

    public static void remove(UUID player, int amount) {
        currencyMap.put(player, currencyMap.get(player) - amount);
    }

    public static void save() {
        // TODO
    }
}
