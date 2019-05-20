package com.mazh.ssm.service;

import com.mazh.ssm.mapper.PageviewsMapper;
import com.mazh.ssm.pojo.Pageviews;
import com.mazh.ssm.pojo.PageviewsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageviewsServiceImpl implements PageviewsService{

    @Autowired(required = true)
    private PageviewsMapper pageviewsMapper;

    @Override
    public List<Pageviews> getAllPageviews() throws Exception {
        return pageviewsMapper.getAllPageviews();
    }

    @Override
    public Pageviews getOnePageviews(String session) throws Exception {
        return pageviewsMapper.getOnePageviews(session);
    }

    @Override
    public void insertPageviews(Pageviews pageviews) throws Exception {
        pageviewsMapper.insertPageviews(pageviews);
    }

    @Override
    public void updatePageviews(Pageviews pageviews) throws Exception {
        pageviewsMapper.updatePageviews(pageviews);
    }

    @Override
    public void deletePageviews(String session) throws Exception {
        pageviewsMapper.deletePageviews(session);
    }

    @Override
    public List<Pageviews> getAllPageviewsWhere(Pageviews pageviews) throws Exception {
        return pageviewsMapper.getAllPageviewsWhere(pageviews);
    }

    @Override
    public void deleteCheckPageviews(String[] ids) throws Exception {
        for(String id : ids){
            pageviewsMapper.deletePageviews(id);
        }
    }

    @Override
    public void updateAllPageviews(PageviewsVO pageviewsVO) throws Exception {
        // TODO Auto-generated method stub
        for(Pageviews pageviews :  pageviewsVO.getPageviewsList()){
            pageviewsMapper.updatePageviews(pageviews);
        }
    }
}
