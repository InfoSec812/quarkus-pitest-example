package com.redhat.runtimes.api.impl;

import com.redhat.runtimes.api.*;
import com.redhat.runtimes.models.*;


import com.redhat.runtimes.models.NewTodo;
import com.redhat.runtimes.models.Todo;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-04T10:31:26.650582-04:00[America/New_York]")
public class TodosApiServiceImpl implements TodosApi {
      public Response createTodo(NewTodo newTodo,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteTodo(String todoId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getTodo(String todoId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getTodos(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateTodo(String todoId,Todo todo,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
