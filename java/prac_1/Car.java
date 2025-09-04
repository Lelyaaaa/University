public class Car
{
    String model;
    String license;
    String color;
    int year;

    public void setModel (String model) {this.model = model;}
    public String getModel() {return model;}

    public void setLicense (String license) {this.license = license;}
    public  String getLicense() {return license;}

    public void setColor (String color) {this.color = color;}
    public String getColor() {return color;}

    public void setYear (int year) {this.year = year;}
    public int getYear() {return year;}

    public Car()
    {
        year = 2010;
    }
    public Car
    (
        String model,
        String license,
        String color,
        int year
    ){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }
    public Car
    (
        String model,
        String color,
        int year
    )
    {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void To_String(){
        System.out.printf("Модель: "+ model + "\nЦвет: " + color + "\nГод: " + year + "\n");
    }
    public void AgeOfCar(){
        System.out.print(2025 - year);
    }


}
