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

import java.util.Map;

import org.vgu.dm2schema.dm.DataModel;
import org.vgu.dm2schema.dm.Entity;
import org.vgu.se.ocl.dm.EDataModel;
import org.vgu.se.ocl.dm.EEntity;
import org.vgu.se.sql.EStatement;

public class SQLParser {
    public static EStatement saveXMIModel (Statement dataModelXMI) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("key", new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI(fileName));
        resource.getContents().add(data);
        resource.save(Collections.EMPTY_MAP);
    }
}
