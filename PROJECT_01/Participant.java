package PROJECT_01;

// Participant class as a subclass
public class Participant {

    private String name;
    private Integer Id;

    public Participant(String name,Integer Id) {
        this.name = name;
        this.Id = Id;
        //training_course
    }

    public String getName() {
        return name;
    }
    
    public Integer getId() {
        return Id;
    }
}
