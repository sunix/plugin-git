/*******************************************************************************
 * Copyright (c) 2012-2014 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.ext.git.server;

import com.codenvy.api.project.server.ProjectImporter;
import com.codenvy.api.project.server.ValueProviderFactory;
import com.codenvy.ide.ext.git.server.commons.GitRepositoryPrivacyChecker;
import com.codenvy.ide.ext.git.server.nativegit.CredentialsProvider;
import com.codenvy.ide.ext.git.server.nativegit.WSO2OAuthCredentialsProvider;
import com.codenvy.inject.DynaModule;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * The module that contains configuration of the server side part of the Git extension.
 *
 * @author andrew00x
 */
@DynaModule
public class GitModule extends AbstractModule {

    /** {@inheritDoc} */
    @Override
    protected void configure() {
        Multibinder.newSetBinder(binder(), CredentialsProvider.class).addBinding().to(WSO2OAuthCredentialsProvider.class);
        Multibinder<ProjectImporter> projectImporterMultibinder = Multibinder.newSetBinder(binder(), ProjectImporter.class);
        projectImporterMultibinder.addBinding().to(GitProjectImporter.class);
        projectImporterMultibinder.addBinding().to(GitProjectImporterGitCleanUp.class);
        bind(GitConfigurationChecker.class).asEagerSingleton();
        bind(GitRepositoryPrivacyChecker.class);

        Multibinder<ValueProviderFactory> multiBinder = Multibinder.newSetBinder(binder(), ValueProviderFactory.class);
        multiBinder.addBinding().to(IsGitRepositoryValueProviderFactory.class);
    }
}