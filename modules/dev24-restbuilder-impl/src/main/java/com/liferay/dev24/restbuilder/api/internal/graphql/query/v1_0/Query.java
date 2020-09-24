package com.liferay.dev24.restbuilder.api.internal.graphql.query.v1_0;

import com.liferay.dev24.restbuilder.api.dto.v1_0.Dev24Object;
import com.liferay.dev24.restbuilder.api.resource.v1_0.Dev24ObjectResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Liferay Dev24
 * @generated
 */
@Generated("")
public class Query {

	public static void setDev24ObjectResourceComponentServiceObjects(
		ComponentServiceObjects<Dev24ObjectResource>
			dev24ObjectResourceComponentServiceObjects) {

		_dev24ObjectResourceComponentServiceObjects =
			dev24ObjectResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dev24Objects{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Gets a list of Objects")
	public Dev24ObjectPage dev24Objects() throws Exception {
		return _applyComponentServiceObjects(
			_dev24ObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			dev24ObjectResource -> new Dev24ObjectPage(
				dev24ObjectResource.getDev24ObjectsPage()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dev24Object(objectId: ___){id, name}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Get an Object by id")
	public Dev24Object dev24Object(@GraphQLName("objectId") Integer objectId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dev24ObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			dev24ObjectResource -> dev24ObjectResource.getDev24Object(
				objectId));
	}

	@GraphQLName("Dev24ObjectPage")
	public class Dev24ObjectPage {

		public Dev24ObjectPage(Page dev24ObjectPage) {
			actions = dev24ObjectPage.getActions();

			items = dev24ObjectPage.getItems();
			lastPage = dev24ObjectPage.getLastPage();
			page = dev24ObjectPage.getPage();
			pageSize = dev24ObjectPage.getPageSize();
			totalCount = dev24ObjectPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Dev24Object> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			Dev24ObjectResource dev24ObjectResource)
		throws Exception {

		dev24ObjectResource.setContextAcceptLanguage(_acceptLanguage);
		dev24ObjectResource.setContextCompany(_company);
		dev24ObjectResource.setContextHttpServletRequest(_httpServletRequest);
		dev24ObjectResource.setContextHttpServletResponse(_httpServletResponse);
		dev24ObjectResource.setContextUriInfo(_uriInfo);
		dev24ObjectResource.setContextUser(_user);
		dev24ObjectResource.setGroupLocalService(_groupLocalService);
		dev24ObjectResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<Dev24ObjectResource>
		_dev24ObjectResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}