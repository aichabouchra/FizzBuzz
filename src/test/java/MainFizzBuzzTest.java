import org.example.FizzBuzzConvertor;
import org.junit.Before;
import org.junit.Test;

public class MainFizzBuzzTest {

    FizzBuzzConvertor fizzBuzz;

    @Before
    public void convert(){
        fizzBuzz=new FizzBuzzConvertor();
    }

    @Test
    public void OutputFizzBuzz(){
        for(int i=1; i<=100; i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }

}
