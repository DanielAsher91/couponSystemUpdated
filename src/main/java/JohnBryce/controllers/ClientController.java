package JohnBryce.controllers;

import JohnBryce.ClientType;
import JohnBryce.entities.Category;
import JohnBryce.entities.Client;
import JohnBryce.entities.Company;
import JohnBryce.entities.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;


public abstract class ClientController {

   public abstract ResponseEntity<?> login(Client client);

}





