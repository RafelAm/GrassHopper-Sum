import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
        GrassHopper.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
        GrassHopper.summation(8));
    }
}


public class GrassHopper {

    public static int summation(int n) {

      int res = 0;
      for(int i = 1;i<=n ; i++){
        res += i;
      }
      
      
        return res;
    }
}
