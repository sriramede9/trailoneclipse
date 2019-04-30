package Factorypack;

import java.util.ArrayList;
import java.util.List;

import ShapeInteface.IteratorInterface;
import ShapeInteface.Shape;

class ConcreteIterator implements IteratorInterface {

	private List<Shape> privatelist;
	
	
	private int index;
	
	public ConcreteIterator(List<Shape> privatelist) {
		super();
		privatelist=new ArrayList();
		this.privatelist = privatelist;
	}
	

	@Override
	public boolean hasnext1() {
		// TODO Auto-generated method stub
		return index<privatelist.size()-1;
	}

	@Override
	public Object next1() {
		// TODO Auto-generated method stub
		Shape sh=privatelist.get(index);
		index++;
		return sh;
	}

	

}
