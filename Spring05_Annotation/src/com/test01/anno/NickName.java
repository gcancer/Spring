package com.test01.anno;

import org.springframework.stereotype.Component;

//<bean id="nickName" class="com.test01.anno.NickName"/> @Component를 쓰면 이 작업을 자동으로 해 준다.
//id의 첫 글자는 class의 첫 글자를 소문자로
@Component
public class NickName {

	@Override
	public String toString() {
		return "gcancer";
	}
}
