package fr.natsuco.nakcityplugin.commands;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.natsuco.nakcityplugin.main;

public class CommandTest implements CommandExecutor {
	
	main plugin;

    public CommandTest(main plugin) {
        this.plugin = plugin;
    }
	
	
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
		
		
				if(cmd.getName().equalsIgnoreCase("mairie")) {
						player.teleport(new Location(Bukkit.getWorld("world"), 0, 69, 0));
						player.sendMessage("§e Vous Voici A La Mairie");
						
					}
				
				if(cmd.getName().equalsIgnoreCase("alert")) {
					if(args.length == 0) {
					  player.sendMessage("§4 Erreur /alert <message>");
					}
					if(args.length >= 1) {
						StringBuilder bc = new StringBuilder();
						for(String part: args) {
							bc.append(part + " ");
						}
						
						Bukkit.broadcastMessage("[§e"+ player.getName() + "§f] " + bc.toString());
					}
				}
				
				if(cmd.getName().equalsIgnoreCase("pseudo")) {
					
					if(args.length == 0) {
						  player.sendMessage("§4 Erreur /pseudo <nouveau pseudo>");
						}
					if(args.length >= 1) {
						player.setDisplayName(msg);
						player.sendMessage("§a Vous avez changez votre pseudo");
					}
				}
				
				
				if (plugin.invisible_list.contains(player)){
	                for (Player people : Bukkit.getOnlinePlayers()){
	                    people.showPlayer(plugin, player);
	                }
	                plugin.invisible_list.remove(player);
	                player.sendMessage("Vous etes visible par les autres joueurs !");
	            }else if(!plugin.invisible_list.contains(player)){
	                for (Player people : Bukkit.getOnlinePlayers()){
	                    people.hidePlayer(plugin, player);
	                }
	                plugin.invisible_list.add(player);
	                player.sendMessage("Vous etes maintenant invisble");
	            }
	        }

	        return true;

			
		    }
		}

				



