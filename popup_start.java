package simulations.sockets_TCP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class popup_start extends Application {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    private String message = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title = "";

    popup_start(){

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        popup.display(getTitle(),getMessage());
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/start.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
