package Visitor;

import java.util.ArrayList;
import java.util.List;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostageService ps=new PostageService();
		
		List<Visitable> ls=new ArrayList();
		
		Book b=new Book(80);
		CD cd=new CD(20);
		
		ls.add(cd);
		ls.add(b);
		
		for(Visitable l:ls) {
			l.visit(ps);
		}
		
		System.out.println(ps.gettotal());
	}

}
