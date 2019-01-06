package chapter_2_eclipse;

import java.io.Serializable;

public interface Greeter extends Serializable {

    String greet();

    String greet(String name);
}
