package seed.micronaut.project.echo;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import seed.micronaut.project.toggle.Feature;

@Feature("echo")
@Controller("/echo")
public class EchoController {

  @Post
  @Produces(MediaType.APPLICATION_JSON)
  public String echo(@Body String requestBody) {
    return requestBody;
  }

}
