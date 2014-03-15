/*******************************************************************************
 * Copyright (c) 2014 Hugo Marchadour (Obeo).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugo Marchadour - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.obeonetwork.jdt2uml.creator.api.handler;

import org.eclipse.jdt.core.IJavaProject;
import org.obeonetwork.jdt2uml.core.api.handler.JDTHandler;

public interface JDTCreatorHandler extends JDTHandler {

	JDTCreatorHandler copy();

	String getNewModelFileName(IJavaProject javaProject);
}