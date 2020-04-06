package com.sse.annotation.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


/**
 * SCOPE_PROTOTYPE
 * 	 SCOPE_SINGLETON
 * 	 SCOPE_REQUEST
 * 	 SCOPE_SESSION
 * 	 当然，下面这两个都需要在web环境中，而且像这两个在web环境中，我们也不会用到，如果我们要同一个请求，或者同一个session都用同一个对象，那么我们就把它放在请求域中，或者session域中
 */
@Scope(value = "request")
@Service
public class AnnoService {
}
