package beilei.report.service;

import beilei.report.dao.ReportBaseInfoDao;
import beilei.report.entity.ReportBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportBaseInfoService {
    @Autowired
    private ReportBaseInfoDao reportBaseInfoDao;

    public ReportBaseInfo getById(Long id) {
        return reportBaseInfoDao.getById(id);
    }
}
