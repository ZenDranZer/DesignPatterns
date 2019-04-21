package creational_patterns.builder_pattern;

public class Phone {
    private String model;
    private String ram;
    private String storage;

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
