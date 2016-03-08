package net.breecko.eersteplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			Player player = (Player) sender;
			if (player.getAllowFlight()){
				player.setAllowFlight(false);
				player.sendMessage("Flight has been turned off.");
				return true;	
			} else {
				player.setAllowFlight(true);
				player.sendMessage("Flight has been turned on.");
				return true;
			}
		} else {
			sender.sendMessage("You must be a player in order to execute this command!");
		    return true;
		}
	}

}