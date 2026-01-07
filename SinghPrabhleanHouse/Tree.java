import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tree {

	public static void paint(Pane p, int x, int y) {

		// Paints the leaves
		IsosTriangle.paint(p, Color.DARKGREEN, x, y + 10, 100, 40);
		IsosTriangle.paint(p, Color.DARKGREEN, x, y + 30, 120, 50);
		IsosTriangle.paint(p, Color.DARKGREEN, x, y + 60, 140, 50);
		IsosTriangle.paint(p, Color.DARKGREEN, x, y + 90, 160, 50);

		// Paints the trunk
		Rectangle trunk = new Rectangle(x - 25, y + 140, 50, 60);
		trunk.setFill(Color.BROWN);
		p.getChildren().add(trunk);
	}
}
