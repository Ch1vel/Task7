package web.model;

public class Car {

    private String model;

    private int series;

    private String yearOfIssue;

    public Car() {
    }

    public Car(String model, int series, String yearOfIssue) {
        this.model = model;
        this.series = series;
        this.yearOfIssue = yearOfIssue;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }
}
