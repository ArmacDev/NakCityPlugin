package fr.natsuco.nakcityplugin;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import fr.natsuco.nakcityplugin.commands.CommandTest;
import fr.natsuco.nakcityplugin.events.JoinEvent;

public class main extends JavaPlugin {
	
	
	
	 public ArrayList<Player> invisible_list = new ArrayList<>();
	@Override
	public void onEnable() {
		System.out.println("je suis allume");
		getCommand("mairie").setExecutor(new CommandTest(null));
		getCommand("alert").setExecutor(new CommandTest(null));
		getCommand("pseudo").setExecutor(new CommandTest(null));
		getCommand("vanish").setExecutor(new CommandTest(this));

        getServer().getPluginManager().registerEvents(new JoinEvent(this), this);


		
	}
	
	
	@Override
	public void onDisable() {
		System.out.println("je suis eteint");
	}

}
