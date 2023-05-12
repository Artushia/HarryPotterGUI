package org.java.isep.Controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.java.isep.Controller.Scene2;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.java.isep.Model.*;
import org.java.isep.Model.Character;

import java.io.IOException;
import java.util.Random;

public class Scene3 {

    @FXML
    private Label wizName;
    @FXML
    private Label wandSize;
    @FXML
    private Label coreLabel;
    @FXML
    private Label houseLabel;
    @FXML
    private Label petLabel;
    @FXML
    private Label damage1;
    @FXML
    private Label damage2;
    @FXML
    private Label wizardlifepoints;
    @FXML
    private Label trolllifepoints;

    private static final Random rand = new Random();

    public Scene3() throws IOException {
    }

    //Display wizard's info
    public void displayName(String username) {
        wizName.setText("Hello " + username + " !");
    }
    public void displayWandLength(int length) {
        wandSize.setText("Wand length : " + length + " cm");
    }
    public void displayCoreName(String coreName) {
        coreLabel.setText("Core name : " + coreName);
    }
    public void displayHouseName(String housename) {
        houseLabel.setText("House : " + housename);
    }
    public void displayPetName(String petname) {
        petLabel.setText("Pet : " + petname);
    }

    //import wizard
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/java/isep/character-traits.fxml"));
    Parent root = loader.load();

    //Imports main character
    Scene2 scene2Controller = loader.getController();
    Wizard fighter = scene2Controller.wizard;
    Enemy troll = scene2Controller.troll;


    public void attack(Character character, Spell spell) {
        if (getRandomZeroOne(spell.getPercentSuccess()) == 1) {
            character.setHp((character.getHp() - spell.getDamage()));
        }
    }

    //Method that return 0 if random float is less than 1 - percent success or 1 if random float is higher than 1 - percent success
    public static int getRandomZeroOne(double percentSuccess) {
        return (rand.nextDouble() >= (1 - percentSuccess)) ? 1 : 0;
    }

    public boolean isAlive(Character character) {
        return character.getHp() > 0;
    }

    private void syncFight(Wizard wizard, Enemy enemy) throws IOException {
        int wizHealthBeforeAttack = wizard.getHp();
        int trollHealthBeforeAttack = troll.getHp();
        displayHealthPoints1(wizHealthBeforeAttack);
        displayHealthPoints2(trollHealthBeforeAttack);
        if (isAlive(wizard)) {
                attack(enemy, wizard.getKnownSpells().get(0));
                displayAttackDamage1(trollHealthBeforeAttack - enemy.getHp());
        } else {
            redirectToGameOverScene("LOST");
        }

        //enemy fights back if he has lives
        if (isAlive(enemy)) {
            attack(wizard, enemy.getSpell());
            if (wizard.getHp() <= 0) {
                redirectToGameOverScene("LOST");
            } else {
            displayAttackDamage2(wizHealthBeforeAttack - wizard.getHp());}
        } else {
            redirectToGameOverScene("WIN");
        }
        displayHealthPoints1(wizard.getHp());
        displayHealthPoints2(troll.getHp());

    }

    private void redirectToGameOverScene(String state) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/java/isep/final-page.fxml"));
        Parent root = loader.load();
        Scene finalscene = new Scene(root);

        Stage currentStage = (Stage) wizName.getScene().getWindow();
        currentStage.setScene(finalscene);
        currentStage.show();

        //Modifies label on last page
        Scene4 finalpage = loader.getController();
        finalpage.displayEndMessage(state);
    }

    //Method sync to attack button
    public void attackButton(ActionEvent event) throws IOException {
        syncFight(fighter, troll);
    }

    //Method for displaying text
    public void displayAttackDamage1(int damage) {damage1.setText("You lost " + damage + " hp");}
    public void displayAttackDamage2(int damage) {damage2.setText("You lost " + damage + " hp");}
    public void displayHealthPoints1(int health) {wizardlifepoints.setText("❤" +" "+ health);}
    public void displayHealthPoints2(int health) {trolllifepoints.setText("❤"+ " " + health);}

}


