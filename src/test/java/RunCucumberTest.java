import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@regression",
        glue = "steps"// Keep this empty to look in the default package
)
public class RunCucumberTest {
}