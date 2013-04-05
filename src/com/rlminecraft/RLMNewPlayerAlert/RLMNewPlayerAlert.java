package com.rlminecraft.RLMNewPlayerAlert;

import org.bukkit.plugin.java.JavaPlugin;

public class RLMNewPlayerAlert extends JavaPlugin {
	
	public void onEnable () {
		this.getServer().getPluginManager().registerEvents(new JoinListener(this), this);
	}
	
	
	public void onDisable () {
	}
	
}
