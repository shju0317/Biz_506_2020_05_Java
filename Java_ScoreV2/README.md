# 객체지향(Object Oriented Programming : OOP)의 특징

## 상속(확장, extends)
* 기존에 잘 만들어진 클래스가 있는데 이중에 일부 method가 좀 불편하다라든가, 내가 만들면 좀더 잘 만들 수 있을 것 같다라고 생각이 되면
* 기존의 클래스를 extends하여 새로운 클래스를 선언하고
* 불편한 method만 새롭게 다시 코딩하여 기능을 개선(변경)하는 객체지향의 매우 중요한 특징

## 재정의(Overriding)
* 기존 클래스를 상속(extends)하여 일부 method의 이름을 그대로 사용하면서, 내부 작동 코드만 새롭게 만드는 것
* extends와 Overriding은 함께 묶어서 생각해야 하는 개념이다.

## 정보은닉(Information hiding)
* 클래스에 선언된 필드변수를 private으로 선언하고
* 외부에서 직접 접근하지 못하도록 하는 개념

## 캡슐화(Encapsulation)
* 데이터와 데이터를 처리하는 method를 하나로 묶어두는 개념
* 만약 getter() method를 호출한다는 것은 객체 필드변수의 값을 읽는 것이고
* setter(값) method를 호출한다는 것은 객체 필드변수에 값을 저장한다는 것이다.
* getter()나 setter() 또는 기타 여러 method들의 내부에서 어떤 일들이 수행되는지는 모르겠지만 나는 원하는 일의 수행할 수 있다라는 개념

## 다형성(Polymorphism)
* method의 매개변수의 개수, type이 다르면 같은 클래스 내에서
* 같은 이름의 method를 정의하여 사용할 수 있다.  