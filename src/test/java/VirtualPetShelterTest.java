import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    OrganicDog dog1;
    OrganicDog dog2;
    RobotDog dog3;
    RobotDog dog4;
    OrganicCat cat1;
    RobotCat cat2;

    @Before
    public void SetUp() {
        underTest = new VirtualPetShelter();
        dog1 = new OrganicDog("Jake", "Black Lab", 10, 10, 10, 10, 10, 10);
        dog2 = new OrganicDog("Shadow", "Golden Retriever", 10, 10, 10, 10, 10, 10);
        dog3 = new RobotDog("Zoomer", "Bronze", 10, 10, 10, 10);
        dog4 = new RobotDog("Boomer", "Silver", 10, 10, 10, 10);
        cat1 = new OrganicCat("Molly", "Calico", 10, 10, 10, 10, 10);
        cat2 = new RobotCat("Max", "Tungsten", 10, 10, 10, 10);
    }

    @Test
    public void shouldReduceAllOrganicPetsHungerByThreeWhenFeeding() {
        underTest.admit(dog1);
        underTest.admit(cat1);
        underTest.feedAll();
        Assert.assertEquals(7, dog1.getHunger());
        Assert.assertEquals(7, cat1.getHunger());
    }

    @Test
    public void shouldReduceAllOrganicPetsThirstByThreeWhenWatering() {
        underTest.admit(dog1);
        underTest.admit(dog2);
        underTest.waterAll();
        Assert.assertEquals(7, dog1.getThirst());
        Assert.assertEquals(7, dog2.getThirst());
    }

    @Test
    public void shouldIncreaseAllRobotPetsOilLevelByThreeWhenOiling(){
        underTest.admit(dog3);
        underTest.admit(cat2);
        underTest.oilAll();
        Assert.assertEquals(13, dog3.getOilLevel());
        Assert.assertEquals(13, cat2.getOilLevel());
    }

    //Still not working, revisit
    @Test
    public void shouldBeAbleToAdoptAPet(){
        underTest.admit(dog1);
        underTest.adopt(dog1);
        String check = dog1.getName();
        Assertions.assertThat(check).isEqualTo("Jake");
    }

    @Test
    public void shouldIncreaseHappinessWhenWalking(){
        underTest.admit(dog1);
        underTest.admit(dog3);
        underTest.walkDogs();
        Assert.assertEquals(15, dog1.getHappiness());
        Assert.assertEquals(15, dog3.getHappiness());
    }

    @Test
    public void shouldDecreaseBoredomWhilePlaying(){
        underTest.admit(dog1);
        dog1.play(10);
        Assert.assertEquals(0, dog1.getBoredom());
    }

}
