import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class House {

	public static void paint(Pane p) {
		HouseFrame.paint(p);
		Door.paint(p);
		Roof.paint(p);
		Window.paint(p, Color.LIGHTBLUE, 275, 525, 100, 100);
		Window.paint(p, Color.LIGHTBLUE, 590, 525, 100, 100);
		Window.paint(p, Color.LIGHTBLUE, 275, 350, 60, 100);
		Window.paint(p, Color.LIGHTBLUE, 630, 350, 60, 100);
		Window.paint(p, Color.LIGHTBLUE, 480, 400, 40);
	}
}
