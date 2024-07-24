import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

public class Hellpworldtest {
	@Test
	void print() {
		System.out.println("hello");
	}
@RepeatedTest(2)
void show() {
	System.out.println("hi");
}
@Disabled
void demo() {
	System.out.println("welcome");
}
}



