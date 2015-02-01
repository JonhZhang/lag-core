package test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sin.lag.pojo.User;
import com.sin.lag.service.ICategoryService;
import com.sin.lag.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private IUserService userService = null;
	@Resource
	private ICategoryService categoryService;
	
	@Test
	public void test1() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
	@Test
	public void test2() {
		StringBuilder options = new StringBuilder();
		categoryService.constructOptions(options , 0, 0);
		logger.info(options.toString());
	}
	
	@Test
	public void test3() {
		List<Integer> ids = new ArrayList<Integer>();
		categoryService.constructId(ids, 1);
		logger.info(ids);
	}
	
	@Test
	public void test4() {
		List<Integer> ids = new ArrayList<Integer>();
		categoryService.constructId(ids, 1);
		categoryService.delete(3);
		logger.info("success");
	}
}
