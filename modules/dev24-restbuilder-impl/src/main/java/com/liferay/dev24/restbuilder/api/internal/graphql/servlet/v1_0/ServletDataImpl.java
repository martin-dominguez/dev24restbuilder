package com.liferay.dev24.restbuilder.api.internal.graphql.servlet.v1_0;

import com.liferay.dev24.restbuilder.api.internal.graphql.mutation.v1_0.Mutation;
import com.liferay.dev24.restbuilder.api.internal.graphql.query.v1_0.Query;
import com.liferay.dev24.restbuilder.api.resource.v1_0.Dev24ObjectResource;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Liferay Dev24
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setDev24ObjectResourceComponentServiceObjects(
			_dev24ObjectResourceComponentServiceObjects);

		Query.setDev24ObjectResourceComponentServiceObjects(
			_dev24ObjectResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/dev24-restbuilder-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<Dev24ObjectResource>
		_dev24ObjectResourceComponentServiceObjects;

}