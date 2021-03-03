package com.Dbconfigration.greatwits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatwits.rasika.EmployeeImplementation;
import com.greatwits.rasika.EmployeeVo;

@Component
public class DataBaseOperation implements EmployeeOperation {
	@Autowired
	EmployeeImplementation abc;

	@Override
	public List<EmployeeVo> Selectall() {
		Iterable<EmployeeVo> findAll = abc.findAll();
		return (List<EmployeeVo>) findAll;
	}

	@Override
	public EmployeeVo selectById(int id) {
		EmployeeVo find = abc.findById(id).orElse(null);

		return find;
	}

	@Override
	public EmployeeVo insert(EmployeeVo employeeVo) {
		EmployeeVo insert = abc.save(employeeVo);

		return insert;
	}

	@Override
	public EmployeeVo update(int id, String name) {
		EmployeeVo findById = abc.findById(id).orElse(null);
		findById.setEmployeeName(name);
		EmployeeVo studentVo = abc.save(findById);
		return studentVo;
	}

	@Override
	public EmployeeVo delete(int id) {
		abc.deleteById(id);
		return null;
	}

}
