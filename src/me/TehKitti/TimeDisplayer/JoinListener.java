package me.TehKitti.TimeDisplayer;

import me.TehKitti.TimeDisplayer.Main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
	Main main;

	public JoinListener(Main plugin) {
		this.main = plugin;
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Bukkit.dispatchCommand(player, "playtimetop 10");
	}
}
