/*
 * Copyright 2011-17 Fraunhofer ISE, energy & meteo Systems GmbH and other contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.openmuc.openiec61850.internal.scl;

import org.openmuc.openiec61850.SclParseException;
import org.w3c.dom.Node;

public abstract class AbstractType {

    public String id = null;

    // attributes not needed: desc

    public AbstractType(Node xmlNode) throws SclParseException {
        Node idNode = xmlNode.getAttributes().getNamedItem("id");
        if (idNode == null) {
            throw new SclParseException("Required attribute \"id\" not found!");
        }
        id = idNode.getNodeValue();
    }
}
