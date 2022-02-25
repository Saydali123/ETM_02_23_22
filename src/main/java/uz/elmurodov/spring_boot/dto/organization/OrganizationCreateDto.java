package uz.elmurodov.spring_boot.dto.organization;

import lombok.*;
import org.mapstruct.control.NoComplexMapping;
import org.springframework.web.multipart.MultipartFile;
import org.yaml.snakeyaml.DumperOptions;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCreateDto {
    private String name;
    private String logo;
    private String email;
    private Long ownerId;

}
