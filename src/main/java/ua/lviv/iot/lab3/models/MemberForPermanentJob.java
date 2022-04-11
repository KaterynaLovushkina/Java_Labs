package ua.lviv.iot.lab3.models;

public class MemberForPermanentJob extends PositionInformation {
    private WorkingProjects workingProjects;
    private double salaryPerMonthsInUAH;

    public MemberForPermanentJob(String occupation, String name, int age, String educationDegree, int workExperience,double salaryPerMonthsInUAH) {
        super(occupation, name, age, educationDegree, workExperience);
        this.salaryPerMonthsInUAH=salaryPerMonthsInUAH;
    }

    public double getSalary() {
        return salaryPerMonthsInUAH;
    }

    public void setSalary(double salaryPerMonthsInUAH) {
        this.salaryPerMonthsInUAH = salaryPerMonthsInUAH;
    }

    @Override
    public String toString() {
        return "Member{" +
                " Occupation:'" +this.getOccupation() + '\'' +
                ", Name:'" + this.getName() + '\'' +
                ", Age:" + this.getAge() +
                ", EducationDegree:'" + this.getEducationDegree() + '\'' +
                ", WorkExperience:" + this.getWorkExperience() +
                "  Salary per month:" + salaryPerMonthsInUAH+" UAH" +
                '}';
    }
}