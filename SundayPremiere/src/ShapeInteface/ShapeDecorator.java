package ShapeInteface;

public abstract class ShapeDecorator implements Shape {
	protected Shape shapeobj;

	public ShapeDecorator(Shape shapeobj) {
		super();
		this.shapeobj = shapeobj;
	}
	
	
}
