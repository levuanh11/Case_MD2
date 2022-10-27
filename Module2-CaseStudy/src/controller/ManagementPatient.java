package controller;

import model.Doctor;
import model.Nurse;
import model.Patient;
import service.IOScanner;

import java.io.Serializable;
import java.util.*;

public class ManagementPatient implements Serializable {
    public List<Patient> patientList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public ManagementPatient() {
        this.patientList = new ArrayList<>();
    }


    public void showPatient() {
        for (Patient patient : patientList) {
            System.out.println(patientList.toString());
        }
    }

    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }

    public void findByIdPatient() {
        System.out.print("nhập mã bệnh nhân cần tìm: ");
        String id = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getIdPatitent().equals(id)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByNamePatient() {
        System.out.print("nhập tên cần tìm: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getName().equals(name)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByAgePatient() {
        System.out.print("nhập số tuổi cần tìm: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getAge() == age) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByPhonePatient() {
        System.out.print("nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getPhone().equals(phone)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByAddressPatient() {
        System.out.print("nhập địa chỉ cần tìm: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getAddress().equals(address)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    //sắp theo mã
    public void sortByIdPatitent() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getIdPatitent().compareTo(o2.getIdPatitent());
            }
        });
        showPatient();
    }

    //sắp theo tên
    public void sortByNamePatitent() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showPatient();
    }

    //sắp theo bệnh
    public void sortByDiseasesPatitent() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getDiseases().compareTo(o2.getDiseases());
            }
        });
        showPatient();
    }

    //sắp theo loại phòng
    public void sortByTypeRoomPatitent() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getTypeRoom().compareTo(o2.getTypeRoom());
            }
        });
        showPatient();
    }

    //sắp theo số ngày ở viện
    public void sortByDaysInHospital() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.getDaysInHospital() > o2.getDaysInHospital()) {
                    return 1;
                } else if (o1.getDaysInHospital() < o2.getDaysInHospital()) {
                    return -1;
                } else {
                    return o1.getIdPatitent().compareTo(o2.getIdPatitent());
                }
            }
        });
        showPatient();
    }

    //sắp theo số phòng
    public void sortByIdRoom() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.getIdRoom() > o2.getIdRoom()) {
                    return 1;
                } else if (o1.getIdRoom() < o2.getIdRoom()) {
                    return -1;
                } else {
                    return o1.getIdPatitent().compareTo(o2.getIdPatitent());
                }
            }
        });
        showPatient();
    }

    //sắp theo tuổi
    public void sortByAgePatient() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        showPatient();
    }

    public Doctor updatePatientById() {
        System.out.print("nhập tìm theo mã bệnh nhân: ");
        String idPatient = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (Patient patient : patientList) {
            if (patient.getIdPatitent().equals(idPatient)) {
                ioScanner.updatePatient(patient);
            }
        }
        System.out.println("không tìm thấy mã bác sĩ cần sửa!!!");
        return null;
    }

    public void deleteByIdPatient(){
        System.out.print("nhập tìm mã: ");
        String id = scanner.nextLine();
        for (Patient patient : patientList) {
            if (patient.getIdPatitent().equals(id)) {
                patientList.remove(patient);
            }
        }
    }
}
