package uz.elmurodov.spring_boot.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amonov Bunyod, пт 25.02.2022 17:00 .
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {
    private String email;
    private String picture;
    private String password;
    private String role;
    private Long organizationId;
}
