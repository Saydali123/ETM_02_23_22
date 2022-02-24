package uz.elmurodov.spring_boot.dto.project;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.elmurodov.spring_boot.dto.Dto;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder(builderMethodName = "childBuilder")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCreateDto implements Dto {
    private String name;
    private String description;
    private LocalDateTime deadline;

}
