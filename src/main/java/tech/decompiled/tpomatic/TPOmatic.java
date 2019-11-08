package tech.decompiled.tpomatic;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class TPOmatic extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("tech.decompiled.tpomatic.TPOmatic enabled");
    }

    @Override
    public void onDisable(){
        getLogger().info("tech.decompiled.tpomatic.TPOmatic disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arguments){
        getLogger().info(cmd.getLabel() + " received from " + sender.getName());
        return true;
    }

}
