package uz.elmurodov.spring_boot.dto.column;

import lombok.*;
import uz.elmurodov.spring_boot.dto.GenericDto;
import uz.elmurodov.spring_boot.dto.task.TaskDto;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PColumnDto extends GenericDto {
    private Long id;
    private String name;
    private Integer order;
}
