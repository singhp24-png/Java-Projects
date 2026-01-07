import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HouseFrame {

	public static void paint(Pane p) {
		Rectangle frame = new Rectangle(215, 300, 550, 400);
		frame.setFill(Color.DARKSLATEGRAY);

		p.getChildren().add(frame);
	}
}
