package com.pokergame.backend;

import java.util.*;
import java.io.*;

/**
 *
 * @author Joshua Isaac
 */
public class IOHelper {

    private static final String FILENAME = "accounts/players.ser";

    public static void serialize(HashMap<String, Player> players) {
        try {
            FileOutputStream fileOut = new FileOutputStream(FILENAME);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(players);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    } // end serialize

    public static HashMap<String, Player> deserialize() {
        HashMap<String, Player> players = null;
        try {
            FileInputStream fileIn = new FileInputStream(FILENAME);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            players = (HashMap<String, Player>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return players;
    } // end deserialize
    
    public static void serializeThatPlayerYo(Player player) {
        HashMap<String, Player> players = IOHelper.deserialize();
        players.put(player.getUsername(), player);
        IOHelper.serialize(players);
    }
}
