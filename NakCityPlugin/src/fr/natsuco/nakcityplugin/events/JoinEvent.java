package fr.natsuco.nakcityplugin.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.natsuco.nakcityplugin.main;

public class JoinEvent implements Listener {
	  main plugin;

	    public JoinEvent(main plugin) {
	        this.plugin = plugin;
	    }

	    @EventHandler
	    public void PlayerJoin(PlayerJoinEvent e){
	        Player player = e.getPlayer();
	        for (int i = 0; i < plugin.invisible_list.size(); i++){
	            player.hidePlayer(plugin, plugin.invisible_list.get(i));
	        }
	    }



}
