package TestPack;

import Factorypack.ColouredShape;
import Factorypack.ConcreteObservr;
import Factorypack.Factory;
import ShapeInteface.ComponentInterface;
import ShapeInteface.Shape;
import ShapeInteface.AbstractShape;

public class FactoryAndSingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square=Factory.getInstance().getShape("square");
		
		square.draw();
		
		
	
		Shape SimpleShapeobjects=Factory.getInstance().getSimpleshapes();
		
		SimpleShapeobjects.draw();
		
		 //((ComponentInterface) SimpleShapeobjects).getList().remove(0); 
		// now iterator comes to picture
		ConcreteObservr co=new ConcreteObservr();
		
		square.addObservr(co);
		
		((AbstractShape) square).set();
		
			ColouredShape cs=new ColouredShape(square,"Blue");
			
			cs.draw();
		
	}

}
 