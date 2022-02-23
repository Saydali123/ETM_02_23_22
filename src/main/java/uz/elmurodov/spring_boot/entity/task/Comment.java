package uz.elmurodov.spring_boot.entity.task;

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
public class Comment extends Auditable {

    private String body;

    @Column(name = "task_id")
    private String taskId;
}
