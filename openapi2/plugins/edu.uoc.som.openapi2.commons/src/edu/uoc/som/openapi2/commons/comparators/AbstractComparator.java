package edu.uoc.som.openapi2.commons.comparators;

import java.util.Comparator;

/**
 * A abstract string comparator
 *
 */
public abstract class AbstractComparator implements Comparator<String> {
	
	
	protected String prefix;
	protected String suffix;
	
	protected boolean ignoreExact;
	
	

	/**
	 * @param prefix the prefix to add to the second string
	 * @param suffix the suffix to add to the second string
	 */
	public AbstractComparator(String prefix, String suffix, boolean ignoreExact) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.ignoreExact = ignoreExact;
	}

	

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}



	public boolean isIgnoreExact() {
		return ignoreExact;
	}



	public void setIgnoreExact(boolean ignoreExact) {
		this.ignoreExact = ignoreExact;
	}

	


}
