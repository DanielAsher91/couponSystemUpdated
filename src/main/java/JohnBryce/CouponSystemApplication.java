package JohnBryce;

import JohnBryce.entities.Category;
import JohnBryce.entities.Company;
import JohnBryce.entities.Coupon;
import JohnBryce.entities.Customer;
import JohnBryce.job.CouponExpirationDaily;
import JohnBryce.services.ClientService;
import JohnBryce.services.CompanyService;
import JohnBryce.services.AdminService;
import JohnBryce.services.CustomerService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class CouponSystemApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(CouponSystemApplication.class, args);

        Test test = ctx.getBean(Test.class);

        test.testAll();

    }}


