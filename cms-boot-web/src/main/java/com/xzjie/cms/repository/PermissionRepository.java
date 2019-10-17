package com.xzjie.cms.repository;

import com.xzjie.cms.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long>, JpaSpecificationExecutor<Permission> {

    List<Permission> findByRoleId(Long roleId);

    int deleteByRoleId(Long roleId);
}
