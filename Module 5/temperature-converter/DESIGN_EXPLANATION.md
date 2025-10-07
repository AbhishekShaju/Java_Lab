# Design Explanation - Temperature Converter

## Binding Rationale

**Bidirectional Property Binding:**
The core innovation of this design is the use of bidirectional property binding between the model's DoubleProperty values (celsius/fahrenheit) and the view's TextField text properties. This eliminates the need for manual event handlers to read and write values.

**Model-Level Conversion:**
The TempModel implements automatic conversion through property listeners. When celsius changes, it automatically calculates and updates fahrenheit (and vice versa). The isUpdating flag prevents circular updates that would otherwise cause infinite recursion.

**String-to-Number Conversion:**
The controller uses NumberStringConverter to handle TextField.textProperty() binding to DoubleProperty. This built-in converter manages the string-to-double and double-to-string transformations automatically, with error handling for invalid input.

**Benefits:**
- Real-time synchronization: Typing in either field immediately updates both the model and the other field
- Minimal code: No manual event handlers needed for value updates
- Data consistency: The model is always the single source of truth
- Type safety: StringConverter ensures proper number formatting and parsing

**Reset Functionality:**
The reset button simply calls model.reset(), which sets both properties to their default values (0°C = 32°F). Thanks to bidirectional binding, the UI updates automatically.

This architecture demonstrates JavaFX's powerful property binding system, where UI and data stay synchronized through declarative bindings rather than imperative event handling.
