package com.jfrog.bintray.reproduce


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(TestInterceptor)
class TestInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test test interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"user")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
