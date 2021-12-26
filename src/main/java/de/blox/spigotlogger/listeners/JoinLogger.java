package de.blox.spigotlogger.listeners;

import de.blox.spigotlogger.SpigotLogger;
import de.blox.spigotlogger.utils.DiscordExecute;
import de.blox.spigotlogger.utils.DiscordWebhook;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JoinLogger implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        DiscordExecute.execute(event.getPlayer(), "join", null);
    }
}
