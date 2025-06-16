package fed.in.DTOs;


import java.io.Serializable;

public class UserResponseDto implements  Serializable {
        private Long id;
        private String name;
        private String lastName;
        private String email;
        private Long mobile;

        public  UserResponseDto(){

        }

        public UserResponseDto(Long id, String name, String lastName, String email, Long mobile) {
            this.id = id;
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

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }


