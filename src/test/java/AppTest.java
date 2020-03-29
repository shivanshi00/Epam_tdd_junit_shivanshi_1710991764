import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    /*  TODO list for my feature
     *  1. first char A  :  ABCD => BCD
     *  2. second char A :  BACD => BCD
     *  3. both chars A  :  AABC => BC
     *  4. no chars A    :  BBAA => BBAA
     *  5. single char A :  A => " "
     *  6. someother char:  B => "B"
     *  7. empty char    :  "" => ""
     */


    @Test
    public void FirstCharA()
    {
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals("BCD",RemoveCharacters.checkString("ABCD"));
    }

    @Test
    public void SecondCharA(){
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals("BCD",RemoveCharacters.checkString("BACD"));
    }

    @Test
    public void BothCharsA(){
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals("BC",RemoveCharacters.checkString("AABC"));
    }

    @Test
    public void NoCharsA(){
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals("BBAA",RemoveCharacters.checkString("BBAA"));
    }

    @Test
    public void SingleCharA(){
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals(" ",RemoveCharacters.checkString("A"));
    }

    @Test
    public void SomeotherChar(){
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals("B",RemoveCharacters.checkString("B"));
    }

    @Test
    public void EmptyChar(){
        RemoveCharacters RemoveCharacters = new RemoveCharacters();
        assertEquals(" ",RemoveCharacters.checkString(""));
    }
}
