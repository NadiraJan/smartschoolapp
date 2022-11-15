package be.intecbrussel.smartschoolapp.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginDto {
    private long No;
    private String password;
    private String role;
}
