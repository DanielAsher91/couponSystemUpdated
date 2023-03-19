package JohnBryce.entities;

import JohnBryce.ClientType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Client {

 private String email;
 private String password;


}
