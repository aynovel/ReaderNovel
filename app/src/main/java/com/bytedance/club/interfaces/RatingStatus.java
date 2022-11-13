package com.bytedance.club.interfaces;


public enum RatingStatus {
    Disable(0),
    Enable(1);

    public int mStatus;

    RatingStatus(int statusValue) {
        this.mStatus = statusValue;
    }

    public static RatingStatus getStatus(int status) {
        return status == Disable.mStatus ? Disable : Enable;
    }
}
