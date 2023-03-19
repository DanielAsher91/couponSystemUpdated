package JohnBryce;

import JohnBryce.services.AdminService;
import JohnBryce.services.ClientService;
import JohnBryce.services.CompanyService;
import JohnBryce.services.CustomerService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Data
public class LoginManager {

    @Autowired
    AdminService adminService;

    @Autowired
    CompanyService companyService;

    @Autowired
    CustomerService customerService;





    public ClientService login(ClientType clientType, String email, String password) {


       if (clientType == ClientType.Admin) {
       return adminService;
       }
       if (clientType == ClientType.Company && companyService.isCompanyExists(email, password)) {
           companyService.companyLoginForLoginManager(email, password);
           return companyService;
       }if (clientType == ClientType.Customer && customerService.isCustomerExists(email, password)) {
           customerService.CustomerLoginForLoginManager(email, password);
           return customerService;
        }

       else {
            System.out.println("Wrong details entered!");
           return null;}
    }


}
