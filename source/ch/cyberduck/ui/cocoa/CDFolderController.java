package ch.cyberduck.ui.cocoa;

/*
 *  Copyright (c) 2005 David Kocher. All rights reserved.
 *  http://cyberduck.ch/
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Bug fixes, suggestions and comments should be sent to:
 *  dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathFactory;

import com.apple.cocoa.application.NSAlertPanel;
import com.apple.cocoa.application.NSApplication;
import com.apple.cocoa.application.NSButton;
import com.apple.cocoa.application.NSPanel;
import com.apple.cocoa.application.NSTextField;
import com.apple.cocoa.foundation.NSBundle;
import com.apple.cocoa.foundation.NSMutableArray;
import com.apple.cocoa.foundation.NSNotification;
import com.apple.cocoa.foundation.NSNotificationCenter;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * @version $Id$
 */
public class CDFolderController extends CDWindowController {
    private static Logger log = Logger.getLogger(CDFolderController.class);

    private NSTextField folderField; //IBOutlet

    public void setFolderField(NSTextField folderField) {
        this.folderField = folderField;
    }

    private CDBrowserController controller;

    public CDFolderController(CDBrowserController controller) {
        this.controller = controller;
        if (!NSApplication.loadNibNamed("Folder", this)) {
            log.fatal("Couldn't load Folder.nib");
        }
    }

    public void createButtonClicked(NSButton sender) {
        // Ends a document modal session by specifying the sheet window, sheet. Also passes along a returnCode to the delegate.
        if (folderField.stringValue().indexOf('/') != -1) {
            NSAlertPanel.beginInformationalAlertSheet(NSBundle.localizedString("Error", "Alert sheet title"), //title
                    NSBundle.localizedString("OK", "Alert default button"), // defaultbutton
                    null, //alternative button
                    null, //other button
                    this.window(), //docWindow
                    null, //modalDelegate
                    null, //didEndSelector
                    null, // dismiss selector
                    null, // context
                    NSBundle.localizedString("Invalid character in folder name.", "") // message
            );
        }
        else if (folderField.stringValue().length() == 0) {
            //
        }
        else {
            this.endSheet(this.window(), sender.tag());
        }
    }

    public void cancelButtonClicked(NSButton sender) {
        this.endSheet(this.window(), sender.tag());
    }

    public void sheetDidEnd(NSPanel sheet, int returncode, Object contextInfo) {
        sheet.orderOut(null);
        switch (returncode) {
            case (NSAlertPanel.DefaultReturn):
                Path workdir = (Path) contextInfo;
                this.create(workdir, folderField.stringValue());
                break;
            case (NSAlertPanel.AlternateReturn):
                break;
        }
        this.release();
    }

    public void create(Path workdir, String filename) {
        Path folder = PathFactory.createPath(workdir.getSession(), workdir.getAbsolute(), filename);
        folder.mkdir(false);
        if(folder.exists()) {
            controller.setShowHiddenFiles(filename.charAt(0) == '.');
            controller.reloadData(true);
        }
    }
}
