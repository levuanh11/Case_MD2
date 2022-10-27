package controller;

import model.Doctor;
import model.Person;
import service.IOFile;
import service.IOScanner;

import java.io.Serializable;
import java.util.*;


public class ManagementDoctor implements Serializable {
    public List<Doctor> doctorList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();
    IOFile ioFile = new IOFile();

    public ManagementDoctor() {
        this.doctorList = new ArrayList<>();
    }


    public void showDoctor() {
//        this.doctorList = ioFile.readFileDoctor("doctor.csv");
        for (Doctor doctor : doctorList) {
         System.out.println(doctor.toString());
        }
    }

    public void addDoctor(Doctor doctor) {
        this.doctorList.add(doctor);
        ioFile.writeFileDoctor("File:\\doctor.csv",this.doctorList);
        System.out.println("Thêm thành công");
    }

    public void findByIdDoctor(){
        System.out.print("nhập mã bác sĩ cần tìm: ");
        String id = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList){
            if(doctor.getIdDoctor().equals(id)){
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByNameDoctor(){
        System.out.print("nhập tên cần tìm: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList){
            if(doctor.getName().equals(name)){
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByAgeDoctor(){
        System.out.print("nhập số tuổi cần tìm: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList){
            if(doctor.getAge() == age){
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByPhoneDoctor(){
        System.out.print("nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList){
            if(doctor.getPhone().equals(phone)){
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByAddressDoctor(){
        System.out.print("nhập địa chỉ cần tìm: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList){
            if(doctor.getAddress().equals(address)){
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void sortByIdDoctor(){
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                return o1.getIdDoctor().compareTo(o2.getIdDoctor());
            }
        });
        showDoctor();
    }

    public void sortByNameDoctor(){
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showDoctor();
    }

    public void sortByLevelSalaryDoctor(){
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                if(o1.getLevelSalaryDoctor()> o2.getLevelSalaryDoctor()){
                    return 1;
                }
                else if(o1.getLevelSalaryDoctor()< o2.getLevelSalaryDoctor()){
                    return -1;
                }
                else {
                    return o1.getIdDoctor().compareTo(o2.getIdDoctor());
                }
            }
        });
        showDoctor();
    }

    public void sortByAgeDoctor(){
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                if(o1.getAge()> o2.getAge()){
                    return 1;
                }
                else if(o1.getAge()< o2.getAge()){
                    return -1;
                }
                else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        showDoctor();
    }

    public Doctor updateDoctorById() {
        System.out.print("nhập tìm theo mã bác sĩ: ");
        String idDoctor = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (Doctor doctor : doctorList) {
            if (doctor.getIdDoctor().equals(idDoctor)) {
                ioScanner.updateDoctor(doctor);
//                ioFile.writeFileDoctor("File:\\doctor.csv",this.doctorList);
                System.out.println("Sửa thành công");
            }
        }
        System.out.println("không tìm thấy mã bác sĩ cần sửa!!!");
        return null;
    }

    public void deleteByIdDoctor(){
        System.out.print("nhập tìm mã: ");
        String id = scanner.nextLine();
        for (Doctor doctor : doctorList) {
            if (doctor.getIdDoctor().equals(id)) {
                doctorList.remove(doctor);
//                ioFile.writeFileDoctor("File:\\doctor.csv",doctorList);
            }
        }
    }
}
