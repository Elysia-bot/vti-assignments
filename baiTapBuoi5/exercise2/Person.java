package DTN2508.com.vti.baiTapBuoi5.exercise2;

import DTN2508.com.vti.entity.gender;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String fullName;
    private gender gender;
    private LocalDate birthDate;
    private String address;
    Scanner sc = new Scanner(System.in);

    public Person(){

    }

    public Person(String fullName, gender gender, LocalDate birthDate, String address){
        this.address =address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public gender getGender(){
        return gender;
    }

    public void setGender(gender gender){
        this.gender = gender;
    }

    public LocalDate getBirthDate (){
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void inputInfo(){
        System.out.println("Nhập tên person: ");
        this.fullName = sc.nextLine();
        while (true) {
            System.out.print("Nhập giới tính (MALE/FEMALE/OTHER): ");
            String input = sc.nextLine().toUpperCase();

            try {
                this.gender = DTN2508.com.vti.entity.gender.valueOf(input);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Giới tính không hợp lệ, nhập lại!");
            }
        }
        System.out.println("Nhập birth date: ");
        this.birthDate = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập address: ");
        this.address = sc.nextLine();
    }

    public void showInfo() {
        System.out.printf("Tên: %s%n", this.fullName);
        System.out.printf("Gender: %s%n", this.gender);
        System.out.printf("Birth date: %s%n", this.birthDate);
        System.out.printf("Address: %s%n", this.address);
    }
}









