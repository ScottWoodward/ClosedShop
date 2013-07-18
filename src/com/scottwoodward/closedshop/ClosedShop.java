package com.scottwoodward.closedshop;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * ClosedShop.java
 * Purpose: Registers inventory listeners
 * 
 * @author Scott Woodward
 * @version 1.0.0
 */
public class ClosedShop extends JavaPlugin{
    
    /**
     * Enables the plugin, and registers the MerchantInventoryListener with the server.
     */
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new MerchantInventoryListener(), this);
    }
}
