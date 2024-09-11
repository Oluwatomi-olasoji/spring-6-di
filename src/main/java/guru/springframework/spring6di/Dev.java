package guru.springframework.spring6di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    public Computer computer;

    public void build (){
        computer.compile();
        System.out.println("Building a web application");
    }
}
