package com.brs.sun.model.dao;

import java.util.List;

import com.brs.sun.vo.DepartmentVo;
import com.brs.sun.vo.EmployeeVo;

public interface JsTreeDao {

	public List<DepartmentVo> getDept();
	
	public List<EmployeeVo> getEmp();
}
