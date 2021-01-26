import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TestFile extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(TestFile.class.getResource("/text_from_textArea.fxml"));

        Parent root = loader.load();

        primaryStage.setTitle("Чат");
        primaryStage.setScene(new Scene(root, 600, 400));

        mainWindowController = loader.getController();
        mainWindowController.setNetwork(network);

        primaryStage.setOnCloseRequest(windowEvent -> network.close());
    }
}
