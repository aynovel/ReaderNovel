package com.bytedance.club.niceratingbar;


public enum RatingStatus {
    Disable(0),
    Enable(1);

    int mStatus;

    RatingStatus(int statusValue) {
        this.mStatus = statusValue;
    }

    public static RatingStatus getStatus(int status) {
        return status == Disable.mStatus ? Disable : Enable;
    }
}
