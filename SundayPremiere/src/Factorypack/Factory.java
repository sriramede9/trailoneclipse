package Factorypack;

import ShapeInteface.Shape;

public class Factory {

	private Factory(){
		
	}
	
	private static class Innerc{
		private static final Factory facobj=new Factory();
	}
	
	//thread way.
	
	private static volatile Factory fac;
	
	public static Factory getInstancethread() {
		
		if(Factory.fac==null) {
			synchronized(Factory.class) {
				if(Factory.fac==null) {
					Factory.fac=new Factory();
				}
			}
		}
		
		return Factory.fac;
	}
	
	public static Factory getInstance() {
		return Innerc.facobj;
	}
	
	public Shape getShape(String sh) {
		if(sh.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(sh.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
	
	public Shape getSimpleshapes() {
		
		Compositeconcrete concret=new Compositeconcrete();
		
		SimpleSquare simplesquare=new SimpleSquare();
		SimpleRectangle simplerectangle=new SimpleRectangle();
		
		concret.add(simplerectangle);
		concret.add(simplesquare);
		
		return concret;
	}
	
}
