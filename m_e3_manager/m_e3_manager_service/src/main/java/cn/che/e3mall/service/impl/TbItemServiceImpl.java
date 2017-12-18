package cn.che.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.che.e3mall.mapper.TbItemMapper;
import cn.che.e3mall.pojo.TbItem;
import cn.che.e3mall.service.TbItemService;

@Service
public class TbItemServiceImpl implements TbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem selectById(Long id) throws Exception {
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
