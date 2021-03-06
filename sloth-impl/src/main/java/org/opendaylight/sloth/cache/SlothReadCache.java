/*
 * Copyright © 2016 Northwestern University LIST Lab, Libin Song and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.sloth.cache;


import org.opendaylight.sloth.cache.model.SlothPolicyCheckResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.sloth.permission.rev150105.CheckPermissionInput;

public interface SlothReadCache extends AutoCloseable {
    SlothPolicyCheckResult checkPermission(CheckPermissionInput input);

    SlothPolicyCheckResult policyCheck(CheckPermissionInput input);
}
