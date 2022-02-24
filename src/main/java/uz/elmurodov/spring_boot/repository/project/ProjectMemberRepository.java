package uz.elmurodov.spring_boot.repository.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.project.ProjectMember;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Long>, AbstractRepository {
}
