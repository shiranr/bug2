class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }


        "/$username"(controller: 'user', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
