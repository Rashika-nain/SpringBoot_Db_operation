package com.greatwits.rashika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dbconfigration.greatwits.DataBaseOperation;
import com.Dbconfigration.greatwits.EmployeeOperation;
import com.greatwits.rasika.EmployeeVo;

@RestController
@RequestMapping(path = "/home")
public class ControlllerOperation implements EmployeeOperation {
	@Autowired
	private DataBaseOperation dboption;

	@GetMapping("/all")
	@Override
	public List<EmployeeVo> Selectall() {
		List<EmployeeVo> list = dboption.Selectall();
		return list;
	}

	@GetMapping("/all/{id}")
	@Override
	public EmployeeVo selectById(@PathVariable("id") int id) {
		EmployeeVo employeeVo = dboption.selectById(id);
		return employeeVo;
	}

	@PostMapping("/insert")
	@Override
	public EmployeeVo insert(@RequestBody EmployeeVo employeeVo) {
		EmployeeVo employeeVo2 = dboption.insert(employeeVo);
		return employeeVo2;
	}

	@PutMapping("/update/{id}/{name}")
	@Override
	public EmployeeVo update(@PathVariable("id") int id, @PathVariable("name") String name) {
		EmployeeVo updateEmployeeVo = dboption.update(id, name);
		return updateEmployeeVo;
	}

	@DeleteMapping("/delete/{id}")
	@Override
	public EmployeeVo delete(@PathVariable("id") int id) {
		EmployeeVo delete = dboption.delete(id);
		return delete;
	}

}
