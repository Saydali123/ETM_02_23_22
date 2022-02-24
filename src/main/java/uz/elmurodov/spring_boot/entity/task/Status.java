package uz.elmurodov.spring_boot.entity.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Status {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
