
public class Sailor extends Person {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sailor(String title, String name, int weight) {
        super(name, weight);
        setTitle(title);
    }

    public Sailor(String name, int weight) {
        super(name, weight);
        setTitle("Shipmate");
    }
    
    public Sailor(String name) {
        super(name);
        setTitle("Shipmate");
    }

    public Sailor(int weight) {
        super(weight);
        setTitle("Shipmate");
    }

    public Sailor() {
        super();
        setTitle("Shipmate");
    }

}
