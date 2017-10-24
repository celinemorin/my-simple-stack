package deqo.cmor.mysimplestack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main (String[] argv) {
        Result result = JUnitCore.runClasses(ItemTest.class);
        for (Failure failure : result.getFailures())
            System.out.println(failure.toString());
    }

}
