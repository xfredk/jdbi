/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jdbi.v3.testing.junit5.tc;

import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.OracleContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
class OracleXeJdbiTestContainersExtensionTest extends AbstractJdbiTestcontainersExtensionTest {

    @Container
    static JdbcDatabaseContainer<?> dbContainer = new OracleContainer("gvenzl/oracle-xe:slim-faststart");

    @Override
    JdbcDatabaseContainer<?> getDbContainer() {
        return dbContainer;
    }
}
