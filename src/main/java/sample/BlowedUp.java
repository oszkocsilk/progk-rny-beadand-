package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Blows the bomb is you choose it.
 */
public class BlowedUp implements mezo{

    private Aknakereso aknakereso;

    /**
     *Calls the created @aknakereso.
     * @param aknakereso the created Aknakereso
     */
    public BlowedUp(Aknakereso aknakereso) {
        this.aknakereso = aknakereso;
    }

    /**
     * This watches when you chose a bomb and shows that is a bomb.
     */
    public void Blowed() {
        for (int x = 0; x < aknakereso.getMezo().length; x++) {
            for (int y = 0; y < aknakereso.getMezo().length; y++) {
                aknakereso.getMezo()[x][y].setDisable(true);

                if (counter[x][y] == 666) {

                    aknakereso.getMezo()[x][y].setText("X");
                    aknakereso.getMezo()[x][y].setStyle("-fx-background-color: #ff0000");
                }
            }
        }
    }

    /**
     *
     * @param title az új ablak címe
     * @param message az új ablak üzenete
     */
    public static void display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close this window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}
