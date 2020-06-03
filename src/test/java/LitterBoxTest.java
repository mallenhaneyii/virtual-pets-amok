import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class LitterBoxTest {

    LitterBox underTest = new LitterBox(10);

    @Test
    public void shouldReturnLitterWasteLevel(){
        int check = underTest.getWaste();
        Assertions.assertThat(check).isEqualTo(10);
    }

    @Test
    public void shouldBeAbleToDecreaseWasteLevel(){
        underTest.cleanLitterBox();
        Assert.assertEquals(0, underTest.getWaste());
    }
}
