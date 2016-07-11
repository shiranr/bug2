package com.jfrog.bintray.reproduce.controller

class UserController {

    def index() {
        render(view: 'user', model: [username: params.username])
    }
}
