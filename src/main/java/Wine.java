public class Wine {
    private String name;
    private String grape;

    public Wine(String name, String grape) {
        this.name = name;
        this.grape = grape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrape() {
        return grape;
    }
}
