package com.elsevier.json.wrapper;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface Property {
	Object get();
	void set(Object value);
	void updateJsonRoot(ObjectNode root);
}
