package de.blox.spigotlogger.listeners;

import de.blox.spigotlogger.SpigotLogger;
import de.blox.spigotlogger.utils.DiscordExecute;
import de.blox.spigotlogger.utils.DiscordWebhook;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DeathLogger implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        DiscordExecute.execute(event.getPlayer(), "death", event.getDeathMessage());
    }
}
