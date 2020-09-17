package com.liferay.dev24.restbuilder.api.internal.graphql.mutation.v1_0;

import com.liferay.dev24.restbuilder.api.dto.v1_0.Dev24Object;
import com.liferay.dev24.restbuilder.api.resource.v1_0.Dev24ObjectResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Liferay Dev24
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setDev24ObjectResourceComponentServiceObjects(
		ComponentServiceObjects<Dev24ObjectResource>
			dev24ObjectResourceComponentServiceObjects) {

		_dev24ObjectResourceComponentServiceObjects =
			dev24ObjectResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Creates a new Object")
	public Dev24Object createDev24Object(
			@GraphQLName("dev24Object") Dev24Object dev24Object)
		throws Exception {

		return _applyComponentServiceObjects(
			_dev24ObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			dev24ObjectResource -> dev24ObjectResource.postDev24Object(
				dev24Object));
	}

	@GraphQLField
	public Response createDev24ObjectBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_dev24ObjectResourceComponentServiceObjects,
			this::_populateResourceContext,
			dev24ObjectResource -> dev24ObjectResource.postDev24ObjectBatch(
				callbackURL, object));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}