package org.glucosio.android.db;

import org.glucosio.android.Constants;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReminderTest {

    private Reminder reminderTester;

    @Before
    public void setup(){
        reminderTester = new Reminder();
    }

    @Test
    public void SetsId_WhenProvided() {
        int id = 100;

        reminderTester.setId(id);

        assertThat(reminderTester.getId()).isEqualTo(id);
    }
}
