package com.bytedance.club.amodel.packges;

import java.io.Serializable;

public class BasePackageBean<T> implements Serializable {
    public boolean ok;
    public String reason;
    public int error_code;
    public int resultcode;

    public int serverTime;
    public String ServerNo;
}
