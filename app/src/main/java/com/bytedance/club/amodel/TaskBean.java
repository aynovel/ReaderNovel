package com.bytedance.club.amodel;


import com.bytedance.club.amodel.bean.TaskDetailBean;

public class TaskBean {
    public String serverNo;
    public long serverTime;
    public ResultData resultData;

    public  class ResultData{
        public String msg;
        public long status;
        public TaskDetailBean lists;
    }
}
