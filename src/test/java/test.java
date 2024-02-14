import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;

public class test {
    @Test
    public void testing() throws ParameterException {
        String param = ParameterService.INSTANCE.getString("IT_CUF_owl");
        System.out.println(param);
    }
}
