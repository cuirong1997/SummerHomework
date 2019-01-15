package summer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import summer.mapper.ManagerMapper;
import summer.domain.Manager;
import summer.service.ManagerService;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public Manager mlogin(String managername, String managerpwd) {
		// TODO Auto-generated method stub
		return managerMapper.findWithManagernameAndManagerPwd(managername, managerpwd);
	}

}
