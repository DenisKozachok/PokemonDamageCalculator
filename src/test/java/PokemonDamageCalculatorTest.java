import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PokemonDamageCalculatorTest {


    @Test
    public void pokemonDamageCalculatorFireWaterTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("fire", "water", 100, 100), 25);
    }

    @Test
    public void pokemonDamageCalculatorGrassWaterTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("grass", "water", 100, 100), 100);
    }

    @Test
    public void pokemonDamageCalculatorGrassWatersTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("grass", "water", 40, 40), 100);
    }

    @Test
    public void pokemonDamageCalculatorElectricFireTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("electric", "fire", 100, 100), 50);
    }

    @Test
    public void pokemonDamageCalculatorGrassElectricTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("grass", "electric", 57, 19), 150);
    }

    @Test
    public void pokemonDamageCalculatorGrassFireTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("grass", "fire", 35, 5), 175);
    }

    @Test
    public void pokemonDamageCalculatorFireElectricTest() {
        PokemonDamageCalculator tester = new PokemonDamageCalculator();

        assertEquals(tester.calculateDamage("fire", "electric", 10, 2), 250);
        ;
    }

}
