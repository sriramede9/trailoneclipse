package Visitor;

public class Book implements Visitable {

	private int price;
	
	public Book(int price) {
		super();
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		v.accept(this);
	}

}
