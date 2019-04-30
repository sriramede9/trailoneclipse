package ShapeInteface;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractShape implements Shape {
// this is where helper methods come to help
	//
	
	//now Observer. think some gui and make sure they are all intrested in Draw
	
	List<Observr> obslist=new ArrayList();
	
	public void addObserver(Observr obs) {
		obslist.add(obs);
	}
	
	public void removeObserver(Observr obs) {
		obslist.remove(obs);
	}
	
	public void set() {
		System.out.println("Set method with is called by Concrete subject Object in our case Gui guy");
		
		notifyidiots();
	}

	private void notifyidiots() {
		// TODO Auto-generated method stub
		for(Observr j:obslist) {
			j.update();
		}
	}
}
