package com.Dbconfigration.greatwits;
import java.util.List;

import com.greatwits.rasika.EmployeeVo;
public interface EmployeeOperation {
	public List<EmployeeVo> Selectall();
	public EmployeeVo selectById(int id);
	public EmployeeVo insert(EmployeeVo employeeVo);
	public EmployeeVo update(int id, String name);
	public EmployeeVo delete(int id);

}
