package edu.uoc.som.openapi2.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import edu.uoc.som.openapi2.ExtendedAPI;
import edu.uoc.som.openapi2.ExtendedOpenAPI2Factory;
import edu.uoc.som.openapi2.ExtendedOperation;
import edu.uoc.som.openapi2.ExtendedParameter;
import edu.uoc.som.openapi2.ExtendedPath;
import edu.uoc.som.openapi2.ExtendedResponse;
import edu.uoc.som.openapi2.ExtendedSchema;
import edu.uoc.som.openapi2.ExtendedSecurityScheme;
import edu.uoc.som.openapi2.OpenAPI2Package;

public class ExtendedOpenAPI2FactoryImpl extends OpenAPI2FactoryImpl implements ExtendedOpenAPI2Factory  {

	

	
	public static ExtendedOpenAPI2Factory init() {
		try {
			ExtendedOpenAPI2Factory theOpenAPI2Factory = (ExtendedOpenAPI2Factory)EPackage.Registry.INSTANCE.getEFactory(OpenAPI2Package.eNS_URI);
			if (theOpenAPI2Factory != null) {
				return  theOpenAPI2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtendedOpenAPI2FactoryImpl();
		
	}
	@Override
	public ExtendedAPI createAPI() {
		return new ExtendedAPIImpl();
	}
	
	@Override
	public ExtendedOperation createOperation() {
		return new ExtendedOperationImpl();
	}
	
	@Override
	public ExtendedParameter createParameter() {
		return new ExtendedParameterImpl();
	}
	
	@Override
	public ExtendedPath createPath() {
		return new ExtendedPathImpl();
	}
	
	@Override
	public ExtendedResponse createResponse() {
		return new ExtendedResponseImpl();
	}
	
	@Override
	public ExtendedSchema createSchema() {
		return new ExtendedSchemaImpl();
	}
	
	@Override
	public ExtendedSecurityScheme createSecurityScheme() {
		return new ExtendedSecuritySchemeImpl();
	}

	
}
