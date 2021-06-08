package fr.xp06.mareu.events;


import fr.xp06.mareu.model.Meeting;

public class DeleteMeetingEvent {
    public Meeting meeting;

    public DeleteMeetingEvent(Meeting meeting) {
        this.meeting = meeting;
    }
}
