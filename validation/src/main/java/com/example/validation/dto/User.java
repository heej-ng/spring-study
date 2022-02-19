package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;
import jdk.dynalink.linker.LinkerServices;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    @Valid      // Validation 판단하기 위해서는 @Valid 붙여줘야한다
    private List<Car> cars;

//    @Email
//    private String email;
//
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
//    private String phoneNumber;
//
//    // @Size(min = 6, max = 6)
//    @YearMonth
//    private String reqYearMonth;    // yyyyMM

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    // AssertTrue / False 와 같은 method 지정을 통해서 Custom Logic 적용하는 경우 재사용이 안되는 단점이 있다
    // -> ConstraintValidator 적용하여 재사용 가능한 Custom Logic 적용가능
//    @AssertTrue(message = "yyyyMM 의 형식에 맞지 않습니다.")  // @AssertTrue 는 boolean 메소드를 지정하기 때문에
//    public boolean isreqYearMonthValidation(){              //  메소드명의 맨앞에 is가 있어야한다
//        System.out.println("assert true call");
//        try{
//            LocalDate localDate = LocalDate.parse(getReqYearMonth()+"01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//        }catch (Exception e){
//            return false;
//        }
//        return true;
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
