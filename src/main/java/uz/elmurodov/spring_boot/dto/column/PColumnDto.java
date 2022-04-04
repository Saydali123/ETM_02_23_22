package uz.elmurodov.spring_boot.dto.column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import uz.elmurodov.spring_boot.dto.GenericDto;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PColumnDto extends GenericDto {
    private Long id;
    private String name;
    private Integer order;
}
