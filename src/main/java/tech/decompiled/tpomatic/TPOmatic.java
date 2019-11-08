package tech.decompiled.tpomatic;

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

}
