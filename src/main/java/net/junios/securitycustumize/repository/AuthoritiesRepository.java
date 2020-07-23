package net.junios.securitycustumize.repository;

import net.junios.securitycustumize.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthoritiesRepository extends JpaRepository<Authority, Integer> {
    List<Authority> findByUsername(String username);
}
