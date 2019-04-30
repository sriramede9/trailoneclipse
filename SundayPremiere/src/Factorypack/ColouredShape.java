package Factorypack;

import ShapeInteface.Observr;	
import ShapeInteface.Shape;
import ShapeInteface.ShapeDecorator;

public class ColouredShape extends ShapeDecorator implements Shape {

	private String color;
	
	public ColouredShape(Shape shapeobj,String color) {
		super(shapeobj);
		// TODO Auto-generated constructor stub
		this.color=color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//super.draw();
		shapeobj.draw();
		System.out.println("drawing the coloured shape with"+this.color);
	}

	@Override
	public void addObservr(Observr ob) {
		// TODO Auto-generated method stub
		
	}

}
