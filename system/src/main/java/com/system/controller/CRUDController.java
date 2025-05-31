package com.system.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.system.model.Student;

public class CRUDController<T, M> {
	private Map<T, M> objects = new HashMap<T, M>();

	public Map<T, M> getObjects() {
		return objects;
	}

	public void setObjects(Map<T, M> objects) {
		this.objects = objects;
	}
	
	@GetMapping("/")
	public Map<T, M> getAll() {
		return objects;
	}
	
	@GetMapping("/{id}")
	public M getById(@PathVariable("id") T id) {
		return objects.get(id);
	}
	
	@PostMapping("/")
	public String add(@RequestBody M object, @RequestParam T id) {
		objects.put(id, object);
		return "Object added successfully";
	}
}
