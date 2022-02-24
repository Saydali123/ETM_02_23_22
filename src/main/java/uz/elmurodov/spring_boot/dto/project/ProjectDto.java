package uz.elmurodov.spring_boot.dto.project;

import lombok.*;
import uz.elmurodov.spring_boot.dto.GenericDto;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "childbuilder")
public class ProjectDto extends GenericDto {
    private String name;
    private Boolean closed;
    private Long createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime deadline;


    @Builder(builderMethodName = "childBuilder")
    public ProjectDto(Long id, String name, String tzPath, Boolean closed, LocalDateTime createdat, Long createdby) {
        super(id);
        this.name = name;
        this.closed = closed;
        this.createdAt = createdat;
        this.createdBy = createdby;
    }
}
