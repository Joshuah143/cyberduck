package ch.cyberduck.core.dropbox;

/*
 * Copyright (c) 2002-2020 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.DefaultPathContainerService;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathRelativizer;
import ch.cyberduck.core.preferences.HostPreferences;

import org.apache.commons.lang3.StringUtils;

import com.dropbox.core.v2.common.PathRoot;

public class DropboxPathContainerService extends DefaultPathContainerService {

    private final DropboxSession session;

    public DropboxPathContainerService(final DropboxSession session) {
        this.session = session;
    }

    @Override
    public boolean isContainer(final Path file) {
        if(file.isRoot()) {
            return true;
        }
        if(super.isContainer(file)) {
            return file.getType().contains(Path.Type.volume);
        }
        return false;
    }

    @Override
    public String getKey(final Path file) {
        if(new HostPreferences(session.getHost()).getBoolean("dropbox.business.enable")) {
            if(file.isRoot()) {
                // Root
                return StringUtils.EMPTY;
            }
            if(this.isContainer(file)) {
                // Return path relative to parent namespace
                return Path.DELIMITER + PathRelativizer.relativize(this.getContainer(file.getParent()).getAbsolute(), file.getAbsolute());
            }
            // Return path relative to this namespace
            return Path.DELIMITER + super.getKey(file);
        }
        return file.isRoot() ? StringUtils.EMPTY : file.getAbsolute();
    }

    protected PathRoot getNamespace(final Path file) {
        if(new HostPreferences(session.getHost()).getBoolean("dropbox.business.enable")) {
            final Path container = this.getContainer(file);
            if(StringUtils.isNotBlank(container.attributes().getFileId())) {
                // List relative to the namespace id
                return PathRoot.namespaceId(container.attributes().getFileId());
            }
        }
        return PathRoot.HOME;
    }
}
