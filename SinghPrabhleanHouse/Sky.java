import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sky {
	public static void paint(Pane p) {
		Rectangle sky = new Rectangle(0, 0, 1000, 1000);
		sky.setFill(Color.CORNFLOWERBLUE);
		p.getChildren().add(sky);
	}
}
