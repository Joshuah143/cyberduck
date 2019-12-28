package ch.cyberduck.ui.cocoa.callback;

/*
 * Copyright (c) 2002-2019 iterate GmbH. All rights reserved.
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

import ch.cyberduck.binding.foundation.NSArray;
import ch.cyberduck.core.Controller;
import ch.cyberduck.core.keychain.SFChooseIdentityPanel;
import ch.cyberduck.core.threading.DefaultMainAction;

import java.util.concurrent.atomic.AtomicInteger;

public class ModalPromptCertificateIdentityCallback extends PromptCertificateIdentityCallback {

    private final Controller controller;

    public ModalPromptCertificateIdentityCallback(final Controller controller) {
        super(controller);
        this.controller = controller;
    }

    @Override
    protected int prompt(final SFChooseIdentityPanel panel, final NSArray identities) {
        final AtomicInteger option = new AtomicInteger();
        controller.invoke(new DefaultMainAction() {
            @Override
            public void run() {
                option.set(panel.runModalForIdentities_message(identities, null).intValue());
            }
        }, true);
        return option.get();
    }
}
