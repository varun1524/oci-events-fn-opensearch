//package com.example;
//
//import com.fnproject.fn.testing.*;
//import org.junit.*;
//
//import static org.junit.Assert.*;
//
//public class NotificationHandlerTest {
//
//    @Rule
//    public final FnTestingRule testing = FnTestingRule.createDefault();
//
//    @Test
//    public void shouldReturnGreeting() {
//        String event = "[your test image event JSON]";
//        testing.givenEvent().withBody(event).enqueue();
//        testing.thenRun(HelloFunction.class, "handleRequest");
//
//        FnResult result = testing.getOnlyResult();
//        assertTrue(result.isSuccess());
//    }
//
//}
