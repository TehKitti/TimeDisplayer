package com.vauff.timedisplayer.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandPreprocessListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCommandPreprocess(PlayerCommandPreprocessEvent event)
	{
		Player sender = event.getPlayer();

		if (event.getMessage().equalsIgnoreCase("/playtimetop"))
		{
			event.setCancelled(true);
			Bukkit.dispatchCommand(sender, "playtimetop 10");
		}
	}
}