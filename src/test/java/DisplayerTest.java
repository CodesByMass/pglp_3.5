import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DisplayerTest {


  @Test
  public void testDisplay() {
    Displayer temp = new Displayer();
    assertEquals(temp.display("Test"), "Test");
  }

}
