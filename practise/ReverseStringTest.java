
public class ReverseStringTest {
    
    ReverseString reverseString;
    
    @BeforeEach
    void setup(){
        reverseString = new ReverseString();
    }

    @Test
    public void testNormal(){
        String input = "darshan";
        String output = "darshan";
        assertEquals(output,reverseString.reverse(input));
    }

    @Test
    public void emptyString(){
        String input = "";
        String output = "";
        assertEqual(output,reverseString.reverse(input));
    }

    @test
    public void nullInput(){
        assertThrows(NullPointerException.class, () -> {
            reverseString.reverse(null);
        });
    }
}
