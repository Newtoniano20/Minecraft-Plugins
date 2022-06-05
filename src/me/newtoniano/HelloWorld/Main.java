package me.newtoniano.HelloWorld;

import org.bukkit.plugin.java.JavaPlugin;

import me.newtoniano.HelloWorld.commands.HelloCommand;
import me.newtoniano.HelloWorld.commands.HubCommand;
import me.newtoniano.HelloWorld.commands.KillCommand;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
    	new HelloCommand(this);
    	new HubCommand(this);
    	new KillCommand(this);
     }
}
