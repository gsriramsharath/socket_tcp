package simulations.sockets_TCP;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import simulations.sockets_TCP.popup_start;

import javafx.event.ActionEvent;


import javafx.scene.input.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.EventListener;
import java.util.ResourceBundle;


public class StartController implements Initializable {

    @FXML
    private BorderPane scenePane;

    @FXML
    private JFXButton StartTcp;

    private popup_start pop;





    @FXML
    public void socketEventHandler(javafx.event.ActionEvent event) throws Exception {
//        popup.display("Stage 1 : Socket", "creates a new communication point for \n both client and server");
        pop = new popup_start();
        pop.setTitle("Stage 1 : Socket ");
        pop.setMessage("Server and client create a stream socket s with the socket() call \n int sockid = socket(family, type, protocol);");
        pop.start((Stage)scenePane.getScene().getWindow());

    }

    @FXML
    public void bindEventHandler(javafx.event.ActionEvent event) throws Exception {
        pop = new popup_start();
        pop.setTitle("Stage 2 : Bind ");
        pop.setMessage("(Optional for client) Sever bind socket s to a local address with the bind() call.\n int status = bind(sockid, &addrport, size);\n");
        pop.start((Stage)scenePane.getScene().getWindow());

    }

    @FXML
    public void listenEventHandler(javafx.event.ActionEvent event) {
        popup.display("Stage 3 : Listen ", "Server uses the listen() call to alert the TCP/IP machine of the willingness to accept connections.\n Client connects socket s to a foreign host with the connect() call.\nint status = listen(sockid, queueLimit);\nint status = connect(sockid, &foreignAddr, addrlen);");
    }

    @FXML
    public void acceptEventHandler(javafx.event.ActionEvent event) {
        popup.display("Stage 4 : Accept ", " Server accepts the connection and receives a second socket, for example ns, \n with the accept() call.\nint s = accept(sockid, &clientAddr, &addrLen); ");
    }
    @FXML
    public void sendEventHandler(javafx.event.ActionEvent event) {
        popup.display("Stage 5 : Send ", "Server reads and writes data on socket ns, client reads and writes data on socket s,\n by using send() and recv() calls, until all data has been exchanged.\nint count = send(sockid, msg, msgLen, flags);");
    }

    @FXML
    public void closeEventHandler(javafx.event.ActionEvent event) {
        popup.display("Stage 6 : Close ", "Sever closes socket ns with the close() call. Client closes socket s and end \n the TCP/IP session with the close() call. Go to stage 4.\nstatus = close(sockid);\n");
    }

    @FXML
    public void receiveEventHandler(javafx.event.ActionEvent event) {
        popup.display("Stage 7 : Recieve ", "Server reads and writes data on socket ns, client reads and writes data on socket s,\n by using send() and recv() calls, until all data has been exchanged.int count = recv(sockid, recvBuf, bufLen, flags);");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }
    @FXML
    public void BackEventHandler(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("/simulations/sockets_TCP/tcp.fxml"));
            Scene about_scene = new Scene(root);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(about_scene);
            app_stage.show();
    }
}


