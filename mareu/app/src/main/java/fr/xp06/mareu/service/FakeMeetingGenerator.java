package fr.xp06.mareu.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import fr.xp06.mareu.model.Meeting;

public class FakeMeetingGenerator {
    private static Date currentDate = new Date(System.currentTimeMillis());
    private static Date tomorrow = new Date(System.currentTimeMillis() + 86400000);

    public static List<Meeting> FAKE_MEETINGS = Arrays.asList(
            new Meeting(1, 0xFF5E855F, currentDate, 6, "Réunion 1", "pili.xavier06@gmail.com,pili.xavier06@gmail.com,pili.xavier06@gmail.com"),
            new Meeting(2, 0xFF5E755F, tomorrow, 6, "Réunion 2", "pili.xavier06@gmail.com,pili.xavier06@gmail.com,pili.xavier06@gmail.com"),
            new Meeting(3, 0xFF5E888F, currentDate, 9, "Réunion 3", "pili.xavier06@gmail.com,pili.xavier06@gmail.com,pili.xavier06@gmail.com"),
            new Meeting(4, 0xFF5E155F, tomorrow, 9, "Réunion 4", "pili.xavier06@gmail.com,pili.xavier06@gmail.com,pili.xavier06@gmail.com"),
            new Meeting(5, 0xFF5E668F, currentDate, 1, "Réunion 5", "pili.xavier06@gmail.com,pili.xavier06@gmail.com,pili.xavier06@gmail.com"),
            new Meeting(6, 0xFF5E338F, currentDate, 10, "Réunion 6", "pili.xavier06@gmail.com,pili.xavier06@gmail.com,pili.xavier06@gmail.com")
    );

    public FakeMeetingGenerator() throws ParseException {
    }

    static List<Meeting> generateMeetings() {
        return new ArrayList<>(FAKE_MEETINGS);
    }
}
