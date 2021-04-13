package org.cdqt.module.security.service.iface;

import java.util.List;
import java.util.Map;

import org.cdqt.module.security.entity.Menu;

/**
 * IMenuService
 *
 * @author LiuGangQiang Create in 2020/04/06
 */
public interface IMenuService {

	/**
	 * 查询重复
	 *
	 * @author LiuGangQiang Create in 2020/04/08
	 * @param menu 菜单对象
	 * @return {@link Map}
	 */
	Map<String, Object> queryUnique(Menu menu);

	/**
	 * 新增菜单
	 *
	 * @author LiuGangQiang Create in 2020/04/08
	 * @param menu 菜单对象
	 * @return {@link Integer}
	 */
	Integer insert(Menu menu);

	/**
	 * 查询详情
	 *
	 * @author LiuGangQiang Create in 2020/04/08
	 * @param menu 菜单对象
	 * @return {@link Map}
	 */
	Map<String, Object> queryOne(Menu menu);

	/**
	 * 删除菜单
	 *
	 * @author LiuGangQiang Create in 2020/04/08
	 * @param menu 菜单对象
	 * @return {@link Integer}
	 */
	Integer delete(Menu menu);

	/**
	 * 修改菜单
	 *
	 * @author LiuGangQiang Create in 2020/04/08
	 * @param menu 菜单对象
	 * @return {@link Integer}
	 */
	Integer update(Menu menu);

	/**
	 * 查询列表
	 *
	 * @author LiuGangQiang Create in 2020/04/08
	 * @param menu 菜单对象
	 * @return {@link List}
	 */
	List<Map<String, Object>> queryList(Menu menu);

}
