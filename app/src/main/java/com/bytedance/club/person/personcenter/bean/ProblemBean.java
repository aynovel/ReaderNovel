package com.bytedance.club.person.personcenter.bean;import java.io.Serializable;import java.util.List;public class ProblemBean implements Serializable {    public String serverNo;    public long serverTime;    public ResultData resultData;    public class ResultData implements Serializable {        public List<Data> data;        public String msg;        public long status;        public class Data implements Serializable {            public String title;            public String status;            public String sort;            public String id;            public String pid;            public String channel;            public String create_time;            public String content;            public List<list> list;            public class list implements Serializable {                public String title;                public String status;                public String sort;                public String id;                public String pid;                public String channel;                public String create_time;                public String content;            }        }    }}