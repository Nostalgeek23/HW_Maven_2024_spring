import org.testng.Assert;
import org.testng.annotations.Test;
import org.example.homework11.*;
public class HomeWork11PartOneTest {

    Worker w = new Worker();

    @Test
    public void testWorkerGetSalary(){
        Assert.assertEquals(w.getSalary(), 2000);
    }

   @Test
    public void testManagerGetSalary(){
        Assert.assertEquals(new Manager(5).getSalary(), 2300);
   }

   @Test
   public void testDirectorGetSalary(){
       Assert.assertEquals(new Director(5).getSalary(), 2900);
   }








}
