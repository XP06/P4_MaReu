package fr.xp06.mareu.di;


import fr.xp06.mareu.service.DummyMeetingApiService;
import fr.xp06.mareu.service.MeetingApiService;

public class DI {
    private static final MeetingApiService service;

    static {
        service = new DummyMeetingApiService();
    }

    /**
     * Get a new instance on ]{@Link MeetingApiService}
     */
    public static MeetingApiService getMeetingApiService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link MeetingApiService}. Useful for tests, so we ensure the context is clean.
     *
     * @return
     */
    public static MeetingApiService getNewInstanceApiService() {
        return new DummyMeetingApiService();
    }
}
