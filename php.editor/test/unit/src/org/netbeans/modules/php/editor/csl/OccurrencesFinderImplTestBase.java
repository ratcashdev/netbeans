/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.editor.csl;

import java.io.File;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

public abstract class OccurrencesFinderImplTestBase extends PHPNavTestBase {

    public OccurrencesFinderImplTestBase(String testName) {
        super(testName);
    }

    @Override
    protected FileObject[] createSourceClassPathsForTest() {
        return new FileObject[]{FileUtil.toFileObject(new File(getDataDir(), getTestFolderPath()))};
    }

    protected String getTestFolderPath() {
        return "testfiles/markoccurences/" + getTestName();//NOI18N
    }

    protected String getTestPath() {
        return getTestFolderPath() + "/" + getTestName() + ".php";//NOI18N
    }

    protected String getTestName() {
        String name = getName();
        int indexOf = name.indexOf("_");
        if (indexOf != -1) {
            name = name.substring(0, indexOf);
        }
        return name;
    }

}
