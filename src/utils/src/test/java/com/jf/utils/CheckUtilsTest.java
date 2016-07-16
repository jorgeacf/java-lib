package com.jf.utils;

import junit.framework.TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LogManager.class})
@PowerMockIgnore("javax.management.*")
public class CheckUtilsTest {

    @Before
    public void before() {
        mockStatic(LogManager.class);
        Logger logger = mock(Logger.class);
        when(LogManager.getLogger(any(Class.class))).thenReturn(logger);
        when(logger.isDebugEnabled()).thenReturn(true);
    }

    @Test
    public void isNullReturnsTrueIfTheArrayIsNull() {
        boolean result = CheckUtils.isNull(null);
        assertTrue(result);
    }

    @Test
    public void isNullReturnsFalseIfTheArrayIsNotNull() {
        boolean result = CheckUtils.isNull(new Object[0]);
        assertFalse(result);
    }

    @Test
    public void isObjectNullShouldThrowIllegalArgumentExceptionIfValueIsNull() {
        try {
            CheckUtils.isNull(null, "ArgumentName");
            fail("Should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
    }

    @Test
    public void isObjectNullShouldNoThrowExceptionIfNotNull() {
        CheckUtils.isNull(new Object(), "ArgumentName");
    }

    @Test
    public void isArrayNullShouldThrowIllegalArgumentExceptionIfValueIsNull() {
        try {
            CheckUtils.isNull(null, "ArgumentName");
            fail("Should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
    }

    @Test
    public void isArrayNullShouldNoThrowExceptionIfNotNull() {
        CheckUtils.isNull(new Object[0], "ArgumentName");
    }
}
