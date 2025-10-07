package com.example.colorswitcher;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MainController {

    @FXML
    private Rectangle colorRectangle;

    @FXML
    private ToggleButton switchColorButton;

    @FXML
    private Label colorLabel;

    private Color currentColor = Color.RED;

    @FXML
    private void initialize() {
        updateUI();
    }

    @FXML
    private void handleToggleColor() {
        if (currentColor.equals(Color.RED)) {
            currentColor = Color.BLUE;
        } else {
            currentColor = Color.RED;
        }
        updateUI();
    }

    private void updateUI() {
        colorRectangle.setFill(currentColor);
        colorLabel.setText(currentColor.equals(Color.RED) ? "Red" : "Blue");
    }
}