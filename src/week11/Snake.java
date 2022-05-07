package week11;

import java.util.LinkedList;
import java.util.List;

public class Snake {
	private String name;
	
	private static final List<Snake> snakes = List.of(
		new Snake("Python reguis"),
		new Snake("Pantherophis guttatus"),
		new Snake("Boa constrictor"),
		new Snake("Heterodon nasicus"),
		new Snake("Gongylophis colubrinus"),
		new Snake("Epicrates cenchria"),
		new Snake("Malayopython reticulatus"),
		new Snake("Morelia spilota")
	);
		
	public Snake(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return (name + " Snake");
	}

	public int compare(Snake that) {
		return this.name.compareTo(that.name);
	}

	public static List<Snake> getSnakes() {
		return new LinkedList<>(snakes);
	}

}