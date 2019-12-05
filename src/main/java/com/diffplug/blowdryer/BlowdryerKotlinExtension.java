/*
 * Copyright 2019 DiffPlug
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.blowdryer;

public class BlowdryerKotlinExtension {
	Blowdryer.WithProject withProject;

	public BlowdryerKotlinExtension(Blowdryer.WithProject withProject) {
		this.withProject = withProject;
	}

	public Blowdryer.WithProject get干() {
		return withProject;
	}

	public Blowdryer.WithProject getBlowdryer() {
		return withProject;
	}
}
