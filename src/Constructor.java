import java.util.List;

public class Constructor {

   private String name;
   private int cm;
   private String color;



    public Constructor(String name, int cm, String color) {
        this.name = name;
        this.cm = cm;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", cm=" + cm +
                ", color=" + color +
                '}';
    }
}
