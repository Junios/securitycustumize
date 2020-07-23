package net.junios.securitycustumize.repository;

import net.junios.securitycustumize.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
