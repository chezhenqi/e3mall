package cn.che.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.che.e3mall.common.pojo.DataGridResult;
import cn.che.e3mall.mapper.TbItemMapper;
import cn.che.e3mall.pojo.TbItem;
import cn.che.e3mall.pojo.TbItemExample;
import cn.che.e3mall.service.TbItemService;

@Service
public class TbItemServiceImpl implements TbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem selectById(Long id) throws Exception {
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public DataGridResult findByPage(int page, int rows) {
		// 查询前先进性分页处理
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		List<TbItem> list = tbItemMapper.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		DataGridResult dataGridResult = new DataGridResult();
		dataGridResult.setTotal(pageInfo.getTotal());
		dataGridResult.setRows(pageInfo.getList());
		return dataGridResult;
	}

}
