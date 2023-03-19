package JohnBryce.repositories;

import JohnBryce.entities.Company;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Boolean existsByEmailAndPassword(String email, String password);

    Company findByEmailAndPassword(String email, String password);







}
