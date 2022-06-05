package me.newtoniano.HelloWorld.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.newtoniano.HelloWorld.Main;

public class HubCommand implements CommandExecutor {
	private Main plugin;
	
	public HubCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hub").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Command Reserved for players");
			return true;
		}
		Player p = (Player) sender;
		p.sendMessage("initialising Teleport");
		p.teleport(new Location(Bukkit.getWorld("world"), 0, 90, 0, 0, 0));
		return true;
	}

}
