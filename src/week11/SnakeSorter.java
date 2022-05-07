package week11;

import java.util.List;

public class SnakeSorter {

	public static void main(String[] args) {
		new SnakeSorter().run();

	}
	
	private void run() {
		
		System.out.println("Original: " + Snake.getSnakes());
		
		sortWithLambda();
		List<Snake> lambdaSnakes = sortWithLambda();
		System.out.println("Lambda: " + lambdaSnakes);

		sortWithMethod();
		List<Snake> methodSnakes = sortWithMethod();
		System.out.println("Method: " + methodSnakes);
			
	}

	private List<Snake> sortWithMethod() {
		List<Snake> snakes = Snake.getSnakes();
		
		snakes.sort(Snake::compare);
		return snakes;
	
	}

	private List<Snake> sortWithLambda() {
		List<Snake> snakes = Snake.getSnakes();
		
		snakes.sort((s1, s2) -> (s1.compare(s2)));
		return snakes;
	}
}
