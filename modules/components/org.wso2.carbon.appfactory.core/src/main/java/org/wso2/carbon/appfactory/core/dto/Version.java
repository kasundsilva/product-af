/*
 * Copyright 2005-2011 WSO2, Inc. (http://wso2.com)
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package org.wso2.carbon.appfactory.core.dto;

import org.wso2.carbon.appfactory.core.ApplicationEventsHandler;

/**
 * Holds information about a version. Refer {@link ApplicationEventsHandler} for usage.
 */
public class Version {
    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String lifecycleStage;

    public String getPromoteStatus() {
        return promoteStatus;
    }

    public void setPromoteStatus(String promoteStatus) {
        this.promoteStatus = promoteStatus;
    }

    private String promoteStatus;
    
    public Version() {
    }

    public Version(String id) {
        this.id = id;
    }

	public String getId() {
        return id;
    }
	
    public String getLifecycleStage() {
		return lifecycleStage;
	}

	public void setLifecycleStage(String lifecycleStage) {
		this.lifecycleStage = lifecycleStage;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Version other = (Version) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}