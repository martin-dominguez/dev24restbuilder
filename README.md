#INTERESTING LINKS
* Liferay Help Center > Liferay DXP Frameworks > Web Services > REST Builder (Official docs): https://help.liferay.com/hc/es/articles/360036343312-REST-Builder
* Liferay.dev BLOGS - David's post: Use Liferay's REST Builder tool to generate your own Headless APIs https://liferay.dev/blogs/-/blogs/creating-headless-apis-part-1
* Javier de Arcos' GitHub Account: RestBuilder Docs: https://github.com/javierdearcos/rest-builder-docs
* Swagger Editor: https://editor.swagger.io/
* REST Resource Naming Guide: https://restfulapi.net/resource-naming/
* Liferay Nexus Repository: https://repository.liferay.com/nexus/index.html
* DEV 24 RESTBuilder example code: https://github.com/martin-dominguez/dev24restbuilder

#OpenAPI Profile Creation Tips
*Create your profile in the Swagger Editor, you’ll see your profile in awesome colors, but be careful, even if you don’t have errors, it doesn’t mean that it is going to compile in the REST Builder
*Review indents (you should use spaces not tabs)
*Check your spelling
*Follow the REST best practices to naming URLs
*Don’t use “id” to name your identifiers… and in general try to avoid reserved words because it can create issues.
*Check Javier de Arcos documentation, and double check that you didn’t forget any required parameter.
*If your profile doesn’t compile, and the error that you get is something like “java.null.pointer exception”, use a minimum template file and add pieces one by one until you find which one is generating the error.
*If your code is not generated properly, you can remove all the previously generated code and let the REST builder create it again.
*Don't forget remove all "operationId" in your OpenAPI profile description.
*From 7.3 you can use the artifact "release.portal.api" which will solve all your dependencies.
