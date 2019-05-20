package com.mazh.ssm.service;

import com.mazh.ssm.pojo.Weblog;
import com.mazh.ssm.pojo.WeblogVO;

import java.util.List;

public interface WeblogService {
    public List<Weblog> getAllWeblog() throws Exception;

    public List<Weblog> getOneWeblog(String Remote_addr) throws Exception;

    public void insertWeblog(Weblog weblog) throws Exception;

    public void updateWeblog(Weblog weblog) throws Exception;

    public void deleteWeblog(String Remote_addr) throws Exception;

    public List<Weblog> getAllWeblogWhere(Weblog weblog) throws Exception;

    public void updateAllWeblog(WeblogVO weblogVO) throws Exception;

    public void deleteCheckWeblog(String[] ids) throws Exception;
}
