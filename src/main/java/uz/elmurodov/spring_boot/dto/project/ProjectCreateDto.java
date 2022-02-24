package uz.elmurodov.spring_boot.dto.project;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.elmurodov.spring_boot.dto.Dto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectCreateDto implements Dto {
    private String name;
//    private MultipartFile tzPath;

}
