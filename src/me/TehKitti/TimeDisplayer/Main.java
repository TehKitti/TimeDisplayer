package me.TehKitti.TimeDisplayer;

import me.TehKitti.TimeDisplayer.JoinListener;
import me.TehKitti.TimeDisplayer.Main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	String v = "1.1";
	public static Main instance;

	@Override
	public void onDisable() {
		System.out.println("[TimeDisplayer] Version " + v + " of TimeDisplayer disabled!");
	}

	@Override
	public void onEnable() {
		Main.instance = this;
		System.out.println("[TimeDisplayer] Version " + v + " of TimeDisplayer enabled!");
		getServer().getPluginManager().registerEvents(new JoinListener(this),this);

	}

}