package new_imm_proj;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * Approval Screen class.
 */
public class ScreenApprover extends Application {
    /**
     * Shows the approval screen for the immigrant request.
     * @param primaryStage      The stage of the screen
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Request Approved");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Request Approved");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method of the approval screen.
     * Displays the screen
     * @param args      Command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
