package seed.micronaut.project.users;

import io.eldermael.zwitch.Feature;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.List;

@Feature("users")
@Controller("/users")
public class UsersController {


  @Get
  public List<Users> getUsers() {
    return Collections.emptyList();
  }

}
