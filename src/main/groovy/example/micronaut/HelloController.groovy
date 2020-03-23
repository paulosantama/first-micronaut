package example.micronaut

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller('/hello')
class HelloController {

	@Get('/')
	String index() {
		'Hello World'
	}
}
