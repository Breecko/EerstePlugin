package net.breecko.eersteplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			Player player = (Player) sender;
			World world = Bukkit.getServer().getWorld("world");
			Location loc = new Location(world, 0, 75, 0);
			player.teleport(loc);
			player.sendMessage(ChatColor.GOLD + "You have been warped to Spawn!");
			return true;
					
		}else {
			sender.sendMessage("You must be a player in order to execute this command!");
			return true;
		}
	}

}

