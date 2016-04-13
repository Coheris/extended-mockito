package com.github.aro_tech.extended_mockito;

import org.mockito.BDDMockito;
import org.mockito.stubbing.Answer; 

/** 
 * Wrapper of static elements in org.mockito.BDDMockito
 * Generated by Interface-It: https://github.com/aro-tech/interface-it
 * {@link org.mockito.BDDMockito}
 */
public interface BDDMockitoMixin extends MockitoMixin {


    // CONSTANTS: 

    // DELEGATE METHODS: 

    /**
     * Delegate call to public static <T> org.mockito.BDDMockito.org.mockito.BDDMockito$BDDMyOngoingStubbing<T> org.mockito.BDDMockito.given(T)
     * {@link org.mockito.BDDMockito#given(java.lang.Object)}
     */
    default <T> BDDMockito.BDDMyOngoingStubbing<T> given(T methodCall) {
        return BDDMockito.given(methodCall);
    }



    /**
     * Delegate call to public static <T> org.mockito.BDDMockito.org.mockito.BDDMockito$Then<T> org.mockito.BDDMockito.then(T)
     * {@link org.mockito.BDDMockito#then(java.lang.Object)}
     */
    default <T> BDDMockito.Then<T> then(T mock) {
        return BDDMockito.then(mock);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.will(org.mockito.stubbing.Answer)
     * {@link org.mockito.BDDMockito#will(org.mockito.stubbing.Answer)}
     */
    default BDDMockito.BDDStubber will(Answer answer) {
        return BDDMockito.will(answer);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willAnswer(org.mockito.stubbing.Answer)
     * {@link org.mockito.BDDMockito#willAnswer(org.mockito.stubbing.Answer)}
     */
    default BDDMockito.BDDStubber willAnswer(Answer answer) {
        return BDDMockito.willAnswer(answer);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willCallRealMethod()
     * {@link org.mockito.BDDMockito#willCallRealMethod()}
     */
    default BDDMockito.BDDStubber willCallRealMethod() {
        return BDDMockito.willCallRealMethod();
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willDoNothing()
     * {@link org.mockito.BDDMockito#willDoNothing()}
     */
    default BDDMockito.BDDStubber willDoNothing() {
        return BDDMockito.willDoNothing();
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willReturn(java.lang.Object)
     * {@link org.mockito.BDDMockito#willReturn(java.lang.Object)}
     */
    default BDDMockito.BDDStubber willReturn(Object toBeReturned) {
        return BDDMockito.willReturn(toBeReturned);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willReturn(java.lang.Object,java.lang.Object...)
     * {@link org.mockito.BDDMockito#willReturn(java.lang.Object,java.lang.Object[])}
     */
    default BDDMockito.BDDStubber willReturn(Object toBeReturned, Object... toBeReturnedNext) {
        return BDDMockito.willReturn(toBeReturned, toBeReturnedNext);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willThrow(java.lang.Class<? extends java.lang.Throwable>)
     * {@link org.mockito.BDDMockito#willThrow(java.lang.Class)}
     */
    default BDDMockito.BDDStubber willThrow(Class<? extends Throwable> toBeThrown) {
        return BDDMockito.willThrow(toBeThrown);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willThrow(java.lang.Throwable...)
     * {@link org.mockito.BDDMockito#willThrow(java.lang.Throwable[])}
     */
    default BDDMockito.BDDStubber willThrow(Throwable... toBeThrown) {
        return BDDMockito.willThrow(toBeThrown);
    }



    /**
     * Delegate call to public static org.mockito.BDDMockito$BDDStubber org.mockito.BDDMockito.willThrow(java.lang.Class<? extends java.lang.Throwable>,java.lang.Class<? extends java.lang.Throwable>...)
     * {@link org.mockito.BDDMockito#willThrow(java.lang.Class,java.lang.Class[])}
     */
    default BDDMockito.BDDStubber willThrow(Class<? extends Throwable> toBeThrown, Class<? extends Throwable>... throwableTypes) {
        return BDDMockito.willThrow(toBeThrown, throwableTypes);
    }



}