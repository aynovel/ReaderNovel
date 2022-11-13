package com.bytedance.club.amodel.packges;

import com.google.gson.annotations.SerializedName;

public class UserAllTasksPackage extends BasePackageBean{

    @SerializedName("ResultData")
    private UserAllTasksResult result;


    public UserAllTasksResult getResult() {
        return result;
    }

    public void setResult(UserAllTasksResult result) {
        this.result = result;
    }
}
