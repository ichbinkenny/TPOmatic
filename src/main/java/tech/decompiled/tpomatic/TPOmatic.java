package tech.decompiled.tpomatic;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class TPOmatic extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("tech.decompiled.tpomatic.TPOmatic enabled");
        this.getCommand("tpify").setExecutor(this);
    }

    @Override
    public void onDisable(){
        getLogger().info("tech.decompiled.tpomatic.TPOmatic disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arguments){
        getLogger().info(cmd.getLabel() + " received from " + sender.getName());
        if(sender instanceof Player){
            Player p = (Player) sender;
            p.setCustomName("LIL BITCH");
            Random rand = new Random();
            p.teleport(new Location(p.getWorld(), rand.nextDouble(), rand.nextDouble(), rand.nextDouble()));
        }
        return true;
    }

}
