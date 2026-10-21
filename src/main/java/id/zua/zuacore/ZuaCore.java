package id.zua.zuacore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ZuaCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ZuaCore berhasil diaktifkan!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ZuaCore telah dimatikan.");
    }

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args
    ) {
        if (command.getName().equalsIgnoreCase("zuacore")) {
            sender.sendMessage(
                ChatColor.LIGHT_PURPLE
                + "✦ ZuaCore berhasil berjalan!"
            );
            return true;
        }

        return false;
    }
}
