package collections;

public class SimplePositiveQueue {
	//private int lenght;   Это свойство не используется!
	
	private int first;
	private int middle;
	private int last;
	
	public SimplePositiveQueue() {
		//lenght = 0;
		first = -1;
		middle = -1;
		last = -1;
	}
	public boolean push (int value) {
		if(value < 0) {
			System.err.println("ERROR");
			return false;
		}
		if (first < 0) {
			first = value;
			return true;
		}
		else if (middle < 0) {
			middle = value;
			return true;
		}
		else if(last < 0) {
			last = value;
		}
		return false;
	}
	public int poll() {
		if (first >= 0) {
			int first_tmp = first;
			first = middle;
			middle = last;
			last = -1;
			return first_tmp;
		}
		return -1;
	}
}
