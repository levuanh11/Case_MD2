package model;

import model.Person;

import java.io.Serializable;

public class PreventiveDoctor extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idPreventiveDoctor;
    private String positionPreventiveDoctor;
    private int levelSalaryPreventiveDoctor;
    private int salaryPreventiveDoctor;

    public PreventiveDoctor() {
    }

    public PreventiveDoctor(String idPreventiveDoctor, String positionPreventiveDoctor, int levelSalaryPreventiveDoctor, int salaryPreventiveDoctor) {
        this.idPreventiveDoctor = idPreventiveDoctor;
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
        this.salaryPreventiveDoctor = salaryPreventiveDoctor;
    }

    public PreventiveDoctor(String name, int age, String address, String gender, String phone, String idPreventiveDoctor, String positionPreventiveDoctor, int levelSalaryPreventiveDoctor, int salaryPreventiveDoctor) {
        super(name, age, address, gender, phone);
        this.idPreventiveDoctor = idPreventiveDoctor;
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
        this.salaryPreventiveDoctor = salaryPreventiveDoctor;
    }

    public PreventiveDoctor(Person person, String idPreventiveDoctor, String positionPreventiveDoctor, int levelSalaryPreventiveDoctor) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.idPreventiveDoctor = idPreventiveDoctor;
        this.positionPreventiveDoctor = positionPreventiveDoctor;
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
        this.salaryPreventiveDoctor = salaryPreventiveDoctor;
    }

    public String getPositionPreventiveDoctor() {
        return positionPreventiveDoctor;
    }

    public void setPositionPreventiveDoctor(String positionPreventiveDoctor) {
        this.positionPreventiveDoctor = positionPreventiveDoctor;
    }

    public int getLevelSalaryPreventiveDoctor() {
        return levelSalaryPreventiveDoctor;
    }

    public void setLevelSalaryPreventiveDoctor(int levelSalaryPreventiveDoctor) {
        this.levelSalaryPreventiveDoctor = levelSalaryPreventiveDoctor;
    }

    public String getIdPreventiveDoctor() {
        return idPreventiveDoctor;
    }

    public void setIdPreventiveDoctor(String idPreventiveDoctor) {
        this.idPreventiveDoctor = idPreventiveDoctor;
    }

    public int getSalaryPreventiveDoctor() {
        return salaryPreventiveDoctor;
    }

    public void setSalaryPreventiveDoctor(int salaryPreventiveDoctor) {
        this.salaryPreventiveDoctor = salaryPreventiveDoctor;
    }

    @Override
    public String toString() {
        return "B??c s?? {" +
                "M?? b??c s?? d??? ph??ng='" + idPreventiveDoctor + '\'' +
                ", T??n='" + super.getName() + '\'' +
                ", Tu???i=" + super.getAge() +
                ", ?????a ch???='" + super.getAddress() + '\'' +
                ", Gi???i t??nh=" + super.getGender() +
                ", S??? ??i???n tho???i='" + super.getPhone() + '\'' +
                ", V??? tr??='" + positionPreventiveDoctor + '\'' +
                ", C???p b???c l????ng='" + levelSalaryPreventiveDoctor + '\'' +
                ", M???c l????ng='" + getSalaryPreventiveDoctor() + '\'' +
                '}';
    }
}
