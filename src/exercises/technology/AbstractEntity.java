package exercises.technology;

public abstract class AbstractEntity {
    private int id;
    static int nextId = 1;

    //constructor


    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }

    //getter
    public int getId() {
        return id;
    }


}
