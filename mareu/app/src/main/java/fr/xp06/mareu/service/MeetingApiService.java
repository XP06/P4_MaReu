package fr.xp06.mareu.service;

import java.util.Date;
import java.util.List;

import fr.xp06.mareu.model.Meeting;

/** Meeting Api Service
 */
public interface MeetingApiService {

    /**
     * @return {@Link List}
     */
    List<Meeting> getMeetings();


    /**
     * Reset meeting List
     */
    void resetMeetings();

    /**
     * Add a meeting
     *
     * @param  meeting
     */
    void addMeeting(Meeting meeting);

    /**
     * Delete a meeting
     *
     * @param meeting
     */
    void deleteMeeting(Meeting meeting);

    List<Meeting> getFilteredMeetings(Date fDate, List<fr.xp06.mareu.model.Place> fPlaces);

}

