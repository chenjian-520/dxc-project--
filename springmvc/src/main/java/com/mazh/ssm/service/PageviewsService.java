package com.mazh.ssm.service;

import com.mazh.ssm.pojo.Pageviews;
import com.mazh.ssm.pojo.PageviewsVO;

import java.util.List;

public interface PageviewsService {
    public List<Pageviews> getAllPageviews() throws Exception;

    public Pageviews getOnePageviews(String session) throws Exception;

    public void insertPageviews(Pageviews pageviews) throws Exception;

    public void updatePageviews(Pageviews pageviews) throws Exception;
    public void updateAllPageviews(PageviewsVO pageviewsVO) throws Exception;

    public void deletePageviews(String session) throws Exception;

    public List<Pageviews> getAllPageviewsWhere(Pageviews pageviews) throws Exception;

    public void deleteCheckPageviews(String[] ids) throws Exception;

}
