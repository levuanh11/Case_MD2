package service;

import model.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String NAME_REGEX = "^[A-Za-z]{2,9}$";
    public static final String ADDRESS_REGEX = "^[A-Za-z]{2,9}\\s{1}[A-Za-z]{2,9}$";
    public static final String GENDER_REGEX = "^(?:nam|nu)$";
    public static final String PHONE_REGEX = "^[0]{1}\\d{9}$";
    public static final String ID_DOCTOR_REGEX = "^[dr]{1}\\.\\d{3}$";
    public static final String ID_PREVENTIVE_DOCTOR_REGEX = "^[pdr]{1}\\.\\d{3}$";
    public static final String ID_NURSE_REGEX = "^[n]{1}\\.\\d{3}$";
    public static final String ID_PATIENT_REGEX = "^[p]{1}\\.\\d{3}$";
    public static final String POSITION_REGEX = "^[hang1|hang2|hang3]$";
    public static final String LEVEL_REGEX = "^[1-9]{1}$";
    public static final String LEVEL_NURSE_REGEX = "^[1-12]{1}$";
    public static final String ID_ROOM_REGEX = "^[A-D]{1}[1-9]{3}$";

    private Matcher matcher;
    private static Pattern pattern;

    public Validate() {
    }

    public boolean validate(String regex){
        Pattern patternName = Pattern.compile(NAME_REGEX);
        Pattern patternAddress = Pattern.compile(ADDRESS_REGEX);
        Pattern patternGender = Pattern.compile(GENDER_REGEX);
        Pattern patternPhone = Pattern.compile(PHONE_REGEX);
        Pattern patternDoctor = Pattern.compile(ID_DOCTOR_REGEX);
        Pattern patternPDoctor = Pattern.compile(ID_PREVENTIVE_DOCTOR_REGEX);
        Pattern patternNurse = Pattern.compile(ID_NURSE_REGEX);
        Pattern patternPatient = Pattern.compile(ID_PATIENT_REGEX);
        Pattern patternPosition = Pattern.compile(POSITION_REGEX);
        Pattern patternLevel = Pattern.compile(LEVEL_REGEX);
        Pattern patternLevelNurse = Pattern.compile(LEVEL_NURSE_REGEX);
        Pattern patternIdRoom = Pattern.compile(ID_ROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
