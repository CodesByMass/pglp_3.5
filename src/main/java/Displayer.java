/**
 * Implements the interface Logging to redefine the display method.
 *
 * @see Logging
 *
 * @author Mass'
 *
 * @version 1.1
 *
 */
public class Displayer implements Logging {

  public Displayer() {};

  /**
   * Prints the message.
   * 
   * @param message a string to be printed
   * 
   * @see Logging#display(String)
   * 
   */
  @Override
  public void display(String message) {
    // TODO Auto-generated method stub
    System.out.println(message);
  }

}
