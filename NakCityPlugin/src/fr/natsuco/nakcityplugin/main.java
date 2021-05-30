package fr.natsuco.nakcityplugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.natsuco.nakcityplugin.commands.CommandTest;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("je suis allume");
		getCommand("mairie").setExecutor(new CommandTest());
		getCommand("alert").setExecutor(new CommandTest());
		getCommand("pseudo").setExecutor(new CommandTest());
	}
	
	
	@Override
	public void onDisable() {
		System.out.println("je suis eteint");
	}

}
