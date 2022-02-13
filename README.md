# APIFooBarQix
 FooBarQix API for Tryane interview
 
 Implementation of the FooBarQix challenge from https://codingdojo.org/kata/FooBarQix/
 
 To try the API, you first need to run the spring boot application in com/thomas/edgar/EdgarApplication.java
 Then you can go to this url http://localhost:8080/foobarqix/ and add any number at the end of the url to compute the FooBarQix.
 
 The result will be returned in this format :
 
 {"input":"5408762","output":"Bar*Qix"}
 
 The input field is the number to compute, and the ouptut field is the result.
 
 If you try to compute something that is not a number, or that is over the range of a Long, you will get this message :
 
 {"input":"540876284532555515161","output":"Error, the input isn't a number or is too big."}
 
 
 Since there's no writting or reading from any database, the only mapping I implemented is a GET.
 You can find the mapping implementation in this file : 
 src/main/java/com/thomas/edgar/controller/FooBarQixController.java
 
 The implementation of the FooBarQix algorythm is in this file : 
 src/main/java/com/thomas/edgar/foobarqix/FooBarQix.java
 
 The model for the data transferable object is in this file :
 src/main/java/com/thomas/edgar/model/FooBarQixDto.java
 
 I implemented Unit test to test the result of the compute method. You can run and find the tests here :
 src/test/java/com/thomas/edgar/FooBarQixTests.java
 
 
