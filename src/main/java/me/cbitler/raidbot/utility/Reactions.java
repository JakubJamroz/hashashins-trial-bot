package me.cbitler.raidbot.utility;

import me.cbitler.raidbot.RaidBot;
import net.dv8tion.jda.core.entities.Emote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reactions {
    /**
     * List of reactions representing classes
     */
    static String[] specs = {
        "StamDK",
        "MagDK",
        "StamSorc",
        "MagSorc",
        "Stamblade",
        "Magblade",
        "Stamplar",
        "Magplar",
        "StamWarden",
        "MagWarden"
    };

    /**
     * Get an emoji from it's emote name via JDA
     * @param name The name of the emoji
     * @return The emote object representing that emoji
     */
    private static Emote getEmoji(String name) {
        return RaidBot.getInstance().getJda().getEmotesByName(name, true).get(0);
    }

    /**
     * Get the list of reaction names as a list
     * @return The list of reactions as a list
     */
    public static List<String> getSpecs() {
        return new ArrayList<>(Arrays.asList(specs));
    }

    /**
     * Get the list of emote objects
     * @return The emotes
     */
    public static List<Emote> getEmotes() {
        return Arrays
                .stream(specs)
                .map(Reactions::getEmoji)
                .collect(Collectors.toList());
    }


}
