import org.example.FizzBuzzConvertor;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzzConvertor fizzBuzz;

    @Before
    public void convert(){
        fizzBuzz=new FizzBuzzConvertor();
    }

    @Test
    public void FizzBuzzConvertorNormalNumber(){
        Assert.assertEquals(fizzBuzz.convert(1), "1");
    }

    @Test
    public void FizzBuzzConvertorFizz(){
        Assert.assertEquals(fizzBuzz.convert(3), "Fizz");
    }

    @Test
    public void FizzBuzzConvertorBuzz(){
        Assert.assertEquals(fizzBuzz.convert(5), "Buzz");
    }

    @Test
    public void FizzBuzzConvertorFizzBuzz(){
        Assert.assertEquals(fizzBuzz.convert(15), "FizzBuzz");
    }

}
