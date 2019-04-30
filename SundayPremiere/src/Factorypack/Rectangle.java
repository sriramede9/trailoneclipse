package Factorypack;

import ShapeInteface.AbstractShape;
import ShapeInteface.Observr;
import ShapeInteface.Shape;

class Rectangle extends AbstractShape implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle!");
	}

	@Override
	public void addObservr(Observr ob) {
		// TODO Auto-generated method stub
		this.addObserver(ob);
	}

}
