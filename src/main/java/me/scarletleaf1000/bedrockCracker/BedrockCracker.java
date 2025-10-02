package me.scarletleaf1000.bedrockCracker;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BedrockCracker extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();
        this.reloadConfig();

        this.getCommand("bedrockcracker").setExecutor(new GiveCommand());
        Bukkit.getServer().getPluginManager().registerEvents(new Listener(), this);
        Crafting.crackerRecipe(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
