package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Mention all test classes to be included in the suite
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})
public class AllTestsSuite {
    // This class remains empty
    // Used only as a holder for the above annotations
}
