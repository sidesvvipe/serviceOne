package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Represents a successful scenario of confirming a number

```
given:
	input object is string
when:
	request to verify if obj is number
then:
	we'll reject since it is not a number
```

""")
    request {
        method 'POST'
        url '/is-number'
        body(
                prop: "0"
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 503
        body("""
			{
				"status": "NOT_OK"
			}
			""")
        headers {
            contentType(applicationJson())
        }
    }
}
