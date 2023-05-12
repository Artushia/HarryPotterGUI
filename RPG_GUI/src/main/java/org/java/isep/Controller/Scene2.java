package org.java.isep.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.java.isep.Model.*;

import java.io.IOException;

public class Scene2 {

    @FXML
    private TextField nameField;
    @FXML
    private TextField wandSize;
    @FXML
    private TextField core;
    @FXML
    private TextField petField;

    SortingHat sortingHat = new SortingHat();
    House house = sortingHat.pickHouse();
    Wizard wizard = new Wizard(100);
    Spell enemySpell = new Spell("TrollSpell", 0.99, 20);
    Enemy troll = new Enemy("Troll", 100, enemySpell);

    @FXML
    private void getWizardInfo(ActionEvent event) throws IOException, NumberFormatException {

        String username = nameField.getText();
        int wandLength = Integer.parseInt(wandSize.getText());
        String coreName = core.getText();
        String petName = petField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/java/isep/fightI.fxml"));
        Parent root = loader.load();

        //Displays user data on scene 3
        Scene3 fightController = loader.getController();
        fightController.displayName(username);
        fightController.displayWandLength(wandLength);
        fightController.displayCoreName(coreName);
        fightController.displayHouseName(house.getName());
        fightController.displayPetName(petName);

        //Creates the two characters for the game
        instantiateWizard(wizard, username, house.getName(), petName, coreName, wandLength);


        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene2 = new Scene(root);
        stage.setScene(scene2);
        stage.show();


    }


    public void instantiateWizard(Wizard wizard, String username, String house, String pet, String core, int wandLength) {
        wizard.setName(username);
        wizard.setHouse(house);
        wizard.setPet(pet);
        wizard.setWand(core);
        wizard.setWandLength(wandLength);
    }




}
