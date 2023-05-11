package org.java.isep.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Scene4 {

    @FXML
    Label endphrase;

    public void displayEndMessage(String phrase) {
        endphrase.setText("You " + phrase + " the game !");
    }



}