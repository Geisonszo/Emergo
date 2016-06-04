package unlv.erc.emergo.model;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    private User user;
    final int MAXIMUM_LENGHT_NAME = 42;
    final int MAXIMUM_TYPEBLOOD = 3;

    // tests for name

    public void testGetName(){
        user = new User();
        String name = "Peter";
        user.setName("Peter");
        assertEquals(name,user.getName());
    }

    public void testSetName(){
        user = new User();
        user.setName("Maria Joaquina");
        assertEquals("Maria Joaquina", user.getName());
    }

    public void testSetNameEmpty(){
        user = new User();
        user.setName("");
        assertEquals("", user.getName());
    }

    public void testSetNameLowerThree(){
        user = new User();
        user.setName("Ana");
        final int MINIMUM = 3;
        boolean result = true;
        if(user.getName().trim().length()<MINIMUM){
            assertFalse(result);
        }else{
            assertTrue(result);
        }
    }

    public void testSetNameMaximumSize(){
        user = new User();

        user.setName("Pedro Alvares Cabral de Valentina");
        boolean result = true;
        if(user.getName().trim().length()>MAXIMUM_LENGHT_NAME){
            assertFalse(result);
        }else{
            assertTrue(result);
        }
    }

    // tests birthday

    public void testSetBirthday(){
        user = new User();
        user.setBirthday("12/03/1990");
        assertEquals("12/03/1990", user.getBirthday());
    }

    // tests for typeBlood

    public void testSetTypeBloodBiggerThree(){
        user = new User();
        user.setTypeBlood("AB-");
        boolean result = true;
        if(user.getTypeBlood().length()>MAXIMUM_TYPEBLOOD){
            assertFalse(result);
        }else{
            assertTrue(result);
        }
    }

    public void testSetTypeBloodNull() {
        user = new User();
        user.setTypeBlood("AB+");
        boolean result = true;
        if(user.getTypeBlood()==null){
            result = false;
            assertTrue(result);
        }else{
            assertTrue(result);
        }
    }

    public void testSetTypeBloodLowerOrEqualsTwo(){
        User user = new User();
        user.setTypeBlood("A-");
        boolean result = true;
        if(user.getTypeBlood().length()<=MAXIMUM_TYPEBLOOD-1){
            assertTrue(result);
        }else{
            assertFalse(result);
        }
    }
}