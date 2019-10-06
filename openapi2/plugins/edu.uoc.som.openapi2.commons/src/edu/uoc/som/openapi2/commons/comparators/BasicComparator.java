package edu.uoc.som.openapi2.commons.comparators;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 *
 */
public class BasicComparator extends AbstractComparator {

	public BasicComparator(String prefix, String suffix, boolean ignoreExact) {
		super(prefix, suffix,ignoreExact);
	}

	@Override
	public int compare(String source, String target) {
		List<String> options = new ArrayList<String>();
		if(!StringUtils.isEmpty(prefix)) {
			options.add(prefix+source);
			options.add(prefix+"_"+source);
			options.add(prefix+"-"+source);
		}
		if(!StringUtils.isEmpty(suffix)) {
			options.add(source+suffix);
			options.add(source+"_"+suffix);
			options.add(source+"_"+suffix);
		}
		if(!ignoreExact) {
			options.add(source);
		}
		
		for(String option: options) {
			if(option.equalsIgnoreCase(target));
				return 0;
		}
		return 1;
	}

}
