package uz.elmurodov.spring_boot.entity.column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.elmurodov.spring_boot.entity.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PColumn extends Auditable implements BaseEntity {

    private String name;

    @Column(name = "project_id")
    private Long projectId;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Task> listTasks;


}
