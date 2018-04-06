package simulations.sockets_TCP;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutController extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void hamburgerHandler(MouseEvent mouseEvent) {
    }

    @FXML
    public void backEventHandler(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/tcp.fxml"));
        Scene about_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(about_scene);
        app_stage.show();
    }
}
