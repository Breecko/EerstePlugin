package net.breecko.eersteplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.breecko.eersteplugin.commands.Jump;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		Bukkit.getLogger().info("Plugin has started!");
		Jump jump = new Jump();
		getCommand("jump").setExecutor(jump);
	}
	
	@Override
	public void onDisable(){
		//Not relevant for now
	}	
	
}
