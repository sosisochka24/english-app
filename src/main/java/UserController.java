import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class UserController {
    @RequestMapping(path="/greeting/{firstName}/{lastName}",method = RequestMethod.GET)
    public User greeting(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return new User(firstName, lastName);
    }
}
