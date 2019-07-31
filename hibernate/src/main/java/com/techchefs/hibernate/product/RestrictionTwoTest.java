package com.techchefs.hibernate.product;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernate.dto.ProductBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class RestrictionTwoTest {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(ProductBean.class);
		
		Criterion criterion = Restrictions.ilike("productName", "A%");
		criteria.add(criterion);
		
		List<ProductBean> products = criteria.list();
		
		for(ProductBean product:products) {
			log.info("product id : "+ product.getProductId());
			log.info("product name : "+ product.getProductName());
			log.info("product price : "+ product.getPrice());
			log.info("product color : "+ product.getColor());
			log.info("product weight : "+ product.getWeight());
		}
		
	}
}
