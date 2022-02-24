package uz.elmurodov.spring_boot.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.elmurodov.spring_boot.dto.column.ColumnDto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Saydali Murodullayev, Thu 6:06 PM. 2/24/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectColumnTaskDto {
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime deadline;
    private List<ColumnDto> columnList;
}
