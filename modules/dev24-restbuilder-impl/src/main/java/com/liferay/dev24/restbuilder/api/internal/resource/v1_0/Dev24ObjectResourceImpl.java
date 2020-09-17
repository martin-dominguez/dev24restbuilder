package com.liferay.dev24.restbuilder.api.internal.resource.v1_0;

import com.liferay.dev24.restbuilder.api.dto.v1_0.Dev24Object;
import com.liferay.dev24.restbuilder.api.resource.v1_0.Dev24ObjectResource;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Liferay Dev24
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/dev24-object.properties",
	scope = ServiceScope.PROTOTYPE, service = Dev24ObjectResource.class
)
public class Dev24ObjectResourceImpl extends BaseDev24ObjectResourceImpl {
	public Dev24Object getDev24Object(Integer id)
			throws Exception {
			User user = UserLocalServiceUtil.getUser(id.longValue());

			Dev24Object ob = new Dev24Object();
			ob.setId((int) user.getUserId());
			ob.setName(user.getFullName()); 
			return ob;
		}
		
		public Page<Dev24Object> getDev24ObjectPage() throws Exception {
			List<User> users = UserLocalServiceUtil.getUsers(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			List<Dev24Object> objects = new ArrayList<>();
			for (User user : users) {
				Dev24Object ob = new Dev24Object();
				ob.setId((int) user.getUserId());
				ob.setName(user.getFullName());
				objects.add(ob);
			}
			return Page.of(objects);
		}
		
		public Dev24Object postDev24Object(Dev24Object dev24Object)
				throws Exception {
				Dev24Object ob = dev24Object;
				ob.setName(dev24Object.getName() + " (CREATED)");
				return dev24Object;
		}
}