/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: ngpbh
***************************************************************************/

package org.vgu.se.sql.parser;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.vgu.se.sql.EStatement;
import org.vgu.se.sql.SqlFactory;

import net.sf.jsqlparser.statement.Statement;

public class SQLParser {
    private static SqlFactory factory = SqlFactory.eINSTANCE;
    
    public static Statement transform(EStatement statementXMI) {
        return J2XMI.transform(statementXMI);
    }
    
    public static EStatement transform(Statement statement) {
        return XMI2J.transform(statement);
    }

    public static void saveEStatement(String fileName, EStatement statement)
        throws IOException {
        EcorePackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        factory.eClass();

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet
            .createResource(URI.createFileURI(fileName.concat(".xmi")));
        resource.getContents().add(statement);
        resource.save(Collections.EMPTY_MAP);

        return;
    }

    public static EStatement loadEStatement(String filePath)
        throws IOException {
        // Initialize the model
        factory.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createFileURI(filePath),
            true);

        // This is for loading proxy resources
        EcoreUtil.resolveAll(resSet);

        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        EStatement statement = (EStatement) resource.getContents().get(0);

        return statement;
    }
}
