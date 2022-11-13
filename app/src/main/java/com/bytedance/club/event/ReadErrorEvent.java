package com.bytedance.club.event;

public class ReadErrorEvent {
    public Boolean error;

    public ReadErrorEvent(Boolean error){
        this.error = error;
    }
}
