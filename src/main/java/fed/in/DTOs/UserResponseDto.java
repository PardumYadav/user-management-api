package fed.in.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

    @Data
    @AllArgsConstructor
    public class UserResponseDto {
        private Long id;
        private String name;
        private String lastName;
        private String email;
        private String phoneNumber;
    }


