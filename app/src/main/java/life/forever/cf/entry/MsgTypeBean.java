package life.forever.cf.entry;import java.io.Serializable;import java.util.List;public class MsgTypeBean implements Serializable {    public String serverNo;    public long serverTime;    public ResultData resultData;    public static class ResultData implements Serializable {        public lists lists;        public String msg;        public long status;        public static class lists implements Serializable {            public User_msg user_msg;            public Sys_msg sys_msg;            public static class Sys_msg implements Serializable {                public long type;                public List<list> list;                public long unread_count;                public static class list implements Serializable {                    public String msg_id;                    public String title;                    public String status;                    public String id;                    public String receiver_id;                    public String addtime;                    public String type;                    public String content;                    public String sender_id;                }            }            public static class User_msg implements Serializable {                public long type;                public List<list> list;                public long unread_count;                public static class list implements Serializable {                    public String msg_id;                    public String title;                    public String status;                    public String id;                    public String receiver_id;                    public String addtime;                    public String type;                    public String content;                    public String sender_id;                }            }        }    }}