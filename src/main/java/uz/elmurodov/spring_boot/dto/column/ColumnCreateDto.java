package uz.elmurodov.spring_boot.dto.column;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ColumnCreateDto {
    private String name;
}
