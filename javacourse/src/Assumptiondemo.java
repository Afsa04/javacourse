import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class Assumptiondemo {
	
	@Test
	void testonassum() {
	int a=5, s=25;
		
	Assumptions.assumeTrue(s==a*a);
	System.out.println("it will display");
	}
		@Test
		void testonassumption() {
			int a=5,b=8;
			Assumptions.assumingThat(a==b,()->{System.out.println("testing a==b");});
		}
	}

	


