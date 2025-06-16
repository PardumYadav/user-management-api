package fed.in.DTOs;

import java.io.Serializable;


public class UserRequestDto implements Serializable {
    private String name;
    private String lastName;
    private String email;
    private Long mobile;

    public UserRequestDto() {
    }

    public UserRequestDto(String name, String lastName, String email, Long mobile) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
