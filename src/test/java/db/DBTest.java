package db;

import db.service.UserTable;
import org.testng.annotations.Test;

public class DBTest {

    private final UserTable userTable = new UserTable();

    @Test
    void shouldBeAddedAndDeleteAlice() {
        userTable.insertAlice();
        userTable.updateAlice();
        userTable.deleteAlice();
        userTable.selectAllUsers();
    }

    @Test
    void shouldBeAddedAndUpdateAnna(){
        userTable.insertAnna();
        userTable.updateAnna();
        userTable.selectAllUsers();
    }
    @Test
    void shouldBeAddedAndDeleteDaniel(){
        userTable.insertDaniel();
        userTable.deleteDaniel();
        userTable.selectAllUsers();
    }




}

