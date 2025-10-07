package shapedrawer;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 * Model class for Shape Drawer Application
 * Maintains the current shape type and count of shapes drawn
 */
public class ShapeModel {
    private ObjectProperty<String> shapeType;
    private int shapeCount;

    public ShapeModel() {
        this.shapeType = new SimpleObjectProperty<>("Circle");
        this.shapeCount = 0;
    }

    public String getShapeType() {
        return shapeType.get();
    }

    public void setShapeType(String s) {
        shapeType.set(s);
    }

    public ObjectProperty<String> shapeTypeProperty() {
        return shapeType;
    }

    public int getShapeCount() {
        return shapeCount;
    }

    public void incrementShapeCount() {
        shapeCount++;
    }

    public void resetShapeCount() {
        shapeCount = 0;
    }
}
