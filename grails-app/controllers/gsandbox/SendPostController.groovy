package gsandbox
import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

class SendPostController {

    def index() {
        render(view: "sendPost")


    }

    def sendPost(){


//        def http = new HTTPBuilder( 'http://developers.farmigo.com' )
//
//        http.request( POST, JSON ) {
//        uri.path = '/code/generate'
//        uri.query = [ email:'shlomper82@gmail.com', name: 'shlomper',technology:'GAE' ]
//
//
//
//        // response handler for a success response code:
//        response.success = { resp, json ->
//            println resp.statusLine
//
//            // parse the JSON response object:
//            json.responseData.results.each {
//                println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
//            }
//        }

        def http = new HTTPBuilder( 'http://ajax.googleapis.com' )
        http.request( GET, JSON ) {
            uri.path = '/ajax/services/search/web'
            uri.query = [ v:'1.0', q: 'home' ]

            response.success = { resp, json ->
                assert json.size() == 3
                println "Query response: "
                json.responseData.results.each {
                    println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
                }
            }
        }

}



}
