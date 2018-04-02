import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	void tryWithResourcesByJava7() throws IOException {

		try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
			// do something
		}
	}

	// final or effectively final이 적용되어 reader 참조를 사용할 수 있음
	void tryWithResourcesByJava9() throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		try (reader) {
			// do something
		}
	}
}
