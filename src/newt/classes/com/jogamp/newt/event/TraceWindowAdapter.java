/*
 * Copyright (c) 2010 Sven Gothel. All Rights Reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * - Redistribution of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * 
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * 
 * Neither the name Sven Gothel or the names of
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * 
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES,
 * INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN
 * MICROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR
 * ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR
 * DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE
 * DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY,
 * ARISING OUT OF THE USE OF OR INABILITY TO USE THIS SOFTWARE, EVEN IF
 * SVEN GOTHEL HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 */
package com.jogamp.newt.event;

import com.jogamp.newt.*;

public class TraceWindowAdapter implements WindowListener {

    WindowListener downstream;

    public TraceWindowAdapter() {
        this.downstream = null;
    }

    public TraceWindowAdapter(WindowListener downstream) {
        this.downstream = downstream;
    }

    public void windowResized(WindowEvent e) {
        System.out.println(e);
        if(null!=downstream) { downstream.windowResized(e); }
    }
    public void windowMoved(WindowEvent e) {
        System.out.println(e);
        if(null!=downstream) { downstream.windowMoved(e); }
    }
    public void windowDestroyNotify(WindowEvent e) {
        System.out.println(e);
        if(null!=downstream) { downstream.windowDestroyNotify(e); }
    }
    public void windowGainedFocus(WindowEvent e) {
        System.out.println(e);
        if(null!=downstream) { downstream.windowGainedFocus(e); }
    }
    public void windowLostFocus(WindowEvent e) {
        System.out.println(e);
        if(null!=downstream) { downstream.windowLostFocus(e); }
    }
    public void windowRepaint(WindowUpdateEvent e) {
        System.out.println(e);
        if(null!=downstream) { downstream.windowRepaint(e); }
    }
}
