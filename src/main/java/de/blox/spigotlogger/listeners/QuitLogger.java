package de.blox.spigotlogger.listeners;


import de.blox.spigotlogger.SpigotLogger;
import de.blox.spigotlogger.utils.DiscordExecute;
import de.blox.spigotlogger.utils.DiscordWebhook;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuitLogger implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        DiscordExecute.execute(event.getPlayer(), "quit", null);
    }
}
