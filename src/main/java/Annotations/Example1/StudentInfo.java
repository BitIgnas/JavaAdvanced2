package Annotations.Example1;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME) //nurodome kad anotacija vyksta runtime
public @interface StudentInfo {

    String studentName();
    String studentAddress();

}
