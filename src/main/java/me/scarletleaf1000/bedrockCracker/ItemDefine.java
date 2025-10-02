package me.scarletleaf1000.bedrockCracker;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemRarity;
import org.bukkit.inventory.ItemStack;

import java.util.List;


public class ItemDefine {

    public static ItemStack bedrockCracker(){
        var item = new ItemStack(Material.PRISMARINE_SHARD);
        var meta = item.getItemMeta();

        meta.setMaxStackSize(1);
        meta.setRarity(ItemRarity.UNCOMMON);
        meta.addEnchant(Enchantment.UNBREAKING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setItemName("Bedrock Cracker");
        meta.setLore(List.of(
                ChatColor.GRAY + "Can crack 1 piece of bedrock,",
                ChatColor.GRAY + "Allowing it to be mined."
        ));

        item.setItemMeta(meta);
        return item;
    }
}
