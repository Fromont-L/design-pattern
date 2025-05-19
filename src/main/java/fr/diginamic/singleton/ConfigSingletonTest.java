package fr.diginamic.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfigSingletonTest {
    @Test
    public void testLectureValeursConfig() {
        ConfigSingleton config = ConfigSingleton.getInstance();

        String url = config.getProperty("db.url");
        String user = config.getProperty("db.user");
        String mdp = config.getProperty("db.password");

        assertEquals("jdbc:mysql://localhost:3306/mabase", url);
        assertEquals("root", user);
        assertEquals("1234", mdp);

    }


}
