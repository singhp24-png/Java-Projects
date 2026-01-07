import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Roof {

	public static void paint(Pane p) {

		Rectangle chimney = new Rectangle(630, 150, 100, 120);
		chimney.setFill(Color.BLACK);

		Ellipse smoke1 = new Ellipse(680, 120, 50, 15);
		smoke1.setFill(Color.GREY);

		Ellipse smoke2 = new Ellipse(750, 90, 50, 15);
		smoke2.setFill(Color.GREY);

		Ellipse smoke3 = new Ellipse(810, 60, 50, 15);
		smoke3.setFill(Color.GREY);

		p.getChildren().addAll(chimney, smoke1, smoke2, smoke3);

		IsosTriangle.paint(p, Color.ORANGE, 490, 100, 600, 200);

	}
}
