package JohnBryce.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
@Builder
public class Token {

    @Id
    @GeneratedValue
    private int id;
    private String token;
    private LocalTime issueOfToken;

    private int clientId;


}
