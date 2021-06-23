Spring security에서 Filter와 Intercepter의 차이점

Spring을 사용하여 로그인 인증 로직을 구현 하기 위해서는 Spring Security는 필수이다.
그러기 위해서는 우선적으로 Filter와 Intercepter의 차이점을 알아야한다.
우선 그림으로 표현된 MVC패턴의 로직중 Filter와 Intercepter의 역할과 위치이다.


핵심적으로 Filter와 Intercepter의 실행되는 시점이 다르다.

Filter는 자원에 대한 요청, 자원에 대한 응답에 대하여 필터링을 수행하는 객체이다.

Init(), destroy()를 이용해 생성과 소멸 시 행동을 취할 수있으며, doFilter() 메소드를 통해 요청과 응답을 다음 루틴으로 전송한다.

Tomcat javax.servlet 패키지에 구현되어 있으며, Web Application에 등록한다. (Tomcatㅔ서 제공하는 클래스이기때문)


  
Intercepter는 Controller에 들어오는 요청 HttpRequest와 응답 HttpResponse를 개로채는 역할을 하는 객체이다.

Handler를 실행하기 전(preHandle()) 후(PostHandle()), view를 렌더링 한 후 (afterCompletion()) 실행할 수 있다는 것이 장점이다.

Intercepter가 작업을 처리 중 Exception이 발생하면 @ControllerAdvice 어노테이션을 통해 예외처리가 가능.



Filter와 Intercepter의 차이점
	1. 호출 시점
		○ Filter : DispatcherServlet 실행 전
		○ Intercepter : DispatcherServlet 실행 후
	2. 설정 위치
		○ Filter : web.xml에서 등록
		○ Intercepter : ApplicationContext에 등록

실제 적용할 때 용도의 차이점
스프링 HandlerInterceptor documentation에서는 Filter를 더 강력한 도구로 표현하고 있다.
Filter는 Request와 Response를 교체시켜 제공할 수 있기 때문이며, 자주 사용된다.
쓰임은 Filter는 Request Content나 View Content에 적합하다.
Intercepter는 들어온 요청에 대해 공통 핸들러 또는 권한을 체크하는데 정제하여 사용하는 것이 좋다.
또한 View를 렌더링 하기 전 후로 작업을 할당할 수 있다는것이 장점이다. (권한에 따른 View렌더링 또한 포함)
