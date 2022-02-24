package uz.elmurodov.spring_boot.dto.column;

import lombok.*;
import uz.elmurodov.spring_boot.dto.GenericDto;


@Getter
@Setter
public class ColumnDto extends GenericDto {

    private String name;
    private Long projectId;

    @Builder(builderMethodName = "childBuilder")
    public ColumnDto(String name, Long projectId) {
        this.name = name;
        this.projectId = projectId;
    }
}
