package com.smoner.beanlifecycle.applicationcontext;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwareBeanPostProcessor extends
		InstantiationAwareBeanPostProcessorAdapter {
	public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException{
		if("car".equals(beanName)){
			System.out.println("实例化前，InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
		}
		return null;
	}
	public boolean postProcessAfterInstantiation(Object bean,String beanName)throws BeansException{
		if("car".equals(beanName)){
			System.out.println("实例化后，InstantiationAwarePostProcessor.postprocessAfterInstantiation");
		}
		return true;
	}
	
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,PropertyDescriptor[] pds,Object bean,String beanName)throws BeansException{
		if("car".equals(beanName)){
			System.out.println("InstantiationAwarePostProcessor.postProcessPropertyValues");
		}
		return pvs;
	}
}
