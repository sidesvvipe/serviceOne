package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Represents a successful scenario of confirming a number

```
given:
	input object is number
when:
	request to verify if obj is number
then:
	we'll confirm it is a number
```

""")
    request {
        method 'POST'
        url '/is-number'
        body(
                prop: 66
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body("""
			{
				"status": "OK"
			}
			""")
        headers {
            contentType(applicationJson())
        }
    }
}
