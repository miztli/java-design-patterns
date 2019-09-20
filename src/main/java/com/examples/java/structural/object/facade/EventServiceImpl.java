package com.examples.java.structural.object.facade;

public class EventServiceImpl implements EventsService
{
    @Override
    public void logEvent(final String event)
    {
        System.out.println(String.format("Event: %s", event));
    }
}
