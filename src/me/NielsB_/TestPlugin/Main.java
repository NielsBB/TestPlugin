package me.NielsB_.TestPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        //onEnable
    }

    @Override
    public void onDisable() {
        //onDisable


        ggg
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("allahuakbar")) {
            sender.sendMessage(ChatColor.RED + "ALLAHU AKBAR");
            return true;
        }
        return true;
    }
}
