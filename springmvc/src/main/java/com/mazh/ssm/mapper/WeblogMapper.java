package com.mazh.ssm.mapper;

import com.mazh.ssm.pojo.Weblog;

import java.util.List;

public interface WeblogMapper {
    public List<Weblog> getAllWeblog() throws Exception;

    public List<Weblog> getOneWeblog(String Remote_addr) throws Exception;

    public void insertWeblog(Weblog weblog) throws Exception;

    public void updateWeblog(Weblog weblog) throws Exception;

    public void deleteWeblog(String Remote_addr) throws Exception;

    public List<Weblog> getAllWeblogWhere(Weblog weblog) throws Exception;

}
