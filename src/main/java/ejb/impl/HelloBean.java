package ejb.impl;

import ejb.remote.Hello;
import jakarta.ejb.Stateless;

@Stateless
public class HelloBean implements Hello {
    @Override
    public void getDetails() {
        System.out.println("Hello ejb is working");
    }
}
