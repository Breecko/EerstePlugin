package net.breecko.eersteplugin.commands;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.breecko.eersteplugin.HashMaps;

public class AFK implements CommandExecutor {

    @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			Player player = (Player) sender;
			UUID uuid = player.getUniqueId();
			if (HashMaps.AFK.get(uuid)){
				HashMaps.AFK.put(uuid,false);
				Bukkit.broadcastMessage(ChatColor.BOLD + "" + ChatColor.YELLOW + player.getName() + " is no longer AFK.");
				return true;
						
			}else {
				HashMaps.AFK.put(uuid, true);
				Bukkit.broadcastMessage(ChatColor.BOLD + "" + ChatColor.YELLOW + player.getName() + " is now AFK.");
				return true;
				
			}
		}else {
			sender.sendMessage("You must be a player in order to execute this command!");
			return true;
		}
    }
			
		
}	
