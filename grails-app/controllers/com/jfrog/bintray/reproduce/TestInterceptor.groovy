package com.jfrog.bintray.reproduce



class TestInterceptor {

    TestInterceptor() {
        matchAll()
    }

    boolean before() {
        println("Going to controller: ${controllerName} and action ${actionName} with params ${params.toString()}")
    }


}
