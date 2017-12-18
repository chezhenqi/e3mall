package cn.che.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.che.e3mall.pojo.TbItem;
import cn.che.e3mall.service.TbItemService;

@Controller
@RequestMapping("/item")
public class TbItemController {
	@Autowired
	private TbItemService tbItemService;

	@RequestMapping("/selectById/{id}")
	@ResponseBody
	public TbItem selectById(@PathVariable Long id) throws Exception {
		return tbItemService.selectById(id);
	}
}
