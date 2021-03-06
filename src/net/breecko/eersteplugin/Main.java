package net.breecko.eersteplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.breecko.eersteplugin.commands.Fly;
import net.breecko.eersteplugin.commands.Jump;
import net.breecko.eersteplugin.commands.Spawn;
import net.breecko.eersteplugin.commands.AFK;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		Bukkit.getLogger().info("Plugin has started!");
		Jump jump = new Jump();
		getCommand("jump").setExecutor(jump);
		Fly fly = new Fly();
		getCommand("fly").setExecutor(fly);
		Spawn spawn = new Spawn();
		getCommand("spawn").setExecutor(spawn);
		AFK afk = new AFK();
		getCommand("afk").setExecutor(afk);
	}
	
	@Override
	public void onDisable(){
		Bukkit.getLogger().info("Plugin has shut down!")
	}	
	
}
