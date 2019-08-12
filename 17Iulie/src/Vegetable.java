import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vegetable extends Product {
    private String name;
    private List<String> vitaminList;

    public Vegetable(String name) {
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getVitaminList() {
        return vitaminList;
    }

    public void setVitaminList(List<String> vitaminList) {
        this.vitaminList = vitaminList;

    }
}