package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.Path;

public class ExtendedOperationImpl extends OperationImpl {

	@Override
	public String getFullPath() {
		return ((Path) eContainer).getApi().getHost() + ((Path) eContainer).getApi().getBasePath()
				+ ((Path) eContainer).getRelativePath();
	}
	
	@Override
	public String getHTTPMethod() {
		Path path = ((Path)eContainer);
		if(path.getGet()!= null && path.getGet().equals(this))
			return "GET";
		if(path.getPost()!= null && path.getPost().equals(this))
			return "POST";
		if(path.getPut()!= null && path.getPut().equals(this))
			return "PUT";
		if(path.getDelete()!=null && path.getDelete().equals(this))
			return "DELETE";
		if(path.getOptions()!= null && path.getOptions().equals(this))
			return "OPTIONS";
		if(path.getHead()!= null && path.getHead().equals(this))
			return "HEAD";
		if(path.getPatch()!=null && path.getPatch().equals(this))
			return "PATCH";
		return null;	
	}
}
