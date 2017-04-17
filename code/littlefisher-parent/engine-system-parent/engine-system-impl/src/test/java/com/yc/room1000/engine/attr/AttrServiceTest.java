package com.yc.room1000.engine.attr;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.littlefisher.core.exception.BaseAppException;
import com.littlefisher.core.utils.LittleFisherLogger;
import com.yc.room1000.engine.attr.model.AttrDto;
import com.yc.room1000.engine.attr.model.QryAttrListRequest;
import com.yc.room1000.engine.attr.service.IAttrService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/EngineConfig.xml")
@Transactional
public class AttrServiceTest {
	
	/**
	 * logger
	 */
	private static LittleFisherLogger logger = LittleFisherLogger.getLogger(AttrServiceTest.class);
	
	/**
	 * attrService
	 */
	@Autowired
	private IAttrService attrService;

	@Test
	public void testGetAttrListByCond() throws BaseAppException {
		QryAttrListRequest req = new QryAttrListRequest();
		List<AttrDto> attrList = attrService.getAttrListByCond(req);
		logger.debug("attrList: " + attrList);
	}
	
	@Test
	public void testGetAttrAll() throws BaseAppException {
		List<AttrDto> attrList = attrService.getAllAttr();
		logger.debug("attrList: " + attrList);
	}
}
