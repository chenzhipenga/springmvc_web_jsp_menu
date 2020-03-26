package beilei.report.dao;

import beilei.report.entity.ReportBaseInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportBaseInfoDao {
    ReportBaseInfo getById(@Param("id") Long id);
}
