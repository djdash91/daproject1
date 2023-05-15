package da.projects.daproject1.repository;

import da.projects.daproject1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}