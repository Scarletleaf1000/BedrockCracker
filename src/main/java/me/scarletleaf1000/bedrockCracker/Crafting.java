package me.scarletleaf1000.bedrockCracker;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import static org.bukkit.Bukkit.getServer;

public class Crafting {

    public static void crackerRecipe(Plugin plugin){
        var item = ItemDefine.bedrockCracker();

        var key = new NamespacedKey(plugin, "cracker_recipe");
        var recipe = new ShapedRecipe(key, item);

        recipe.shape("DDD", "DPD", "RNR");

        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('P', Material.DIAMOND_PICKAXE);
        recipe.setIngredient('R', Material.REDSTONE_BLOCK);
        recipe.setIngredient('N', Material.NETHERITE_SCRAP);

        if (plugin.getConfig().getBoolean("CraftableCracker"))
            getServer().addRecipe(recipe);
    }
}
