package controller;

import model.Doctor;
import model.Nurse;
import model.Person;
import model.PreventiveDoctor;
import service.IOScanner;

import java.io.Serializable;
import java.util.*;

public class ManagementNurse implements Serializable {
    public List<Nurse> nurseList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public ManagementNurse() {
        this.nurseList = new ArrayList<>();
    }


    public void showNurse() {
        for (Nurse nurses : nurseList) {
            System.out.println(nurses.toString());
        }
    }

    public void addNurse(Nurse nurse) {
        this.nurseList.add(nurse);
    }

    public void findByIdNurse(){
        System.out.print("nhập mã y tá cần tìm: ");
        String id = scanner.nextLine();
        int count = 0;
        for (Nurse nurse: nurseList){
            if(nurse.getIdNurse().equals(id)){
                System.out.println(nurse);
                count++;
            }
        }
    }

    public void findByNameNurse(){
        System.out.print("nhập tên cần tìm: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Nurse nurse : nurseList){
            if(nurse.getName().equals(name)){
                System.out.println(nurse);
                count++;
            }
        }
    }

    public void findByAgeNurse(){
        System.out.print("nhập số tuổi cần tìm: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Nurse nurse : nurseList){
            if(nurse.getAge() == age){
                System.out.println(nurse);
                count++;
            }
        }
    }

    public void findByPhoneNurse(){
        System.out.print("nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Nurse nurse : nurseList){
            if(nurse.getPhone().equals(phone)){
                System.out.println(nurse);
                count++;
            }
        }
    }

    public void findByAddressNurse(){
        System.out.print("nhập địa chỉ cần tìm: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Nurse nurse : nurseList){
            if(nurse.getAddress().equals(address)){
                System.out.println(nurse);
                count++;
            }
        }
    }

    public void sortByIdNurse(){
        Collections.sort(nurseList, new Comparator<Nurse>() {
            @Override
            public int compare(Nurse o1, Nurse o2) {
                return o1.getIdNurse().compareTo(o2.getIdNurse());
            }
        });
        showNurse();
    }

    public void sortByNameNurse(){
        Collections.sort(nurseList, new Comparator<Nurse>() {
            @Override
            public int compare(Nurse o1, Nurse o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showNurse();
    }

    public void sortByLevelSalaryNurse(){
        Collections.sort(nurseList, new Comparator<Nurse>() {
            @Override
            public int compare(Nurse o1, Nurse o2) {
                if(o1.getLevelNurse()> o2.getLevelNurse()){
                    return 1;
                }
                else if(o1.getLevelNurse()< o2.getLevelNurse()){
                    return -1;
                }
                else {
                    return o1.getIdNurse().compareTo(o2.getIdNurse());
                }
            }
        });
        showNurse();
    }

    public void sortByAgeNurse(){
        Collections.sort(nurseList, new Comparator<Nurse>() {
            @Override
            public int compare(Nurse o1, Nurse o2) {
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
        showNurse();
    }

    public Nurse updateNurseById() {
        System.out.print("nhập tìm theo mã y tá: ");
        String idNurse = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (Nurse nurse : nurseList) {
            if (nurse.getIdNurse().equals(idNurse)) {
                ioScanner.updateNurse(nurse);
            }
        }
        System.out.println("không tìm thấy mã y tá cần sửa!!!");
        return null;
    }

    public void deleteByIdNurse(){
        System.out.print("nhập tìm mã: ");
        String id = scanner.nextLine();
        for (Nurse nurse : nurseList) {
            if (nurse.getIdNurse().equals(id)) {
                nurseList.remove(nurse);
            }
        }
    }

}
