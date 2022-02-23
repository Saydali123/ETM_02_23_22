package uz.elmurodov.spring_boot.repository.organization;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.organization.Organization;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {

}
