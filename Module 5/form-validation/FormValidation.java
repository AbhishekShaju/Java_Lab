package formvalidation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Mini Form Validation Application
 * Validates email format and provides visual feedback
 */
public class FormValidation extends Application {

    private TextField emailField;
    private Label statusLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mini Form Validation");

        // UI Components
        Label titleLabel = new Label("Email Validation Form");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label emailLabel = new Label("Enter Email:");
        emailLabel.setStyle("-fx-font-size: 14px;");

        emailField = new TextField();
        emailField.setPromptText("example@domain.com");
        emailField.setPrefWidth(300);

        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 10 20;");

        statusLabel = new Label("");
        statusLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        // Event Handler
        submitButton.setOnAction(event -> {
            validateEmail();
        });

        // Allow Enter key to submit
        emailField.setOnAction(event -> {
            validateEmail();
        });

        // Layout
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));
        root.getChildren().addAll(
            titleLabel,
            emailLabel,
            emailField,
            submitButton,
            statusLabel
        );

        root.setStyle("-fx-background-color: #f5f5f5;");

        // Scene and Stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Validates email format and updates status label
     * Valid if contains @ and .
     */
    private void validateEmail() {
        String email = emailField.getText();

        if (email != null && !email.trim().isEmpty()) {
            // Check if email contains both @ and .
            if (email.contains("@") && email.contains(".")) {
                // Valid email
                statusLabel.setText("Valid");
                statusLabel.setTextFill(Color.GREEN);
            } else {
                // Invalid email
                statusLabel.setText("Invalid");
                statusLabel.setTextFill(Color.RED);
            }
        } else {
            // Empty input
            statusLabel.setText("Invalid");
            statusLabel.setTextFill(Color.RED);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
