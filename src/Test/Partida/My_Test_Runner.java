import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class My_Test_Runner {

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(Partida_Init_Test.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("El test ha anat be");
        } else {
            System.out.println("El test ha anat malament");
        }
    }
}
