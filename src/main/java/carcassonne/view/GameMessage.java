package carcassonne.view;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import carcassonne.model.tile.Tile;
import carcassonne.model.tile.TileType;

/**
 * Message class for showing the user small messages.
 * @author Timur Saglam
 */
public final class GameMessage {
    private static final int GAME_ICON_SIZE = 75;
    private static final String TITLE = "Carcassonne";

    private GameMessage() {
        // private constructor ensures non-instantiability!
    }

    /**
     * Asks the user for text input.
     * @param messageText is the custom message.
     * @return the user input string.
     */
    public static String getUserInput(String messageText) {
        return JOptionPane.showInputDialog(null, messageText, TITLE, JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Shows a custom error message.
     * @param messageText is the message text.
     */
    public static void showError(String messageText) {
        show(messageText, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Shows a custom plain message.
     * @param messageText is the message text.
     */
    public static void showMessage(String messageText) {
        show(messageText, JOptionPane.DEFAULT_OPTION);
    }

    /**
     * Shows a custom warning message.
     * @param messageText is the message text.
     */
    public static void showWarning(String messageText) {
        show(messageText, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Creates a game icon for dialogs.
     * @return the game {@link Icon}.
     */
    public static Icon getGameIcon() {
        return new Tile(TileType.Null).getScaledIcon(GAME_ICON_SIZE);
    }

    private static void show(String messageText, int type) {
        JOptionPane.showMessageDialog(null, messageText, TITLE, type, getGameIcon());
    }
}
