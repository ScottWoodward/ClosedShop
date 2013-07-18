package com.scottwoodward.closedshop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

/**
 * MerchantInventoryListener.java
 * Purpose: Implements a listener to wait for InventoryOpenEvent and cancel if they involve a villager.
 * 
 * @author Scott Woodward
 * @version 1.0.0
 */
public class MerchantInventoryListener implements Listener{
    
    /**
     * Whenever an inventory is opened, cancel the event if it involves a villager.
     * 
     * @param event The inventory open event to be validated.
     */
    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent event){
        if(event.getInventory().getType() == InventoryType.MERCHANT){
            event.setCancelled(true);
        }
    }
}
