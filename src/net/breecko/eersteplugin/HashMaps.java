package net.breecko.eersteplugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class HashMaps {
	
	public static Map<UUID,Boolean> AFK = new HashMap<UUID,Boolean>();
	
	public static void addPlayersToMaps(){
		for(Player player: Bukkit.getOnlinePlayers()){
			AFK.put(player.getUniqueId(), false);
		}
	}
}
