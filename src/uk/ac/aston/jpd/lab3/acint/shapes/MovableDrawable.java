package uk.ac.aston.jpd.lab3.acint.shapes;

public interface MovableDrawable extends Drawable {
	MovableDrawable move(int dx, int dy);
	
	default MovableDrawable moveXY(int d) {
		return move(d, d);
	}
}