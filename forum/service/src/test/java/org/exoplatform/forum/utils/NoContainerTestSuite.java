/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU Affero General Public License
* as published by the Free Software Foundation; either version 3
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.forum.utils;

import org.exoplatform.forum.search.UnifiedSearchOrderTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by The eXo Platform SAS
 * Author : Vu Duy Tu
 *          tuvd@exoplatform.com
 * Nov 13, 2012  
 */
@RunWith(Suite.class)
@SuiteClasses({ 
  UserProfileUtilsTestCase.class,
  UtilsTestCase.class,
  UnifiedSearchOrderTest.class,
  ForumEventQueryTestCase.class
})
public class NoContainerTestSuite {
  @BeforeClass
  public static void setUp() throws Exception {
  }

  @AfterClass
  public static void tearDown() {
  }
}
