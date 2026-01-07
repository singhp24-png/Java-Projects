import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Ground {

	public static void paint(Pane p) {
		Rectangle ground = new Rectangle(0, 700, 1000, 300);
		ground.setFill(Color.GREEN);
		p.getChildren().add(ground);
	}
}
