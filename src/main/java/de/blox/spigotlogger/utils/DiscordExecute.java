package de.blox.spigotlogger.utils;

import de.blox.spigotlogger.SpigotLogger;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DiscordExecute {
    private String url;
    public static void execute(Player player, String title, String message) {
        if (SpigotLogger.getInstance().getYamlConfiguration().getBoolean(title + "Logger")) {
            DiscordWebhook discordWebhook = new DiscordWebhook(SpigotLogger.getInstance().getYamlConfiguration().getString(title + "Logger-DiscordWebhook"));
            DiscordWebhook.EmbedObject embedObject = new DiscordWebhook.EmbedObject();
            String[] ips = String.valueOf(Objects.requireNonNull(player.getAddress()).getAddress()).split("/");
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            embedObject.setTitle(title);
            embedObject.setDescription(message);
            embedObject.setAuthor("Get IP", "https://ipinfo.io/"+ ips[1], null);
            embedObject.setFooter(player.getName() + " " + formatter.format(date), "https://cravatar.eu/helmavatar/" + player.getName() + ".png");
            discordWebhook.addEmbed(embedObject);
            discordWebhook.setUsername("SpigotLogger");
            discordWebhook.setAvatarUrl("https://img.icons8.com/doodle/452/multi-edit--v1.png");
            try {
                discordWebhook.execute();
            } catch (IOException ignored) {
            }
        }

    }
}
