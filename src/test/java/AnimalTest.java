import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class AnimalTest {
    @Test
    void shouldBeAliveAfterCreation() {
        //given
        Animal animal = new PolarBear();
        //then
        assertTrue(animal.isAlive());
    }

    @Test
    void shouldBeAliveAfterEating() {
        //given
        Animal animal = new PolarBear();
        //when
        animal.eat();
        //then
        assertTrue(animal.isAlive());
    }

    @Test
    void shouldBeDeadWhenNotEatBeforeTenDays() {
        //given
        Animal animal = spy(new PolarBear());
     //   mock(PolarBear.class);
        //when
        LocalDateTime value = LocalDateTime.now().minusDays(11);
        when(animal.getLastEatTime()).thenReturn((value));
          //then
        assertFalse(animal.isAlive());
    }

    @Test
    void shouldReturnCantEatExceptionWhenTeddyBear() {
        //given
        Animal animal = new TeddyBear();
        //when
        //then
//        assertThrows(CantEatException.class,
//                ()-> animal.eat());
assertThrows(CantEatException.class, animal::eat);
    }

    @Test
    void shouldReturn200WhenPolarBear() {
        //given
        Animal animal = new PolarBear();
        //when
        int weight = animal.getWeight();
        //then
        assertEquals(200, weight);
    }
    @Test

    void shouldReturn100WhenBrownBear() {
        //given
        Animal animal = new BrownBear();
        //when
        int weight = animal.getWeight();
        //then
        assertEquals(100, weight);
    }
}