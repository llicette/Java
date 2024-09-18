class Car {
    final int CURRENT_YEAR = 2024;

    private String model;
    private String license;
    private String color;
    private int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        System.out.println("Констуктор со всеми аргументами");
    }

    public Car() {
        this.model = "ГАЗель Бизнес";
        this.license = "В994КО";
        this.color = "Красный";
        this.year = 2010;
        System.out.println("Пустой констуктор");
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.license = "А231ВС";
        this.color = "Чёрный";
        System.out.println("Констуктор с произвольными полями");
    }

    public void To_String() {
        System.out.println(model + " " + license + " " + color + " " + year);
    }

    public int getAge() {
        return CURRENT_YEAR - this.year;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        var car_1 = new Car("Bentley Flying Spur", "К517УО", "Оранжевый", 2019);
        var car_2 = new Car();
        var car_3 = new Car("КамАЗ-65224", 2005);

        System.out.println("_____________________________");

        car_1.To_String();
        System.out.println("Возраст автомобиля: " + car_1.getAge() + "\n");

        car_2.To_String();
        System.out.println("Возраст автомобиля: " + car_2.getAge() + "\n");

        car_3.To_String();
        System.out.println("Возраст автомобиля: " + car_3.getAge());

        System.out.println("_____________________________");

        System.out.println(car_1.getColor());
        System.out.println(car_2.getModel());
        car_2.setModel("КрАЗ Т17.0ЕХ «Бурлак»");
        System.out.println(car_2.getModel());
    }
}