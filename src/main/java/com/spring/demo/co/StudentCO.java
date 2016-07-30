package com.spring.demo.co;

import com.spring.demo.validators.IsHobbyValid;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

public class StudentCO {

    @NotEmpty(message = "First Name should not be blank")
    @Size(min = 2, max = 20, message = "Size must be between 2 to 20")
    String firstName;

    @NotEmpty(message = "Last Name should not be blank")
    @Size(min = 2, max = 20, message = "Size must be between 2 to 20")
    String lastName;

    @Email(message = "Please provide valid Email Address")
    String email;

    @NotNull
    Long phoneNumber;

    @NotEmpty(message = "You should have one subject assigned.")
    List<String> subjects;

    @NotNull
    Date dateOfBirth;

    @NotNull
    AddressCO address;

    @IsHobbyValid
    String hobby;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AddressCO getAddress() {
        return address;
    }

    public void setAddress(AddressCO address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
