package model;

import java.io.Serializable;

public class Doctor extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idDoctor;
    private String positionDoctor;
    private int levelSalaryDoctor;
    private int salaryDoctor;

    public Doctor() {
    }

    public Doctor(String idDoctor, String positionDoctor, int levelSalaryDoctor, int salaryDoctor) {
        this.idDoctor = idDoctor;
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
        this.salaryDoctor = salaryDoctor;
    }

    public Doctor(String name, int age, String address, String gender, String phone, String idDoctor, String positionDoctor, int levelSalaryDoctor, int salaryDoctor) {
        super(name, age, address, gender, phone);
        this.idDoctor = idDoctor;
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
        this.salaryDoctor = salaryDoctor;
    }



    public Doctor(Person person,String idDoctor, String positionDoctor, int levelSalaryDoctor) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
        this.idDoctor = idDoctor;
        this.salaryDoctor = salaryDoctor;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getPositionDoctor() {
        return positionDoctor;
    }

    public void setPositionDoctor(String positionDoctor) {
        this.positionDoctor = positionDoctor;
    }

    public int getLevelSalaryDoctor() {
        return levelSalaryDoctor;
    }

    public void setLevelSalaryDoctor(int levelSalaryDoctor) {
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    public int getSalaryDoctor() {
        return salaryDoctor;
    }

    public void setSalaryDoctor(int salaryDoctor) {
        this.salaryDoctor = salaryDoctor;
    }

    @Override
    public String toString() {
        return "Bác sĩ {" +
                "Mã bác sĩ='" + idDoctor + '\'' +
                ", Tên='" + super.getName() + '\'' +
                ", Tuổi=" + super.getAge() +
                ", Địa chỉ='" + super.getAddress() + '\'' +
                ", Giới tính=" + super.getGender() +
                ", Số điện thoại='" + super.getPhone() + '\'' +
                ", Vị trí='" + positionDoctor + '\'' +
                ", Cấp bậc lương='" + levelSalaryDoctor + '\'' +
                ", Mức lương='" + getSalaryDoctor() + '\'' +
                '}';
    }

}