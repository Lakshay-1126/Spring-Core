package com.app.A;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {
		
		@Value("SAMPLE")
		private String entity;

		@Override
		public String toString() {
			return "A [entity=" + entity + "]";
		}
}
