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

    public void setName(String name) {
        this.name = name;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public void setFilipinoGrade(double filipinoGrade) {
        this.filipinoGrade = filipinoGrade;
    }

    public void setMapehGrade(double mapehGrade) {
        this.mapehGrade = mapehGrade;
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
