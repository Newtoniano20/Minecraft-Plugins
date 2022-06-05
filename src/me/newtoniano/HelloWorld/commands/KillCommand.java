package me.newtoniano.HelloWorld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.newtoniano.HelloWorld.Main;

public class KillCommand implements CommandExecutor{
	
	private Main plugin;
	
	public KillCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("kill").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Command Reserved for players");
			return true;
		}
		Player p = (Player) sender;
		p.setHealth(0);
		return true;
	}

}
