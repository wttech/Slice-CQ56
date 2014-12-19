package com.cognifide.slice.cq.bindings;

import javax.script.Bindings;

import org.apache.commons.lang.StringUtils;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.commons.classloader.DynamicClassLoaderManager;
import org.apache.sling.scripting.api.BindingsValuesProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.components.Component;
import com.day.cq.wcm.api.components.ComponentManager;

@org.apache.felix.scr.annotations.Component
@Service
public class SliceBindingsProvider implements BindingsValuesProvider {

	private static final Logger LOG = LoggerFactory.getLogger(SliceBindingsProvider.class);

	@Reference
	private DynamicClassLoaderManager classLoaderManager;

	@Override
	public void addBindings(Bindings bindings) {
		final Resource resource = (Resource) bindings.get("resource");
		if (resource == null) {
			return;
		}

		final Component component = resource.getResourceResolver().adaptTo(ComponentManager.class).getComponentOfResource(resource);
		if (component == null) {
			return;
		}

		final String modelClass = (String) component.getProperties().get("sliceModel");
		if (StringUtils.isBlank(modelClass)) {
			return;
		}

		try {
			Class<?> clazz = classLoaderManager.getDynamicClassLoader().loadClass(modelClass);
			bindings.put("model", resource.adaptTo(clazz));
		} catch (ClassNotFoundException e) {
			LOG.error("Can't found slice:model class " + modelClass, e);
		}
	}

}
