package com.vauff.timedisplayer.core;

import org.bukkit.plugin.java.JavaPlugin;

import com.vauff.timedisplayer.listeners.CommandPreprocessListener;
import com.vauff.timedisplayer.listeners.PlayerJoinListener;

public class Main extends JavaPlugin
{
	public static String v = "1.2";

	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
		getServer().getPluginManager().registerEvents(new CommandPreprocessListener(), this);
	}
}