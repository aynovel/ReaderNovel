package com.bytedance.club.amodel.packges;

import com.google.gson.annotations.SerializedName;

public class BookChapterPackage extends BasePackageBean {
    @SerializedName("ResultData")
    private BookCatalogResult result;

    public BookCatalogResult getResult() {
        return result;
    }

    public void setResult(BookCatalogResult result) {
        this.result = result;
    }
}
