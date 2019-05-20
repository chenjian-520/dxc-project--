package com.mazh.ssm.service;

import com.mazh.ssm.mapper.WeblogMapper;
import com.mazh.ssm.pojo.Weblog;
import com.mazh.ssm.pojo.WeblogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeblogServiceImpl implements WeblogService {

    @Autowired(required = true)
    private WeblogMapper weblogMapper;

    @Override
    public List<Weblog> getAllWeblog() throws Exception {
        return weblogMapper.getAllWeblog();
    }

    @Override
    public List<Weblog> getOneWeblog(String Remote_addr) throws Exception {
        return weblogMapper.getOneWeblog(Remote_addr);
    }

    @Override
    public void insertWeblog(Weblog weblog) throws Exception {
        weblogMapper.insertWeblog(weblog);
    }

    @Override
    public void updateWeblog(Weblog weblog) throws Exception {
        weblogMapper.updateWeblog(weblog);
    }

    @Override
    public void deleteWeblog(String Remote_addr) throws Exception {
        weblogMapper.deleteWeblog(Remote_addr);
    }

    @Override
    public List<Weblog> getAllWeblogWhere(Weblog weblog) throws Exception {
        return weblogMapper.getAllWeblogWhere(weblog);
    }

    @Override
    public void deleteCheckWeblog(String[] ids) throws Exception {
        for(String id : ids){
            weblogMapper.deleteWeblog(id);
        }
    }

    @Override
    public void updateAllWeblog(WeblogVO weblogVO) throws Exception {
        // TODO Auto-generated method stub
        for(Weblog weblog :  weblogVO.getWeblogList()){
            weblogMapper.updateWeblog(weblog);
        }
    }
}
