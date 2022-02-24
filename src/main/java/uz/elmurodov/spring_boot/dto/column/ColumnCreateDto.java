package uz.elmurodov.spring_boot.dto.column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.spring_boot.dto.Dto;
@Getter
@Setter
@AllArgsConstructor
public class ColumnCreateDto implements Dto {

    private String name;
    private Long projectId;

}
