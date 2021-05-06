package example.micronaut

import io.micronaut.http.HttpRequest
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class HelloControllerSpec extends Specification {

	@Inject
	@Client('/')
	RxHttpClient client

	void 'test hello world response'() {
		when:
		HttpRequest request = HttpRequest.GET('/hello')
		String ans = client.toBlocking().retrieve(request)

		then:
		ans == 'Hello World'
	}
}
