package me.scarletleaf1000.bedrockCracker;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onRightClic(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if (e.getItem().isSimilar(ItemDefine.bedrockCracker())){
                if (e.getClickedBlock().getType().equals(Material.BEDROCK)){
                    e.getClickedBlock().setType(Material.BLACKSTONE);
                    e.getItem().setAmount(e.getItem().getAmount() -1);
                    e.getPlayer().playSound(e.getClickedBlock().getLocation(), Sound.BLOCK_GRINDSTONE_USE, 1F, 0.5F);
                }else {
                    e.getPlayer().sendMessage(ChatColor.RED + "That block is too weak!");
                }
            }
        }
    }
}
