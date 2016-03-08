package net.breecko.eersteplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Jump implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			Player player = (Player) sender;
			Location loc = player.getLocation();
			loc.setY(loc.getY() + 10);
			player.teleport(loc);
			Bukkit.broadcastMessage(player.getName() + " has jumped!") ;
			return true;
		} else {
			sender.sendMessage("You must be a player in order to execute this command!");
			return true;
		}
	}
}

