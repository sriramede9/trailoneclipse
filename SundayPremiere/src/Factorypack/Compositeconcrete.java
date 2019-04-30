package Factorypack;

import java.util.ArrayList;
import java.util.List;

import ShapeInteface.AbstractShape;
import ShapeInteface.ComponentInterface;
import ShapeInteface.IteratorInterface;
import ShapeInteface.Observr;
import ShapeInteface.Shape;

class Compositeconcrete extends AbstractShape implements ComponentInterface,Shape {
	
	List<Shape> Simpleshapelist=new ArrayList();

	@Override
	public void add(Shape sh) {
		// TODO Auto-generated method stub
		Simpleshapelist.add(sh);
	}

	@Override
	public void remove(Shape sh) {
		// TODO Auto-generated method stub
		Simpleshapelist.remove(sh);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(Shape f:Simpleshapelist) {
			f.draw();
		}
	}

	@Override
	public IteratorInterface getList() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(Simpleshapelist);
	}

	@Override
	public void addObservr(Observr ob) {
		// TODO Auto-generated method stub
		
	}

}
