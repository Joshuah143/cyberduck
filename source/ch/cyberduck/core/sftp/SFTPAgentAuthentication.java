package ch.cyberduck.core.sftp;

/*
 * Copyright (c) 2002-2014 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * feedback@cyberduck.ch
 */

import ch.cyberduck.core.Host;
import ch.cyberduck.core.LoginCallback;
import ch.cyberduck.core.exception.AccessDeniedException;
import ch.cyberduck.core.exception.LoginCanceledException;

import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * @version $Id$
 */
public class SFTPAgentAuthentication implements SFTPAuthentication {
    private static final Logger log = Logger.getLogger(SFTPAgentAuthentication.class);

    private SFTPSession session;

    private AgentAuthenticator agent;

    public SFTPAgentAuthentication(final SFTPSession session, final AgentAuthenticator agent) {
        this.session = session;
        this.agent = agent;
    }

    @Override
    public boolean authenticate(final Host host, final LoginCallback controller)
            throws IOException, LoginCanceledException, AccessDeniedException {
        if(log.isDebugEnabled()) {
            log.debug(String.format("Login using agent %s with credentials %s", agent, host.getCredentials()));
        }
        if(session.getClient().isAuthMethodAvailable(host.getCredentials().getUsername(), "publickey")) {
            return session.getClient().authenticateWithAgent(host.getCredentials().getUsername(), agent);
        }
        return false;
    }
}
