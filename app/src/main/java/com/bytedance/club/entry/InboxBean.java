package com.bytedance.club.entry;import java.io.Serializable;import java.util.List;public class InboxBean implements Serializable {    public String serverNo;    public long serverTime;    public ResultData resultData;    public class ResultData implements Serializable {        public String msg;        public long status;        public Lists list;        public class Lists implements Serializable{            public Rec_info rec_info;            public String template;            public String template_ios;            public List<Rec_list> rec_list;            public class Rec_info implements Serializable{                public String isimg;                public String num;                public String rec_id;                public String template;                public String recimg;                public String length;                public String display;                public String endtime;                public String addtime;                public String sort;                public String type;                public Object rec_tag;                public String alias;                public String intro;                public String title;                public String pid;                public String isrand;                public String ishot;                public String starttime;            }            public class Rec_list implements Serializable{                public String channel;                public String rec_id;                public String h_url;                public String status;                public String config_num;                public String addtime;                public String rec_tag;                public String sort;                public String h_cover;                public String advertise_type;                public String intro;                public String title;                public String recimg;                public String id;                public String js_dispatch;                public String wid;                public Advertise_data advertise_data;                public String pack;                public String score;                public String author;                public String update_time;                public String wtype;                public String sortname;                public String parent_sort;                public String description;                public class Advertise_data implements Serializable{                    public String st;                    public String path;                    public String su;                    public String ifreash;                    public String is;                    public String ht;                    public String ps;                    public String cid;                    public String readflag;                    public String wid;                    public String url;                }            }        }    }}