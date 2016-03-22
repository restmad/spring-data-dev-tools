/*
 * Copyright 2016 the original author or authors.
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

import org.springframework.data.release.model.Iteration;
import org.springframework.data.release.model.Train;
import org.springframework.data.release.model.TrainIteration;

/**
 * @author Mark Paluch
 */
public interface GitHubIssueConnector extends IssueTracker {

	/**
	 * Returns all {@link Tickets} for the given {@link Train} and {@link Iteration}.
	 *
	 * @param iteration must not be {@literal null}.
	 * @param forCurrentUser
	 * @return
	 */
	Tickets getTicketsFor(TrainIteration iteration, boolean forCurrentUser);

}