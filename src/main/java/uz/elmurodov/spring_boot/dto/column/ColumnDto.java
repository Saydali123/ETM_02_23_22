package uz.elmurodov.spring_boot.dto.column;

import lombok.*;
import uz.elmurodov.spring_boot.dto.GenericDto;
import uz.elmurodov.spring_boot.dto.task.TaskDto;

import java.util.List;


@Getter
@Setter
public class ColumnDto extends GenericDto {
    private String name;
    private List<TaskDto> taskList;

    @Builder(builderMethodName = "childBuilder")
    public ColumnDto(String name, List<TaskDto> list) {
        this.name = name;
        this.taskList = list;
    }
}
