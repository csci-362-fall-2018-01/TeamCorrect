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

    @Test
    public void SetsId_WhenProvided2() {
        int id = 123456789;

        reminderTester.setId(id);

        assertThat(reminderTester.getId()).isEqualTo(id);
    }
    @Test
    public void SetsMetric_WhenProvided() {
        String metric = "0mL";

        reminderTester.setMetric(metric);

        assertThat(reminderTester.getMetric()).isEqualTo(metric);
    }
    @Test
    public void SetsMetric_WhenProvided2() {
        String metric = "9L";

        reminderTester.setMetric(metric);

        assertThat(reminderTester.getMetric()).isEqualTo(metric);
    }
    @Test
    public void SetsActive_WhenProvided() {
        boolean active = true;

        reminderTester.setActive(active);

        assertThat(reminderTester.isActive()).isEqualTo(active);
    }
}
