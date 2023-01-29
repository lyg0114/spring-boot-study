package yglee.springbootstudy;

import java.util.Objects;

public class HelloController {
  public String hello(String name){
    HelloService service = new SimpleHelloService();
    return service.sayHello(Objects.requireNonNull(name));
  }
}