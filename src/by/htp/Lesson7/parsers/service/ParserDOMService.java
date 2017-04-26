package by.htp.Lesson7.parsers.service;

import java.util.List;
import java.util.Map;

import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;

public interface ParserDOMService {
	public Map<Manager, List<RentUnit>> getAllData();
}
