import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class IsosTriangle {

	public static void paint(Pane p, Color c, int x, int y, int base, int height) {

		// Have to cast double for polygon constructor
		double[] points = { (double) x, (double) y, (double) (x + base / 2), (double) (y + height),
				(double) (x - base / 2), (double) (y + height), };

		// Adds points to the polygon
		Polygon isosTriangle = new Polygon(points);

		isosTriangle.setFill(c);

		p.getChildren().add(isosTriangle);

	}
}
