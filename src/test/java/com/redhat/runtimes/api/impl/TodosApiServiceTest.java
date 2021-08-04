package com.redhat.runtimes.api.impl;

import com.redhat.runtimes.api.TodosApi;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;

class TodosApiServiceTest {

	TodosApi underTest = new TodosApiServiceImpl();

	@Test
	void createTodo() {
	}

	@Test
	void deleteTodo() {
		Response response = underTest.deleteTodo("failTest", null);

		assertEquals(response.getStatus(), 200);
	}

	@Test
	void getTodo() {
	}

	@Test
	void getTodos() {
	}

	@Test
	void updateTodo() {
	}
}