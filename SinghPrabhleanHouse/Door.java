import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Door {

	public static void paint(Pane p) {
		Rectangle door = new Rectangle(430, 500, 100, 200);
		door.setFill(Color.BROWN);

		Circle doorKnob = new Circle(510, 600, 8);
		doorKnob.setFill(Color.YELLOW);

		p.getChildren().addAll(door, doorKnob);

	}
}
