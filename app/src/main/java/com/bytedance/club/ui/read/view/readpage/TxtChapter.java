package com.bytedance.club.ui.read.view.readpage;



public class TxtChapter{

    String bookId;
    String siteId;



    String chapterId;

    //章节的链接(网络)
    String link;

    //章节名(共用)
    String title;

    //章节内容在文章中的起始位置(本地)
    long start;
    //章节内容在文章中的终止位置(本地)
    long end;

    //章节内容字数
    int textCount;

    int chapterOrder;//章节序列

    public  int errorTimes = 0;

    public void setChapterOrder(int chapterOrder) {
        this.chapterOrder = chapterOrder;
    }

    public int getChapterOrder() {
        return chapterOrder;
    }



    public String getBookId() {
        return bookId;
    }

    public void setBookId(String id) {
        this.bookId = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public void setTextCount(int count) {
        textCount = count;
    }

    public int getTextCount() {
        return textCount;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    private ChapterPageStatusInfo mChatperStatusInfo;


    public ChapterPageStatusInfo getmChatperStatusInfo() {
        return mChatperStatusInfo;
    }

    public void setmChatperStatusInfo(ChapterPageStatusInfo mChatperStatusInfo) {
        if(mChatperStatusInfo != null)
        {
            mChatperStatusInfo.setChapterOrder(this.chapterOrder);
        }
        this.mChatperStatusInfo = mChatperStatusInfo;
    }





    @Override
    public String toString() {
        return "TxtChapter{" +
                "title='" + title + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
