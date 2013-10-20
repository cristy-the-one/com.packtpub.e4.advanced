/*
 * Copyright (c) 2014, Alex Blewitt, Bandlem Ltd
 * Copyright (c) 2014, Packt Publishing Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.packtpub.e4.advanced.feeds.ui;
import org.eclipse.jface.wizard.Wizard;
public class NewFeedWizard extends Wizard {
	private NewFeedPage newFeedPage = new NewFeedPage();
	@Override
	public void addPages() {
		addPage(newFeedPage);
	}
	@Override
	public boolean performFinish() {
		return false;
	}
}