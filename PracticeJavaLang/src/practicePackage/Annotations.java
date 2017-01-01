package practicePackage;

import java.lang.annotation.Documented;

/**
 * Created by inet-tech on 26/12/16.
 */
public class Annotations {

    @Documented
    @interface ClassPreamble {
        String author();
        String date();
        int age();
        int currentRevision() default 1;
        String lastModified() default "N/A";
        String lastModifiedBy() default "N/A";
        String[] reviewers();
    }
}
