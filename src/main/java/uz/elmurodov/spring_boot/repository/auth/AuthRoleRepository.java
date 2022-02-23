package uz.elmurodov.spring_boot.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.auth.AuthRole;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface AuthRoleRepository extends JpaRepository<AuthRole, Long>, AbstractRepository {
}
