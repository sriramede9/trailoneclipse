package Visitor;

public class CD implements Visitable {

	private int price;
	
	
	public CD(int price) {
		super();
		this.price = price;
	}

	

	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		v.accept(this);
	}

}
