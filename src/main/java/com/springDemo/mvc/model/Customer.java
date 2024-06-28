package com.springDemo.mvc.model;

import com.springDemo.mvc.validation.IFSCCode;
import jakarta.validation.constraints.*;


public class Customer {
    @NotNull(message = "is required!!!")
    @Size(min = 1,message = "Minimum 1 character should be entered")
    private String firstName;
    @NotNull(message = "is required!!!")
    @Size(min = 1,message = "Minimum 1 character should be entered")
    private String lastName;
    @Min(value = 0,message = "Must be greater than or equal to 0")
    @Max(value = 120,message = "Must be lesser than or equal to 120")
    @NotNull(message = "is required!!!")
    private Integer age;
    @Pattern(regexp = "^[a-zA-Z0-9]{6}",message = "only 6 characters/digits")
    private String postalCode;
    @IFSCCode(value = "UBIN",message="Must start with UBIN")
    private String IFSCCode;

    public Customer() {
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }
}
