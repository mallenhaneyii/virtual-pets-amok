import org.assertj.core.api.Assertions;
import org.junit.Test;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("name", "description", 0, 0, 0, 0, 0);

    @Test
    public void shouldReturnName(){
        String check = underTest.getName();
        Assertions.assertThat(check).isEqualTo("name");
    }

    @Test
    public void shouldReturnDescription(){
        String check = underTest.getDescription();
        Assertions.assertThat(check).isEqualTo("description");
    }

    @Test
    public void shouldReturnHealthLevel(){
        int check = underTest.getHealth();
        Assertions.assertThat(check).isEqualTo(0);
    }

    @Test
    public void shouldReturnHappiness(){
        int check = underTest.getHappiness();
        Assertions.assertThat(check).isEqualTo(0);
    }

    @Test
    public void shouldReturnBoredom(){
        int check = underTest.getBoredom();
        Assertions.assertThat(check).isEqualTo(0);
    }

    @Test
    public void shouldReturnHunger(){
        int check = underTest.getHunger();
        Assertions.assertThat(check).isEqualTo(0);
    }

    @Test
    public void shouldReturnThirst(){
        int check = underTest.getThirst();
        Assertions.assertThat(check).isEqualTo(0);
    }



}
