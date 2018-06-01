public class Wine {

    private String name;
    private String varietal;
    private int vintage;

    public Wine(String name, String varietal, int vintage) {
        this.name = name;
        this.varietal = varietal;
        this.vintage = vintage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVarietal() {
        return varietal;
    }

    public void setVarietal(String varietal) {
        this.varietal = varietal;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public int getAge(){
        int age = 2018 - vintage;
        return age;
    }
}
