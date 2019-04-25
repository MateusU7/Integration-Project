
/**
 * This object class is an extension of the Person class, representing a sailor
 * that has a title in addition to name and weight.
 * 
 * @author Mateus Urbanski
 */

public class Sailor extends Person {

  // The job of this sailor.
  private String title;

  /**
   * Gets the title of this Sailor.
   * 
   * @return this Person's weight.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Changes the title of this Sailor.
   * 
   * @param title This Sailor's new title on the ship.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Creates a new Sailor with a custom name, weight, and title.
   * 
   * @param name   This Sailor's new name. Should include first and last name.
   * @param weight This Sailor's new weight in pounds.
   * @param title  This Sailor's new title on the ship.
   */
  public Sailor(String title, String name, int weight) {
    super(name, weight);
    setTitle(title);
  }

  /**
   * Creates a new Sailor with a custom name, custom weight and default title.
   * 
   * @param name   This Sailor's new name. Should include first and last name.
   * @param weight This Sailor's new weight in pounds.
   */
  public Sailor(String name, int weight) {
    super(name, weight);
    setTitle("Shipmate");
  }

  /**
   * Creates a new Sailor with a custom name, default weight and default title.
   * 
   * @param name This Sailor's new name. Should include first and last name.
   */
  public Sailor(String name) {
    super(name);
    setTitle("Shipmate");
  }

  /**
   * Creates a new Sailor with an unknown name, custom weight and default title.
   * 
   * @param weight This Sailor's new weight in pounds.
   */
  public Sailor(int weight) {
    super(weight);
    setTitle("Shipmate");
  }

  // Creates a new Sailor with an unknown name, default weight and default title
  public Sailor() {
    super();
    setTitle("Shipmate");
  }

}
