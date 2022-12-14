package model;

import model.Person;

import java.io.Serializable;

public class Patient extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idPatitent;
    private String diseases;
    private String status;
    private double height;
    private double weight;
    private int daysInHospital;
    private String typeRoom;
    private int idRoom;

    public Patient() {
    }


    public Patient(String idPatitent, String name, int age, String address, String gender, String phone, String diseases, String status, double height, double weight, int daysInHospital, String typeRoom, int idRoom) {
        super(name, age, address, gender, phone);
        this.idPatitent = idPatitent;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.daysInHospital = daysInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }

    public Patient(Person person, String idPatitent, String diseases, String status, double height, double weight, int daysInHospital, String typeRoom, int idRoom) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.idPatitent = idPatitent;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.daysInHospital = daysInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }

    public String getIdPatitent() {
        return idPatitent;
    }

    public void setIdPatitent(String idPatitent) {
        this.idPatitent = idPatitent;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDaysInHospital() {
        return daysInHospital;
    }

    public void setDaysInHospital(int daysInHospital) {
        this.daysInHospital = daysInHospital;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "B???nh nh??n {" +
                "M?? b???nh nh??n='" + diseases + '\'' +
                ", T??n='" + super.getName() + '\'' +
                ", Tu???i=" + super.getAge() +
                ", ?????a ch???='" + super.getAddress() + '\'' +
                ", Gi???i t??nh=" + super.getGender() +
                ", S??? ??i???n tho???i='" + super.getPhone() + '\'' + "\n" +
                " B???nh t???t='" + diseases + '\'' +
                ", Tr???ng th??i='" + status + '\'' +
                ", Chi???u cao='" + height + '\'' +
                ", C??n n???ng='" + weight + '\'' + "\n" +
                " S??? ng??y nh???p vi???n='" + daysInHospital + '\'' +
                ", Lo???i ph??ng='" + typeRoom + '\'' +
                ", S??? ph??ng='" + idRoom + '\'' +
                '}';
    }
}
