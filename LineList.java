import java.util.ArrayList;

public class LineList {

	ArrayList<String> l; 
	
	public LineList(){
		l = new ArrayList<String>();
	}
	
	public int size(){
		
		return l.size();
	}
	
	public String get(int k){
		
		return l.get(k);
		}
	
	public void add(String line){
		
		l.add(line);
	}
	
	public String remove(int k){
	
		return l.remove(k);
	}
	
	public void move(int index, int newIndex){
		
		for(int i = 0; i < l.size(); i++){
			if(newIndex < index){
				index--;
			}
			else if(newIndex >= index){
				index++;
			}
		}
	}
	
	public String toString(){
		
		return l.toString();
	}
	public static void main(String[] args){
		LineList ll = new LineList();
		ll.add("hi");
		ll.add("ink");
		ll.add("jar");
		System.out.println(ll);
		ll.move(0 , 2);
		System.out.println(ll);
	}
}
