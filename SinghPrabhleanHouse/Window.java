import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Window {

	public static void paint(Pane p, Color c, int x, int y, int width, int height) {
		Rectangle baseWindow = new Rectangle(x, y, width, height);
		baseWindow.setFill(c);

		// Calculated an array using the parameters from the paint class and finds the
		// midpoints per window line
		Line windowLine1 = new Line((x + (double) (width / 2)), y, (x + (double) (width / 2)), (y + height));
		Line windowLine2 = new Line(x, (y + (double) (height / 2)), (x + width), (y + (double) (height / 2)));

		p.getChildren().addAll(baseWindow, windowLine1, windowLine2);
	}

	public static void paint(Pane p, Color c, int x, int y, int radius) {
		Circle baseWindow = new Circle(x, y, radius);
		baseWindow.setFill(c);

		// Calculated an array using the parameters from the paint class and finds the
		// points per window line
		Line windowLine1 = new Line((x + radius), y, (x + -radius), y);
		Line windowLine2 = new Line(x, (y + radius), x, (y - radius));

		p.getChildren().addAll(baseWindow, windowLine1, windowLine2);
	}
}
