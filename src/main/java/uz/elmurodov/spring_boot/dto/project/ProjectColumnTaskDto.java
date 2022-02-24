package uz.elmurodov.spring_boot.dto.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.elmurodov.spring_boot.dto.auth.AuthUserDto;
import uz.elmurodov.spring_boot.dto.column.ColumnDto;
import uz.elmurodov.spring_boot.entity.project.ProjectMember;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Saydali Murodullayev, Thu 6:06 PM. 2/24/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectColumnTaskDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime deadline;
    private List<ColumnDto> columnList;
    private List<AuthUserDto> memberList;
}
