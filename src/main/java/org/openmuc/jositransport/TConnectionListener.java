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
package org.openmuc.jositransport;

import java.io.IOException;

public interface TConnectionListener {

    public void connectionIndication(TConnection tConnection);

    /**
     * This function is only called when an IOException in ServerSocket.accept() occurred which was not forced using
     * ServerTSAP.stopListening()
     * 
     * @param e
     *            The IOException caught form ServerSocket.accept()
     */
    public void serverStoppedListeningIndication(IOException e);
}
