package yglee.springbootstudy;

import java.util.Objects;

public class HelloController {

  private final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  public String hello(String name) {
    HelloService service = new SimpleHelloService();
    return service.sayHello(Objects.requireNonNull(name));
  }
}
