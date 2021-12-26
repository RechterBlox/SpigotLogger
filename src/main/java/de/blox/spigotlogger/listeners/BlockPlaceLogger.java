package de.blox.spigotlogger.listeners;

import de.blox.spigotlogger.SpigotLogger;
import de.blox.spigotlogger.utils.DiscordExecute;
import de.blox.spigotlogger.utils.DiscordWebhook;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BlockPlaceLogger implements Listener {

    @EventHandler
    public void onPlaceBlock(BlockPlaceEvent event) {
        DiscordExecute.execute(event.getPlayer(), "placeBlock", event.getBlock().getType() +  "\\n" + event.getBlock().getLocation());
    }
}
