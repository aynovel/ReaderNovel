package com.bytedance.club.amodel;import java.io.Serializable;import java.util.List;public class BookShelfRec implements Serializable {    public String serverNo;    public long serverTime;    public ResultData resultData;    public static class ResultData implements Serializable {        public shelfRecommend shelfrecommend;        public String msg;        public long status;        public static class shelfRecommend implements Serializable {            public List<Rec_list> rec_list;            public Rec_info rec_info;            public class Rec_info implements Serializable {                public String isimg;                public String num;                public String rec_id;                public String template;                public String recimg;                public String length;                public String display;                public String endtime;                public String addtime;                public String sort;                public String type;                public String rec_tag;                public String alias;                public String intro;                public String title;                public String pid;                public String isrand;                public String ishot;                public String starttime;            }            public class Rec_list implements Serializable {                public String channel;                public String score;                public String rec_id;                public String author;                public String h_url;                public String status;                public String config_num;                public String addtime;                public String update_time;                public String rec_tag;                public String sort;                public String h_cover;                public String wtype;                public String sortname;                public String advertise_type;                public String intro;                public List<Tag> tag;                public String title;                public String recimg;                public String id;                public String parent_sort;                public String js_dispatch;                public String wid;                public String description;                public Advertise_data advertise_data;                public String pack;                public class Tag implements Serializable {                    public String id;                    public String tag;                }                public class Advertise_data implements Serializable {                    public String cid;                    public String readflag;                    public String wid;                    public String st;                    public String path;                    public String su;                    public String ifreash;                    public String is;                    public String ht;                    public String url;                    public String ps;                    public String homeindex;                }            }        }    }}