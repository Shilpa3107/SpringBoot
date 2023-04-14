import org.springframeork.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframwork.web.bind.annotation.RestController;

@SpringBootApplication
@ResrController

public class MyApplication {
    public static void main(String[] args)
{
    SpringApplication.run(MyApplicatio.class, args);
}
@GetMapping("/")
public String hello() {
    return "Hello, World!";
}

}
