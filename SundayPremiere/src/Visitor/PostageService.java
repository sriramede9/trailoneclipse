package Visitor;

public class PostageService implements Visitor {

	private int total;
	
	@Override
	public void accept(Book book) {
		// TODO Auto-generated method stub
		total+=book.getPrice()*10;
	}

	@Override
	public void accept(CD cd) {
		// TODO Auto-generated method stub
		total+=cd.getPrice()*5;
	}
	
	public int gettotal() {
		return total;
	}

	


}
