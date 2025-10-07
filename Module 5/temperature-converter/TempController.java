package tempconverter;

import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

/**
 * Controller class for Temperature Converter
 * Handles bidirectional binding between view and model
 */
public class TempController {
    private final TempModel model;
    private final TempView view;

    public TempController(TempModel model, TempView view) {
        this.model = model;
        this.view = view;

        initializeBindings();
        initializeEventHandlers();
    }

    private void initializeBindings() {
        // Create bidirectional string converter for numbers
        StringConverter<Number> converter = new NumberStringConverter() {
            @Override
            public Number fromString(String value) {
                try {
                    return super.fromString(value);
                } catch (NumberFormatException e) {
                    return 0.0; // Default value on invalid input
                }
            }
        };

        // Bind Celsius field to model's celsius property (bidirectional)
        view.getCelsiusField().textProperty().bindBidirectional(
            model.celsiusProperty(), 
            converter
        );

        // Bind Fahrenheit field to model's fahrenheit property (bidirectional)
        view.getFahrenheitField().textProperty().bindBidirectional(
            model.fahrenheitProperty(), 
            converter
        );
    }

    private void initializeEventHandlers() {
        // Reset button action
        view.getResetButton().setOnAction(event -> {
            model.reset();
        });

        // Optional: Add focus listeners to select all text when field is focused
        view.getCelsiusField().focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (isNowFocused) {
                view.getCelsiusField().selectAll();
            }
        });

        view.getFahrenheitField().focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (isNowFocused) {
                view.getFahrenheitField().selectAll();
            }
        });
    }
}
