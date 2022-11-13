package com.bytedance.club.amodel.packges;

import com.bytedance.club.amodel.bean.ChapterContentBean;
import com.google.gson.annotations.SerializedName;

public class BookChapterContentResult extends BasePackageBean {
    @SerializedName("ResultData")
    private ChapterContentBean result;

    public ChapterContentBean getResult() {
        return result;
    }

    public void setResult(ChapterContentBean result) {
        this.result = result;
    }
}
