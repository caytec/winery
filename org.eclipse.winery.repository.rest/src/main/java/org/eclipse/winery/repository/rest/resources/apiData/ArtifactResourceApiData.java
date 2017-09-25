/**
 * Copyright (c) 2017 University of Stuttgart. All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v2.0 and the Apache License 2.0 which both accompany this
 * distribution, and are available at http://www.eclipse.org/legal/epl-v20.html and
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package org.eclipse.winery.repository.rest.resources.apiData;

public class ArtifactResourceApiData {

	public String fileName;
	public String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}