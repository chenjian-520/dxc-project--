package com.mazh.ssm.service;

import com.mazh.ssm.mapper.VisitsMapper;
import com.mazh.ssm.pojo.Visits;
import com.mazh.ssm.pojo.VisitsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitsServiceImpl implements VisitsService {

    @Autowired(required = true)
    private VisitsMapper visitsMapper;

    @Override
    public List<Visits> getAllVisits() throws Exception {
        return visitsMapper.getAllVisits();
    }

    @Override
    public Visits getOneVisits(String session) throws Exception {
        return visitsMapper.getOneVisits(session);
    }

    @Override
    public void insertVisits(Visits visits) throws Exception {
        visitsMapper.insertVisits(visits);
    }

    @Override
    public void updateVisits(Visits visits) throws Exception {
        visitsMapper.updateVisits(visits);
    }

    @Override
    public void deleteVisits(String session) throws Exception {
        visitsMapper.deleteVisits(session);
    }

    @Override
    public List<Visits> getAllVisitsWhere(Visits Visits) throws Exception {
        return visitsMapper.getAllVisitsWhere(Visits);
    }

    @Override
    public void deleteCheckVisits(String[] ids) throws Exception {
        for(String id : ids){
            visitsMapper.deleteVisits(id);
        }
    }

    @Override
    public void updateAllVisits(VisitsVO visitsVO) throws Exception {
        // TODO Auto-generated method stub
        for(Visits visits :  visitsVO.getVisitsList()){
            visitsMapper.updateVisits(visits);
        }
    }
}
