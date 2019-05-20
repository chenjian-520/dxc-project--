package com.mazh.ssm.mapper;


import com.mazh.ssm.pojo.Visits;

import java.util.List;

public interface VisitsMapper {
    public List<Visits> getAllVisits() throws Exception;

    public Visits getOneVisits(String session) throws Exception;

    public void insertVisits(Visits visits) throws Exception;

    public void updateVisits(Visits visits) throws Exception;

    public void deleteVisits(String session) throws Exception;

    public List<Visits> getAllVisitsWhere(Visits Visits) throws Exception;

}
