package com.bytedance.club.amodel.packges;

import com.google.gson.annotations.SerializedName;

public class UserReadingTimeTaskRewardPackage extends BasePackageBean{

    @SerializedName("ResultData")
    private UserReadingTimeTaskRewardResult result;

    public UserReadingTimeTaskRewardResult getResult() {
        return result;
    }

    public void setResult(UserReadingTimeTaskRewardResult result) {
        this.result = result;
    }

}
