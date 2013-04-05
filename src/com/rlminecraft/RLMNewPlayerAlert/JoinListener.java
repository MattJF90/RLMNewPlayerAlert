package com.rlminecraft.RLMNewPlayerAlert;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
	
	private RLMNewPlayerAlert plugin;
	
	public JoinListener (RLMNewPlayerAlert instance) {
		this.plugin = instance;
	}
	
	@EventHandler
	public void onPlayerJoin (PlayerJoinEvent event) {
		Player joiningPlayer = event.getPlayer();
		if (joiningPlayer.hasPlayedBefore()) return;
		for (Player player : plugin.getServer().getOnlinePlayers()) {
			if (player.hasPermission("rlmnewplayeralert.alert")) {
				player.sendMessage(ChatColor.GREEN + joiningPlayer.getName() + ChatColor.LIGHT_PURPLE + " is a new player! Be sure to welcome him to the server.");
			}
		}
	}
	
}
