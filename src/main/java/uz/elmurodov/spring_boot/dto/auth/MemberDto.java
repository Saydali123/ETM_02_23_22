package uz.elmurodov.spring_boot.dto.auth;

import lombok.*;

/**
 * @author Saydali Murodullayev, Thu 6:47 PM. 2/24/2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MemberDto {
    private Long id;
    private String username;
    private String picture;
}
