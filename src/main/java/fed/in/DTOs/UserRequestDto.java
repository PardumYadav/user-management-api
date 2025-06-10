package fed.in.DTOs;

import lombok.Data;

@Data
public class UserRequestDto {
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
}
