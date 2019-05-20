package com.mazh.ssm.service;

import com.mazh.ssm.pojo.Visits;
import com.mazh.ssm.pojo.VisitsVO;

import java.util.List;

public interface VisitsService {
    public List<Visits> getAllVisits() throws Exception;

    public Visits getOneVisits(String session) throws Exception;

    public void insertVisits(Visits visits) throws Exception;

    public void updateVisits(Visits visits) throws Exception;

    public void updateAllVisits(VisitsVO VisitsVO) throws Exception;

    public void deleteVisits(String session) throws Exception;

    public List<Visits> getAllVisitsWhere(Visits visits) throws Exception;

    public void deleteCheckVisits(String[] ids) throws Exception;
}
