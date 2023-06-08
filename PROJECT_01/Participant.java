package PROJECT_01;

// Participant class as a subclass
public class Participant {

    private String name;
    private String Id;

    public Participant(String name,String Id) {
        this.name = name;
        this.Id = Id;
        //training_course
    }

    public String getName() {
        return name;
    }
    
    public String getId() {
        return Id;
    }
}
