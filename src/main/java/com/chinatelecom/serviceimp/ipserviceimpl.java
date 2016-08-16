/*package com.chinatelecom.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinatelecom.dao.ipDao;
import com.chinatelecom.model.Area;
import com.chinatelecom.model.IPSegment;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;
import com.chinatelecom.service.ipservice;

public class ipserviceimpl implements ipservice{

    @Autowired
    private ipDao ipInfo;
    
   // @Override
    public ResPool getResPoolInfo(int PoolID){
        ResPool pool=ipInfo.getResPoolInfo(PoolID);
        return pool;
    }
    public List<String> getAreaNameByResPoolID(int ResPoolID){
        List<String> areaname=ipInfo.getAreaNameByResPoolID(ResPoolID);
        return areaname;
    }
    public Area getAreaInfoByAreaID(int AreaID){
        Area areaname=ipInfo.getAreaInfoByAreaID(AreaID);
        return areaname;
    }
    public List<String> getSegmentIpByAreaID(int AreaID){
        List<String> segment=ipInfo.getSegmentIpByAreaID(AreaID);
        return segment;
    }
    public IPSegment getSegmentIpInfoBySegmentID(int SegmentID){
        IPSegment segmentipinfo=ipInfo.getSegmentIpInfoBySegmentID(SegmentID);
        return segmentipinfo;
    }
    public List<String> getIpNameBySegmentIpID(int SegmentID){
        List<String> ipname=ipInfo.getIpNameBySegmentIpID(SegmentID);
        return ipname;
    }
    public Ip getIpInfoByIpID(int IpID){
        Ip ip=ipInfo.getIpInfoByIpID(IpID);
        return ip;
    }
    public IpMap getIpMapByMapID(int MapID){
        IpMap ipMap=ipInfo.getIpMapByMapID(MapID);
        return ipMap;
    }
}
*/