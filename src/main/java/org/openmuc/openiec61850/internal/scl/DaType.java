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

import java.util.ArrayList;
import java.util.List;

import org.openmuc.openiec61850.SclParseException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class DaType extends AbstractType {

    // attributes not needed: iedType

    public List<Bda> bdas = new ArrayList<>();

    public DaType(Node xmlNode) throws SclParseException {

        super(xmlNode);

        NodeList elements = xmlNode.getChildNodes();

        for (int i = 0; i < elements.getLength(); i++) {
            Node node = elements.item(i);
            if (node.getNodeName().equals("BDA")) {
                bdas.add(new Bda(node));
            }
        }
    }

}
