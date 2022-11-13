package com.bytedance.club.amodel.packges;

import com.google.gson.annotations.SerializedName;

public class UserRecevieTaskRewardPackage extends BasePackageBean{

    @SerializedName("ResultData")
    private UserRecevieTaskRewardResult result;

    public UserRecevieTaskRewardResult getResult() {
        return result;
    }

    public void setResult(UserRecevieTaskRewardResult result) {
        this.result = result;
    }

}
