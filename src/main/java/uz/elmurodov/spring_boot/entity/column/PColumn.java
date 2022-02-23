package uz.elmurodov.spring_boot.entity.column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.elmurodov.spring_boot.entity.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PColumn extends Auditable {

    private String name;

    @Column(name = "project_id")
    private Long projectId;
}
