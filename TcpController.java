/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulations.sockets_TCP;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;;
import javafx.stage.Stage;

public class TcpController implements Initializable {

    public void initialize(URL url, ResourceBundle rb)
    {
        //todo
    }

    @FXML
    private void startEventHandler(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/start.fxml"));
        Scene start_tcp = new Scene(root);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(start_tcp);
        app_stage.show();
    }

    @FXML
    private void aboutEventHandler(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/about.fxml"));
        Scene about_scene = new Scene(root);
        Stage app_stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        app_stage.setScene(about_scene);
        app_stage.show();
    }

    @FXML
    private void TestEventHandler(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/demotcp.fxml"));
        Scene about_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(about_scene);
        app_stage.show();
    }

    @FXML
    private void actionHandler(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/newSimulation/newSimulation.fxml"));
        Scene about_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(about_scene);
        app_stage.show();
    }
}

