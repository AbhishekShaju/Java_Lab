package tempconverter;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Model class for Temperature Converter
 * Maintains bidirectional conversion between Celsius and Fahrenheit
 */
public class TempModel {
    private final DoubleProperty celsius;
    private final DoubleProperty fahrenheit;
    private boolean isUpdating = false; // Prevent circular updates

    public TempModel() {
        this.celsius = new SimpleDoubleProperty(0.0);
        this.fahrenheit = new SimpleDoubleProperty(32.0);

        // Bidirectional binding with conversion logic
        setupBindings();
    }

    private void setupBindings() {
        // When Celsius changes, update Fahrenheit
        celsius.addListener((obs, oldVal, newVal) -> {
            if (!isUpdating) {
                isUpdating = true;
                double f = celsiusToFahrenheit(newVal.doubleValue());
                fahrenheit.set(f);
                isUpdating = false;
            }
        });

        // When Fahrenheit changes, update Celsius
        fahrenheit.addListener((obs, oldVal, newVal) -> {
            if (!isUpdating) {
                isUpdating = true;
                double c = fahrenheitToCelsius(newVal.doubleValue());
                celsius.set(c);
                isUpdating = false;
            }
        });
    }

    public void setCelsius(double value) {
        celsius.set(value);
    }

    public void setFahrenheit(double value) {
        fahrenheit.set(value);
    }

    public double getCelsius() {
        return celsius.get();
    }

    public double getFahrenheit() {
        return fahrenheit.get();
    }

    public DoubleProperty celsiusProperty() {
        return celsius;
    }

    public DoubleProperty fahrenheitProperty() {
        return fahrenheit;
    }

    public void reset() {
        isUpdating = true;
        celsius.set(0.0);
        fahrenheit.set(32.0);
        isUpdating = false;
    }

    // Conversion formulas
    private double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    private double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
}
