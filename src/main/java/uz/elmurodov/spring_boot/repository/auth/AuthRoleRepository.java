package uz.elmurodov.spring_boot.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.auth.AuthRole;
import uz.elmurodov.spring_boot.repository.AbstractRepository;
@Repository
public interface AuthRoleRepository extends JpaRepository<AuthRole, Long>, AbstractRepository {
}
