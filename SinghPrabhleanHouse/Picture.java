import javafx.animation.PathTransition;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Picture {

	public static void paint(Pane p) {
		Scenery.paint(p);
		House.paint(p);

		// Displays my name
		Text name = new Text(10, 200, "Prabhlean Singh");

		name.setFont(Font.font(20));

		PathTransition animation = new PathTransition(Duration.millis(1000), new Line(100, 200, 100, 100), name);

		p.getChildren().add(name);
		animation.setCycleCount(1);
		animation.play();
	}

}
