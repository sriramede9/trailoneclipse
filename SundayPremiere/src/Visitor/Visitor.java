package Visitor;

public interface Visitor {
	void accept(Book book);
	void accept(CD cd);
}
