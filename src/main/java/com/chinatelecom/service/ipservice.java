package com.chinatelecom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinatelecom.model.Area;
import com.chinatelecom.model.IPSegment;
import com.chinatelecom.model.Ip;
import com.chinatelecom.model.IpMap;
import com.chinatelecom.model.ResPool;

@Service
public interface ipservice {
    public ResPool getResPoolInfo(int PoolID);
    public List<String> getAreaNameByResPoolID(int ResPoolID);
    public Area getAreaInfoByAreaID(int AreaID);
    public List<String> getSegmentIpByAreaID(int AreaID);
    public IPSegment getSegmentIpInfoBySegmentID(int SegmentID);
    public List<String> getIpNameBySegmentIpID(int SegmentID);
    public Ip getIpInfoByIpID(int IpID);
    public IpMap getIpMapByMapID(int MapID);
}
