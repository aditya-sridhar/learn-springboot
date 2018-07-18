package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.MirrorPayloadRequest;
import com.example.models.MirrorPayloadResponse;
import com.example.models.SampleResponse;

@RestController
public class WebController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/helloworld")
	public SampleResponse Greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(counter.incrementAndGet());
		response.setMessage(String.format(template, name));
		return response;

	}
	
	@RequestMapping(value = "/mirrorpayload", method = RequestMethod.POST)
	public MirrorPayloadResponse MirrorPayload(@RequestBody MirrorPayloadRequest inputPayload) {

		inputPayload.setCountValue(counter.incrementAndGet());
		System.out.println("/mirrorpayload : "+inputPayload.getName());
		MirrorPayloadResponse response = new MirrorPayloadResponse();
		response.setData(inputPayload);
		return response;
	}

}
