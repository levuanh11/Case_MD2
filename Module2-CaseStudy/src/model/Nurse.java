package model;

import java.io.Serializable;

public class Nurse extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idNurse;
    private int levelNurse;
    private int salaryNurse;

    public Nurse() {
    }

    public Nurse(String idNurse, int levelNurse, int salaryNurse) {
        this.idNurse = idNurse;
        this.levelNurse = levelNurse;
        this.salaryNurse = salaryNurse;
    }

    public Nurse(String name, int age, String address, String gender, String phone, String idNurse, int levelNurse, int salaryNurse) {
        super(name, age, address, gender, phone);
        this.idNurse = idNurse;
        this.levelNurse = levelNurse;
        this.salaryNurse = salaryNurse;
    }

    public Nurse(Person person, String idNurse, int levelNurse) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.levelNurse = levelNurse;
    }

    public String getIdNurse() {
        return idNurse;
    }

    public void setIdNurse(String idNurse) {
        this.idNurse = idNurse;
    }

    public int getLevelNurse() {
        return levelNurse;
    }

    public void setLevelNurse(int levelNurse) {
        this.levelNurse = levelNurse;
    }

    public int getSalaryNurse() {
        return salaryNurse;
    }

    public void setSalaryNurse(int salaryNurse) {
        this.salaryNurse = salaryNurse;
    }

    @Override
    public String toString() {
        return "Y tá {" +
                "Mã y tá='" + idNurse + '\'' +
                ", Tên='" + super.getName() + '\'' +
                ", Tuổi=" + super.getAge() +
                ", Địa chỉ='" + super.getAddress() + '\'' +
                ", Giới tính=" + super.getGender() +
                ", Số điện thoại='" + super.getPhone() + '\'' +
                ", Cấp bậc lương='" + levelNurse + '\'' +
                ", Mức lương='" + getSalaryNurse() + '\'' +
                '}';
    }
}
