package com.bytedance.club.amodel.packges;

import com.google.gson.annotations.SerializedName;

public class BookBuyMultiPackage {

    @SerializedName("ResultData")
    private BookBuyMultiResult result;

    public BookBuyMultiResult getResult() {
        return result;
    }

    public void setResult(BookBuyMultiResult result) {
        this.result = result;
    }


}
