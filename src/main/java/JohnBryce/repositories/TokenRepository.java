package JohnBryce.repositories;

import JohnBryce.entities.Company;
import JohnBryce.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    Boolean existsByToken (String tokenString);

    Token findByToken(String token);

}
