/*
 * Copyright © 2016 Northwestern University LIST Lab, Libin Song and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.sloth.cli.api;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;

public interface SlothCliCommands {
    DataBroker getDataBroker();
}
