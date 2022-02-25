package uz.elmurodov.spring_boot.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.elmurodov.spring_boot.dto.GenericDto;

/**
 * @author Amonov Bunyod, пт 25.02.2022 17:03 .
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDto extends GenericDto {
    private String email;
    private String picture;
    private String role;
}
