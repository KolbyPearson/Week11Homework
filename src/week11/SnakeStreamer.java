package week11;

import java.util.stream.Collectors;

public class SnakeStreamer {

	public static void main(String[] args) {
		new SnakeStreamer().run();

	}

	private void run() { //@formatter:off
		String names = Snake.getSnakes()
			.stream()
			.map(s -> s.toString())
			.sorted()
			.collect(Collectors.joining(", "));
		//@formatter:on
		System.out.println(names);
	}
}
