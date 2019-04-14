
public class Person {

    private String name = "unknown";
    private int weight = 0;

    public String getName() {
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person(String name, int weight) {
        setName(name);
        setWeight(weight);
    }
    
    public Person(String name) {
        setName(name);
        setWeight(180);
    }
    
    public Person(int weight) {
        setName("This person's name is unknown");
        setWeight(weight);
    }
    
    public Person() {
        setName("This person's name is unknown");
        setWeight(180);
    }

}