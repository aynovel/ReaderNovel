package life.forever.cf.entry;import java.io.Serializable;import java.util.List;public class MsgDetailBean implements Serializable {    public String serverNo;    public long serverTime;    public ResultData resultData;    public static class ResultData implements Serializable {        public String msg;        public long status;        public List<list> list;        public static class list implements Serializable {            public String id;            public String title;            public String sender_id;            public String receiver_id;            public String msg_id;            public String type;            public String status;            public String addtime;            public String content;        }    }}