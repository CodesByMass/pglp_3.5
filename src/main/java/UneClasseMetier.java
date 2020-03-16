import java.time.LocalDateTime;

/**
 * A class with a high abstraction level.
 *
 * @author Mass'
 *
 * @version 1.0
 *
 */
public class UneClasseMetier {

  public UneClasseMetier() {

  };

  /**
   * A method that respects the DIP principle.
   */
  public void uneMethodeMetier() {
    Logging l = new Displayer();
    l.display(LocalDateTime.now() + " Début d'une méthode métier");
    // Traitement métier
    l.display(LocalDateTime.now() + " Fin d'une méthode métier");
  }

  public static void main(String[] args) {
    UneClasseMetier exemple = new UneClasseMetier();
    exemple.uneMethodeMetier();

  }

}
