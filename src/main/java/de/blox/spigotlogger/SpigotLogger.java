package de.blox.spigotlogger;

import de.blox.spigotlogger.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class SpigotLogger extends JavaPlugin{
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(new File("./plugins/SpigotLogger/config.yml"));
    public static SpigotLogger instance;

    @Override
    public void onEnable() {
        instance = this;
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new CommandLogger(), this);
        pluginManager.registerEvents(new MessageLogger(), this);
        pluginManager.registerEvents(new DeathLogger(), this);
        pluginManager.registerEvents(new BlockBreakLogger(), this);
        pluginManager.registerEvents(new BlockPlaceLogger(), this);
        pluginManager.registerEvents(new JoinLogger(), this);
        pluginManager.registerEvents(new QuitLogger(), this);
        saveResource("config.yml", false);
    }

    public static SpigotLogger getInstance() {
        return instance;
    }

    public YamlConfiguration getYamlConfiguration() {
        return yamlConfiguration;
    }
}
