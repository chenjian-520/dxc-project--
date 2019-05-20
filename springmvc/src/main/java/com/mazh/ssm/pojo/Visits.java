package com.mazh.ssm.pojo;

import java.util.Objects;

public class Visits {
    private String session;
    private String remote_addr;
    private String inTime;
    private String outTime;
    private String inPage;
    private String outPage;
    private String referal;
    private int pageVisits;

    public Visits() {
        super();
    }

    public String getSession() {
        return session;
    }

    public String getRemote_addr() {
        return remote_addr;
    }

    public void setRemote_addr(String remote_addr) {
        this.remote_addr = remote_addr;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getInPage() {
        return inPage;
    }

    public void setInPage(String inPage) {
        this.inPage = inPage;
    }

    public String getOutPage() {
        return outPage;
    }

    public void setOutPage(String outPage) {
        this.outPage = outPage;
    }

    public String getReferal() {
        return referal;
    }

    public void setReferal(String referal) {
        this.referal = referal;
    }

    public int getPageVisits() {
        return pageVisits;
    }

    public void setPageVisits(int pageVisits) {
        this.pageVisits = pageVisits;
    }

    @Override
    public String toString() {
        return "Visits{" +
                "session='" + session + '\'' +
                ", remote_addr='" + remote_addr + '\'' +
                ", inTime='" + inTime + '\'' +
                ", outTime='" + outTime + '\'' +
                ", inPage='" + inPage + '\'' +
                ", outPage='" + outPage + '\'' +
                ", referal='" + referal + '\'' +
                ", pageVisits=" + pageVisits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visits visits = (Visits) o;
        return pageVisits == visits.pageVisits &&
                Objects.equals(session, visits.session) &&
                Objects.equals(remote_addr, visits.remote_addr) &&
                Objects.equals(inTime, visits.inTime) &&
                Objects.equals(outTime, visits.outTime) &&
                Objects.equals(inPage, visits.inPage) &&
                Objects.equals(outPage, visits.outPage) &&
                Objects.equals(referal, visits.referal);
    }

    @Override
    public int hashCode() {

        return Objects.hash(session, remote_addr, inTime, outTime, inPage, outPage, referal, pageVisits);
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Visits(String session, String remote_addr, String inTime, String outTime, String inPage, String outPage, String referal, int pageVisits) {
        this.session = session;
        this.remote_addr = remote_addr;
        this.inTime = inTime;
        this.outTime = outTime;
        this.inPage = inPage;
        this.outPage = outPage;
        this.referal = referal;
        this.pageVisits = pageVisits;
    }
}
