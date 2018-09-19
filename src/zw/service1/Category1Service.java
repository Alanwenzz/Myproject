package zw.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zw.mapper.Category1Mapper;
import zw.pojo1.Ccategory1;
@Service
public class Category1Service {
	@Autowired
	private Category1Mapper category1Mapper;
	public Ccategory1 get(Ccategory1 cc) {
		return category1Mapper.get(cc.getId());
	}
}
