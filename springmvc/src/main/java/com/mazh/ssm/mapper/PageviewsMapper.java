package com.mazh.ssm.mapper;

import com.mazh.ssm.pojo.Pageviews;

import java.util.List;

public interface PageviewsMapper {
    public List<Pageviews> getAllPageviews() throws Exception;

    public Pageviews getOnePageviews(String session) throws Exception;

    public void insertPageviews(Pageviews pageviews) throws Exception;

    public void updatePageviews(Pageviews pageviews) throws Exception;

    public void deletePageviews(String session) throws Exception;

    public List<Pageviews> getAllPageviewsWhere(Pageviews pageviews) throws Exception;

}
