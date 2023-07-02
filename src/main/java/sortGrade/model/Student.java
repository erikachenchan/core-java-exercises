package sortGrade.model;

public class Student {

    private int userId;
    private String name;
    private double englishGrade;
    private double mathGrade;
    private double scienceGrade;

    public Student(int userId, String name, double englishGrade, double mathGrade, double scienceGrade) {
        this.userId = userId;
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;

    }

    public int getUserId() {
        return userId;
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

    public void setUserId(int userId) {
        this.userId = userId;
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


    public double calculateGrade() {
        double sum = (getEnglishGrade() + getMathGrade() + getScienceGrade());
        double calculateGradeAvg = sum / 3;
        return calculateGradeAvg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", englishGrade=" + englishGrade +
                ", mathGrade=" + mathGrade +
                ", scienceGrade=" + scienceGrade +
                '}';
    }
}
