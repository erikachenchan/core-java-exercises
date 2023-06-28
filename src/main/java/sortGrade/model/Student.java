package sortGrade.model;

public class Student {

    private String name;
    private double englishGrade;
    private double mathGrade;
    private double scienceGrade;
    private double filipinoGrade;
    private double mapehGrade;

    public Student(String name, double englishGrade, double mathGrade, double scienceGrade, double filipinoGrade, double mapehGrade) {
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.filipinoGrade = filipinoGrade;
        this.mapehGrade = mapehGrade;
    }

    public String getName() {
        return name;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getFilipinoGrade() {
        return filipinoGrade;
    }

    public double getMapehGrade() {
        return mapehGrade;
    }

    public double calculateGrade() {
        double sum = (getEnglishGrade() + getMathGrade() + getScienceGrade() + getFilipinoGrade() + getMapehGrade());
        double calculateGradeAvg = sum / 5;
        return calculateGradeAvg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", englishGrade=" + englishGrade +
                ", mathGrade=" + mathGrade +
                ", scienceGrade=" + scienceGrade +
                ", filipinoGrade=" + filipinoGrade +
                ", mapehGrade=" + mapehGrade +
                '}';
    }


}
