package ShapeInteface;

import java.util.List;

public interface ComponentInterface extends Shape  {
	void add(Shape sh);
	void remove(Shape sh);
	void draw();
	IteratorInterface getList();
}
