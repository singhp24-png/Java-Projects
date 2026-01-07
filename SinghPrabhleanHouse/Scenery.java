import javafx.scene.layout.Pane;

public class Scenery {

	public static void paint(Pane p) {
		Sky.paint(p);
		Ground.paint(p);
		Tree.paint(p, 100, 500);
		Tree.paint(p, 875, 500);
	}
}
