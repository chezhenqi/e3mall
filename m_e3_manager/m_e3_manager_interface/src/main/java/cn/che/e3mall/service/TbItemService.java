package cn.che.e3mall.service;

import cn.che.e3mall.common.pojo.DataGridResult;
import cn.che.e3mall.pojo.TbItem;

public interface TbItemService {
	TbItem selectById(Long id) throws Exception;

	DataGridResult findByPage(int page, int rows);
}
