package me.scarletleaf1000.bedrockCracker;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player p) {
            if (p.hasPermission("bedrockcracker.give")) {
                p.getInventory().addItem(ItemDefine.bedrockCracker());
                return true;
            }
        }
        sender.sendMessage(ChatColor.RED + "Command Failed");
        return true;
    }
}
