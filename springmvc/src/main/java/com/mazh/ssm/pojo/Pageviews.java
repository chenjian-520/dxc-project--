package com.mazh.ssm.pojo;

import java.util.Objects;

public class Pageviews {
    private String session;
    private String key1;
    private String remote_addr;
    private String timestr;
    private String tequest;
    private int step;
    private int staylong;
    private String referal;
    private String useragent;
    private String bytes_send;
    private String status;

    public Pageviews() {
        super();
    }

    public Pageviews(String session, String key1, String remote_addr, String timestr, String tequest, int step, int staylong, String referal, String useragent, String bytes_send, String status) {
        this.session = session;
        this.key1 = key1;
        this.remote_addr = remote_addr;
        this.timestr = timestr;
        this.tequest = tequest;
        this.step = step;
        this.staylong = staylong;
        this.referal = referal;
        this.useragent = useragent;
        this.bytes_send = bytes_send;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pageviews{" +
                "session='" + session + '\'' +
                ", key1='" + key1 + '\'' +
                ", remote_addr='" + remote_addr + '\'' +
                ", timestr='" + timestr + '\'' +
                ", tequest='" + tequest + '\'' +
                ", step=" + step +
                ", staylong=" + staylong +
                ", referal='" + referal + '\'' +
                ", useragent='" + useragent + '\'' +
                ", bytes_send='" + bytes_send + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pageviews pageviews = (Pageviews) o;
        return step == pageviews.step &&
                staylong == pageviews.staylong &&
                Objects.equals(session, pageviews.session) &&
                Objects.equals(key1, pageviews.key1) &&
                Objects.equals(remote_addr, pageviews.remote_addr) &&
                Objects.equals(timestr, pageviews.timestr) &&
                Objects.equals(tequest, pageviews.tequest) &&
                Objects.equals(referal, pageviews.referal) &&
                Objects.equals(useragent, pageviews.useragent) &&
                Objects.equals(bytes_send, pageviews.bytes_send) &&
                Objects.equals(status, pageviews.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(session, key1, remote_addr, timestr, tequest, step, staylong, referal, useragent, bytes_send, status);
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getRemote_addr() {
        return remote_addr;
    }

    public void setRemote_addr(String remote_addr) {
        this.remote_addr = remote_addr;
    }

    public String getTimestr() {
        return timestr;
    }

    public void setTimestr(String timestr) {
        this.timestr = timestr;
    }

    public String getTequest() {
        return tequest;
    }

    public void setTequest(String tequest) {
        this.tequest = tequest;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getStaylong() {
        return staylong;
    }

    public void setStaylong(int staylong) {
        this.staylong = staylong;
    }

    public String getReferal() {
        return referal;
    }

    public void setReferal(String referal) {
        this.referal = referal;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public String getBytes_send() {
        return bytes_send;
    }

    public void setBytes_send(String bytes_send) {
        this.bytes_send = bytes_send;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}