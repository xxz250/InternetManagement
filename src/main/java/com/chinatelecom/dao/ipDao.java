package com.chinatelecom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinatelecom.dao.mapper.IpMapper;
import com.chinatelecom.model.Area;
import com.chinatelecom.model.IPSegment;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;

@Repository
public class ipDao {
    @Autowired
    private IpMapper map;
    
    /*public ResPool getResPoolInfo(int PoolID){
        return map.getResPoolInfo(PoolID);
    }
    public List<String> getAreaNameByResPoolID(int ResPoolID){
        return map.getAreaNameByResPoolID(ResPoolID);
    }
    public Area getAreaInfoByAreaID(int AreaID){
        return map.getAreaInfoByAreaID(AreaID); 
    }
    public List<String> getSegmentIpByAreaID(int AreaID){
        return map.getSegmentIpByAreaID(AreaID);
    }
    public IPSegment getSegmentIpInfoBySegmentID(int SegmentID){
        return map.getSegmentIpInfoBySegmentID(SegmentID);
    }
    public List<String> getIpNameBySegmentIpID(int SegmentID){
        return map.getIpNameBySegmentIpID(SegmentID);
    }
    public Ip getIpInfoByIpID(int IpID){
        return map.getIpInfoByIpID(IpID);
    }
    public IpMap getIpMapByMapID(int MapID){
        return map.getIpMapByMapID(MapID);
    }*/

}
