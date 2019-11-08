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
            p.teleport(new Location(p.getWorld(), getRandDouble(), getRandDouble(7, 64), getRandDouble()));
        }
        return true;
    }

    private double getRandDouble(){
        Random rand = new Random();
        return rand.nextDouble();
    }

    private double getRandDouble(double min, double max){
        Random rand = new Random();
        double val = rand.nextDouble();
        if (val < min){
            val = Math.abs(val);
            if(val > max){
                val = max;
            }
        }
        if (val > max){
            val = min + max % (max - min);
        }
        return val;
    }

}
