/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.release.jira;

import org.springframework.data.release.jira.JiraIssue.FixVersions;
import org.springframework.data.release.model.ModuleIteration;

import lombok.Value;

/**
 * @author Oliver Gierke
 */
@Value
class JiraVersion {

	private ModuleIteration module;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return module.getMediumVersionString();
	}

	public String getDescription() {
		return module.getTrain().getName() + " " + module.getIteration().getName();
	}

	public FixVersions toFixVersions() {
		return new FixVersions(null, toString());
	}
}
