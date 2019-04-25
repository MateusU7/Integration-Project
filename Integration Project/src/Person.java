
/**
 * An instance of this object class represents a person that has a name and
 * weight.
 * 
 * @author Mateus Urbanski
 */

public class Person {

  // The first and last name of this Person.
  private String name = "unknown";
  // The weight of this Person in pounds.
  private int weight = 0;

  /**
   * Gets the first and last name of this Person.
   * 
   * @return this Person's name.
   */
  public String getName() {
    return name;
  }

  /**
   * Changes the name of this Person.
   * 
   * @param name This Person's new name. Should include first and last name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the weight of this Person.
   * 
   * @return this Person's weight.
   */
  public int getWeight() {
    return weight;
  }

  /**
   * Changes the weight of this Person.
   * 
   * @param weight This Person's new weight in pounds.
   */
  public void setWeight(int weight) {
    this.weight = weight;
  }

  /**
   * Creates a new Person with a custom name and weight.
   * 
   * @param name   This Person's new name. Should include first and last name.
   * @param weight This Person's new weight in pounds.
   */
  public Person(String name, int weight) {
    setName(name);
    setWeight(weight);
  }

  /**
   * Creates a new Person with a custom name and a default weight.
   * 
   * @param name This Person's new name. Should include first and last name.
   */
  public Person(String name) {
    setName(name);
    setWeight(180);
  }

  /**
   * Creates a new Person with an unknown name and a custom weight.
   * 
   * @param weight This Person's new weight in pounds.
   */
  public Person(int weight) {
    setName("This person's name is unknown");
    setWeight(weight);
  }

  // Creates a new Person with an unknown name and default weight.
  public Person() {
    setName("This person's name is unknown");
    setWeight(180);
  }

}