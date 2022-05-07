package week11;

import java.util.NoSuchElementException;
import java.util.Optional;

public class SnakeOptional {

	public static void main(String[] args) {
		new SnakeOptional().run();

	}

	private void run() {
		Snake snake = snakeMethod(Optional.of(new Snake("Thamnophis radix")));
		System.out.println("I have a " + snake);
		
		try {
			snakeMethod(Optional.empty());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Snake snakeMethod(Optional<Snake> snakeOptional) {
		return snakeOptional.orElseThrow(
				() -> new NoSuchElementException("This snake does not exist"));
	}
}
