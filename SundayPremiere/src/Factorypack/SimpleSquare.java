package Factorypack;

import ShapeInteface.AbstractShape;
import ShapeInteface.Observr;
import ShapeInteface.Shape;

class SimpleSquare extends AbstractShape implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Simple Square");
	}

	@Override
	public void addObservr(Observr ob) {
		// TODO Auto-generated method stub
		this.addObserver(ob);
	}

}
