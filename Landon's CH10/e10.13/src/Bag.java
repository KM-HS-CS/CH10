import java.util.ArrayList;


public class Bag {
	
	
	public class item {
		private String name_;
		private int quantity_;
		public item(String name, int quantity) {
			name_ = name;
			quantity_ = quantity;
		}
		public boolean is(String name) {
			if (name == this.name_) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	ArrayList<item> stuff = new ArrayList<item>();
	
	public void add(String itemName) {
		boolean found = false;
		for (item thing: stuff) { //Could change this to stop once it's found but it's fine for this small project
			if (thing.is(itemName)) {
				found = true;
				thing.quantity_++;
			}
		}
		if (found == false) { stuff.add(new item(itemName, 1));}
	}
	
	public int count(String item) {
		for (item thing: stuff) { 
			if (thing.is(item)) {
				return thing.quantity_;
				
			}
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		Bag person = new Bag();
		for (int i = 0; i<10;i++) {
			person.add("Lettuce");
		}
		System.out.println(person.count("Lettuce"));
		
	}
}
