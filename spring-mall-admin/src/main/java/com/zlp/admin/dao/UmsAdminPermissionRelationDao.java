package com.zlp.admin.dao;

import com.zlp.mbg.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;
import java.util.*;

public interface UmsAdminPermissionRelationDao {

    int insertList(@Param("list")List<UmsAdminPermissionRelation> list);
}
