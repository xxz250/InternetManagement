package com.chinatelecom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinatelecom.model.Site;

@Service
public interface webservice {
    public List<Site> getSiteInfoBySiteID(int siteID);
}
