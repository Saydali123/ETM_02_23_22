package uz.elmurodov.spring_boot.dto.project;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder(builderMethodName = "childBuilder")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCreateDto {
    private String name;
    private String description;
}
